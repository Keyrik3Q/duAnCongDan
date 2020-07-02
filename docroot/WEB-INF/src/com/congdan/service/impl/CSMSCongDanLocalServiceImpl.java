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

package com.congdan.service.impl;

import java.util.List;

import com.congdan.service.base.CSMSCongDanLocalServiceBaseImpl;
import com.congdan.service.persistence.CSMSCongDanFinderUtil;
import com.liferay.portal.kernel.exception.SystemException;

public class CSMSCongDanLocalServiceImpl extends CSMSCongDanLocalServiceBaseImpl {
		public List<Object[]> findCSMSCongDans(String ho, String dem, String ten,String macongdan,int tinh, int huyen,int xa ,String sohochieu,String name,String ngaysinh,int socmnd ,int Start, int ketThuc) throws SystemException {
			return CSMSCongDanFinderUtil.findCSMSCongDans(ho, dem, ten, macongdan, tinh, huyen, xa, sohochieu, name, ngaysinh, socmnd, Start, ketThuc);
		}
		public long countCSMSCongDans(String ho, String dem, String ten,String macongdan,int tinh, int huyen,int xa ,String sohochieu,String name,String ngaysinh,int socmnd) throws SystemException{
			return CSMSCongDanFinderUtil.countCSMSCongDans(ho, dem, ten, macongdan, tinh, huyen, xa, sohochieu, name, ngaysinh, socmnd);
		}
		
		public List<Object[]> findHuyens(int idh,int Start, int ketThuc) throws SystemException {
			return CSMSCongDanFinderUtil.findHuyens(idh,Start, ketThuc);
	}
		public List<Object[]> findXas(int idx,int Start, int ketThuc) throws SystemException {
			return CSMSCongDanFinderUtil.findXas(idx,Start, ketThuc);
	}
		public List<Object[]> findHoTens(int Start, int ketThuc) throws SystemException {
			return CSMSCongDanFinderUtil.findHoTens(Start, ketThuc);
		}
		
		}