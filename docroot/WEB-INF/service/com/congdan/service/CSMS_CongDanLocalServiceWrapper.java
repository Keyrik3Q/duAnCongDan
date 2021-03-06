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
 * Provides a wrapper for {@link CSMS_CongDanLocalService}.
 *
 * @author ADMIN
 * @see CSMS_CongDanLocalService
 * @generated
 */
public class CSMS_CongDanLocalServiceWrapper implements CSMS_CongDanLocalService,
	ServiceWrapper<CSMS_CongDanLocalService> {
	public CSMS_CongDanLocalServiceWrapper(
		CSMS_CongDanLocalService csms_CongDanLocalService) {
		_csms_CongDanLocalService = csms_CongDanLocalService;
	}

	/**
	* Adds the c s m s_ cong dan to the database. Also notifies the appropriate model listeners.
	*
	* @param csms_CongDan the c s m s_ cong dan
	* @return the c s m s_ cong dan that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.CSMS_CongDan addCSMS_CongDan(
		com.congdan.model.CSMS_CongDan csms_CongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csms_CongDanLocalService.addCSMS_CongDan(csms_CongDan);
	}

	/**
	* Creates a new c s m s_ cong dan with the primary key. Does not add the c s m s_ cong dan to the database.
	*
	* @param Idcsms_CongDan the primary key for the new c s m s_ cong dan
	* @return the new c s m s_ cong dan
	*/
	@Override
	public com.congdan.model.CSMS_CongDan createCSMS_CongDan(
		long Idcsms_CongDan) {
		return _csms_CongDanLocalService.createCSMS_CongDan(Idcsms_CongDan);
	}

	/**
	* Deletes the c s m s_ cong dan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Idcsms_CongDan the primary key of the c s m s_ cong dan
	* @return the c s m s_ cong dan that was removed
	* @throws PortalException if a c s m s_ cong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.CSMS_CongDan deleteCSMS_CongDan(
		long Idcsms_CongDan)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _csms_CongDanLocalService.deleteCSMS_CongDan(Idcsms_CongDan);
	}

	/**
	* Deletes the c s m s_ cong dan from the database. Also notifies the appropriate model listeners.
	*
	* @param csms_CongDan the c s m s_ cong dan
	* @return the c s m s_ cong dan that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.CSMS_CongDan deleteCSMS_CongDan(
		com.congdan.model.CSMS_CongDan csms_CongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csms_CongDanLocalService.deleteCSMS_CongDan(csms_CongDan);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _csms_CongDanLocalService.dynamicQuery();
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
		return _csms_CongDanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.CSMS_CongDanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _csms_CongDanLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.congdan.model.impl.CSMS_CongDanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _csms_CongDanLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _csms_CongDanLocalService.dynamicQueryCount(dynamicQuery);
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
		return _csms_CongDanLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.congdan.model.CSMS_CongDan fetchCSMS_CongDan(long Idcsms_CongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csms_CongDanLocalService.fetchCSMS_CongDan(Idcsms_CongDan);
	}

	/**
	* Returns the c s m s_ cong dan with the primary key.
	*
	* @param Idcsms_CongDan the primary key of the c s m s_ cong dan
	* @return the c s m s_ cong dan
	* @throws PortalException if a c s m s_ cong dan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.CSMS_CongDan getCSMS_CongDan(long Idcsms_CongDan)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _csms_CongDanLocalService.getCSMS_CongDan(Idcsms_CongDan);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _csms_CongDanLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.congdan.model.CSMS_CongDan> getCSMS_CongDans(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csms_CongDanLocalService.getCSMS_CongDans(start, end);
	}

	/**
	* Returns the number of c s m s_ cong dans.
	*
	* @return the number of c s m s_ cong dans
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCSMS_CongDansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csms_CongDanLocalService.getCSMS_CongDansCount();
	}

	/**
	* Updates the c s m s_ cong dan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param csms_CongDan the c s m s_ cong dan
	* @return the c s m s_ cong dan that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.congdan.model.CSMS_CongDan updateCSMS_CongDan(
		com.congdan.model.CSMS_CongDan csms_CongDan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _csms_CongDanLocalService.updateCSMS_CongDan(csms_CongDan);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _csms_CongDanLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_csms_CongDanLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _csms_CongDanLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CSMS_CongDanLocalService getWrappedCSMS_CongDanLocalService() {
		return _csms_CongDanLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCSMS_CongDanLocalService(
		CSMS_CongDanLocalService csms_CongDanLocalService) {
		_csms_CongDanLocalService = csms_CongDanLocalService;
	}

	@Override
	public CSMS_CongDanLocalService getWrappedService() {
		return _csms_CongDanLocalService;
	}

	@Override
	public void setWrappedService(
		CSMS_CongDanLocalService csms_CongDanLocalService) {
		_csms_CongDanLocalService = csms_CongDanLocalService;
	}

	private CSMS_CongDanLocalService _csms_CongDanLocalService;
}