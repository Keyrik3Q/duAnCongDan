/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.congdan.service.persistence;

import com.congdan.model.CSMSCongDan;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the c s m s cong dan service. This utility wraps {@link CSMSCongDanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ADMIN
 * @see CSMSCongDanPersistence
 * @see CSMSCongDanPersistenceImpl
 * @generated
 */
public class CSMSCongDanUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(CSMSCongDan csmsCongDan) {
		getPersistence().clearCache(csmsCongDan);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CSMSCongDan> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CSMSCongDan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CSMSCongDan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CSMSCongDan update(CSMSCongDan csmsCongDan)
		throws SystemException {
		return getPersistence().update(csmsCongDan);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CSMSCongDan update(CSMSCongDan csmsCongDan,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(csmsCongDan, serviceContext);
	}

	/**
	* Caches the c s m s cong dan in the entity cache if it is enabled.
	*
	* @param csmsCongDan the c s m s cong dan
	*/
	public static void cacheResult(com.congdan.model.CSMSCongDan csmsCongDan) {
		getPersistence().cacheResult(csmsCongDan);
	}

	/**
	* Caches the c s m s cong dans in the entity cache if it is enabled.
	*
	* @param csmsCongDans the c s m s cong dans
	*/
	public static void cacheResult(
		java.util.List<com.congdan.model.CSMSCongDan> csmsCongDans) {
		getPersistence().cacheResult(csmsCongDans);
	}

	/**
	* Creates a new c s m s cong dan with the primary key. Does not add the c s m s cong dan to the database.
	*
	* @param IdcsmsCongDan the primary key for the new c s m s cong dan
	* @return the new c s m s cong dan
	*/
	public static com.congdan.model.CSMSCongDan create(long IdcsmsCongDan) {
		return getPersistence().create(IdcsmsCongDan);
	}

	/**
	* Removes the c s m s cong dan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param IdcsmsCongDan the primary key of the c s m s cong dan
	* @return the c s m s cong dan that was removed
	* @throws com.congdan.NoSuchCSMSCongDanException if a c s m s cong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.congdan.model.CSMSCongDan remove(long IdcsmsCongDan)
		throws com.congdan.NoSuchCSMSCongDanException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(IdcsmsCongDan);
	}

	public static com.congdan.model.CSMSCongDan updateImpl(
		com.congdan.model.CSMSCongDan csmsCongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(csmsCongDan);
	}

	/**
	* Returns the c s m s cong dan with the primary key or throws a {@link com.congdan.NoSuchCSMSCongDanException} if it could not be found.
	*
	* @param IdcsmsCongDan the primary key of the c s m s cong dan
	* @return the c s m s cong dan
	* @throws com.congdan.NoSuchCSMSCongDanException if a c s m s cong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.congdan.model.CSMSCongDan findByPrimaryKey(
		long IdcsmsCongDan)
		throws com.congdan.NoSuchCSMSCongDanException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(IdcsmsCongDan);
	}

	/**
	* Returns the c s m s cong dan with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param IdcsmsCongDan the primary key of the c s m s cong dan
	* @return the c s m s cong dan, or <code>null</code> if a c s m s cong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.congdan.model.CSMSCongDan fetchByPrimaryKey(
		long IdcsmsCongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(IdcsmsCongDan);
	}

	/**
	* Returns all the c s m s cong dans.
	*
	* @return the c s m s cong dans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.congdan.model.CSMSCongDan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the c s m s cong dans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.CSMSCongDanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c s m s cong dans
	* @param end the upper bound of the range of c s m s cong dans (not inclusive)
	* @return the range of c s m s cong dans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.congdan.model.CSMSCongDan> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the c s m s cong dans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.CSMSCongDanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c s m s cong dans
	* @param end the upper bound of the range of c s m s cong dans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c s m s cong dans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.congdan.model.CSMSCongDan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the c s m s cong dans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of c s m s cong dans.
	*
	* @return the number of c s m s cong dans
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CSMSCongDanPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CSMSCongDanPersistence)PortletBeanLocatorUtil.locate(com.congdan.service.ClpSerializer.getServletContextName(),
					CSMSCongDanPersistence.class.getName());

			ReferenceRegistry.registerReference(CSMSCongDanUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CSMSCongDanPersistence persistence) {
	}

	private static CSMSCongDanPersistence _persistence;
}