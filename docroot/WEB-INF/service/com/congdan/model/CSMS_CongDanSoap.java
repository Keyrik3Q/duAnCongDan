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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.congdan.service.http.CSMS_CongDanServiceSoap}.
 *
 * @author ADMIN
 * @see com.congdan.service.http.CSMS_CongDanServiceSoap
 * @generated
 */
public class CSMS_CongDanSoap implements Serializable {
	public static CSMS_CongDanSoap toSoapModel(CSMS_CongDan model) {
		CSMS_CongDanSoap soapModel = new CSMS_CongDanSoap();

		soapModel.setIdcsms_CongDan(model.getIdcsms_CongDan());
		soapModel.setHo(model.getHo());
		soapModel.setDem(model.getDem());
		soapModel.setTen(model.getTen());
		soapModel.setNgaySinh(model.getNgaySinh());
		soapModel.setGioiTinhId(model.getGioiTinhId());
		soapModel.setNoiSinhChiTiet(model.getNoiSinhChiTiet());
		soapModel.setNoiSinhXaId(model.getNoiSinhXaId());
		soapModel.setNoiSinhHuyenId(model.getNoiSinhHuyenId());
		soapModel.setNoiSinhTinhId(model.getNoiSinhTinhId());
		soapModel.setDanTocId(model.getDanTocId());
		soapModel.setQuocTichId(model.getQuocTichId());
		soapModel.setTonGiaoId(model.getTonGiaoId());
		soapModel.setDiaChiThuongTru(model.getDiaChiThuongTru());
		soapModel.setDiaChiThuongTruXaId(model.getDiaChiThuongTruXaId());
		soapModel.setDiaChiThuongTruHuyenId(model.getDiaChiThuongTruHuyenId());
		soapModel.setDiaChiThuongTruTinhId(model.getDiaChiThuongTruTinhId());
		soapModel.setDiaChiHienNay(model.getDiaChiHienNay());
		soapModel.setDiaChiHienNayXaId(model.getDiaChiHienNayXaId());
		soapModel.setDiaChiHienNayHuyenId(model.getDiaChiHienNayHuyenId());
		soapModel.setDiaChiHienNayTinhId(model.getDiaChiHienNayTinhId());
		soapModel.setTinhTrang(model.getTinhTrang());
		soapModel.setTinhtTranghonNhanId(model.getTinhtTranghonNhanId());
		soapModel.setSocmnd(model.getSocmnd());
		soapModel.setNgayCapCMND(model.getNgayCapCMND());
		soapModel.setNoiCapCMND(model.getNoiCapCMND());
		soapModel.setSoHoKhau(model.getSoHoKhau());
		soapModel.setLaChuHo(model.getLaChuHo());
		soapModel.setQuanHeChuHoId(model.getQuanHeChuHoId());

		return soapModel;
	}

