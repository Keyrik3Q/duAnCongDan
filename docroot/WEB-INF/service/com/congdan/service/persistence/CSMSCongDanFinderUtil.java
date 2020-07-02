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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author ADMIN
 */
public class CSMSCongDanFinderUtil {
	public static java.util.List<java.lang.Object[]> findCSMSCongDans(
		java.lang.String ho, java.lang.String dem, java.lang.String ten,
		java.lang.String macongdan, int tinh, int huyen, int xa,
		java.lang.String sohochieu, java.lang.String name,
		java.lang.String ngaysinh, int socmnd, int Start, int ketThuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findCSMSCongDans(ho, dem, ten, macongdan, tinh, huyen, xa,
			sohochieu, name, ngaysinh, socmnd, Start, ketThuc);
	}

	public static long countCSMSCongDans(java.lang.String ho,
		java.lang.String dem, java.lang.String ten, java.lang.String macongdan,
		int tinh, int huyen, int xa, java.lang.String sohochieu,
		java.lang.String name, java.lang.String ngaysinh, int socmnd)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countCSMSCongDans(ho, dem, ten, macongdan, tinh, huyen, xa,
			sohochieu, name, ngaysinh, socmnd);
	}

	public static java.util.List<java.lang.Object[]> findHuyens(int idh,
		int Start, int ketThuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findHuyens(idh, Start, ketThuc);
	}

	public static long countCSMSHuyens(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countCSMSHuyens(id);
	}

	public static java.util.List<java.lang.Object[]> findXas(int idx,
		int Start, int ketThuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findXas(idx, Start, ketThuc);
	}

	public static long countXas(int idx)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countXas(idx);
	}

	public static java.util.List<java.lang.Object[]> findHoKhaus(int idhk,
		int Start, int ketThuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findHoKhaus(idhk, Start, ketThuc);
	}

	public static java.util.List<java.lang.Object[]> findHoTens(int Start,
		int ketThuc) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findHoTens(Start, ketThuc);
	}

	public static CSMSCongDanFinder getFinder() {
		if (_finder == null) {
			_finder = (CSMSCongDanFinder)PortletBeanLocatorUtil.locate(com.congdan.service.ClpSerializer.getServletContextName(),
					CSMSCongDanFinder.class.getName());

			ReferenceRegistry.registerReference(CSMSCongDanFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(CSMSCongDanFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(CSMSCongDanFinderUtil.class,
			"_finder");
	}

	private static CSMSCongDanFinder _finder;
}