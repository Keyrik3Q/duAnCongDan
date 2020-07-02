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

package com.congdan.model;

import java.sql.Blob;

/**
 * The Blob model class for lazy loading the ImageData column in CSMSCongDan.
 *
 * @author ADMIN
 * @see CSMSCongDan
 * @generated
 */
public class CSMSCongDanImageDataBlobModel {
	public CSMSCongDanImageDataBlobModel() {
	}

	public CSMSCongDanImageDataBlobModel(long IdcsmsCongDan) {
		_IdcsmsCongDan = IdcsmsCongDan;
	}

	public CSMSCongDanImageDataBlobModel(long IdcsmsCongDan, Blob ImageDataBlob) {
		_IdcsmsCongDan = IdcsmsCongDan;
		_ImageDataBlob = ImageDataBlob;
	}

	public long getIdcsmsCongDan() {
		return _IdcsmsCongDan;
	}

	public void setIdcsmsCongDan(long IdcsmsCongDan) {
		_IdcsmsCongDan = IdcsmsCongDan;
	}

	public Blob getImageDataBlob() {
		return _ImageDataBlob;
	}

	public void setImageDataBlob(Blob ImageDataBlob) {
		_ImageDataBlob = ImageDataBlob;
	}

	private long _IdcsmsCongDan;
	private Blob _ImageDataBlob;
}