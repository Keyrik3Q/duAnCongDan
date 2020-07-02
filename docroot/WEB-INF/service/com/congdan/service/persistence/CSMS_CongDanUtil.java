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

import com.congdan.model.CSMS_CongDan;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the c s m s_ cong dan service. This utility wraps {@link CSMS_CongDanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ADMIN
 * @see CSMS_CongDanPersistence
 * @see CSMS_CongDanPersistenceImpl
 * @generated
 */
public class CSMS_CongDanUtil {
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
	public static void clearCache(CSMS_CongDan csms_CongDan) {
		getPersistence().clearCache(csms_CongDan);
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
	public static List<CSMS_CongDan> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CSMS_CongDan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CSMS_CongDan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CSMS_CongDan update(CSMS_CongDan csms_CongDan)
		throws SystemException {
		return getPersistence().update(csms_CongDan);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CSMS_CongDan update(CSMS_CongDan csms_CongDan,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(csms_CongDan, serviceContext);
	}

	/**
	* Caches the c s m s_ cong dan in the entity cache if it is enabled.
	*
	* @param csms_CongDan the c s m s_ cong dan
	*/
	public static void cacheResult(com.congdan.model.CSMS_CongDan csms_CongDan) {
		getPersistence().cacheResult(csms_CongDan);
	}

	/**
	* Caches the c s m s_ cong dans in the entity cache if it is enabled.
	*
	* @param csms_CongDans the c s m s_ cong dans
	*/
	public static void cacheResult(
		java.util.List<com.congdan.model.CSMS_CongDan> csms_CongDans) {
		getPersistence().cacheResult(csms_CongDans);
	}

	/**
	* Creates a new c s m s_ cong dan with the primary key. Does not add the c s m s_ cong dan to the database.
	*
	* @param Idcsms_CongDan the primary key for the new c s m s_ cong dan
	* @return the new c s m s_ cong dan
	*/
	public static com.congdan.model.CSMS_CongDan create(long Idcsms_CongDan) {
		return getPersistence().create(Idcsms_CongDan);
	}

	/**
	* Removes the c s m s_ cong dan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Idcsms_CongDan the primary key of the c s m s_ cong dan
	* @return the c s m s_ cong dan that was removed
	* @throws com.congdan.NoSuchCSMS_CongDanException if a c s m s_ cong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.congdan.model.CSMS_CongDan remove(long Idcsms_CongDan)
		throws com.congdan.NoSuchCSMS_CongDanException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(Idcsms_CongDan);
	}

	public static com.congdan.model.CSMS_CongDan updateImpl(
		com.congdan.model.CSMS_CongDan csms_CongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(csms_CongDan);
	}

	/**
	* Returns the c s m s_ cong dan with the primary key or throws a {@link com.congdan.NoSuchCSMS_CongDanException} if it could not be found.
	*
	* @param Idcsms_CongDan the primary key of the c s m s_ cong dan
	* @return the c s m s_ cong dan
	* @throws com.congdan.NoSuchCSMS_CongDanException if a c s m s_ cong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.congdan.model.CSMS_CongDan findByPrimaryKey(
		long Idcsms_CongDan)
		throws com.congdan.NoSuchCSMS_CongDanException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(Idcsms_CongDan);
	}

	/**
	* Returns the c s m s_ cong dan with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Idcsms_CongDan the primary key of the c s m s_ cong dan
	* @return the c s m s_ cong dan, or <code>null</code> if a c s m s_ cong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.congdan.model.CSMS_CongDan fetchByPrimaryKey(
		long Idcsms_CongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Idcsms_CongDan);
	}

	/**
	* Returns all the c s m s_ cong dans.
	*
	* @return the c s m s_ cong dans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.congdan.model.CSMS_CongDan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the c s m s_ cong dans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.CSMS_CongDanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c s m s_ cong dans
	* @param end the upper bound of the range of c s m s_ cong dans (not inclusive)
	* @return the range of c s m s_ cong dans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.congdan.model.CSMS_CongDan> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the c s m s_ cong dans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.CSMS_CongDanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c s m s_ cong dans
	* @param end the upper bound of the range of c s m s_ cong dans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c s m s_ cong dans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.congdan.model.CSMS_CongDan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the c s m s_ cong dans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of c s m s_ cong dans.
	*
	* @return the number of c s m s_ cong dans
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CSMS_CongDanPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CSMS_CongDanPersistence)PortletBeanLocatorUtil.locate(com.congdan.service.ClpSerializer.getServletContextName(),
					CSMS_CongDanPersistence.class.getName());

			ReferenceRegistry.registerReference(CSMS_CongDanUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CSMS_CongDanPersistence persistence) {
	}

	private static CSMS_CongDanPersistence _persistence;
}