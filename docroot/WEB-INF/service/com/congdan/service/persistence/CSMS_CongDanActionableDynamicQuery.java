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

import com.congdan.model.CSMS_CongDan;

import com.congdan.service.CSMS_CongDanLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author ADMIN
 * @generated
 */
public abstract class CSMS_CongDanActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public CSMS_CongDanActionableDynamicQuery() throws SystemException {
		setBaseLocalService(CSMS_CongDanLocalServiceUtil.getService());
		setClass(CSMS_CongDan.class);

		setClassLoader(com.congdan.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("Idcsms_CongDan");
	}
}