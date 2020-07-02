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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the c s m s cong dan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ADMIN
 * @see CSMSCongDanPersistenceImpl
 * @see CSMSCongDanUtil
 * @generated
 */
public interface CSMSCongDanPersistence extends BasePersistence<CSMSCongDan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CSMSCongDanUtil} to access the c s m s cong dan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the c s m s cong dan in the entity cache if it is enabled.
	*
	* @param csmsCongDan the c s m s cong dan
	*/
	public void cacheResult(com.congdan.model.CSMSCongDan csmsCongDan);

	/**
	* Caches the c s m s cong dans in the entity cache if it is enabled.
	*
	* @param csmsCongDans the c s m s cong dans
	*/
	public void cacheResult(
		java.util.List<com.congdan.model.CSMSCongDan> csmsCongDans);

	/**
	* Creates a new c s m s cong dan with the primary key. Does not add the c s m s cong dan to the database.
	*
	* @param IdcsmsCongDan the primary key for the new c s m s cong dan
	* @return the new c s m s cong dan
	*/
	public com.congdan.model.CSMSCongDan create(long IdcsmsCongDan);

	/**
	* Removes the c s m s cong dan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param IdcsmsCongDan the primary key of the c s m s cong dan
	* @return the c s m s cong dan that was removed
	* @throws com.congdan.NoSuchCSMSCongDanException if a c s m s cong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.congdan.model.CSMSCongDan remove(long IdcsmsCongDan)
		throws com.congdan.NoSuchCSMSCongDanException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.congdan.model.CSMSCongDan updateImpl(
		com.congdan.model.CSMSCongDan csmsCongDan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c s m s cong dan with the primary key or throws a {@link com.congdan.NoSuchCSMSCongDanException} if it could not be found.
	*
	* @param IdcsmsCongDan the primary key of the c s m s cong dan
	* @return the c s m s cong dan
	* @throws com.congdan.NoSuchCSMSCongDanException if a c s m s cong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.congdan.model.CSMSCongDan findByPrimaryKey(long IdcsmsCongDan)
		throws com.congdan.NoSuchCSMSCongDanException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c s m s cong dan with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param IdcsmsCongDan the primary key of the c s m s cong dan
	* @return the c s m s cong dan, or <code>null</code> if a c s m s cong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.congdan.model.CSMSCongDan fetchByPrimaryKey(long IdcsmsCongDan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the c s m s cong dans.
	*
	* @return the c s m s cong dans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.congdan.model.CSMSCongDan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.congdan.model.CSMSCongDan> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.congdan.model.CSMSCongDan> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the c s m s cong dans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of c s m s cong dans.
	*
	* @return the number of c s m s cong dans
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}