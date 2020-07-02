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

import com.congdan.model.Huyen;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the huyen service. This utility wraps {@link HuyenPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ADMIN
 * @see HuyenPersistence
 * @see HuyenPersistenceImpl
 * @generated
 */
public class HuyenUtil {
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
	public static void clearCache(Huyen huyen) {
		getPersistence().clearCache(huyen);
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
	public static List<Huyen> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Huyen> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Huyen> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Huyen update(Huyen huyen) throws SystemException {
		return getPersistence().update(huyen);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Huyen update(Huyen huyen, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(huyen, serviceContext);
	}

	/**
	* Caches the huyen in the entity cache if it is enabled.
	*
	* @param huyen the huyen
	*/
	public static void cacheResult(com.congdan.model.Huyen huyen) {
		getPersistence().cacheResult(huyen);
	}

	/**
	* Caches the huyens in the entity cache if it is enabled.
	*
	* @param huyens the huyens
	*/
	public static void cacheResult(
		java.util.List<com.congdan.model.Huyen> huyens) {
		getPersistence().cacheResult(huyens);
	}

	/**
	* Creates a new huyen with the primary key. Does not add the huyen to the database.
	*
	* @param Id the primary key for the new huyen
	* @return the new huyen
	*/
	public static com.congdan.model.Huyen create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the huyen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the huyen
	* @return the huyen that was removed
	* @throws com.congdan.NoSuchHuyenException if a huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.congdan.model.Huyen remove(long Id)
		throws com.congdan.NoSuchHuyenException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(Id);
	}

	public static com.congdan.model.Huyen updateImpl(
		com.congdan.model.Huyen huyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(huyen);
	}

	/**
	* Returns the huyen with the primary key or throws a {@link com.congdan.NoSuchHuyenException} if it could not be found.
	*
	* @param Id the primary key of the huyen
	* @return the huyen
	* @throws com.congdan.NoSuchHuyenException if a huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.congdan.model.Huyen findByPrimaryKey(long Id)
		throws com.congdan.NoSuchHuyenException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the huyen with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the huyen
	* @return the huyen, or <code>null</code> if a huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.congdan.model.Huyen fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the huyens.
	*
	* @return the huyens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.congdan.model.Huyen> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the huyens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.HuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of huyens
	* @param end the upper bound of the range of huyens (not inclusive)
	* @return the range of huyens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.congdan.model.Huyen> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the huyens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.HuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of huyens
	* @param end the upper bound of the range of huyens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of huyens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.congdan.model.Huyen> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the huyens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of huyens.
	*
	* @return the number of huyens
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static HuyenPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (HuyenPersistence)PortletBeanLocatorUtil.locate(com.congdan.service.ClpSerializer.getServletContextName(),
					HuyenPersistence.class.getName());

			ReferenceRegistry.registerReference(HuyenUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(HuyenPersistence persistence) {
	}

	private static HuyenPersistence _persistence;
}