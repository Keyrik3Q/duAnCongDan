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

package com.congdan.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link XaLocalService}.
 *
 * @author ADMIN
 * @see XaLocalService
 * @generated
 */
public class XaLocalServiceWrapper implements XaLocalService,
	ServiceWrapper<XaLocalService> {
	public XaLocalServiceWrapper(XaLocalService xaLocalService) {
		_xaLocalService = xaLocalService;
	}

	/**
	* Adds the xa to the database. Also notifies the appropriate model listeners.
	*
	* @param xa the xa
	* @return the xa that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.Xa addXa(com.congdan.model.Xa xa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _xaLocalService.addXa(xa);
	}

	/**
	* Creates a new xa with the primary key. Does not add the xa to the database.
	*
	* @param Id the primary key for the new xa
	* @return the new xa
	*/
	@Override
	public com.congdan.model.Xa createXa(long Id) {
		return _xaLocalService.createXa(Id);
	}

	/**
	* Deletes the xa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the xa
	* @return the xa that was removed
	* @throws PortalException if a xa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.Xa deleteXa(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _xaLocalService.deleteXa(Id);
	}

	/**
	* Deletes the xa from the database. Also notifies the appropriate model listeners.
	*
	* @param xa the xa
	* @return the xa that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.Xa deleteXa(com.congdan.model.Xa xa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _xaLocalService.deleteXa(xa);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _xaLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _xaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.XaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _xaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.XaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _xaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _xaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _xaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.congdan.model.Xa fetchXa(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _xaLocalService.fetchXa(Id);
	}

	/**
	* Returns the xa with the primary key.
	*
	* @param Id the primary key of the xa
	* @return the xa
	* @throws PortalException if a xa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.Xa getXa(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _xaLocalService.getXa(Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _xaLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.congdan.model.Xa> getXas(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _xaLocalService.getXas(start, end);
	}

	/**
	* Returns the number of xas.
	*
	* @return the number of xas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getXasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _xaLocalService.getXasCount();
	}

	/**
	* Updates the xa in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param xa the xa
	* @return the xa that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.Xa updateXa(com.congdan.model.Xa xa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _xaLocalService.updateXa(xa);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _xaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_xaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _xaLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public XaLocalService getWrappedXaLocalService() {
		return _xaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedXaLocalService(XaLocalService xaLocalService) {
		_xaLocalService = xaLocalService;
	}

	@Override
	public XaLocalService getWrappedService() {
		return _xaLocalService;
	}

	@Override
	public void setWrappedService(XaLocalService xaLocalService) {
		_xaLocalService = xaLocalService;
	}

	private XaLocalService _xaLocalService;
}