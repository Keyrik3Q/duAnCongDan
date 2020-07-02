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
 * Provides a wrapper for {@link HuyenLocalService}.
 *
 * @author ADMIN
 * @see HuyenLocalService
 * @generated
 */
public class HuyenLocalServiceWrapper implements HuyenLocalService,
	ServiceWrapper<HuyenLocalService> {
	public HuyenLocalServiceWrapper(HuyenLocalService huyenLocalService) {
		_huyenLocalService = huyenLocalService;
	}

	/**
	* Adds the huyen to the database. Also notifies the appropriate model listeners.
	*
	* @param huyen the huyen
	* @return the huyen that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.Huyen addHuyen(com.congdan.model.Huyen huyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _huyenLocalService.addHuyen(huyen);
	}

	/**
	* Creates a new huyen with the primary key. Does not add the huyen to the database.
	*
	* @param Id the primary key for the new huyen
	* @return the new huyen
	*/
	@Override
	public com.congdan.model.Huyen createHuyen(long Id) {
		return _huyenLocalService.createHuyen(Id);
	}

	/**
	* Deletes the huyen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the huyen
	* @return the huyen that was removed
	* @throws PortalException if a huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.Huyen deleteHuyen(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _huyenLocalService.deleteHuyen(Id);
	}

	/**
	* Deletes the huyen from the database. Also notifies the appropriate model listeners.
	*
	* @param huyen the huyen
	* @return the huyen that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.Huyen deleteHuyen(com.congdan.model.Huyen huyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _huyenLocalService.deleteHuyen(huyen);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _huyenLocalService.dynamicQuery();
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
		return _huyenLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.HuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _huyenLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.HuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _huyenLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _huyenLocalService.dynamicQueryCount(dynamicQuery);
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
		return _huyenLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.congdan.model.Huyen fetchHuyen(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _huyenLocalService.fetchHuyen(Id);
	}

	/**
	* Returns the huyen with the primary key.
	*
	* @param Id the primary key of the huyen
	* @return the huyen
	* @throws PortalException if a huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.Huyen getHuyen(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _huyenLocalService.getHuyen(Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _huyenLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.congdan.model.Huyen> getHuyens(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _huyenLocalService.getHuyens(start, end);
	}

	/**
	* Returns the number of huyens.
	*
	* @return the number of huyens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getHuyensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _huyenLocalService.getHuyensCount();
	}

	/**
	* Updates the huyen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param huyen the huyen
	* @return the huyen that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.Huyen updateHuyen(com.congdan.model.Huyen huyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _huyenLocalService.updateHuyen(huyen);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _huyenLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_huyenLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _huyenLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public HuyenLocalService getWrappedHuyenLocalService() {
		return _huyenLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedHuyenLocalService(HuyenLocalService huyenLocalService) {
		_huyenLocalService = huyenLocalService;
	}

	@Override
	public HuyenLocalService getWrappedService() {
		return _huyenLocalService;
	}

	@Override
	public void setWrappedService(HuyenLocalService huyenLocalService) {
		_huyenLocalService = huyenLocalService;
	}

	private HuyenLocalService _huyenLocalService;
}