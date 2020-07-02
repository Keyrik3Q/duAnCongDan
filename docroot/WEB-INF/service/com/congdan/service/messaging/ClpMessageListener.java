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

package com.congdan.service.messaging;

import com.congdan.service.CSMSCongDanLocalServiceUtil;
import com.congdan.service.CSMSCongDanServiceUtil;
import com.congdan.service.ClpSerializer;
import com.congdan.service.HuyenLocalServiceUtil;
import com.congdan.service.HuyenServiceUtil;
import com.congdan.service.PhotoLocalServiceUtil;
import com.congdan.service.PhotoServiceUtil;
import com.congdan.service.TinhLocalServiceUtil;
import com.congdan.service.TinhServiceUtil;
import com.congdan.service.XaLocalServiceUtil;
import com.congdan.service.XaServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author ADMIN
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			CSMSCongDanLocalServiceUtil.clearService();

			CSMSCongDanServiceUtil.clearService();
			HuyenLocalServiceUtil.clearService();

			HuyenServiceUtil.clearService();
			PhotoLocalServiceUtil.clearService();

			PhotoServiceUtil.clearService();
			TinhLocalServiceUtil.clearService();

			TinhServiceUtil.clearService();
			XaLocalServiceUtil.clearService();

			XaServiceUtil.clearService();
		}
	}
}