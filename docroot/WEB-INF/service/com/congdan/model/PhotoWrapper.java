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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.sql.Blob;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Photo}.
 * </p>
 *
 * @author ADMIN
 * @see Photo
 * @generated
 */
public class PhotoWrapper implements Photo, ModelWrapper<Photo> {
	public PhotoWrapper(Photo photo) {
		_photo = photo;
	}

	@Override
	public Class<?> getModelClass() {
		return Photo.class;
	}

	@Override
	public String getModelClassName() {
		return Photo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("photoId", getPhotoId());
		attributes.put("photoName", getPhotoName());
		attributes.put("owner", getOwner());
		attributes.put("data", getData());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long photoId = (Long)attributes.get("photoId");

		if (photoId != null) {
			setPhotoId(photoId);
		}

		String photoName = (String)attributes.get("photoName");

		if (photoName != null) {
			setPhotoName(photoName);
		}

		Long owner = (Long)attributes.get("owner");

		if (owner != null) {
			setOwner(owner);
		}

		Blob data = (Blob)attributes.get("data");

		if (data != null) {
			setData(data);
		}
	}

	/**
	* Returns the primary key of this photo.
	*
	* @return the primary key of this photo
	*/
	@Override
	public long getPrimaryKey() {
		return _photo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this photo.
	*
	* @param primaryKey the primary key of this photo
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_photo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the photo ID of this photo.
	*
	* @return the photo ID of this photo
	*/
	@Override
	public long getPhotoId() {
		return _photo.getPhotoId();
	}

	/**
	* Sets the photo ID of this photo.
	*
	* @param photoId the photo ID of this photo
	*/
	@Override
	public void setPhotoId(long photoId) {
		_photo.setPhotoId(photoId);
	}

	/**
	* Returns the photo name of this photo.
	*
	* @return the photo name of this photo
	*/
	@Override
	public java.lang.String getPhotoName() {
		return _photo.getPhotoName();
	}

	/**
	* Sets the photo name of this photo.
	*
	* @param photoName the photo name of this photo
	*/
	@Override
	public void setPhotoName(java.lang.String photoName) {
		_photo.setPhotoName(photoName);
	}

	/**
	* Returns the owner of this photo.
	*
	* @return the owner of this photo
	*/
	@Override
	public long getOwner() {
		return _photo.getOwner();
	}

	/**
	* Sets the owner of this photo.
	*
	* @param owner the owner of this photo
	*/
	@Override
	public void setOwner(long owner) {
		_photo.setOwner(owner);
	}

	/**
	* Returns the data of this photo.
	*
	* @return the data of this photo
	*/
	@Override
	public java.sql.Blob getData() {
		return _photo.getData();
	}

	/**
	* Sets the data of this photo.
	*
	* @param data the data of this photo
	*/
	@Override
	public void setData(java.sql.Blob data) {
		_photo.setData(data);
	}

	@Override
	public boolean isNew() {
		return _photo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_photo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _photo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_photo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _photo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _photo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_photo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _photo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_photo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_photo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_photo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PhotoWrapper((Photo)_photo.clone());
	}

	@Override
	public int compareTo(com.congdan.model.Photo photo) {
		return _photo.compareTo(photo);
	}

	@Override
	public int hashCode() {
		return _photo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.congdan.model.Photo> toCacheModel() {
		return _photo.toCacheModel();
	}

	@Override
	public com.congdan.model.Photo toEscapedModel() {
		return new PhotoWrapper(_photo.toEscapedModel());
	}

	@Override
	public com.congdan.model.Photo toUnescapedModel() {
		return new PhotoWrapper(_photo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _photo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _photo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_photo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PhotoWrapper)) {
			return false;
		}

		PhotoWrapper photoWrapper = (PhotoWrapper)obj;

		if (Validator.equals(_photo, photoWrapper._photo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Photo getWrappedPhoto() {
		return _photo;
	}

	@Override
	public Photo getWrappedModel() {
		return _photo;
	}

	@Override
	public void resetOriginalValues() {
		_photo.resetOriginalValues();
	}

	private Photo _photo;
}