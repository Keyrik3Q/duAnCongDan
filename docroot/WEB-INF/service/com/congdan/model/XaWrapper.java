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
 * This class is a wrapper for {@link Xa}.
 * </p>
 *
 * @author ADMIN
 * @see Xa
 * @generated
 */
public class XaWrapper implements Xa, ModelWrapper<Xa> {
	public XaWrapper(Xa xa) {
		_xa = xa;
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

	/**
	* Returns the primary key of this xa.
	*
	* @return the primary key of this xa
	*/
	@Override
	public long getPrimaryKey() {
		return _xa.getPrimaryKey();
	}

	/**
	* Sets the primary key of this xa.
	*
	* @param primaryKey the primary key of this xa
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_xa.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this xa.
	*
	* @return the ID of this xa
	*/
	@Override
	public long getId() {
		return _xa.getId();
	}

	/**
	* Sets the ID of this xa.
	*
	* @param Id the ID of this xa
	*/
	@Override
	public void setId(long Id) {
		_xa.setId(Id);
	}

	/**
	* Returns the name of this xa.
	*
	* @return the name of this xa
	*/
	@Override
	public java.lang.String getName() {
		return _xa.getName();
	}

	/**
	* Sets the name of this xa.
	*
	* @param Name the name of this xa
	*/
	@Override
	public void setName(java.lang.String Name) {
		_xa.setName(Name);
	}

	/**
	* Returns the type of this xa.
	*
	* @return the type of this xa
	*/
	@Override
	public java.lang.String getType() {
		return _xa.getType();
	}

	/**
	* Sets the type of this xa.
	*
	* @param Type the type of this xa
	*/
	@Override
	public void setType(java.lang.String Type) {
		_xa.setType(Type);
	}

	/**
	* Returns the huyen ID of this xa.
	*
	* @return the huyen ID of this xa
	*/
	@Override
	public long getHuyenId() {
		return _xa.getHuyenId();
	}

	/**
	* Sets the huyen ID of this xa.
	*
	* @param HuyenId the huyen ID of this xa
	*/
	@Override
	public void setHuyenId(long HuyenId) {
		_xa.setHuyenId(HuyenId);
	}

	@Override
	public boolean isNew() {
		return _xa.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_xa.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _xa.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_xa.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _xa.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _xa.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_xa.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _xa.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_xa.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_xa.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_xa.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new XaWrapper((Xa)_xa.clone());
	}

	@Override
	public int compareTo(com.congdan.model.Xa xa) {
		return _xa.compareTo(xa);
	}

	@Override
	public int hashCode() {
		return _xa.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.congdan.model.Xa> toCacheModel() {
		return _xa.toCacheModel();
	}

	@Override
	public com.congdan.model.Xa toEscapedModel() {
		return new XaWrapper(_xa.toEscapedModel());
	}

	@Override
	public com.congdan.model.Xa toUnescapedModel() {
		return new XaWrapper(_xa.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _xa.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _xa.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_xa.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof XaWrapper)) {
			return false;
		}

		XaWrapper xaWrapper = (XaWrapper)obj;

		if (Validator.equals(_xa, xaWrapper._xa)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Xa getWrappedXa() {
		return _xa;
	}

	@Override
	public Xa getWrappedModel() {
		return _xa;
	}

	@Override
	public void resetOriginalValues() {
		_xa.resetOriginalValues();
	}

	private Xa _xa;
}