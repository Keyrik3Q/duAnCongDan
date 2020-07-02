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
 * Provides a wrapper for {@link CSMSCongDanLocalService}.
 *
 * @author ADMIN
 * @see CSMSCongDanLocalService
 * @generated
 */
public class CSMSCongDanLocalServiceWrapper implements CSMSCongDanLocalService,
	ServiceWrapper<CSMSCongDanLocalService> {
	public CSMSCongDanLocalServiceWrapper(
		CSMSCongDanLocalService csmsCongDanLocalService) {
		_csmsCongDanLocalService = csmsCongDanLocalService;
	}

	/**
	* Adds the c s m s cong dan to the database. Also notifies the appropriate model listeners.
	*
	* @param csmsCongDan the c s m s cong dan
	* @return the c s m s cong dan that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.CSMSCongDan addCSMSCongDan(
		com.congdan.model.CSMSCongDan csmsCongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csmsCongDanLocalService.addCSMSCongDan(csmsCongDan);
	}

	/**
	* Creates a new c s m s cong dan with the primary key. Does not add the c s m s cong dan to the database.
	*
	* @param IdcsmsCongDan the primary key for the new c s m s cong dan
	* @return the new c s m s cong dan
	*/
	@Override
	public com.congdan.model.CSMSCongDan createCSMSCongDan(long IdcsmsCongDan) {
		return _csmsCongDanLocalService.createCSMSCongDan(IdcsmsCongDan);
	}

	/**
	* Deletes the c s m s cong dan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param IdcsmsCongDan the primary key of the c s m s cong dan
	* @return the c s m s cong dan that was removed
	* @throws PortalException if a c s m s cong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.CSMSCongDan deleteCSMSCongDan(long IdcsmsCongDan)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _csmsCongDanLocalService.deleteCSMSCongDan(IdcsmsCongDan);
	}

	/**
	* Deletes the c s m s cong dan from the database. Also notifies the appropriate model listeners.
	*
	* @param csmsCongDan the c s m s cong dan
	* @return the c s m s cong dan that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.CSMSCongDan deleteCSMSCongDan(
		com.congdan.model.CSMSCongDan csmsCongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csmsCongDanLocalService.deleteCSMSCongDan(csmsCongDan);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _csmsCongDanLocalService.dynamicQuery();
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
		return _csmsCongDanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.CSMSCongDanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _csmsCongDanLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.CSMSCongDanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _csmsCongDanLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _csmsCongDanLocalService.dynamicQueryCount(dynamicQuery);
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
		return _csmsCongDanLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.congdan.model.CSMSCongDan fetchCSMSCongDan(long IdcsmsCongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csmsCongDanLocalService.fetchCSMSCongDan(IdcsmsCongDan);
	}

	/**
	* Returns the c s m s cong dan with the primary key.
	*
	* @param IdcsmsCongDan the primary key of the c s m s cong dan
	* @return the c s m s cong dan
	* @throws PortalException if a c s m s cong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.CSMSCongDan getCSMSCongDan(long IdcsmsCongDan)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _csmsCongDanLocalService.getCSMSCongDan(IdcsmsCongDan);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _csmsCongDanLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.congdan.model.CSMSCongDan> getCSMSCongDans(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csmsCongDanLocalService.getCSMSCongDans(start, end);
	}

	/**
	* Returns the number of c s m s cong dans.
	*
	* @return the number of c s m s cong dans
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCSMSCongDansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csmsCongDanLocalService.getCSMSCongDansCount();
	}

	/**
	* Updates the c s m s cong dan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param csmsCongDan the c s m s cong dan
	* @return the c s m s cong dan that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.CSMSCongDan updateCSMSCongDan(
		com.congdan.model.CSMSCongDan csmsCongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csmsCongDanLocalService.updateCSMSCongDan(csmsCongDan);
	}

	@Override
	public com.congdan.model.CSMSCongDanImageDataBlobModel getImageDataBlobModel(
		java.io.Serializable primaryKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csmsCongDanLocalService.getImageDataBlobModel(primaryKey);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _csmsCongDanLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_csmsCongDanLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _csmsCongDanLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<java.lang.Object[]> findCSMSCongDans(
		java.lang.String ho, java.lang.String dem, java.lang.String ten,
		java.lang.String macongdan, int tinh, int huyen, int xa,
		java.lang.String sohochieu, java.lang.String name,
		java.lang.String ngaysinh, int socmnd, int Start, int ketThuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csmsCongDanLocalService.findCSMSCongDans(ho, dem, ten,
			macongdan, tinh, huyen, xa, sohochieu, name, ngaysinh, socmnd,
			Start, ketThuc);
	}

	@Override
	public long countCSMSCongDans(java.lang.String ho, java.lang.String dem,
		java.lang.String ten, java.lang.String macongdan, int tinh, int huyen,
		int xa, java.lang.String sohochieu, java.lang.String name,
		java.lang.String ngaysinh, int socmnd)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csmsCongDanLocalService.countCSMSCongDans(ho, dem, ten,
			macongdan, tinh, huyen, xa, sohochieu, name, ngaysinh, socmnd);
	}

	@Override
	public java.util.List<java.lang.Object[]> findHuyens(int idh, int Start,
		int ketThuc) throws com.liferay.portal.kernel.exception.SystemException {
		return _csmsCongDanLocalService.findHuyens(idh, Start, ketThuc);
	}

	@Override
	public java.util.List<java.lang.Object[]> findXas(int idx, int Start,
		int ketThuc) throws com.liferay.portal.kernel.exception.SystemException {
		return _csmsCongDanLocalService.findXas(idx, Start, ketThuc);
	}

	@Override
	public java.util.List<java.lang.Object[]> findHoTens(int Start, int ketThuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csmsCongDanLocalService.findHoTens(Start, ketThuc);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CSMSCongDanLocalService getWrappedCSMSCongDanLocalService() {
		return _csmsCongDanLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCSMSCongDanLocalService(
		CSMSCongDanLocalService csmsCongDanLocalService) {
		_csmsCongDanLocalService = csmsCongDanLocalService;
	}

	@Override
	public CSMSCongDanLocalService getWrappedService() {
		return _csmsCongDanLocalService;
	}

	@Override
	public void setWrappedService(
		CSMSCongDanLocalService csmsCongDanLocalService) {
		_csmsCongDanLocalService = csmsCongDanLocalService;
	}

	private CSMSCongDanLocalService _csmsCongDanLocalService;
}