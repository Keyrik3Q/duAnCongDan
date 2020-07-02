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
 * This class is a wrapper for {@link Tinh}.
 * </p>
 *
 * @author ADMIN
 * @see Tinh
 * @generated
 */
public class TinhWrapper implements Tinh, ModelWrapper<Tinh> {
	public TinhWrapper(Tinh tinh) {
		_tinh = tinh;
	}

	@Override
	public Class<?> getModelClass() {
		return Tinh.class;
	}

	@Override
	public String getModelClassName() {
		return Tinh.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("Name", getName());
		attributes.put("Type", getType());

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
	}

	/**
	* Returns the primary key of this tinh.
	*
	* @return the primary key of this tinh
	*/
	@Override
	public long getPrimaryKey() {
		return _tinh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tinh.
	*
	* @param primaryKey the primary key of this tinh
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tinh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tinh.
	*
	* @return the ID of this tinh
	*/
	@Override
	public long getId() {
		return _tinh.getId();
	}

	/**
	* Sets the ID of this tinh.
	*
	* @param Id the ID of this tinh
	*/
	@Override
	public void setId(long Id) {
		_tinh.setId(Id);
	}

	/**
	* Returns the name of this tinh.
	*
	* @return the name of this tinh
	*/
	@Override
	public java.lang.String getName() {
		return _tinh.getName();
	}

	/**
	* Sets the name of this tinh.
	*
	* @param Name the name of this tinh
	*/
	@Override
	public void setName(java.lang.String Name) {
		_tinh.setName(Name);
	}

	/**
	* Returns the type of this tinh.
	*
	* @return the type of this tinh
	*/
	@Override
	public java.lang.String getType() {
		return _tinh.getType();
	}

	/**
	* Sets the type of this tinh.
	*
	* @param Type the type of this tinh
	*/
	@Override
	public void setType(java.lang.String Type) {
		_tinh.setType(Type);
	}

	@Override
	public boolean isNew() {
		return _tinh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tinh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tinh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tinh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tinh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tinh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tinh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tinh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tinh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tinh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tinh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TinhWrapper((Tinh)_tinh.clone());
	}

	@Override
	public int compareTo(com.congdan.model.Tinh tinh) {
		return _tinh.compareTo(tinh);
	}

	@Override
	public int hashCode() {
		return _tinh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.congdan.model.Tinh> toCacheModel() {
		return _tinh.toCacheModel();
	}

	@Override
	public com.congdan.model.Tinh toEscapedModel() {
		return new TinhWrapper(_tinh.toEscapedModel());
	}

	@Override
	public com.congdan.model.Tinh toUnescapedModel() {
		return new TinhWrapper(_tinh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tinh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tinh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tinh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TinhWrapper)) {
			return false;
		}

		TinhWrapper tinhWrapper = (TinhWrapper)obj;

		if (Validator.equals(_tinh, tinhWrapper._tinh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Tinh getWrappedTinh() {
		return _tinh;
	}

	@Override
	public Tinh getWrappedModel() {
		return _tinh;
	}

	@Override
	public void resetOriginalValues() {
		_tinh.resetOriginalValues();
	}

	private Tinh _tinh;
}