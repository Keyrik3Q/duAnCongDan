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

import com.congdan.service.CSMS_CongDanLocalServiceUtil;
import com.congdan.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ADMIN
 */
public class CSMS_CongDanClp extends BaseModelImpl<CSMS_CongDan>
	implements CSMS_CongDan {
	public CSMS_CongDanClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CSMS_CongDan.class;
	}

	@Override
	public String getModelClassName() {
		return CSMS_CongDan.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _Idcsms_CongDan;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIdcsms_CongDan(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Idcsms_CongDan;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Idcsms_CongDan", getIdcsms_CongDan());
		attributes.put("Ho", getHo());
		attributes.put("Dem", getDem());
		attributes.put("Ten", getTen());
		attributes.put("NgaySinh", getNgaySinh());
		attributes.put("GioiTinhId", getGioiTinhId());
		attributes.put("NoiSinhChiTiet", getNoiSinhChiTiet());
		attributes.put("NoiSinhXaId", getNoiSinhXaId());
		attributes.put("NoiSinhHuyenId", getNoiSinhHuyenId());
		attributes.put("NoiSinhTinhId", getNoiSinhTinhId());
		attributes.put("DanTocId", getDanTocId());
		attributes.put("QuocTichId", getQuocTichId());
		attributes.put("TonGiaoId", getTonGiaoId());
		attributes.put("DiaChiThuongTru", getDiaChiThuongTru());
		attributes.put("DiaChiThuongTruXaId", getDiaChiThuongTruXaId());
		attributes.put("DiaChiThuongTruHuyenId", getDiaChiThuongTruHuyenId());
		attributes.put("DiaChiThuongTruTinhId", getDiaChiThuongTruTinhId());
		attributes.put("DiaChiHienNay", getDiaChiHienNay());
		attributes.put("DiaChiHienNayXaId", getDiaChiHienNayXaId());
		attributes.put("DiaChiHienNayHuyenId", getDiaChiHienNayHuyenId());
		attributes.put("DiaChiHienNayTinhId", getDiaChiHienNayTinhId());
		attributes.put("TinhTrang", getTinhTrang());
		attributes.put("TinhtTranghonNhanId", getTinhtTranghonNhanId());
		attributes.put("socmnd", getSocmnd());
		attributes.put("NgayCapCMND", getNgayCapCMND());
		attributes.put("NoiCapCMND", getNoiCapCMND());
		attributes.put("SoHoKhau", getSoHoKhau());
		attributes.put("LaChuHo", getLaChuHo());
		attributes.put("QuanHeChuHoId", getQuanHeChuHoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Idcsms_CongDan = (Long)attributes.get("Idcsms_CongDan");

		if (Idcsms_CongDan != null) {
			setIdcsms_CongDan(Idcsms_CongDan);
		}

		String Ho = (String)attributes.get("Ho");

		if (Ho != null) {
			setHo(Ho);
		}

		String Dem = (String)attributes.get("Dem");

		if (Dem != null) {
			setDem(Dem);
		}

		String Ten = (String)attributes.get("Ten");

		if (Ten != null) {
			setTen(Ten);
		}

		Date NgaySinh = (Date)attributes.get("NgaySinh");

		if (NgaySinh != null) {
			setNgaySinh(NgaySinh);
		}

		Long GioiTinhId = (Long)attributes.get("GioiTinhId");

		if (GioiTinhId != null) {
			setGioiTinhId(GioiTinhId);
		}

		String NoiSinhChiTiet = (String)attributes.get("NoiSinhChiTiet");

		if (NoiSinhChiTiet != null) {
			setNoiSinhChiTiet(NoiSinhChiTiet);
		}

		Long NoiSinhXaId = (Long)attributes.get("NoiSinhXaId");

		if (NoiSinhXaId != null) {
			setNoiSinhXaId(NoiSinhXaId);
		}

		Long NoiSinhHuyenId = (Long)attributes.get("NoiSinhHuyenId");

		if (NoiSinhHuyenId != null) {
			setNoiSinhHuyenId(NoiSinhHuyenId);
		}

		Long NoiSinhTinhId = (Long)attributes.get("NoiSinhTinhId");

		if (NoiSinhTinhId != null) {
			setNoiSinhTinhId(NoiSinhTinhId);
		}

		Long DanTocId = (Long)attributes.get("DanTocId");

		if (DanTocId != null) {
			setDanTocId(DanTocId);
		}

		Long QuocTichId = (Long)attributes.get("QuocTichId");

		if (QuocTichId != null) {
			setQuocTichId(QuocTichId);
		}

		Long TonGiaoId = (Long)attributes.get("TonGiaoId");

		if (TonGiaoId != null) {
			setTonGiaoId(TonGiaoId);
		}

		String DiaChiThuongTru = (String)attributes.get("DiaChiThuongTru");

		if (DiaChiThuongTru != null) {
			setDiaChiThuongTru(DiaChiThuongTru);
		}

		Long DiaChiThuongTruXaId = (Long)attributes.get("DiaChiThuongTruXaId");

		if (DiaChiThuongTruXaId != null) {
			setDiaChiThuongTruXaId(DiaChiThuongTruXaId);
		}

		Long DiaChiThuongTruHuyenId = (Long)attributes.get(
				"DiaChiThuongTruHuyenId");

		if (DiaChiThuongTruHuyenId != null) {
			setDiaChiThuongTruHuyenId(DiaChiThuongTruHuyenId);
		}

		Long DiaChiThuongTruTinhId = (Long)attributes.get(
				"DiaChiThuongTruTinhId");

		if (DiaChiThuongTruTinhId != null) {
			setDiaChiThuongTruTinhId(DiaChiThuongTruTinhId);
		}

		String DiaChiHienNay = (String)attributes.get("DiaChiHienNay");

		if (DiaChiHienNay != null) {
			setDiaChiHienNay(DiaChiHienNay);
		}

		Long DiaChiHienNayXaId = (Long)attributes.get("DiaChiHienNayXaId");

		if (DiaChiHienNayXaId != null) {
			setDiaChiHienNayXaId(DiaChiHienNayXaId);
		}

		Long DiaChiHienNayHuyenId = (Long)attributes.get("DiaChiHienNayHuyenId");

		if (DiaChiHienNayHuyenId != null) {
			setDiaChiHienNayHuyenId(DiaChiHienNayHuyenId);
		}

		Long DiaChiHienNayTinhId = (Long)attributes.get("DiaChiHienNayTinhId");

		if (DiaChiHienNayTinhId != null) {
			setDiaChiHienNayTinhId(DiaChiHienNayTinhId);
		}

		Long TinhTrang = (Long)attributes.get("TinhTrang");

		if (TinhTrang != null) {
			setTinhTrang(TinhTrang);
		}

		Long TinhtTranghonNhanId = (Long)attributes.get("TinhtTranghonNhanId");

		if (TinhtTranghonNhanId != null) {
			setTinhtTranghonNhanId(TinhtTranghonNhanId);
		}

		String socmnd = (String)attributes.get("socmnd");

		if (socmnd != null) {
			setSocmnd(socmnd);
		}

		Date NgayCapCMND = (Date)attributes.get("NgayCapCMND");

		if (NgayCapCMND != null) {
			setNgayCapCMND(NgayCapCMND);
		}

		Long NoiCapCMND = (Long)attributes.get("NoiCapCMND");

		if (NoiCapCMND != null) {
			setNoiCapCMND(NoiCapCMND);
		}

		String SoHoKhau = (String)attributes.get("SoHoKhau");

		if (SoHoKhau != null) {
			setSoHoKhau(SoHoKhau);
		}

		Long LaChuHo = (Long)attributes.get("LaChuHo");

		if (LaChuHo != null) {
			setLaChuHo(LaChuHo);
		}

		Long QuanHeChuHoId = (Long)attributes.get("QuanHeChuHoId");

		if (QuanHeChuHoId != null) {
			setQuanHeChuHoId(QuanHeChuHoId);
		}
	}

	@Override
	public long getIdcsms_CongDan() {
		return _Idcsms_CongDan;
	}

	@Override
	public void setIdcsms_CongDan(long Idcsms_CongDan) {
		_Idcsms_CongDan = Idcsms_CongDan;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setIdcsms_CongDan", long.class);

				method.invoke(_csms_CongDanRemoteModel, Idcsms_CongDan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHo() {
		return _Ho;
	}

	@Override
	public void setHo(String Ho) {
		_Ho = Ho;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setHo", String.class);

				method.invoke(_csms_CongDanRemoteModel, Ho);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDem() {
		return _Dem;
	}

	@Override
	public void setDem(String Dem) {
		_Dem = Dem;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDem", String.class);

				method.invoke(_csms_CongDanRemoteModel, Dem);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTen() {
		return _Ten;
	}

	@Override
	public void setTen(String Ten) {
		_Ten = Ten;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_csms_CongDanRemoteModel, Ten);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgaySinh() {
		return _NgaySinh;
	}

	@Override
	public void setNgaySinh(Date NgaySinh) {
		_NgaySinh = NgaySinh;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaySinh", Date.class);

				method.invoke(_csms_CongDanRemoteModel, NgaySinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGioiTinhId() {
		return _GioiTinhId;
	}

	@Override
	public void setGioiTinhId(long GioiTinhId) {
		_GioiTinhId = GioiTinhId;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setGioiTinhId", long.class);

				method.invoke(_csms_CongDanRemoteModel, GioiTinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiSinhChiTiet() {
		return _NoiSinhChiTiet;
	}

	@Override
	public void setNoiSinhChiTiet(String NoiSinhChiTiet) {
		_NoiSinhChiTiet = NoiSinhChiTiet;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiSinhChiTiet",
						String.class);

				method.invoke(_csms_CongDanRemoteModel, NoiSinhChiTiet);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNoiSinhXaId() {
		return _NoiSinhXaId;
	}

	@Override
	public void setNoiSinhXaId(long NoiSinhXaId) {
		_NoiSinhXaId = NoiSinhXaId;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiSinhXaId", long.class);

				method.invoke(_csms_CongDanRemoteModel, NoiSinhXaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNoiSinhHuyenId() {
		return _NoiSinhHuyenId;
	}

	@Override
	public void setNoiSinhHuyenId(long NoiSinhHuyenId) {
		_NoiSinhHuyenId = NoiSinhHuyenId;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiSinhHuyenId", long.class);

				method.invoke(_csms_CongDanRemoteModel, NoiSinhHuyenId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNoiSinhTinhId() {
		return _NoiSinhTinhId;
	}

	@Override
	public void setNoiSinhTinhId(long NoiSinhTinhId) {
		_NoiSinhTinhId = NoiSinhTinhId;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiSinhTinhId", long.class);

				method.invoke(_csms_CongDanRemoteModel, NoiSinhTinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDanTocId() {
		return _DanTocId;
	}

	@Override
	public void setDanTocId(long DanTocId) {
		_DanTocId = DanTocId;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDanTocId", long.class);

				method.invoke(_csms_CongDanRemoteModel, DanTocId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getQuocTichId() {
		return _QuocTichId;
	}

	@Override
	public void setQuocTichId(long QuocTichId) {
		_QuocTichId = QuocTichId;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setQuocTichId", long.class);

				method.invoke(_csms_CongDanRemoteModel, QuocTichId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTonGiaoId() {
		return _TonGiaoId;
	}

	@Override
	public void setTonGiaoId(long TonGiaoId) {
		_TonGiaoId = TonGiaoId;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setTonGiaoId", long.class);

				method.invoke(_csms_CongDanRemoteModel, TonGiaoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChiThuongTru() {
		return _DiaChiThuongTru;
	}

	@Override
	public void setDiaChiThuongTru(String DiaChiThuongTru) {
		_DiaChiThuongTru = DiaChiThuongTru;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiThuongTru",
						String.class);

				method.invoke(_csms_CongDanRemoteModel, DiaChiThuongTru);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDiaChiThuongTruXaId() {
		return _DiaChiThuongTruXaId;
	}

	@Override
	public void setDiaChiThuongTruXaId(long DiaChiThuongTruXaId) {
		_DiaChiThuongTruXaId = DiaChiThuongTruXaId;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiThuongTruXaId",
						long.class);

				method.invoke(_csms_CongDanRemoteModel, DiaChiThuongTruXaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDiaChiThuongTruHuyenId() {
		return _DiaChiThuongTruHuyenId;
	}

	@Override
	public void setDiaChiThuongTruHuyenId(long DiaChiThuongTruHuyenId) {
		_DiaChiThuongTruHuyenId = DiaChiThuongTruHuyenId;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiThuongTruHuyenId",
						long.class);

				method.invoke(_csms_CongDanRemoteModel, DiaChiThuongTruHuyenId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDiaChiThuongTruTinhId() {
		return _DiaChiThuongTruTinhId;
	}

	@Override
	public void setDiaChiThuongTruTinhId(long DiaChiThuongTruTinhId) {
		_DiaChiThuongTruTinhId = DiaChiThuongTruTinhId;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiThuongTruTinhId",
						long.class);

				method.invoke(_csms_CongDanRemoteModel, DiaChiThuongTruTinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChiHienNay() {
		return _DiaChiHienNay;
	}

	@Override
	public void setDiaChiHienNay(String DiaChiHienNay) {
		_DiaChiHienNay = DiaChiHienNay;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiHienNay", String.class);

				method.invoke(_csms_CongDanRemoteModel, DiaChiHienNay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDiaChiHienNayXaId() {
		return _DiaChiHienNayXaId;
	}

	@Override
	public void setDiaChiHienNayXaId(long DiaChiHienNayXaId) {
		_DiaChiHienNayXaId = DiaChiHienNayXaId;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiHienNayXaId",
						long.class);

				method.invoke(_csms_CongDanRemoteModel, DiaChiHienNayXaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDiaChiHienNayHuyenId() {
		return _DiaChiHienNayHuyenId;
	}

	@Override
	public void setDiaChiHienNayHuyenId(long DiaChiHienNayHuyenId) {
		_DiaChiHienNayHuyenId = DiaChiHienNayHuyenId;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiHienNayHuyenId",
						long.class);

				method.invoke(_csms_CongDanRemoteModel, DiaChiHienNayHuyenId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDiaChiHienNayTinhId() {
		return _DiaChiHienNayTinhId;
	}

	@Override
	public void setDiaChiHienNayTinhId(long DiaChiHienNayTinhId) {
		_DiaChiHienNayTinhId = DiaChiHienNayTinhId;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiHienNayTinhId",
						long.class);

				method.invoke(_csms_CongDanRemoteModel, DiaChiHienNayTinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTinhTrang() {
		return _TinhTrang;
	}

	@Override
	public void setTinhTrang(long TinhTrang) {
		_TinhTrang = TinhTrang;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setTinhTrang", long.class);

				method.invoke(_csms_CongDanRemoteModel, TinhTrang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTinhtTranghonNhanId() {
		return _TinhtTranghonNhanId;
	}

	@Override
	public void setTinhtTranghonNhanId(long TinhtTranghonNhanId) {
		_TinhtTranghonNhanId = TinhtTranghonNhanId;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setTinhtTranghonNhanId",
						long.class);

				method.invoke(_csms_CongDanRemoteModel, TinhtTranghonNhanId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSocmnd() {
		return _socmnd;
	}

	@Override
	public void setSocmnd(String socmnd) {
		_socmnd = socmnd;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setSocmnd", String.class);

				method.invoke(_csms_CongDanRemoteModel, socmnd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapCMND() {
		return _NgayCapCMND;
	}

	@Override
	public void setNgayCapCMND(Date NgayCapCMND) {
		_NgayCapCMND = NgayCapCMND;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapCMND", Date.class);

				method.invoke(_csms_CongDanRemoteModel, NgayCapCMND);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNoiCapCMND() {
		return _NoiCapCMND;
	}

	@Override
	public void setNoiCapCMND(long NoiCapCMND) {
		_NoiCapCMND = NoiCapCMND;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiCapCMND", long.class);

				method.invoke(_csms_CongDanRemoteModel, NoiCapCMND);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoHoKhau() {
		return _SoHoKhau;
	}

	@Override
	public void setSoHoKhau(String SoHoKhau) {
		_SoHoKhau = SoHoKhau;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setSoHoKhau", String.class);

				method.invoke(_csms_CongDanRemoteModel, SoHoKhau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLaChuHo() {
		return _LaChuHo;
	}

	@Override
	public void setLaChuHo(long LaChuHo) {
		_LaChuHo = LaChuHo;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setLaChuHo", long.class);

				method.invoke(_csms_CongDanRemoteModel, LaChuHo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getQuanHeChuHoId() {
		return _QuanHeChuHoId;
	}

	@Override
	public void setQuanHeChuHoId(long QuanHeChuHoId) {
		_QuanHeChuHoId = QuanHeChuHoId;

		if (_csms_CongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csms_CongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setQuanHeChuHoId", long.class);

				method.invoke(_csms_CongDanRemoteModel, QuanHeChuHoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCSMS_CongDanRemoteModel() {
		return _csms_CongDanRemoteModel;
	}

	public void setCSMS_CongDanRemoteModel(BaseModel<?> csms_CongDanRemoteModel) {
		_csms_CongDanRemoteModel = csms_CongDanRemoteModel;
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

		Class<?> remoteModelClass = _csms_CongDanRemoteModel.getClass();

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

		Object returnValue = method.invoke(_csms_CongDanRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CSMS_CongDanLocalServiceUtil.addCSMS_CongDan(this);
		}
		else {
			CSMS_CongDanLocalServiceUtil.updateCSMS_CongDan(this);
		}
	}

	@Override
	public CSMS_CongDan toEscapedModel() {
		return (CSMS_CongDan)ProxyUtil.newProxyInstance(CSMS_CongDan.class.getClassLoader(),
			new Class[] { CSMS_CongDan.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CSMS_CongDanClp clone = new CSMS_CongDanClp();

		clone.setIdcsms_CongDan(getIdcsms_CongDan());
		clone.setHo(getHo());
		clone.setDem(getDem());
		clone.setTen(getTen());
		clone.setNgaySinh(getNgaySinh());
		clone.setGioiTinhId(getGioiTinhId());
		clone.setNoiSinhChiTiet(getNoiSinhChiTiet());
		clone.setNoiSinhXaId(getNoiSinhXaId());
		clone.setNoiSinhHuyenId(getNoiSinhHuyenId());
		clone.setNoiSinhTinhId(getNoiSinhTinhId());
		clone.setDanTocId(getDanTocId());
		clone.setQuocTichId(getQuocTichId());
		clone.setTonGiaoId(getTonGiaoId());
		clone.setDiaChiThuongTru(getDiaChiThuongTru());
		clone.setDiaChiThuongTruXaId(getDiaChiThuongTruXaId());
		clone.setDiaChiThuongTruHuyenId(getDiaChiThuongTruHuyenId());
		clone.setDiaChiThuongTruTinhId(getDiaChiThuongTruTinhId());
		clone.setDiaChiHienNay(getDiaChiHienNay());
		clone.setDiaChiHienNayXaId(getDiaChiHienNayXaId());
		clone.setDiaChiHienNayHuyenId(getDiaChiHienNayHuyenId());
		clone.setDiaChiHienNayTinhId(getDiaChiHienNayTinhId());
		clone.setTinhTrang(getTinhTrang());
		clone.setTinhtTranghonNhanId(getTinhtTranghonNhanId());
		clone.setSocmnd(getSocmnd());
		clone.setNgayCapCMND(getNgayCapCMND());
		clone.setNoiCapCMND(getNoiCapCMND());
		clone.setSoHoKhau(getSoHoKhau());
		clone.setLaChuHo(getLaChuHo());
		clone.setQuanHeChuHoId(getQuanHeChuHoId());

		return clone;
	}

	@Override
	public int compareTo(CSMS_CongDan csms_CongDan) {
		long primaryKey = csms_CongDan.getPrimaryKey();

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

		if (!(obj instanceof CSMS_CongDanClp)) {
			return false;
		}

		CSMS_CongDanClp csms_CongDan = (CSMS_CongDanClp)obj;

		long primaryKey = csms_CongDan.getPrimaryKey();

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
		StringBundler sb = new StringBundler(59);

		sb.append("{Idcsms_CongDan=");
		sb.append(getIdcsms_CongDan());
		sb.append(", Ho=");
		sb.append(getHo());
		sb.append(", Dem=");
		sb.append(getDem());
		sb.append(", Ten=");
		sb.append(getTen());
		sb.append(", NgaySinh=");
		sb.append(getNgaySinh());
		sb.append(", GioiTinhId=");
		sb.append(getGioiTinhId());
		sb.append(", NoiSinhChiTiet=");
		sb.append(getNoiSinhChiTiet());
		sb.append(", NoiSinhXaId=");
		sb.append(getNoiSinhXaId());
		sb.append(", NoiSinhHuyenId=");
		sb.append(getNoiSinhHuyenId());
		sb.append(", NoiSinhTinhId=");
		sb.append(getNoiSinhTinhId());
		sb.append(", DanTocId=");
		sb.append(getDanTocId());
		sb.append(", QuocTichId=");
		sb.append(getQuocTichId());
		sb.append(", TonGiaoId=");
		sb.append(getTonGiaoId());
		sb.append(", DiaChiThuongTru=");
		sb.append(getDiaChiThuongTru());
		sb.append(", DiaChiThuongTruXaId=");
		sb.append(getDiaChiThuongTruXaId());
		sb.append(", DiaChiThuongTruHuyenId=");
		sb.append(getDiaChiThuongTruHuyenId());
		sb.append(", DiaChiThuongTruTinhId=");
		sb.append(getDiaChiThuongTruTinhId());
		sb.append(", DiaChiHienNay=");
		sb.append(getDiaChiHienNay());
		sb.append(", DiaChiHienNayXaId=");
		sb.append(getDiaChiHienNayXaId());
		sb.append(", DiaChiHienNayHuyenId=");
		sb.append(getDiaChiHienNayHuyenId());
		sb.append(", DiaChiHienNayTinhId=");
		sb.append(getDiaChiHienNayTinhId());
		sb.append(", TinhTrang=");
		sb.append(getTinhTrang());
		sb.append(", TinhtTranghonNhanId=");
		sb.append(getTinhtTranghonNhanId());
		sb.append(", socmnd=");
		sb.append(getSocmnd());
		sb.append(", NgayCapCMND=");
		sb.append(getNgayCapCMND());
		sb.append(", NoiCapCMND=");
		sb.append(getNoiCapCMND());
		sb.append(", SoHoKhau=");
		sb.append(getSoHoKhau());
		sb.append(", LaChuHo=");
		sb.append(getLaChuHo());
		sb.append(", QuanHeChuHoId=");
		sb.append(getQuanHeChuHoId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(91);

		sb.append("<model><model-name>");
		sb.append("com.congdan.model.CSMS_CongDan");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Idcsms_CongDan</column-name><column-value><![CDATA[");
		sb.append(getIdcsms_CongDan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Ho</column-name><column-value><![CDATA[");
		sb.append(getHo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Dem</column-name><column-value><![CDATA[");
		sb.append(getDem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Ten</column-name><column-value><![CDATA[");
		sb.append(getTen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgaySinh</column-name><column-value><![CDATA[");
		sb.append(getNgaySinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GioiTinhId</column-name><column-value><![CDATA[");
		sb.append(getGioiTinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NoiSinhChiTiet</column-name><column-value><![CDATA[");
		sb.append(getNoiSinhChiTiet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NoiSinhXaId</column-name><column-value><![CDATA[");
		sb.append(getNoiSinhXaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NoiSinhHuyenId</column-name><column-value><![CDATA[");
		sb.append(getNoiSinhHuyenId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NoiSinhTinhId</column-name><column-value><![CDATA[");
		sb.append(getNoiSinhTinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DanTocId</column-name><column-value><![CDATA[");
		sb.append(getDanTocId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QuocTichId</column-name><column-value><![CDATA[");
		sb.append(getQuocTichId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TonGiaoId</column-name><column-value><![CDATA[");
		sb.append(getTonGiaoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DiaChiThuongTru</column-name><column-value><![CDATA[");
		sb.append(getDiaChiThuongTru());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DiaChiThuongTruXaId</column-name><column-value><![CDATA[");
		sb.append(getDiaChiThuongTruXaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DiaChiThuongTruHuyenId</column-name><column-value><![CDATA[");
		sb.append(getDiaChiThuongTruHuyenId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DiaChiThuongTruTinhId</column-name><column-value><![CDATA[");
		sb.append(getDiaChiThuongTruTinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DiaChiHienNay</column-name><column-value><![CDATA[");
		sb.append(getDiaChiHienNay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DiaChiHienNayXaId</column-name><column-value><![CDATA[");
		sb.append(getDiaChiHienNayXaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DiaChiHienNayHuyenId</column-name><column-value><![CDATA[");
		sb.append(getDiaChiHienNayHuyenId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DiaChiHienNayTinhId</column-name><column-value><![CDATA[");
		sb.append(getDiaChiHienNayTinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TinhTrang</column-name><column-value><![CDATA[");
		sb.append(getTinhTrang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TinhtTranghonNhanId</column-name><column-value><![CDATA[");
		sb.append(getTinhtTranghonNhanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>socmnd</column-name><column-value><![CDATA[");
		sb.append(getSocmnd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayCapCMND</column-name><column-value><![CDATA[");
		sb.append(getNgayCapCMND());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NoiCapCMND</column-name><column-value><![CDATA[");
		sb.append(getNoiCapCMND());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoHoKhau</column-name><column-value><![CDATA[");
		sb.append(getSoHoKhau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LaChuHo</column-name><column-value><![CDATA[");
		sb.append(getLaChuHo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>QuanHeChuHoId</column-name><column-value><![CDATA[");
		sb.append(getQuanHeChuHoId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Idcsms_CongDan;
	private String _Ho;
	private String _Dem;
	private String _Ten;
	private Date _NgaySinh;
	private long _GioiTinhId;
	private String _NoiSinhChiTiet;
	private long _NoiSinhXaId;
	private long _NoiSinhHuyenId;
	private long _NoiSinhTinhId;
	private long _DanTocId;
	private long _QuocTichId;
	private long _TonGiaoId;
	private String _DiaChiThuongTru;
	private long _DiaChiThuongTruXaId;
	private long _DiaChiThuongTruHuyenId;
	private long _DiaChiThuongTruTinhId;
	private String _DiaChiHienNay;
	private long _DiaChiHienNayXaId;
	private long _DiaChiHienNayHuyenId;
	private long _DiaChiHienNayTinhId;
	private long _TinhTrang;
	private long _TinhtTranghonNhanId;
	private String _socmnd;
	private Date _NgayCapCMND;
	private long _NoiCapCMND;
	private String _SoHoKhau;
	private long _LaChuHo;
	private long _QuanHeChuHoId;
	private BaseModel<?> _csms_CongDanRemoteModel;
	private Class<?> _clpSerializerClass = com.congdan.service.ClpSerializer.class;
}