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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Huyen}.
 * </p>
 *
 * @author ADMIN
 * @see Huyen
 * @generated
 */
public class HuyenWrapper implements Huyen, ModelWrapper<Huyen> {
	public HuyenWrapper(Huyen huyen) {
		_huyen = huyen;
	}

	@Override
	public Class<?> getModelClass() {
		return Huyen.class;
	}

	@Override
	public String getModelClassName() {
		return Huyen.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("Name", getName());
		attributes.put("Type", getType());
		attributes.put("TinhId", getTinhId());

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

		Long TinhId = (Long)attributes.get("TinhId");

		if (TinhId != null) {
			setTinhId(TinhId);
		}
	}

	/**
	* Returns the primary key of this huyen.
	*
	* @return the primary key of this huyen
	*/
	@Override
	public long getPrimaryKey() {
		return _huyen.getPrimaryKey();
	}

	/**
	* Sets the primary key of this huyen.
	*
	* @param primaryKey the primary key of this huyen
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_huyen.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this huyen.
	*
	* @return the ID of this huyen
	*/
	@Override
	public long getId() {
		return _huyen.getId();
	}

	/**
	* Sets the ID of this huyen.
	*
	* @param Id the ID of this huyen
	*/
	@Override
	public void setId(long Id) {
		_huyen.setId(Id);
	}

	/**
	* Returns the name of this huyen.
	*
	* @return the name of this huyen
	*/
	@Override
	public java.lang.String getName() {
		return _huyen.getName();
	}

	/**
	* Sets the name of this huyen.
	*
	* @param Name the name of this huyen
	*/
	@Override
	public void setName(java.lang.String Name) {
		_huyen.setName(Name);
	}

	/**
	* Returns the type of this huyen.
	*
	* @return the type of this huyen
	*/
	@Override
	public java.lang.String getType() {
		return _huyen.getType();
	}

	/**
	* Sets the type of this huyen.
	*
	* @param Type the type of this huyen
	*/
	@Override
	public void setType(java.lang.String Type) {
		_huyen.setType(Type);
	}

	/**
	* Returns the tinh ID of this huyen.
	*
	* @return the tinh ID of this huyen
	*/
	@Override
	public long getTinhId() {
		return _huyen.getTinhId();
	}

	/**
	* Sets the tinh ID of this huyen.
	*
	* @param TinhId the tinh ID of this huyen
	*/
	@Override
	public void setTinhId(long TinhId) {
		_huyen.setTinhId(TinhId);
	}

	@Override
	public boolean isNew() {
		return _huyen.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_huyen.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _huyen.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_huyen.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _huyen.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _huyen.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_huyen.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _huyen.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_huyen.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_huyen.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_huyen.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new HuyenWrapper((Huyen)_huyen.clone());
	}

	@Override
	public int compareTo(com.congdan.model.Huyen huyen) {
		return _huyen.compareTo(huyen);
	}

	@Override
	public int hashCode() {
		return _huyen.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.congdan.model.Huyen> toCacheModel() {
		return _huyen.toCacheModel();
	}

	@Override
	public com.congdan.model.Huyen toEscapedModel() {
		return new HuyenWrapper(_huyen.toEscapedModel());
	}

	@Override
	public com.congdan.model.Huyen toUnescapedModel() {
		return new HuyenWrapper(_huyen.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _huyen.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _huyen.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_huyen.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HuyenWrapper)) {
			return false;
		}

		HuyenWrapper huyenWrapper = (HuyenWrapper)obj;

		if (Validator.equals(_huyen, huyenWrapper._huyen)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Huyen getWrappedHuyen() {
		return _huyen;
	}

	@Override
	public Huyen getWrappedModel() {
		return _huyen;
	}

	@Override
	public void resetOriginalValues() {
		_huyen.resetOriginalValues();
	}

	private Huyen _huyen;
}