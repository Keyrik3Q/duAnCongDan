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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CSMS_CongDan}.
 * </p>
 *
 * @author ADMIN
 * @see CSMS_CongDan
 * @generated
 */
public class CSMS_CongDanWrapper implements CSMS_CongDan,
	ModelWrapper<CSMS_CongDan> {
	public CSMS_CongDanWrapper(CSMS_CongDan csms_CongDan) {
		_csms_CongDan = csms_CongDan;
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

	/**
	* Returns the primary key of this c s m s_ cong dan.
	*
	* @return the primary key of this c s m s_ cong dan
	*/
	@Override
	public long getPrimaryKey() {
		return _csms_CongDan.getPrimaryKey();
	}

	/**
	* Sets the primary key of this c s m s_ cong dan.
	*
	* @param primaryKey the primary key of this c s m s_ cong dan
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_csms_CongDan.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the idcsms_ cong dan of this c s m s_ cong dan.
	*
	* @return the idcsms_ cong dan of this c s m s_ cong dan
	*/
	@Override
	public long getIdcsms_CongDan() {
		return _csms_CongDan.getIdcsms_CongDan();
	}

	/**
	* Sets the idcsms_ cong dan of this c s m s_ cong dan.
	*
	* @param Idcsms_CongDan the idcsms_ cong dan of this c s m s_ cong dan
	*/
	@Override
	public void setIdcsms_CongDan(long Idcsms_CongDan) {
		_csms_CongDan.setIdcsms_CongDan(Idcsms_CongDan);
	}

	/**
	* Returns the ho of this c s m s_ cong dan.
	*
	* @return the ho of this c s m s_ cong dan
	*/
	@Override
	public java.lang.String getHo() {
		return _csms_CongDan.getHo();
	}

	/**
	* Sets the ho of this c s m s_ cong dan.
	*
	* @param Ho the ho of this c s m s_ cong dan
	*/
	@Override
	public void setHo(java.lang.String Ho) {
		_csms_CongDan.setHo(Ho);
	}

	/**
	* Returns the dem of this c s m s_ cong dan.
	*
	* @return the dem of this c s m s_ cong dan
	*/
	@Override
	public java.lang.String getDem() {
		return _csms_CongDan.getDem();
	}

	/**
	* Sets the dem of this c s m s_ cong dan.
	*
	* @param Dem the dem of this c s m s_ cong dan
	*/
	@Override
	public void setDem(java.lang.String Dem) {
		_csms_CongDan.setDem(Dem);
	}

	/**
	* Returns the ten of this c s m s_ cong dan.
	*
	* @return the ten of this c s m s_ cong dan
	*/
	@Override
	public java.lang.String getTen() {
		return _csms_CongDan.getTen();
	}

	/**
	* Sets the ten of this c s m s_ cong dan.
	*
	* @param Ten the ten of this c s m s_ cong dan
	*/
	@Override
	public void setTen(java.lang.String Ten) {
		_csms_CongDan.setTen(Ten);
	}

	/**
	* Returns the ngay sinh of this c s m s_ cong dan.
	*
	* @return the ngay sinh of this c s m s_ cong dan
	*/
	@Override
	public java.util.Date getNgaySinh() {
		return _csms_CongDan.getNgaySinh();
	}

	/**
	* Sets the ngay sinh of this c s m s_ cong dan.
	*
	* @param NgaySinh the ngay sinh of this c s m s_ cong dan
	*/
	@Override
	public void setNgaySinh(java.util.Date NgaySinh) {
		_csms_CongDan.setNgaySinh(NgaySinh);
	}

	/**
	* Returns the gioi tinh ID of this c s m s_ cong dan.
	*
	* @return the gioi tinh ID of this c s m s_ cong dan
	*/
	@Override
	public long getGioiTinhId() {
		return _csms_CongDan.getGioiTinhId();
	}

	/**
	* Sets the gioi tinh ID of this c s m s_ cong dan.
	*
	* @param GioiTinhId the gioi tinh ID of this c s m s_ cong dan
	*/
	@Override
	public void setGioiTinhId(long GioiTinhId) {
		_csms_CongDan.setGioiTinhId(GioiTinhId);
	}

	/**
	* Returns the noi sinh chi tiet of this c s m s_ cong dan.
	*
	* @return the noi sinh chi tiet of this c s m s_ cong dan
	*/
	@Override
	public java.lang.String getNoiSinhChiTiet() {
		return _csms_CongDan.getNoiSinhChiTiet();
	}

	/**
	* Sets the noi sinh chi tiet of this c s m s_ cong dan.
	*
	* @param NoiSinhChiTiet the noi sinh chi tiet of this c s m s_ cong dan
	*/
	@Override
	public void setNoiSinhChiTiet(java.lang.String NoiSinhChiTiet) {
		_csms_CongDan.setNoiSinhChiTiet(NoiSinhChiTiet);
	}

	/**
	* Returns the noi sinh xa ID of this c s m s_ cong dan.
	*
	* @return the noi sinh xa ID of this c s m s_ cong dan
	*/
	@Override
	public long getNoiSinhXaId() {
		return _csms_CongDan.getNoiSinhXaId();
	}

	/**
	* Sets the noi sinh xa ID of this c s m s_ cong dan.
	*
	* @param NoiSinhXaId the noi sinh xa ID of this c s m s_ cong dan
	*/
	@Override
	public void setNoiSinhXaId(long NoiSinhXaId) {
		_csms_CongDan.setNoiSinhXaId(NoiSinhXaId);
	}

	/**
	* Returns the noi sinh huyen ID of this c s m s_ cong dan.
	*
	* @return the noi sinh huyen ID of this c s m s_ cong dan
	*/
	@Override
	public long getNoiSinhHuyenId() {
		return _csms_CongDan.getNoiSinhHuyenId();
	}

	/**
	* Sets the noi sinh huyen ID of this c s m s_ cong dan.
	*
	* @param NoiSinhHuyenId the noi sinh huyen ID of this c s m s_ cong dan
	*/
	@Override
	public void setNoiSinhHuyenId(long NoiSinhHuyenId) {
		_csms_CongDan.setNoiSinhHuyenId(NoiSinhHuyenId);
	}

	/**
	* Returns the noi sinh tinh ID of this c s m s_ cong dan.
	*
	* @return the noi sinh tinh ID of this c s m s_ cong dan
	*/
	@Override
	public long getNoiSinhTinhId() {
		return _csms_CongDan.getNoiSinhTinhId();
	}

	/**
	* Sets the noi sinh tinh ID of this c s m s_ cong dan.
	*
	* @param NoiSinhTinhId the noi sinh tinh ID of this c s m s_ cong dan
	*/
	@Override
	public void setNoiSinhTinhId(long NoiSinhTinhId) {
		_csms_CongDan.setNoiSinhTinhId(NoiSinhTinhId);
	}

	/**
	* Returns the dan toc ID of this c s m s_ cong dan.
	*
	* @return the dan toc ID of this c s m s_ cong dan
	*/
	@Override
	public long getDanTocId() {
		return _csms_CongDan.getDanTocId();
	}

	/**
	* Sets the dan toc ID of this c s m s_ cong dan.
	*
	* @param DanTocId the dan toc ID of this c s m s_ cong dan
	*/
	@Override
	public void setDanTocId(long DanTocId) {
		_csms_CongDan.setDanTocId(DanTocId);
	}

	/**
	* Returns the quoc tich ID of this c s m s_ cong dan.
	*
	* @return the quoc tich ID of this c s m s_ cong dan
	*/
	@Override
	public long getQuocTichId() {
		return _csms_CongDan.getQuocTichId();
	}

	/**
	* Sets the quoc tich ID of this c s m s_ cong dan.
	*
	* @param QuocTichId the quoc tich ID of this c s m s_ cong dan
	*/
	@Override
	public void setQuocTichId(long QuocTichId) {
		_csms_CongDan.setQuocTichId(QuocTichId);
	}

	/**
	* Returns the ton giao ID of this c s m s_ cong dan.
	*
	* @return the ton giao ID of this c s m s_ cong dan
	*/
	@Override
	public long getTonGiaoId() {
		return _csms_CongDan.getTonGiaoId();
	}

	/**
	* Sets the ton giao ID of this c s m s_ cong dan.
	*
	* @param TonGiaoId the ton giao ID of this c s m s_ cong dan
	*/
	@Override
	public void setTonGiaoId(long TonGiaoId) {
		_csms_CongDan.setTonGiaoId(TonGiaoId);
	}

	/**
	* Returns the dia chi thuong tru of this c s m s_ cong dan.
	*
	* @return the dia chi thuong tru of this c s m s_ cong dan
	*/
	@Override
	public java.lang.String getDiaChiThuongTru() {
		return _csms_CongDan.getDiaChiThuongTru();
	}

	/**
	* Sets the dia chi thuong tru of this c s m s_ cong dan.
	*
	* @param DiaChiThuongTru the dia chi thuong tru of this c s m s_ cong dan
	*/
	@Override
	public void setDiaChiThuongTru(java.lang.String DiaChiThuongTru) {
		_csms_CongDan.setDiaChiThuongTru(DiaChiThuongTru);
	}

	/**
	* Returns the dia chi thuong tru xa ID of this c s m s_ cong dan.
	*
	* @return the dia chi thuong tru xa ID of this c s m s_ cong dan
	*/
	@Override
	public long getDiaChiThuongTruXaId() {
		return _csms_CongDan.getDiaChiThuongTruXaId();
	}

	/**
	* Sets the dia chi thuong tru xa ID of this c s m s_ cong dan.
	*
	* @param DiaChiThuongTruXaId the dia chi thuong tru xa ID of this c s m s_ cong dan
	*/
	@Override
	public void setDiaChiThuongTruXaId(long DiaChiThuongTruXaId) {
		_csms_CongDan.setDiaChiThuongTruXaId(DiaChiThuongTruXaId);
	}

	/**
	* Returns the dia chi thuong tru huyen ID of this c s m s_ cong dan.
	*
	* @return the dia chi thuong tru huyen ID of this c s m s_ cong dan
	*/
	@Override
	public long getDiaChiThuongTruHuyenId() {
		return _csms_CongDan.getDiaChiThuongTruHuyenId();
	}

	/**
	* Sets the dia chi thuong tru huyen ID of this c s m s_ cong dan.
	*
	* @param DiaChiThuongTruHuyenId the dia chi thuong tru huyen ID of this c s m s_ cong dan
	*/
	@Override
	public void setDiaChiThuongTruHuyenId(long DiaChiThuongTruHuyenId) {
		_csms_CongDan.setDiaChiThuongTruHuyenId(DiaChiThuongTruHuyenId);
	}

	/**
	* Returns the dia chi thuong tru tinh ID of this c s m s_ cong dan.
	*
	* @return the dia chi thuong tru tinh ID of this c s m s_ cong dan
	*/
	@Override
	public long getDiaChiThuongTruTinhId() {
		return _csms_CongDan.getDiaChiThuongTruTinhId();
	}

	/**
	* Sets the dia chi thuong tru tinh ID of this c s m s_ cong dan.
	*
	* @param DiaChiThuongTruTinhId the dia chi thuong tru tinh ID of this c s m s_ cong dan
	*/
	@Override
	public void setDiaChiThuongTruTinhId(long DiaChiThuongTruTinhId) {
		_csms_CongDan.setDiaChiThuongTruTinhId(DiaChiThuongTruTinhId);
	}

	/**
	* Returns the dia chi hien nay of this c s m s_ cong dan.
	*
	* @return the dia chi hien nay of this c s m s_ cong dan
	*/
	@Override
	public java.lang.String getDiaChiHienNay() {
		return _csms_CongDan.getDiaChiHienNay();
	}

	/**
	* Sets the dia chi hien nay of this c s m s_ cong dan.
	*
	* @param DiaChiHienNay the dia chi hien nay of this c s m s_ cong dan
	*/
	@Override
	public void setDiaChiHienNay(java.lang.String DiaChiHienNay) {
		_csms_CongDan.setDiaChiHienNay(DiaChiHienNay);
	}

	/**
	* Returns the dia chi hien nay xa ID of this c s m s_ cong dan.
	*
	* @return the dia chi hien nay xa ID of this c s m s_ cong dan
	*/
	@Override
	public long getDiaChiHienNayXaId() {
		return _csms_CongDan.getDiaChiHienNayXaId();
	}

	/**
	* Sets the dia chi hien nay xa ID of this c s m s_ cong dan.
	*
	* @param DiaChiHienNayXaId the dia chi hien nay xa ID of this c s m s_ cong dan
	*/
	@Override
	public void setDiaChiHienNayXaId(long DiaChiHienNayXaId) {
		_csms_CongDan.setDiaChiHienNayXaId(DiaChiHienNayXaId);
	}

	/**
	* Returns the dia chi hien nay huyen ID of this c s m s_ cong dan.
	*
	* @return the dia chi hien nay huyen ID of this c s m s_ cong dan
	*/
	@Override
	public long getDiaChiHienNayHuyenId() {
		return _csms_CongDan.getDiaChiHienNayHuyenId();
	}

	/**
	* Sets the dia chi hien nay huyen ID of this c s m s_ cong dan.
	*
	* @param DiaChiHienNayHuyenId the dia chi hien nay huyen ID of this c s m s_ cong dan
	*/
	@Override
	public void setDiaChiHienNayHuyenId(long DiaChiHienNayHuyenId) {
		_csms_CongDan.setDiaChiHienNayHuyenId(DiaChiHienNayHuyenId);
	}

	/**
	* Returns the dia chi hien nay tinh ID of this c s m s_ cong dan.
	*
	* @return the dia chi hien nay tinh ID of this c s m s_ cong dan
	*/
	@Override
	public long getDiaChiHienNayTinhId() {
		return _csms_CongDan.getDiaChiHienNayTinhId();
	}

	/**
	* Sets the dia chi hien nay tinh ID of this c s m s_ cong dan.
	*
	* @param DiaChiHienNayTinhId the dia chi hien nay tinh ID of this c s m s_ cong dan
	*/
	@Override
	public void setDiaChiHienNayTinhId(long DiaChiHienNayTinhId) {
		_csms_CongDan.setDiaChiHienNayTinhId(DiaChiHienNayTinhId);
	}

	/**
	* Returns the tinh trang of this c s m s_ cong dan.
	*
	* @return the tinh trang of this c s m s_ cong dan
	*/
	@Override
	public long getTinhTrang() {
		return _csms_CongDan.getTinhTrang();
	}

	/**
	* Sets the tinh trang of this c s m s_ cong dan.
	*
	* @param TinhTrang the tinh trang of this c s m s_ cong dan
	*/
	@Override
	public void setTinhTrang(long TinhTrang) {
		_csms_CongDan.setTinhTrang(TinhTrang);
	}

	/**
	* Returns the tinht tranghon nhan ID of this c s m s_ cong dan.
	*
	* @return the tinht tranghon nhan ID of this c s m s_ cong dan
	*/
	@Override
	public long getTinhtTranghonNhanId() {
		return _csms_CongDan.getTinhtTranghonNhanId();
	}

	/**
	* Sets the tinht tranghon nhan ID of this c s m s_ cong dan.
	*
	* @param TinhtTranghonNhanId the tinht tranghon nhan ID of this c s m s_ cong dan
	*/
	@Override
	public void setTinhtTranghonNhanId(long TinhtTranghonNhanId) {
		_csms_CongDan.setTinhtTranghonNhanId(TinhtTranghonNhanId);
	}

	/**
	* Returns the socmnd of this c s m s_ cong dan.
	*
	* @return the socmnd of this c s m s_ cong dan
	*/
	@Override
	public java.lang.String getSocmnd() {
		return _csms_CongDan.getSocmnd();
	}

	/**
	* Sets the socmnd of this c s m s_ cong dan.
	*
	* @param socmnd the socmnd of this c s m s_ cong dan
	*/
	@Override
	public void setSocmnd(java.lang.String socmnd) {
		_csms_CongDan.setSocmnd(socmnd);
	}

	/**
	* Returns the ngay cap c m n d of this c s m s_ cong dan.
	*
	* @return the ngay cap c m n d of this c s m s_ cong dan
	*/
	@Override
	public java.util.Date getNgayCapCMND() {
		return _csms_CongDan.getNgayCapCMND();
	}

	/**
	* Sets the ngay cap c m n d of this c s m s_ cong dan.
	*
	* @param NgayCapCMND the ngay cap c m n d of this c s m s_ cong dan
	*/
	@Override
	public void setNgayCapCMND(java.util.Date NgayCapCMND) {
		_csms_CongDan.setNgayCapCMND(NgayCapCMND);
	}

	/**
	* Returns the noi cap c m n d of this c s m s_ cong dan.
	*
	* @return the noi cap c m n d of this c s m s_ cong dan
	*/
	@Override
	public long getNoiCapCMND() {
		return _csms_CongDan.getNoiCapCMND();
	}

	/**
	* Sets the noi cap c m n d of this c s m s_ cong dan.
	*
	* @param NoiCapCMND the noi cap c m n d of this c s m s_ cong dan
	*/
	@Override
	public void setNoiCapCMND(long NoiCapCMND) {
		_csms_CongDan.setNoiCapCMND(NoiCapCMND);
	}

	/**
	* Returns the so ho khau of this c s m s_ cong dan.
	*
	* @return the so ho khau of this c s m s_ cong dan
	*/
	@Override
	public java.lang.String getSoHoKhau() {
		return _csms_CongDan.getSoHoKhau();
	}

	/**
	* Sets the so ho khau of this c s m s_ cong dan.
	*
	* @param SoHoKhau the so ho khau of this c s m s_ cong dan
	*/
	@Override
	public void setSoHoKhau(java.lang.String SoHoKhau) {
		_csms_CongDan.setSoHoKhau(SoHoKhau);
	}

	/**
	* Returns the la chu ho of this c s m s_ cong dan.
	*
	* @return the la chu ho of this c s m s_ cong dan
	*/
	@Override
	public long getLaChuHo() {
		return _csms_CongDan.getLaChuHo();
	}

	/**
	* Sets the la chu ho of this c s m s_ cong dan.
	*
	* @param LaChuHo the la chu ho of this c s m s_ cong dan
	*/
	@Override
	public void setLaChuHo(long LaChuHo) {
		_csms_CongDan.setLaChuHo(LaChuHo);
	}

	/**
	* Returns the quan he chu ho ID of this c s m s_ cong dan.
	*
	* @return the quan he chu ho ID of this c s m s_ cong dan
	*/
	@Override
	public long getQuanHeChuHoId() {
		return _csms_CongDan.getQuanHeChuHoId();
	}

	/**
	* Sets the quan he chu ho ID of this c s m s_ cong dan.
	*
	* @param QuanHeChuHoId the quan he chu ho ID of this c s m s_ cong dan
	*/
	@Override
	public void setQuanHeChuHoId(long QuanHeChuHoId) {
		_csms_CongDan.setQuanHeChuHoId(QuanHeChuHoId);
	}

	@Override
	public boolean isNew() {
		return _csms_CongDan.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_csms_CongDan.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _csms_CongDan.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_csms_CongDan.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _csms_CongDan.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _csms_CongDan.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_csms_CongDan.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _csms_CongDan.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_csms_CongDan.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_csms_CongDan.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_csms_CongDan.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CSMS_CongDanWrapper((CSMS_CongDan)_csms_CongDan.clone());
	}

	@Override
	public int compareTo(com.congdan.model.CSMS_CongDan csms_CongDan) {
		return _csms_CongDan.compareTo(csms_CongDan);
	}

	@Override
	public int hashCode() {
		return _csms_CongDan.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.congdan.model.CSMS_CongDan> toCacheModel() {
		return _csms_CongDan.toCacheModel();
	}

	@Override
	public com.congdan.model.CSMS_CongDan toEscapedModel() {
		return new CSMS_CongDanWrapper(_csms_CongDan.toEscapedModel());
	}

	@Override
	public com.congdan.model.CSMS_CongDan toUnescapedModel() {
		return new CSMS_CongDanWrapper(_csms_CongDan.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _csms_CongDan.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _csms_CongDan.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_csms_CongDan.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CSMS_CongDanWrapper)) {
			return false;
		}

		CSMS_CongDanWrapper csms_CongDanWrapper = (CSMS_CongDanWrapper)obj;

		if (Validator.equals(_csms_CongDan, csms_CongDanWrapper._csms_CongDan)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CSMS_CongDan getWrappedCSMS_CongDan() {
		return _csms_CongDan;
	}

	@Override
	public CSMS_CongDan getWrappedModel() {
		return _csms_CongDan;
	}

	@Override
	public void resetOriginalValues() {
		_csms_CongDan.resetOriginalValues();
	}

	private CSMS_CongDan _csms_CongDan;
}