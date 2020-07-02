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
 * Provides a wrapper for {@link CSMS_CongDanService}.
 *
 * @author ADMIN
 * @see CSMS_CongDanService
 * @generated
 */
public class CSMS_CongDanServiceWrapper implements CSMS_CongDanService,
	ServiceWrapper<CSMS_CongDanService> {
	public CSMS_CongDanServiceWrapper(CSMS_CongDanService csms_CongDanService) {
		_csms_CongDanService = csms_CongDanService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _csms_CongDanService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_csms_CongDanService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _csms_CongDanService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CSMS_CongDanService getWrappedCSMS_CongDanService() {
		return _csms_CongDanService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCSMS_CongDanService(
		CSMS_CongDanService csms_CongDanService) {
		_csms_CongDanService = csms_CongDanService;
	}

	@Override
	public CSMS_CongDanService getWrappedService() {
		return _csms_CongDanService;
	}

	@Override
	public void setWrappedService(CSMS_CongDanService csms_CongDanService) {
		_csms_CongDanService = csms_CongDanService;
	}

	private CSMS_CongDanService _csms_CongDanService;
}