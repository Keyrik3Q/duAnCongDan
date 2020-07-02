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

import com.congdan.model.Tinh;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the tinh service. This utility wraps {@link TinhPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ADMIN
 * @see TinhPersistence
 * @see TinhPersistenceImpl
 * @generated
 */
public class TinhUtil {
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
	public static void clearCache(Tinh tinh) {
		getPersistence().clearCache(tinh);
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
	public static List<Tinh> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Tinh> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Tinh> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Tinh update(Tinh tinh) throws SystemException {
		return getPersistence().update(tinh);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Tinh update(Tinh tinh, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(tinh, serviceContext);
	}

	/**
	* Caches the tinh in the entity cache if it is enabled.
	*
	* @param tinh the tinh
	*/
	public static void cacheResult(com.congdan.model.Tinh tinh) {
		getPersistence().cacheResult(tinh);
	}

	/**
	* Caches the tinhs in the entity cache if it is enabled.
	*
	* @param tinhs the tinhs
	*/
	public static void cacheResult(java.util.List<com.congdan.model.Tinh> tinhs) {
		getPersistence().cacheResult(tinhs);
	}

	/**
	* Creates a new tinh with the primary key. Does not add the tinh to the database.
	*
	* @param Id the primary key for the new tinh
	* @return the new tinh
	*/
	public static com.congdan.model.Tinh create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the tinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the tinh
	* @return the tinh that was removed
	* @throws com.congdan.NoSuchTinhException if a tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.congdan.model.Tinh remove(long Id)
		throws com.congdan.NoSuchTinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(Id);
	}

	public static com.congdan.model.Tinh updateImpl(com.congdan.model.Tinh tinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tinh);
	}

	/**
	* Returns the tinh with the primary key or throws a {@link com.congdan.NoSuchTinhException} if it could not be found.
	*
	* @param Id the primary key of the tinh
	* @return the tinh
	* @throws com.congdan.NoSuchTinhException if a tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.congdan.model.Tinh findByPrimaryKey(long Id)
		throws com.congdan.NoSuchTinhException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the tinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the tinh
	* @return the tinh, or <code>null</code> if a tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.congdan.model.Tinh fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the tinhs.
	*
	* @return the tinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.congdan.model.Tinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.TinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tinhs
	* @param end the upper bound of the range of tinhs (not inclusive)
	* @return the range of tinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.congdan.model.Tinh> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.TinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tinhs
	* @param end the upper bound of the range of tinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.congdan.model.Tinh> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tinhs.
	*
	* @return the number of tinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TinhPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TinhPersistence)PortletBeanLocatorUtil.locate(com.congdan.service.ClpSerializer.getServletContextName(),
					TinhPersistence.class.getName());

			ReferenceRegistry.registerReference(TinhUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TinhPersistence persistence) {
	}

	private static TinhPersistence _persistence;
}