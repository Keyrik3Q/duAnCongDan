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
import com.congdan.service.XaLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ADMIN
 */
public class XaClp extends BaseModelImpl<Xa> implements Xa {
	public XaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Xa.class;
	}

	@Override
	public String getModelClassName() {
		return Xa.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _Id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("Name", getName());
		attributes.put("Type", getType());
		attributes.put("HuyenId", getHuyenId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		String Type = (String)attributes.get("Type");

		if (Type != null) {
			setType(Type);
		}

		Long HuyenId = (Long)attributes.get("HuyenId");

		if (HuyenId != null) {
			setHuyenId(HuyenId);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_xaRemoteModel != null) {
			try {
				Class<?> clazz = _xaRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_xaRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _Name;
	}

	@Override
	public void setName(String Name) {
		_Name = Name;

		if (_xaRemoteModel != null) {
			try {
				Class<?> clazz = _xaRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_xaRemoteModel, Name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getType() {
		return _Type;
	}

	@Override
	public void setType(String Type) {
		_Type = Type;

		if (_xaRemoteModel != null) {
			try {
				Class<?> clazz = _xaRemoteModel.getClass();

				Method method = clazz.getMethod("setType", String.class);

				method.invoke(_xaRemoteModel, Type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHuyenId() {
		return _HuyenId;
	}

	@Override
	public void setHuyenId(long HuyenId) {
		_HuyenId = HuyenId;

		if (_xaRemoteModel != null) {
			try {
				Class<?> clazz = _xaRemoteModel.getClass();

				Method method = clazz.getMethod("setHuyenId", long.class);

				method.invoke(_xaRemoteModel, HuyenId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getXaRemoteModel() {
		return _xaRemoteModel;
	}

	public void setXaRemoteModel(BaseModel<?> xaRemoteModel) {
		_xaRemoteModel = xaRemoteModel;
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

		Class<?> remoteModelClass = _xaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_xaRemoteModel, remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			XaLocalServiceUtil.addXa(this);
		}
		else {
			XaLocalServiceUtil.updateXa(this);
		}
	}

	@Override
	public Xa toEscapedModel() {
		return (Xa)ProxyUtil.newProxyInstance(Xa.class.getClassLoader(),
			new Class[] { Xa.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		XaClp clone = new XaClp();

		clone.setId(getId());
		clone.setName(getName());
		clone.setType(getType());
		clone.setHuyenId(getHuyenId());

		return clone;
	}

	@Override
	public int compareTo(Xa xa) {
		long primaryKey = xa.getPrimaryKey();

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

		if (!(obj instanceof XaClp)) {
			return false;
		}

		XaClp xa = (XaClp)obj;

		long primaryKey = xa.getPrimaryKey();

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

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", Name=");
		sb.append(getName());
		sb.append(", Type=");
		sb.append(getType());
		sb.append(", HuyenId=");
		sb.append(getHuyenId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.congdan.model.Xa");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>HuyenId</column-name><column-value><![CDATA[");
		sb.append(getHuyenId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _Name;
	private String _Type;
	private long _HuyenId;
	private BaseModel<?> _xaRemoteModel;
	private Class<?> _clpSerializerClass = com.congdan.service.ClpSerializer.class;
}