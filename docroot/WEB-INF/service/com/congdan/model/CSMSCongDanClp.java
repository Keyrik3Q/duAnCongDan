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

import com.congdan.service.CSMSCongDanLocalServiceUtil;
import com.congdan.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ADMIN
 */
public class CSMSCongDanClp extends BaseModelImpl<CSMSCongDan>
	implements CSMSCongDan {
	public CSMSCongDanClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CSMSCongDan.class;
	}

	@Override
	public String getModelClassName() {
		return CSMSCongDan.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _IdcsmsCongDan;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIdcsmsCongDan(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _IdcsmsCongDan;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("IdcsmsCongDan", getIdcsmsCongDan());
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
		attributes.put("SoHoChieu", getSoHoChieu());
		attributes.put("NgayCapSHC", getNgayCapSHC());
		attributes.put("NgayHetHanSHC", getNgayHetHanSHC());
		attributes.put("NoiCapSHC", getNoiCapSHC());
		attributes.put("MaCongDan", getMaCongDan());
		attributes.put("ImageData", getImageData());
		attributes.put("ImgName", getImgName());
		attributes.put("TenCha", getTenCha());
		attributes.put("NgaySinhCha", getNgaySinhCha());
		attributes.put("TenMe", getTenMe());
		attributes.put("NgaySinhMe", getNgaySinhMe());
		attributes.put("TenVo", getTenVo());
		attributes.put("NgaySinhVo", getNgaySinhVo());
		attributes.put("Sdt", getSdt());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long IdcsmsCongDan = (Long)attributes.get("IdcsmsCongDan");

		if (IdcsmsCongDan != null) {
			setIdcsmsCongDan(IdcsmsCongDan);
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

		String DanTocId = (String)attributes.get("DanTocId");

		if (DanTocId != null) {
			setDanTocId(DanTocId);
		}

		String QuocTichId = (String)attributes.get("QuocTichId");

		if (QuocTichId != null) {
			setQuocTichId(QuocTichId);
		}

		String TonGiaoId = (String)attributes.get("TonGiaoId");

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

		String NoiCapCMND = (String)attributes.get("NoiCapCMND");

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

		String SoHoChieu = (String)attributes.get("SoHoChieu");

		if (SoHoChieu != null) {
			setSoHoChieu(SoHoChieu);
		}

		Date NgayCapSHC = (Date)attributes.get("NgayCapSHC");

		if (NgayCapSHC != null) {
			setNgayCapSHC(NgayCapSHC);
		}

		Date NgayHetHanSHC = (Date)attributes.get("NgayHetHanSHC");

		if (NgayHetHanSHC != null) {
			setNgayHetHanSHC(NgayHetHanSHC);
		}

		String NoiCapSHC = (String)attributes.get("NoiCapSHC");

		if (NoiCapSHC != null) {
			setNoiCapSHC(NoiCapSHC);
		}

		Long MaCongDan = (Long)attributes.get("MaCongDan");

		if (MaCongDan != null) {
			setMaCongDan(MaCongDan);
		}

		Blob ImageData = (Blob)attributes.get("ImageData");

		if (ImageData != null) {
			setImageData(ImageData);
		}

		String ImgName = (String)attributes.get("ImgName");

		if (ImgName != null) {
			setImgName(ImgName);
		}

		String TenCha = (String)attributes.get("TenCha");

		if (TenCha != null) {
			setTenCha(TenCha);
		}

		Date NgaySinhCha = (Date)attributes.get("NgaySinhCha");

		if (NgaySinhCha != null) {
			setNgaySinhCha(NgaySinhCha);
		}

		String TenMe = (String)attributes.get("TenMe");

		if (TenMe != null) {
			setTenMe(TenMe);
		}

		Date NgaySinhMe = (Date)attributes.get("NgaySinhMe");

		if (NgaySinhMe != null) {
			setNgaySinhMe(NgaySinhMe);
		}

		String TenVo = (String)attributes.get("TenVo");

		if (TenVo != null) {
			setTenVo(TenVo);
		}

		Date NgaySinhVo = (Date)attributes.get("NgaySinhVo");

		if (NgaySinhVo != null) {
			setNgaySinhVo(NgaySinhVo);
		}

		Long Sdt = (Long)attributes.get("Sdt");

		if (Sdt != null) {
			setSdt(Sdt);
		}
	}

	@Override
	public long getIdcsmsCongDan() {
		return _IdcsmsCongDan;
	}

	@Override
	public void setIdcsmsCongDan(long IdcsmsCongDan) {
		_IdcsmsCongDan = IdcsmsCongDan;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setIdcsmsCongDan", long.class);

				method.invoke(_csmsCongDanRemoteModel, IdcsmsCongDan);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setHo", String.class);

				method.invoke(_csmsCongDanRemoteModel, Ho);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDem", String.class);

				method.invoke(_csmsCongDanRemoteModel, Dem);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_csmsCongDanRemoteModel, Ten);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaySinh", Date.class);

				method.invoke(_csmsCongDanRemoteModel, NgaySinh);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setGioiTinhId", long.class);

				method.invoke(_csmsCongDanRemoteModel, GioiTinhId);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiSinhChiTiet",
						String.class);

				method.invoke(_csmsCongDanRemoteModel, NoiSinhChiTiet);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiSinhXaId", long.class);

				method.invoke(_csmsCongDanRemoteModel, NoiSinhXaId);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiSinhHuyenId", long.class);

				method.invoke(_csmsCongDanRemoteModel, NoiSinhHuyenId);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiSinhTinhId", long.class);

				method.invoke(_csmsCongDanRemoteModel, NoiSinhTinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDanTocId() {
		return _DanTocId;
	}

	@Override
	public void setDanTocId(String DanTocId) {
		_DanTocId = DanTocId;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDanTocId", String.class);

				method.invoke(_csmsCongDanRemoteModel, DanTocId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuocTichId() {
		return _QuocTichId;
	}

	@Override
	public void setQuocTichId(String QuocTichId) {
		_QuocTichId = QuocTichId;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setQuocTichId", String.class);

				method.invoke(_csmsCongDanRemoteModel, QuocTichId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTonGiaoId() {
		return _TonGiaoId;
	}

	@Override
	public void setTonGiaoId(String TonGiaoId) {
		_TonGiaoId = TonGiaoId;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setTonGiaoId", String.class);

				method.invoke(_csmsCongDanRemoteModel, TonGiaoId);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiThuongTru",
						String.class);

				method.invoke(_csmsCongDanRemoteModel, DiaChiThuongTru);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiThuongTruXaId",
						long.class);

				method.invoke(_csmsCongDanRemoteModel, DiaChiThuongTruXaId);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiThuongTruHuyenId",
						long.class);

				method.invoke(_csmsCongDanRemoteModel, DiaChiThuongTruHuyenId);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiThuongTruTinhId",
						long.class);

				method.invoke(_csmsCongDanRemoteModel, DiaChiThuongTruTinhId);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiHienNay", String.class);

				method.invoke(_csmsCongDanRemoteModel, DiaChiHienNay);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiHienNayXaId",
						long.class);

				method.invoke(_csmsCongDanRemoteModel, DiaChiHienNayXaId);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiHienNayHuyenId",
						long.class);

				method.invoke(_csmsCongDanRemoteModel, DiaChiHienNayHuyenId);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiHienNayTinhId",
						long.class);

				method.invoke(_csmsCongDanRemoteModel, DiaChiHienNayTinhId);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setTinhTrang", long.class);

				method.invoke(_csmsCongDanRemoteModel, TinhTrang);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setTinhtTranghonNhanId",
						long.class);

				method.invoke(_csmsCongDanRemoteModel, TinhtTranghonNhanId);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setSocmnd", String.class);

				method.invoke(_csmsCongDanRemoteModel, socmnd);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapCMND", Date.class);

				method.invoke(_csmsCongDanRemoteModel, NgayCapCMND);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiCapCMND() {
		return _NoiCapCMND;
	}

	@Override
	public void setNoiCapCMND(String NoiCapCMND) {
		_NoiCapCMND = NoiCapCMND;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiCapCMND", String.class);

				method.invoke(_csmsCongDanRemoteModel, NoiCapCMND);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setSoHoKhau", String.class);

				method.invoke(_csmsCongDanRemoteModel, SoHoKhau);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setLaChuHo", long.class);

				method.invoke(_csmsCongDanRemoteModel, LaChuHo);
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

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setQuanHeChuHoId", long.class);

				method.invoke(_csmsCongDanRemoteModel, QuanHeChuHoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoHoChieu() {
		return _SoHoChieu;
	}

	@Override
	public void setSoHoChieu(String SoHoChieu) {
		_SoHoChieu = SoHoChieu;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setSoHoChieu", String.class);

				method.invoke(_csmsCongDanRemoteModel, SoHoChieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayCapSHC() {
		return _NgayCapSHC;
	}

	@Override
	public void setNgayCapSHC(Date NgayCapSHC) {
		_NgayCapSHC = NgayCapSHC;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapSHC", Date.class);

				method.invoke(_csmsCongDanRemoteModel, NgayCapSHC);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHetHanSHC() {
		return _NgayHetHanSHC;
	}

	@Override
	public void setNgayHetHanSHC(Date NgayHetHanSHC) {
		_NgayHetHanSHC = NgayHetHanSHC;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHanSHC", Date.class);

				method.invoke(_csmsCongDanRemoteModel, NgayHetHanSHC);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiCapSHC() {
		return _NoiCapSHC;
	}

	@Override
	public void setNoiCapSHC(String NoiCapSHC) {
		_NoiCapSHC = NoiCapSHC;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiCapSHC", String.class);

				method.invoke(_csmsCongDanRemoteModel, NoiCapSHC);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMaCongDan() {
		return _MaCongDan;
	}

	@Override
	public void setMaCongDan(long MaCongDan) {
		_MaCongDan = MaCongDan;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setMaCongDan", long.class);

				method.invoke(_csmsCongDanRemoteModel, MaCongDan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Blob getImageData() {
		return _ImageData;
	}

	@Override
	public void setImageData(Blob ImageData) {
		_ImageData = ImageData;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setImageData", Blob.class);

				method.invoke(_csmsCongDanRemoteModel, ImageData);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImgName() {
		return _ImgName;
	}

	@Override
	public void setImgName(String ImgName) {
		_ImgName = ImgName;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setImgName", String.class);

				method.invoke(_csmsCongDanRemoteModel, ImgName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenCha() {
		return _TenCha;
	}

	@Override
	public void setTenCha(String TenCha) {
		_TenCha = TenCha;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setTenCha", String.class);

				method.invoke(_csmsCongDanRemoteModel, TenCha);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgaySinhCha() {
		return _NgaySinhCha;
	}

	@Override
	public void setNgaySinhCha(Date NgaySinhCha) {
		_NgaySinhCha = NgaySinhCha;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaySinhCha", Date.class);

				method.invoke(_csmsCongDanRemoteModel, NgaySinhCha);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenMe() {
		return _TenMe;
	}

	@Override
	public void setTenMe(String TenMe) {
		_TenMe = TenMe;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setTenMe", String.class);

				method.invoke(_csmsCongDanRemoteModel, TenMe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgaySinhMe() {
		return _NgaySinhMe;
	}

	@Override
	public void setNgaySinhMe(Date NgaySinhMe) {
		_NgaySinhMe = NgaySinhMe;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaySinhMe", Date.class);

				method.invoke(_csmsCongDanRemoteModel, NgaySinhMe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenVo() {
		return _TenVo;
	}

	@Override
	public void setTenVo(String TenVo) {
		_TenVo = TenVo;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setTenVo", String.class);

				method.invoke(_csmsCongDanRemoteModel, TenVo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgaySinhVo() {
		return _NgaySinhVo;
	}

	@Override
	public void setNgaySinhVo(Date NgaySinhVo) {
		_NgaySinhVo = NgaySinhVo;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaySinhVo", Date.class);

				method.invoke(_csmsCongDanRemoteModel, NgaySinhVo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSdt() {
		return _Sdt;
	}

	@Override
	public void setSdt(long Sdt) {
		_Sdt = Sdt;

		if (_csmsCongDanRemoteModel != null) {
			try {
				Class<?> clazz = _csmsCongDanRemoteModel.getClass();

				Method method = clazz.getMethod("setSdt", long.class);

				method.invoke(_csmsCongDanRemoteModel, Sdt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCSMSCongDanRemoteModel() {
		return _csmsCongDanRemoteModel;
	}

	public void setCSMSCongDanRemoteModel(BaseModel<?> csmsCongDanRemoteModel) {
		_csmsCongDanRemoteModel = csmsCongDanRemoteModel;
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

		Class<?> remoteModelClass = _csmsCongDanRemoteModel.getClass();

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

		Object returnValue = method.invoke(_csmsCongDanRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CSMSCongDanLocalServiceUtil.addCSMSCongDan(this);
		}
		else {
			CSMSCongDanLocalServiceUtil.updateCSMSCongDan(this);
		}
	}

	@Override
	public CSMSCongDan toEscapedModel() {
		return (CSMSCongDan)ProxyUtil.newProxyInstance(CSMSCongDan.class.getClassLoader(),
			new Class[] { CSMSCongDan.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CSMSCongDanClp clone = new CSMSCongDanClp();

		clone.setIdcsmsCongDan(getIdcsmsCongDan());
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
		clone.setSoHoChieu(getSoHoChieu());
		clone.setNgayCapSHC(getNgayCapSHC());
		clone.setNgayHetHanSHC(getNgayHetHanSHC());
		clone.setNoiCapSHC(getNoiCapSHC());
		clone.setMaCongDan(getMaCongDan());
		clone.setImageData(getImageData());
		clone.setImgName(getImgName());
		clone.setTenCha(getTenCha());
		clone.setNgaySinhCha(getNgaySinhCha());
		clone.setTenMe(getTenMe());
		clone.setNgaySinhMe(getNgaySinhMe());
		clone.setTenVo(getTenVo());
		clone.setNgaySinhVo(getNgaySinhVo());
		clone.setSdt(getSdt());

		return clone;
	}

	@Override
	public int compareTo(CSMSCongDan csmsCongDan) {
		long primaryKey = csmsCongDan.getPrimaryKey();

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

		if (!(obj instanceof CSMSCongDanClp)) {
			return false;
		}

		CSMSCongDanClp csmsCongDan = (CSMSCongDanClp)obj;

		long primaryKey = csmsCongDan.getPrimaryKey();

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
		StringBundler sb = new StringBundler(87);

		sb.append("{IdcsmsCongDan=");
		sb.append(getIdcsmsCongDan());
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
		sb.append(", SoHoChieu=");
		sb.append(getSoHoChieu());
		sb.append(", NgayCapSHC=");
		sb.append(getNgayCapSHC());
		sb.append(", NgayHetHanSHC=");
		sb.append(getNgayHetHanSHC());
		sb.append(", NoiCapSHC=");
		sb.append(getNoiCapSHC());
		sb.append(", MaCongDan=");
		sb.append(getMaCongDan());
		sb.append(", ImageData=");
		sb.append(getImageData());
		sb.append(", ImgName=");
		sb.append(getImgName());
		sb.append(", TenCha=");
		sb.append(getTenCha());
		sb.append(", NgaySinhCha=");
		sb.append(getNgaySinhCha());
		sb.append(", TenMe=");
		sb.append(getTenMe());
		sb.append(", NgaySinhMe=");
		sb.append(getNgaySinhMe());
		sb.append(", TenVo=");
		sb.append(getTenVo());
		sb.append(", NgaySinhVo=");
		sb.append(getNgaySinhVo());
		sb.append(", Sdt=");
		sb.append(getSdt());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(133);

		sb.append("<model><model-name>");
		sb.append("com.congdan.model.CSMSCongDan");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>IdcsmsCongDan</column-name><column-value><![CDATA[");
		sb.append(getIdcsmsCongDan());
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
		sb.append(
			"<column><column-name>SoHoChieu</column-name><column-value><![CDATA[");
		sb.append(getSoHoChieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayCapSHC</column-name><column-value><![CDATA[");
		sb.append(getNgayCapSHC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayHetHanSHC</column-name><column-value><![CDATA[");
		sb.append(getNgayHetHanSHC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NoiCapSHC</column-name><column-value><![CDATA[");
		sb.append(getNoiCapSHC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaCongDan</column-name><column-value><![CDATA[");
		sb.append(getMaCongDan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ImageData</column-name><column-value><![CDATA[");
		sb.append(getImageData());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ImgName</column-name><column-value><![CDATA[");
		sb.append(getImgName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenCha</column-name><column-value><![CDATA[");
		sb.append(getTenCha());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgaySinhCha</column-name><column-value><![CDATA[");
		sb.append(getNgaySinhCha());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenMe</column-name><column-value><![CDATA[");
		sb.append(getTenMe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgaySinhMe</column-name><column-value><![CDATA[");
		sb.append(getNgaySinhMe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenVo</column-name><column-value><![CDATA[");
		sb.append(getTenVo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgaySinhVo</column-name><column-value><![CDATA[");
		sb.append(getNgaySinhVo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Sdt</column-name><column-value><![CDATA[");
		sb.append(getSdt());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _IdcsmsCongDan;
	private String _Ho;
	private String _Dem;
	private String _Ten;
	private Date _NgaySinh;
	private long _GioiTinhId;
	private String _NoiSinhChiTiet;
	private long _NoiSinhXaId;
	private long _NoiSinhHuyenId;
	private long _NoiSinhTinhId;
	private String _DanTocId;
	private String _QuocTichId;
	private String _TonGiaoId;
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
	private String _NoiCapCMND;
	private String _SoHoKhau;
	private long _LaChuHo;
	private long _QuanHeChuHoId;
	private String _SoHoChieu;
	private Date _NgayCapSHC;
	private Date _NgayHetHanSHC;
	private String _NoiCapSHC;
	private long _MaCongDan;
	private Blob _ImageData;
	private String _ImgName;
	private String _TenCha;
	private Date _NgaySinhCha;
	private String _TenMe;
	private Date _NgaySinhMe;
	private String _TenVo;
	private Date _NgaySinhVo;
	private long _Sdt;
	private BaseModel<?> _csmsCongDanRemoteModel;
	private Class<?> _clpSerializerClass = com.congdan.service.ClpSerializer.class;
}