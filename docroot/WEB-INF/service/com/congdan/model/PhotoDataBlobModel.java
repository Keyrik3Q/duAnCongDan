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
 * The Blob model class for lazy loading the data column in Photo.
 *
 * @author ADMIN
 * @see Photo
 * @generated
 */
public class PhotoDataBlobModel {
	public PhotoDataBlobModel() {
	}

	public PhotoDataBlobModel(long photoId) {
		_photoId = photoId;
	}

	public PhotoDataBlobModel(long photoId, Blob dataBlob) {
		_photoId = photoId;
		_dataBlob = dataBlob;
	}

	public long getPhotoId() {
		return _photoId;
	}

	public void setPhotoId(long photoId) {
		_photoId = photoId;
	}

	public Blob getDataBlob() {
		return _dataBlob;
	}

	public void setDataBlob(Blob dataBlob) {
		_dataBlob = dataBlob;
	}

	private long _photoId;
	private Blob _dataBlob;
}