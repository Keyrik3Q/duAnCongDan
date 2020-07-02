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

import java.io.Serializable;

import java.sql.Blob;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.congdan.service.http.PhotoServiceSoap}.
 *
 * @author ADMIN
 * @see com.congdan.service.http.PhotoServiceSoap
 * @generated
 */
public class PhotoSoap implements Serializable {
	public static PhotoSoap toSoapModel(Photo model) {
		PhotoSoap soapModel = new PhotoSoap();

		soapModel.setPhotoId(model.getPhotoId());
		soapModel.setPhotoName(model.getPhotoName());
		soapModel.setOwner(model.getOwner());
		soapModel.setData(model.getData());

		return soapModel;
	}

	public static PhotoSoap[] toSoapModels(Photo[] models) {
		PhotoSoap[] soapModels = new PhotoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PhotoSoap[][] toSoapModels(Photo[][] models) {
		PhotoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PhotoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PhotoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PhotoSoap[] toSoapModels(List<Photo> models) {
		List<PhotoSoap> soapModels = new ArrayList<PhotoSoap>(models.size());

		for (Photo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PhotoSoap[soapModels.size()]);
	}

	public PhotoSoap() {
	}

	public long getPrimaryKey() {
		return _photoId;
	}

	public void setPrimaryKey(long pk) {
		setPhotoId(pk);
	}

	public long getPhotoId() {
		return _photoId;
	}

	public void setPhotoId(long photoId) {
		_photoId = photoId;
	}

	public String getPhotoName() {
		return _photoName;
	}

	public void setPhotoName(String photoName) {
		_photoName = photoName;
	}

	public long getOwner() {
		return _owner;
	}

	public void setOwner(long owner) {
		_owner = owner;
	}

	public Blob getData() {
		return _data;
	}

	public void setData(Blob data) {
		_data = data;
	}

	private long _photoId;
	private String _photoName;
	private long _owner;
	private Blob _data;
}