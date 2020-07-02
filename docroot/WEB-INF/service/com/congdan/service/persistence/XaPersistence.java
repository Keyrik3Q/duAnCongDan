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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the xa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ADMIN
 * @see XaPersistenceImpl
 * @see XaUtil
 * @generated
 */
public interface XaPersistence extends BasePersistence<Xa> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link XaUtil} to access the xa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the xa in the entity cache if it is enabled.
	*
	* @param xa the xa
	*/
	public void cacheResult(com.congdan.model.Xa xa);

	/**
	* Caches the xas in the entity cache if it is enabled.
	*
	* @param xas the xas
	*/
	public void cacheResult(java.util.List<com.congdan.model.Xa> xas);

	/**
	* Creates a new xa with the primary key. Does not add the xa to the database.
	*
	* @param Id the primary key for the new xa
	* @return the new xa
	*/
	public com.congdan.model.Xa create(long Id);

	/**
	* Removes the xa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the xa
	* @return the xa that was removed
	* @throws com.congdan.NoSuchXaException if a xa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.congdan.model.Xa remove(long Id)
		throws com.congdan.NoSuchXaException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.congdan.model.Xa updateImpl(com.congdan.model.Xa xa)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the xa with the primary key or throws a {@link com.congdan.NoSuchXaException} if it could not be found.
	*
	* @param Id the primary key of the xa
	* @return the xa
	* @throws com.congdan.NoSuchXaException if a xa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.congdan.model.Xa findByPrimaryKey(long Id)
		throws com.congdan.NoSuchXaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the xa with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the xa
	* @return the xa, or <code>null</code> if a xa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.congdan.model.Xa fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the xas.
	*
	* @return the xas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.congdan.model.Xa> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.congdan.model.Xa> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.congdan.model.Xa> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the xas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of xas.
	*
	* @return the number of xas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}