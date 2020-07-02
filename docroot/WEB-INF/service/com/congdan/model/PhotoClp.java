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

import com.congdan.service.ClpSerializer;
import com.congdan.service.PhotoLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.sql.Blob;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ADMIN
 */
public class PhotoClp extends BaseModelImpl<Photo> implements Photo {
	public PhotoClp() {
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
	public long getPrimaryKey() {
		return _photoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPhotoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _photoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getPhotoId() {
		return _photoId;
	}

	@Override
	public void setPhotoId(long photoId) {
		_photoId = photoId;

		if (_photoRemoteModel != null) {
			try {
				Class<?> clazz = _photoRemoteModel.getClass();

				Method method = clazz.getMethod("setPhotoId", long.class);

				method.invoke(_photoRemoteModel, photoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhotoName() {
		return _photoName;
	}

	@Override
	public void setPhotoName(String photoName) {
		_photoName = photoName;

		if (_photoRemoteModel != null) {
			try {
				Class<?> clazz = _photoRemoteModel.getClass();

				Method method = clazz.getMethod("setPhotoName", String.class);

				method.invoke(_photoRemoteModel, photoName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOwner() {
		return _owner;
	}

	@Override
	public void setOwner(long owner) {
		_owner = owner;

		if (_photoRemoteModel != null) {
			try {
				Class<?> clazz = _photoRemoteModel.getClass();

				Method method = clazz.getMethod("setOwner", long.class);

				method.invoke(_photoRemoteModel, owner);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Blob getData() {
		return _data;
	}

	@Override
	public void setData(Blob data) {
		_data = data;

		if (_photoRemoteModel != null) {
			try {
				Class<?> clazz = _photoRemoteModel.getClass();

				Method method = clazz.getMethod("setData", Blob.class);

				method.invoke(_photoRemoteModel, data);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPhotoRemoteModel() {
		return _photoRemoteModel;
	}

	public void setPhotoRemoteModel(BaseModel<?> photoRemoteModel) {
		_photoRemoteModel = photoRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _photoRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_photoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PhotoLocalServiceUtil.addPhoto(this);
		}
		else {
			PhotoLocalServiceUtil.updatePhoto(this);
		}
	}

	@Override
	public Photo toEscapedModel() {
		return (Photo)ProxyUtil.newProxyInstance(Photo.class.getClassLoader(),
			new Class[] { Photo.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PhotoClp clone = new PhotoClp();

		clone.setPhotoId(getPhotoId());
		clone.setPhotoName(getPhotoName());
		clone.setOwner(getOwner());
		clone.setData(getData());

		return clone;
	}

	@Override
	public int compareTo(Photo photo) {
		long primaryKey = photo.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PhotoClp)) {
			return false;
		}

		PhotoClp photo = (PhotoClp)obj;

		long primaryKey = photo.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{photoId=");
		sb.append(getPhotoId());
		sb.append(", photoName=");
		sb.append(getPhotoName());
		sb.append(", owner=");
		sb.append(getOwner());
		sb.append(", data=");
		sb.append(getData());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.congdan.model.Photo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>photoId</column-name><column-value><![CDATA[");
		sb.append(getPhotoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>photoName</column-name><column-value><![CDATA[");
		sb.append(getPhotoName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>owner</column-name><column-value><![CDATA[");
		sb.append(getOwner());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data</column-name><column-value><![CDATA[");
		sb.append(getData());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _photoId;
	private String _photoName;
	private long _owner;
	private Blob _data;
	private BaseModel<?> _photoRemoteModel;
	private Class<?> _clpSerializerClass = com.congdan.service.ClpSerializer.class;
}