	public static CSMS_CongDanSoap[] toSoapModels(CSMS_CongDan[] models) {
		CSMS_CongDanSoap[] soapModels = new CSMS_CongDanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CSMS_CongDanSoap[][] toSoapModels(CSMS_CongDan[][] models) {
		CSMS_CongDanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CSMS_CongDanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CSMS_CongDanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CSMS_CongDanSoap[] toSoapModels(List<CSMS_CongDan> models) {
		List<CSMS_CongDanSoap> soapModels = new ArrayList<CSMS_CongDanSoap>(models.size());

		for (CSMS_CongDan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CSMS_CongDanSoap[soapModels.size()]);
	}

	public CSMS_CongDanSoap() {
	}

	public long getPrimaryKey() {
		return _Idcsms_CongDan;
	}

	public void setPrimaryKey(long pk) {
		setIdcsms_CongDan(pk);
	}

	public long getIdcsms_CongDan() {
		return _Idcsms_CongDan;
	}

	public void setIdcsms_CongDan(long Idcsms_CongDan) {
		_Idcsms_CongDan = Idcsms_CongDan;
	}

	public String getHo() {
		return _Ho;
	}

	public void setHo(String Ho) {
		_Ho = Ho;
	}

	public String getDem() {
		return _Dem;
	}

	public void setDem(String Dem) {
		_Dem = Dem;
	}

	public String getTen() {
		return _Ten;
	}

	public void setTen(String Ten) {
		_Ten = Ten;
	}

	public Date getNgaySinh() {
		return _NgaySinh;
	}

	public void setNgaySinh(Date NgaySinh) {
		_NgaySinh = NgaySinh;
	}

	public long getGioiTinhId() {
		return _GioiTinhId;
	}

	public void setGioiTinhId(long GioiTinhId) {
		_GioiTinhId = GioiTinhId;
	}

	public String getNoiSinhChiTiet() {
		return _NoiSinhChiTiet;
	}

	public void setNoiSinhChiTiet(String NoiSinhChiTiet) {
		_NoiSinhChiTiet = NoiSinhChiTiet;
	}

	public long getNoiSinhXaId() {
		return _NoiSinhXaId;
	}

	public void setNoiSinhXaId(long NoiSinhXaId) {
		_NoiSinhXaId = NoiSinhXaId;
	}

	public long getNoiSinhHuyenId() {
		return _NoiSinhHuyenId;
	}

	public void setNoiSinhHuyenId(long NoiSinhHuyenId) {
		_NoiSinhHuyenId = NoiSinhHuyenId;
	}

	public long getNoiSinhTinhId() {
		return _NoiSinhTinhId;
	}

	public void setNoiSinhTinhId(long NoiSinhTinhId) {
		_NoiSinhTinhId = NoiSinhTinhId;
	}

	public long getDanTocId() {
		return _DanTocId;
	}

	public void setDanTocId(long DanTocId) {
		_DanTocId = DanTocId;
	}

	public long getQuocTichId() {
		return _QuocTichId;
	}

	public void setQuocTichId(long QuocTichId) {
		_QuocTichId = QuocTichId;
	}

	public long getTonGiaoId() {
		return _TonGiaoId;
	}

	public void setTonGiaoId(long TonGiaoId) {
		_TonGiaoId = TonGiaoId;
	}

	public String getDiaChiThuongTru() {
		return _DiaChiThuongTru;
	}

	public void setDiaChiThuongTru(String DiaChiThuongTru) {
		_DiaChiThuongTru = DiaChiThuongTru;
	}

	public long getDiaChiThuongTruXaId() {
		return _DiaChiThuongTruXaId;
	}

	public void setDiaChiThuongTruXaId(long DiaChiThuongTruXaId) {
		_DiaChiThuongTruXaId = DiaChiThuongTruXaId;
	}

	public long getDiaChiThuongTruHuyenId() {
		return _DiaChiThuongTruHuyenId;
	}

	public void setDiaChiThuongTruHuyenId(long DiaChiThuongTruHuyenId) {
		_DiaChiThuongTruHuyenId = DiaChiThuongTruHuyenId;
	}

	public long getDiaChiThuongTruTinhId() {
		return _DiaChiThuongTruTinhId;
	}

	public void setDiaChiThuongTruTinhId(long DiaChiThuongTruTinhId) {
		_DiaChiThuongTruTinhId = DiaChiThuongTruTinhId;
	}

	public String getDiaChiHienNay() {
		return _DiaChiHienNay;
	}

	public void setDiaChiHienNay(String DiaChiHienNay) {
		_DiaChiHienNay = DiaChiHienNay;
	}

	public long getDiaChiHienNayXaId() {
		return _DiaChiHienNayXaId;
	}

	public void setDiaChiHienNayXaId(long DiaChiHienNayXaId) {
		_DiaChiHienNayXaId = DiaChiHienNayXaId;
	}

	public long getDiaChiHienNayHuyenId() {
		return _DiaChiHienNayHuyenId;
	}

	public void setDiaChiHienNayHuyenId(long DiaChiHienNayHuyenId) {
		_DiaChiHienNayHuyenId = DiaChiHienNayHuyenId;
	}

	public long getDiaChiHienNayTinhId() {
		return _DiaChiHienNayTinhId;
	}

	public void setDiaChiHienNayTinhId(long DiaChiHienNayTinhId) {
		_DiaChiHienNayTinhId = DiaChiHienNayTinhId;
	}

	public long getTinhTrang() {
		return _TinhTrang;
	}

	public void setTinhTrang(long TinhTrang) {
		_TinhTrang = TinhTrang;
	}

	public long getTinhtTranghonNhanId() {
		return _TinhtTranghonNhanId;
	}

	public void setTinhtTranghonNhanId(long TinhtTranghonNhanId) {
		_TinhtTranghonNhanId = TinhtTranghonNhanId;
	}

	public String getSocmnd() {
		return _socmnd;
	}

	public void setSocmnd(String socmnd) {
		_socmnd = socmnd;
	}

	public Date getNgayCapCMND() {
		return _NgayCapCMND;
	}

	public void setNgayCapCMND(Date NgayCapCMND) {
		_NgayCapCMND = NgayCapCMND;
	}

	public long getNoiCapCMND() {
		return _NoiCapCMND;
	}

	public void setNoiCapCMND(long NoiCapCMND) {
		_NoiCapCMND = NoiCapCMND;
	}

	public String getSoHoKhau() {
		return _SoHoKhau;
	}

	public void setSoHoKhau(String SoHoKhau) {
		_SoHoKhau = SoHoKhau;
	}

	public long getLaChuHo() {
		return _LaChuHo;
	}

	public void setLaChuHo(long LaChuHo) {
		_LaChuHo = LaChuHo;
	}

	public long getQuanHeChuHoId() {
		return _QuanHeChuHoId;
	}

	public void setQuanHeChuHoId(long QuanHeChuHoId) {
		_QuanHeChuHoId = QuanHeChuHoId;
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
}