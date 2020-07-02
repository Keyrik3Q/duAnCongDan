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

import com.congdan.model.Xa;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the xa service. This utility wraps {@link XaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ADMIN
 * @see XaPersistence
 * @see XaPersistenceImpl
 * @generated
 */
public class XaUtil {
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
	public static void clearCache(Xa xa) {
		getPersistence().clearCache(xa);
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
	public static List<Xa> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Xa> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Xa> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Xa update(Xa xa) throws SystemException {
		return getPersistence().update(xa);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Xa update(Xa xa, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(xa, serviceContext);
	}

	/**
	* Caches the xa in the entity cache if it is enabled.
	*
	* @param xa the xa
	*/
	public static void cacheResult(com.congdan.model.Xa xa) {
		getPersistence().cacheResult(xa);
	}

	/**
	* Caches the xas in the entity cache if it is enabled.
	*
	* @param xas the xas
	*/
	public static void cacheResult(java.util.List<com.congdan.model.Xa> xas) {
		getPersistence().cacheResult(xas);
	}

	/**
	* Creates a new xa with the primary key. Does not add the xa to the database.
	*
	* @param Id the primary key for the new xa
	* @return the new xa
	*/
	public static com.congdan.model.Xa create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the xa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the xa
	* @return the xa that was removed
	* @throws com.congdan.NoSuchXaException if a xa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.congdan.model.Xa remove(long Id)
		throws com.congdan.NoSuchXaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(Id);
	}

	public static com.congdan.model.Xa updateImpl(com.congdan.model.Xa xa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(xa);
	}

	/**
	* Returns the xa with the primary key or throws a {@link com.congdan.NoSuchXaException} if it could not be found.
	*
	* @param Id the primary key of the xa
	* @return the xa
	* @throws com.congdan.NoSuchXaException if a xa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.congdan.model.Xa findByPrimaryKey(long Id)
		throws com.congdan.NoSuchXaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the xa with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the xa
	* @return the xa, or <code>null</code> if a xa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.congdan.model.Xa fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the xas.
	*
	* @return the xas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.congdan.model.Xa> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the xas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.XaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of xas
	* @param end the upper bound of the range of xas (not inclusive)
	* @return the range of xas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.congdan.model.Xa> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the xas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.XaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of xas
	* @param end the upper bound of the range of xas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of xas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.congdan.model.Xa> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the xas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of xas.
	*
	* @return the number of xas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static XaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (XaPersistence)PortletBeanLocatorUtil.locate(com.congdan.service.ClpSerializer.getServletContextName(),
					XaPersistence.class.getName());

			ReferenceRegistry.registerReference(XaUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(XaPersistence persistence) {
	}

	private static XaPersistence _persistence;
}