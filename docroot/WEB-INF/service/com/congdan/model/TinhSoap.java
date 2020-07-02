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

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.congdan.service.http.TinhServiceSoap}.
 *
 * @author ADMIN
 * @see com.congdan.service.http.TinhServiceSoap
 * @generated
 */
public class TinhSoap implements Serializable {
	public static TinhSoap toSoapModel(Tinh model) {
		TinhSoap soapModel = new TinhSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setType(model.getType());

		return soapModel;
	}

	public static TinhSoap[] toSoapModels(Tinh[] models) {
		TinhSoap[] soapModels = new TinhSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TinhSoap[][] toSoapModels(Tinh[][] models) {
		TinhSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TinhSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TinhSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TinhSoap[] toSoapModels(List<Tinh> models) {
		List<TinhSoap> soapModels = new ArrayList<TinhSoap>(models.size());

		for (Tinh model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TinhSoap[soapModels.size()]);
	}

	public TinhSoap() {
	}

	public long getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public String getName() {
		return _Name;
	}

	public void setName(String Name) {
		_Name = Name;
	}

	public String getType() {
		return _Type;
	}

	public void setType(String Type) {
		_Type = Type;
	}

	private long _Id;
	private String _Name;
	private String _Type;
}