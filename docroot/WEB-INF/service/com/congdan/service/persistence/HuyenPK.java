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

package com.congdan.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author ADMIN
 * @generated
 */
public class HuyenPK implements Comparable<HuyenPK>, Serializable {
	public long Id;
	public String Name;
	public String Type;
	public long TinhId;

	public HuyenPK() {
	}

	public HuyenPK(long Id, String Name, String Type, long TinhId) {
		this.Id = Id;
		this.Name = Name;
		this.Type = Type;
		this.TinhId = TinhId;
	}

	public long getId() {
		return Id;
	}

	public void setId(long Id) {
		this.Id = Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String Type) {
		this.Type = Type;
	}

	public long getTinhId() {
		return TinhId;
	}

	public void setTinhId(long TinhId) {
		this.TinhId = TinhId;
	}

	@Override
	public int compareTo(HuyenPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (Id < pk.Id) {
			value = -1;
		}
		else if (Id > pk.Id) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = Name.compareTo(pk.Name);

		if (value != 0) {
			return value;
		}

		value = Type.compareTo(pk.Type);

		if (value != 0) {
			return value;
		}

		if (TinhId < pk.TinhId) {
			value = -1;
		}
		else if (TinhId > pk.TinhId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HuyenPK)) {
			return false;
		}

		HuyenPK pk = (HuyenPK)obj;

		if ((Id == pk.Id) && (Name.equals(pk.Name)) && (Type.equals(pk.Type)) &&
				(TinhId == pk.TinhId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(Id) + String.valueOf(Name) +
		String.valueOf(Type) + String.valueOf(TinhId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(20);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("Id");
		sb.append(StringPool.EQUAL);
		sb.append(Id);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("Name");
		sb.append(StringPool.EQUAL);
		sb.append(Name);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("Type");
		sb.append(StringPool.EQUAL);
		sb.append(Type);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("TinhId");
		sb.append(StringPool.EQUAL);
		sb.append(TinhId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}