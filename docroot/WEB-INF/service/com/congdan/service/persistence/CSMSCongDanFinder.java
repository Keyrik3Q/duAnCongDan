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

/**
 * @author ADMIN
 */
public interface CSMSCongDanFinder {
	public java.util.List<java.lang.Object[]> findCSMSCongDans(
		java.lang.String ho, java.lang.String dem, java.lang.String ten,
		java.lang.String macongdan, int tinh, int huyen, int xa,
		java.lang.String sohochieu, java.lang.String name,
		java.lang.String ngaysinh, int socmnd, int Start, int ketThuc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public long countCSMSCongDans(java.lang.String ho, java.lang.String dem,
		java.lang.String ten, java.lang.String macongdan, int tinh, int huyen,
		int xa, java.lang.String sohochieu, java.lang.String name,
		java.lang.String ngaysinh, int socmnd)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<java.lang.Object[]> findHuyens(int idh, int Start,
		int ketThuc) throws com.liferay.portal.kernel.exception.SystemException;

	public long countCSMSHuyens(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<java.lang.Object[]> findXas(int idx, int Start,
		int ketThuc) throws com.liferay.portal.kernel.exception.SystemException;

	public long countXas(int idx)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<java.lang.Object[]> findHoKhaus(int idhk, int Start,
		int ketThuc) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<java.lang.Object[]> findHoTens(int Start, int ketThuc)
		throws com.liferay.portal.kernel.exception.SystemException;
}