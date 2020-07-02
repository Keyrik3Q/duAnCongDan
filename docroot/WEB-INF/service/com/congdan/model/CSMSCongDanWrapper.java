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

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CSMSCongDan}.
 * </p>
 *
 * @author ADMIN
 * @see CSMSCongDan
 * @generated
 */
public class CSMSCongDanWrapper implements CSMSCongDan,
	ModelWrapper<CSMSCongDan> {
	public CSMSCongDanWrapper(CSMSCongDan csmsCongDan) {
		_csmsCongDan = csmsCongDan;
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

	/**
	* Returns the primary key of this c s m s cong dan.
	*
	* @return the primary key of this c s m s cong dan
	*/
	@Override
	public long getPrimaryKey() {
		return _csmsCongDan.getPrimaryKey();
	}

	/**
	* Sets the primary key of this c s m s cong dan.
	*
	* @param primaryKey the primary key of this c s m s cong dan
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_csmsCongDan.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the idcsms cong dan of this c s m s cong dan.
	*
	* @return the idcsms cong dan of this c s m s cong dan
	*/
	@Override
	public long getIdcsmsCongDan() {
		return _csmsCongDan.getIdcsmsCongDan();
	}

	/**
	* Sets the idcsms cong dan of this c s m s cong dan.
	*
	* @param IdcsmsCongDan the idcsms cong dan of this c s m s cong dan
	*/
	@Override
	public void setIdcsmsCongDan(long IdcsmsCongDan) {
		_csmsCongDan.setIdcsmsCongDan(IdcsmsCongDan);
	}

	/**
	* Returns the ho of this c s m s cong dan.
	*
	* @return the ho of this c s m s cong dan
	*/
	@Override
	public java.lang.String getHo() {
		return _csmsCongDan.getHo();
	}

	/**
	* Sets the ho of this c s m s cong dan.
	*
	* @param Ho the ho of this c s m s cong dan
	*/
	@Override
	public void setHo(java.lang.String Ho) {
		_csmsCongDan.setHo(Ho);
	}

	/**
	* Returns the dem of this c s m s cong dan.
	*
	* @return the dem of this c s m s cong dan
	*/
	@Override
	public java.lang.String getDem() {
		return _csmsCongDan.getDem();
	}

	/**
	* Sets the dem of this c s m s cong dan.
	*
	* @param Dem the dem of this c s m s cong dan
	*/
	@Override
	public void setDem(java.lang.String Dem) {
		_csmsCongDan.setDem(Dem);
	}

	/**
	* Returns the ten of this c s m s cong dan.
	*
	* @return the ten of this c s m s cong dan
	*/
	@Override
	public java.lang.String getTen() {
		return _csmsCongDan.getTen();
	}

	/**
	* Sets the ten of this c s m s cong dan.
	*
	* @param Ten the ten of this c s m s cong dan
	*/
	@Override
	public void setTen(java.lang.String Ten) {
		_csmsCongDan.setTen(Ten);
	}

	/**
	* Returns the ngay sinh of this c s m s cong dan.
	*
	* @return the ngay sinh of this c s m s cong dan
	*/
	@Override
	public java.util.Date getNgaySinh() {
		return _csmsCongDan.getNgaySinh();
	}

	/**
	* Sets the ngay sinh of this c s m s cong dan.
	*
	* @param NgaySinh the ngay sinh of this c s m s cong dan
	*/
	@Override
	public void setNgaySinh(java.util.Date NgaySinh) {
		_csmsCongDan.setNgaySinh(NgaySinh);
	}

	/**
	* Returns the gioi tinh ID of this c s m s cong dan.
	*
	* @return the gioi tinh ID of this c s m s cong dan
	*/
	@Override
	public long getGioiTinhId() {
		return _csmsCongDan.getGioiTinhId();
	}

	/**
	* Sets the gioi tinh ID of this c s m s cong dan.
	*
	* @param GioiTinhId the gioi tinh ID of this c s m s cong dan
	*/
	@Override
	public void setGioiTinhId(long GioiTinhId) {
		_csmsCongDan.setGioiTinhId(GioiTinhId);
	}

	/**
	* Returns the noi sinh chi tiet of this c s m s cong dan.
	*
	* @return the noi sinh chi tiet of this c s m s cong dan
	*/
	@Override
	public java.lang.String getNoiSinhChiTiet() {
		return _csmsCongDan.getNoiSinhChiTiet();
	}

	/**
	* Sets the noi sinh chi tiet of this c s m s cong dan.
	*
	* @param NoiSinhChiTiet the noi sinh chi tiet of this c s m s cong dan
	*/
	@Override
	public void setNoiSinhChiTiet(java.lang.String NoiSinhChiTiet) {
		_csmsCongDan.setNoiSinhChiTiet(NoiSinhChiTiet);
	}

	/**
	* Returns the noi sinh xa ID of this c s m s cong dan.
	*
	* @return the noi sinh xa ID of this c s m s cong dan
	*/
	@Override
	public long getNoiSinhXaId() {
		return _csmsCongDan.getNoiSinhXaId();
	}

	/**
	* Sets the noi sinh xa ID of this c s m s cong dan.
	*
	* @param NoiSinhXaId the noi sinh xa ID of this c s m s cong dan
	*/
	@Override
	public void setNoiSinhXaId(long NoiSinhXaId) {
		_csmsCongDan.setNoiSinhXaId(NoiSinhXaId);
	}

	/**
	* Returns the noi sinh huyen ID of this c s m s cong dan.
	*
	* @return the noi sinh huyen ID of this c s m s cong dan
	*/
	@Override
	public long getNoiSinhHuyenId() {
		return _csmsCongDan.getNoiSinhHuyenId();
	}

	/**
	* Sets the noi sinh huyen ID of this c s m s cong dan.
	*
	* @param NoiSinhHuyenId the noi sinh huyen ID of this c s m s cong dan
	*/
	@Override
	public void setNoiSinhHuyenId(long NoiSinhHuyenId) {
		_csmsCongDan.setNoiSinhHuyenId(NoiSinhHuyenId);
	}

	/**
	* Returns the noi sinh tinh ID of this c s m s cong dan.
	*
	* @return the noi sinh tinh ID of this c s m s cong dan
	*/
	@Override
	public long getNoiSinhTinhId() {
		return _csmsCongDan.getNoiSinhTinhId();
	}

	/**
	* Sets the noi sinh tinh ID of this c s m s cong dan.
	*
	* @param NoiSinhTinhId the noi sinh tinh ID of this c s m s cong dan
	*/
	@Override
	public void setNoiSinhTinhId(long NoiSinhTinhId) {
		_csmsCongDan.setNoiSinhTinhId(NoiSinhTinhId);
	}

	/**
	* Returns the dan toc ID of this c s m s cong dan.
	*
	* @return the dan toc ID of this c s m s cong dan
	*/
	@Override
	public java.lang.String getDanTocId() {
		return _csmsCongDan.getDanTocId();
	}

	/**
	* Sets the dan toc ID of this c s m s cong dan.
	*
	* @param DanTocId the dan toc ID of this c s m s cong dan
	*/
	@Override
	public void setDanTocId(java.lang.String DanTocId) {
		_csmsCongDan.setDanTocId(DanTocId);
	}

	/**
	* Returns the quoc tich ID of this c s m s cong dan.
	*
	* @return the quoc tich ID of this c s m s cong dan
	*/
	@Override
	public java.lang.String getQuocTichId() {
		return _csmsCongDan.getQuocTichId();
	}

	/**
	* Sets the quoc tich ID of this c s m s cong dan.
	*
	* @param QuocTichId the quoc tich ID of this c s m s cong dan
	*/
	@Override
	public void setQuocTichId(java.lang.String QuocTichId) {
		_csmsCongDan.setQuocTichId(QuocTichId);
	}

	/**
	* Returns the ton giao ID of this c s m s cong dan.
	*
	* @return the ton giao ID of this c s m s cong dan
	*/
	@Override
	public java.lang.String getTonGiaoId() {
		return _csmsCongDan.getTonGiaoId();
	}

	/**
	* Sets the ton giao ID of this c s m s cong dan.
	*
	* @param TonGiaoId the ton giao ID of this c s m s cong dan
	*/
	@Override
	public void setTonGiaoId(java.lang.String TonGiaoId) {
		_csmsCongDan.setTonGiaoId(TonGiaoId);
	}

	/**
	* Returns the dia chi thuong tru of this c s m s cong dan.
	*
	* @return the dia chi thuong tru of this c s m s cong dan
	*/
	@Override
	public java.lang.String getDiaChiThuongTru() {
		return _csmsCongDan.getDiaChiThuongTru();
	}

	/**
	* Sets the dia chi thuong tru of this c s m s cong dan.
	*
	* @param DiaChiThuongTru the dia chi thuong tru of this c s m s cong dan
	*/
	@Override
	public void setDiaChiThuongTru(java.lang.String DiaChiThuongTru) {
		_csmsCongDan.setDiaChiThuongTru(DiaChiThuongTru);
	}

	/**
	* Returns the dia chi thuong tru xa ID of this c s m s cong dan.
	*
	* @return the dia chi thuong tru xa ID of this c s m s cong dan
	*/
	@Override
	public long getDiaChiThuongTruXaId() {
		return _csmsCongDan.getDiaChiThuongTruXaId();
	}

	/**
	* Sets the dia chi thuong tru xa ID of this c s m s cong dan.
	*
	* @param DiaChiThuongTruXaId the dia chi thuong tru xa ID of this c s m s cong dan
	*/
	@Override
	public void setDiaChiThuongTruXaId(long DiaChiThuongTruXaId) {
		_csmsCongDan.setDiaChiThuongTruXaId(DiaChiThuongTruXaId);
	}

	/**
	* Returns the dia chi thuong tru huyen ID of this c s m s cong dan.
	*
	* @return the dia chi thuong tru huyen ID of this c s m s cong dan
	*/
	@Override
	public long getDiaChiThuongTruHuyenId() {
		return _csmsCongDan.getDiaChiThuongTruHuyenId();
	}

	/**
	* Sets the dia chi thuong tru huyen ID of this c s m s cong dan.
	*
	* @param DiaChiThuongTruHuyenId the dia chi thuong tru huyen ID of this c s m s cong dan
	*/
	@Override
	public void setDiaChiThuongTruHuyenId(long DiaChiThuongTruHuyenId) {
		_csmsCongDan.setDiaChiThuongTruHuyenId(DiaChiThuongTruHuyenId);
	}

	/**
	* Returns the dia chi thuong tru tinh ID of this c s m s cong dan.
	*
	* @return the dia chi thuong tru tinh ID of this c s m s cong dan
	*/
	@Override
	public long getDiaChiThuongTruTinhId() {
		return _csmsCongDan.getDiaChiThuongTruTinhId();
	}

	/**
	* Sets the dia chi thuong tru tinh ID of this c s m s cong dan.
	*
	* @param DiaChiThuongTruTinhId the dia chi thuong tru tinh ID of this c s m s cong dan
	*/
	@Override
	public void setDiaChiThuongTruTinhId(long DiaChiThuongTruTinhId) {
		_csmsCongDan.setDiaChiThuongTruTinhId(DiaChiThuongTruTinhId);
	}

	/**
	* Returns the dia chi hien nay of this c s m s cong dan.
	*
	* @return the dia chi hien nay of this c s m s cong dan
	*/
	@Override
	public java.lang.String getDiaChiHienNay() {
		return _csmsCongDan.getDiaChiHienNay();
	}

	/**
	* Sets the dia chi hien nay of this c s m s cong dan.
	*
	* @param DiaChiHienNay the dia chi hien nay of this c s m s cong dan
	*/
	@Override
	public void setDiaChiHienNay(java.lang.String DiaChiHienNay) {
		_csmsCongDan.setDiaChiHienNay(DiaChiHienNay);
	}

	/**
	* Returns the dia chi hien nay xa ID of this c s m s cong dan.
	*
	* @return the dia chi hien nay xa ID of this c s m s cong dan
	*/
	@Override
	public long getDiaChiHienNayXaId() {
		return _csmsCongDan.getDiaChiHienNayXaId();
	}

	/**
	* Sets the dia chi hien nay xa ID of this c s m s cong dan.
	*
	* @param DiaChiHienNayXaId the dia chi hien nay xa ID of this c s m s cong dan
	*/
	@Override
	public void setDiaChiHienNayXaId(long DiaChiHienNayXaId) {
		_csmsCongDan.setDiaChiHienNayXaId(DiaChiHienNayXaId);
	}

	/**
	* Returns the dia chi hien nay huyen ID of this c s m s cong dan.
	*
	* @return the dia chi hien nay huyen ID of this c s m s cong dan
	*/
	@Override
	public long getDiaChiHienNayHuyenId() {
		return _csmsCongDan.getDiaChiHienNayHuyenId();
	}

	/**
	* Sets the dia chi hien nay huyen ID of this c s m s cong dan.
	*
	* @param DiaChiHienNayHuyenId the dia chi hien nay huyen ID of this c s m s cong dan
	*/
	@Override
	public void setDiaChiHienNayHuyenId(long DiaChiHienNayHuyenId) {
		_csmsCongDan.setDiaChiHienNayHuyenId(DiaChiHienNayHuyenId);
	}

	/**
	* Returns the dia chi hien nay tinh ID of this c s m s cong dan.
	*
	* @return the dia chi hien nay tinh ID of this c s m s cong dan
	*/
	@Override
	public long getDiaChiHienNayTinhId() {
		return _csmsCongDan.getDiaChiHienNayTinhId();
	}

	/**
	* Sets the dia chi hien nay tinh ID of this c s m s cong dan.
	*
	* @param DiaChiHienNayTinhId the dia chi hien nay tinh ID of this c s m s cong dan
	*/
	@Override
	public void setDiaChiHienNayTinhId(long DiaChiHienNayTinhId) {
		_csmsCongDan.setDiaChiHienNayTinhId(DiaChiHienNayTinhId);
	}

	/**
	* Returns the tinh trang of this c s m s cong dan.
	*
	* @return the tinh trang of this c s m s cong dan
	*/
	@Override
	public long getTinhTrang() {
		return _csmsCongDan.getTinhTrang();
	}

	/**
	* Sets the tinh trang of this c s m s cong dan.
	*
	* @param TinhTrang the tinh trang of this c s m s cong dan
	*/
	@Override
	public void setTinhTrang(long TinhTrang) {
		_csmsCongDan.setTinhTrang(TinhTrang);
	}

	/**
	* Returns the tinht tranghon nhan ID of this c s m s cong dan.
	*
	* @return the tinht tranghon nhan ID of this c s m s cong dan
	*/
	@Override
	public long getTinhtTranghonNhanId() {
		return _csmsCongDan.getTinhtTranghonNhanId();
	}

	/**
	* Sets the tinht tranghon nhan ID of this c s m s cong dan.
	*
	* @param TinhtTranghonNhanId the tinht tranghon nhan ID of this c s m s cong dan
	*/
	@Override
	public void setTinhtTranghonNhanId(long TinhtTranghonNhanId) {
		_csmsCongDan.setTinhtTranghonNhanId(TinhtTranghonNhanId);
	}

	/**
	* Returns the socmnd of this c s m s cong dan.
	*
	* @return the socmnd of this c s m s cong dan
	*/
	@Override
	public java.lang.String getSocmnd() {
		return _csmsCongDan.getSocmnd();
	}

	/**
	* Sets the socmnd of this c s m s cong dan.
	*
	* @param socmnd the socmnd of this c s m s cong dan
	*/
	@Override
	public void setSocmnd(java.lang.String socmnd) {
		_csmsCongDan.setSocmnd(socmnd);
	}

	/**
	* Returns the ngay cap c m n d of this c s m s cong dan.
	*
	* @return the ngay cap c m n d of this c s m s cong dan
	*/
	@Override
	public java.util.Date getNgayCapCMND() {
		return _csmsCongDan.getNgayCapCMND();
	}

	/**
	* Sets the ngay cap c m n d of this c s m s cong dan.
	*
	* @param NgayCapCMND the ngay cap c m n d of this c s m s cong dan
	*/
	@Override
	public void setNgayCapCMND(java.util.Date NgayCapCMND) {
		_csmsCongDan.setNgayCapCMND(NgayCapCMND);
	}

	/**
	* Returns the noi cap c m n d of this c s m s cong dan.
	*
	* @return the noi cap c m n d of this c s m s cong dan
	*/
	@Override
	public java.lang.String getNoiCapCMND() {
		return _csmsCongDan.getNoiCapCMND();
	}

	/**
	* Sets the noi cap c m n d of this c s m s cong dan.
	*
	* @param NoiCapCMND the noi cap c m n d of this c s m s cong dan
	*/
	@Override
	public void setNoiCapCMND(java.lang.String NoiCapCMND) {
		_csmsCongDan.setNoiCapCMND(NoiCapCMND);
	}

	/**
	* Returns the so ho khau of this c s m s cong dan.
	*
	* @return the so ho khau of this c s m s cong dan
	*/
	@Override
	public java.lang.String getSoHoKhau() {
		return _csmsCongDan.getSoHoKhau();
	}

	/**
	* Sets the so ho khau of this c s m s cong dan.
	*
	* @param SoHoKhau the so ho khau of this c s m s cong dan
	*/
	@Override
	public void setSoHoKhau(java.lang.String SoHoKhau) {
		_csmsCongDan.setSoHoKhau(SoHoKhau);
	}

	/**
	* Returns the la chu ho of this c s m s cong dan.
	*
	* @return the la chu ho of this c s m s cong dan
	*/
	@Override
	public long getLaChuHo() {
		return _csmsCongDan.getLaChuHo();
	}

	/**
	* Sets the la chu ho of this c s m s cong dan.
	*
	* @param LaChuHo the la chu ho of this c s m s cong dan
	*/
	@Override
	public void setLaChuHo(long LaChuHo) {
		_csmsCongDan.setLaChuHo(LaChuHo);
	}

	/**
	* Returns the quan he chu ho ID of this c s m s cong dan.
	*
	* @return the quan he chu ho ID of this c s m s cong dan
	*/
	@Override
	public long getQuanHeChuHoId() {
		return _csmsCongDan.getQuanHeChuHoId();
	}

	/**
	* Sets the quan he chu ho ID of this c s m s cong dan.
	*
	* @param QuanHeChuHoId the quan he chu ho ID of this c s m s cong dan
	*/
	@Override
	public void setQuanHeChuHoId(long QuanHeChuHoId) {
		_csmsCongDan.setQuanHeChuHoId(QuanHeChuHoId);
	}

	/**
	* Returns the so ho chieu of this c s m s cong dan.
	*
	* @return the so ho chieu of this c s m s cong dan
	*/
	@Override
	public java.lang.String getSoHoChieu() {
		return _csmsCongDan.getSoHoChieu();
	}

	/**
	* Sets the so ho chieu of this c s m s cong dan.
	*
	* @param SoHoChieu the so ho chieu of this c s m s cong dan
	*/
	@Override
	public void setSoHoChieu(java.lang.String SoHoChieu) {
		_csmsCongDan.setSoHoChieu(SoHoChieu);
	}

	/**
	* Returns the ngay cap s h c of this c s m s cong dan.
	*
	* @return the ngay cap s h c of this c s m s cong dan
	*/
	@Override
	public java.util.Date getNgayCapSHC() {
		return _csmsCongDan.getNgayCapSHC();
	}

	/**
	* Sets the ngay cap s h c of this c s m s cong dan.
	*
	* @param NgayCapSHC the ngay cap s h c of this c s m s cong dan
	*/
	@Override
	public void setNgayCapSHC(java.util.Date NgayCapSHC) {
		_csmsCongDan.setNgayCapSHC(NgayCapSHC);
	}

	/**
	* Returns the ngay het han s h c of this c s m s cong dan.
	*
	* @return the ngay het han s h c of this c s m s cong dan
	*/
	@Override
	public java.util.Date getNgayHetHanSHC() {
		return _csmsCongDan.getNgayHetHanSHC();
	}

	/**
	* Sets the ngay het han s h c of this c s m s cong dan.
	*
	* @param NgayHetHanSHC the ngay het han s h c of this c s m s cong dan
	*/
	@Override
	public void setNgayHetHanSHC(java.util.Date NgayHetHanSHC) {
		_csmsCongDan.setNgayHetHanSHC(NgayHetHanSHC);
	}

	/**
	* Returns the noi cap s h c of this c s m s cong dan.
	*
	* @return the noi cap s h c of this c s m s cong dan
	*/
	@Override
	public java.lang.String getNoiCapSHC() {
		return _csmsCongDan.getNoiCapSHC();
	}

	/**
	* Sets the noi cap s h c of this c s m s cong dan.
	*
	* @param NoiCapSHC the noi cap s h c of this c s m s cong dan
	*/
	@Override
	public void setNoiCapSHC(java.lang.String NoiCapSHC) {
		_csmsCongDan.setNoiCapSHC(NoiCapSHC);
	}

	/**
	* Returns the ma cong dan of this c s m s cong dan.
	*
	* @return the ma cong dan of this c s m s cong dan
	*/
	@Override
	public long getMaCongDan() {
		return _csmsCongDan.getMaCongDan();
	}

	/**
	* Sets the ma cong dan of this c s m s cong dan.
	*
	* @param MaCongDan the ma cong dan of this c s m s cong dan
	*/
	@Override
	public void setMaCongDan(long MaCongDan) {
		_csmsCongDan.setMaCongDan(MaCongDan);
	}

	/**
	* Returns the image data of this c s m s cong dan.
	*
	* @return the image data of this c s m s cong dan
	*/
	@Override
	public java.sql.Blob getImageData() {
		return _csmsCongDan.getImageData();
	}

	/**
	* Sets the image data of this c s m s cong dan.
	*
	* @param ImageData the image data of this c s m s cong dan
	*/
	@Override
	public void setImageData(java.sql.Blob ImageData) {
		_csmsCongDan.setImageData(ImageData);
	}

	/**
	* Returns the img name of this c s m s cong dan.
	*
	* @return the img name of this c s m s cong dan
	*/
	@Override
	public java.lang.String getImgName() {
		return _csmsCongDan.getImgName();
	}

	/**
	* Sets the img name of this c s m s cong dan.
	*
	* @param ImgName the img name of this c s m s cong dan
	*/
	@Override
	public void setImgName(java.lang.String ImgName) {
		_csmsCongDan.setImgName(ImgName);
	}

	/**
	* Returns the ten cha of this c s m s cong dan.
	*
	* @return the ten cha of this c s m s cong dan
	*/
	@Override
	public java.lang.String getTenCha() {
		return _csmsCongDan.getTenCha();
	}

	/**
	* Sets the ten cha of this c s m s cong dan.
	*
	* @param TenCha the ten cha of this c s m s cong dan
	*/
	@Override
	public void setTenCha(java.lang.String TenCha) {
		_csmsCongDan.setTenCha(TenCha);
	}

	/**
	* Returns the ngay sinh cha of this c s m s cong dan.
	*
	* @return the ngay sinh cha of this c s m s cong dan
	*/
	@Override
	public java.util.Date getNgaySinhCha() {
		return _csmsCongDan.getNgaySinhCha();
	}

	/**
	* Sets the ngay sinh cha of this c s m s cong dan.
	*
	* @param NgaySinhCha the ngay sinh cha of this c s m s cong dan
	*/
	@Override
	public void setNgaySinhCha(java.util.Date NgaySinhCha) {
		_csmsCongDan.setNgaySinhCha(NgaySinhCha);
	}

	/**
	* Returns the ten me of this c s m s cong dan.
	*
	* @return the ten me of this c s m s cong dan
	*/
	@Override
	public java.lang.String getTenMe() {
		return _csmsCongDan.getTenMe();
	}

	/**
	* Sets the ten me of this c s m s cong dan.
	*
	* @param TenMe the ten me of this c s m s cong dan
	*/
	@Override
	public void setTenMe(java.lang.String TenMe) {
		_csmsCongDan.setTenMe(TenMe);
	}

	/**
	* Returns the ngay sinh me of this c s m s cong dan.
	*
	* @return the ngay sinh me of this c s m s cong dan
	*/
	@Override
	public java.util.Date getNgaySinhMe() {
		return _csmsCongDan.getNgaySinhMe();
	}

	/**
	* Sets the ngay sinh me of this c s m s cong dan.
	*
	* @param NgaySinhMe the ngay sinh me of this c s m s cong dan
	*/
	@Override
	public void setNgaySinhMe(java.util.Date NgaySinhMe) {
		_csmsCongDan.setNgaySinhMe(NgaySinhMe);
	}

	/**
	* Returns the ten vo of this c s m s cong dan.
	*
	* @return the ten vo of this c s m s cong dan
	*/
	@Override
	public java.lang.String getTenVo() {
		return _csmsCongDan.getTenVo();
	}

	/**
	* Sets the ten vo of this c s m s cong dan.
	*
	* @param TenVo the ten vo of this c s m s cong dan
	*/
	@Override
	public void setTenVo(java.lang.String TenVo) {
		_csmsCongDan.setTenVo(TenVo);
	}

	/**
	* Returns the ngay sinh vo of this c s m s cong dan.
	*
	* @return the ngay sinh vo of this c s m s cong dan
	*/
	@Override
	public java.util.Date getNgaySinhVo() {
		return _csmsCongDan.getNgaySinhVo();
	}

	/**
	* Sets the ngay sinh vo of this c s m s cong dan.
	*
	* @param NgaySinhVo the ngay sinh vo of this c s m s cong dan
	*/
	@Override
	public void setNgaySinhVo(java.util.Date NgaySinhVo) {
		_csmsCongDan.setNgaySinhVo(NgaySinhVo);
	}

	/**
	* Returns the sdt of this c s m s cong dan.
	*
	* @return the sdt of this c s m s cong dan
	*/
	@Override
	public long getSdt() {
		return _csmsCongDan.getSdt();
	}

	/**
	* Sets the sdt of this c s m s cong dan.
	*
	* @param Sdt the sdt of this c s m s cong dan
	*/
	@Override
	public void setSdt(long Sdt) {
		_csmsCongDan.setSdt(Sdt);
	}

	@Override
	public boolean isNew() {
		return _csmsCongDan.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_csmsCongDan.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _csmsCongDan.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_csmsCongDan.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _csmsCongDan.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _csmsCongDan.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_csmsCongDan.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _csmsCongDan.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_csmsCongDan.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_csmsCongDan.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_csmsCongDan.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CSMSCongDanWrapper((CSMSCongDan)_csmsCongDan.clone());
	}

	@Override
	public int compareTo(com.congdan.model.CSMSCongDan csmsCongDan) {
		return _csmsCongDan.compareTo(csmsCongDan);
	}

	@Override
	public int hashCode() {
		return _csmsCongDan.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.congdan.model.CSMSCongDan> toCacheModel() {
		return _csmsCongDan.toCacheModel();
	}

	@Override
	public com.congdan.model.CSMSCongDan toEscapedModel() {
		return new CSMSCongDanWrapper(_csmsCongDan.toEscapedModel());
	}

	@Override
	public com.congdan.model.CSMSCongDan toUnescapedModel() {
		return new CSMSCongDanWrapper(_csmsCongDan.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _csmsCongDan.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _csmsCongDan.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_csmsCongDan.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CSMSCongDanWrapper)) {
			return false;
		}

		CSMSCongDanWrapper csmsCongDanWrapper = (CSMSCongDanWrapper)obj;

		if (Validator.equals(_csmsCongDan, csmsCongDanWrapper._csmsCongDan)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CSMSCongDan getWrappedCSMSCongDan() {
		return _csmsCongDan;
	}

	@Override
	public CSMSCongDan getWrappedModel() {
		return _csmsCongDan;
	}

	@Override
	public void resetOriginalValues() {
		_csmsCongDan.resetOriginalValues();
	}

	private CSMSCongDan _csmsCongDan;
}