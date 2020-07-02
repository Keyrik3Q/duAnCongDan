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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.sql.Blob;

/**
 * The base model interface for the Photo service. Represents a row in the &quot;photo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.congdan.model.impl.PhotoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.congdan.model.impl.PhotoImpl}.
 * </p>
 *
 * @author ADMIN
 * @see Photo
 * @see com.congdan.model.impl.PhotoImpl
 * @see com.congdan.model.impl.PhotoModelImpl
 * @generated
 */
public interface PhotoModel extends BaseModel<Photo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a photo model instance should use the {@link Photo} interface instead.
	 */

	/**
	 * Returns the primary key of this photo.
	 *
	 * @return the primary key of this photo
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this photo.
	 *
	 * @param primaryKey the primary key of this photo
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the photo ID of this photo.
	 *
	 * @return the photo ID of this photo
	 */
	public long getPhotoId();

	/**
	 * Sets the photo ID of this photo.
	 *
	 * @param photoId the photo ID of this photo
	 */
	public void setPhotoId(long photoId);

	/**
	 * Returns the photo name of this photo.
	 *
	 * @return the photo name of this photo
	 */
	@AutoEscape
	public String getPhotoName();

	/**
	 * Sets the photo name of this photo.
	 *
	 * @param photoName the photo name of this photo
	 */
	public void setPhotoName(String photoName);

	/**
	 * Returns the owner of this photo.
	 *
	 * @return the owner of this photo
	 */
	public long getOwner();

	/**
	 * Sets the owner of this photo.
	 *
	 * @param owner the owner of this photo
	 */
	public void setOwner(long owner);

	/**
	 * Returns the data of this photo.
	 *
	 * @return the data of this photo
	 */
	public Blob getData();

	/**
	 * Sets the data of this photo.
	 *
	 * @param data the data of this photo
	 */
	public void setData(Blob data);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.congdan.model.Photo photo);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.congdan.model.Photo> toCacheModel();

	@Override
	public com.congdan.model.Photo toEscapedModel();

	@Override
	public com.congdan.model.Photo toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}