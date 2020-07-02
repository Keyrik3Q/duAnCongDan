package com.congdan.service.persistence;
import java.util.Collections;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

@SuppressWarnings("rawtypes")
public class CSMSCongDanFinderImpl extends BasePersistenceImpl implements CSMSCongDanFinder {
	@SuppressWarnings("unchecked")
	public List<Object[]> findCSMSCongDans(String ho, String dem, String ten,String macongdan,int tinh, int huyen,int xa ,String sohochieu,String name,String ngaysinh,int socmnd ,int Start, int ketThuc) throws SystemException {
		Session session = null;
		try{
		session = openSession();
		String sql = "SELECT csmscongdan.idcsmscongdan, tinh.name as nametinh, huyen.name as namehuyen, xa. name as namexa, csmscongdan.ho,csmscongdan.dem,csmscongdan.ten,csmscongdan.ngaysinh, csmscongdan.socmnd,csmscongdan.macongdan ,csmscongdan.sohochieu FROM qlcongdan.csmscongdan "
				+ " inner join tinh "
				+ " on tinh.id = csmscongdan.diachithuongtrutinhid "
				+ " inner join huyen "
				+ " on huyen.id = csmscongdan.diachithuongtruhuyenid "
				+ " inner join xa "
				+ " on xa.id = csmscongdan.diachithuongtruxaid "
				+ " where 1=1 ";
		if(!name.equals("")){
			sql += " and csmscongdan.ho like '%"+ ho +"%' ";
			sql += " and csmscongdan.dem like '%"+ dem +"%' ";
			sql += " and csmscongdan.ten like '%"+ ten +"%' ";
		}
		if(!ngaysinh.equals("")){
			sql += " and csmscongdan.ngaysinh >= CAST('"+ngaysinh+"' AS DATE) ";
		}
		if(socmnd !=0){
			sql += " and csmscongdan.socmnd like '%"+ socmnd +"%' ";
		}
		if(!macongdan.equals("")){
			sql += " and csmscongdan.macongdan like '%"+ macongdan +"%' ";
		}
		if(!sohochieu.equals("")){
			sql += " and csmscongdan.sohochieu like '%"+ sohochieu +"%' ";
		}
		if(tinh !=0){
			sql += " and csmscongdan.diachithuongtrutinhid like '%"+ tinh +"%' ";
		}
		if(huyen !=0){
			sql += " and csmscongdan.diachithuongtruhuyenid like '%"+ huyen +"%' ";
		}
		if(xa !=0){
			sql += " and csmscongdan.diachithuongtruxaid like '%"+ xa +"%' ";
		}
		SQLQuery query = session.createSQLQuery(sql);
		@SuppressWarnings("unused")
		QueryPos qPos = QueryPos.getInstance(query);
		return (List<Object[]>)QueryUtil.list(query, getDialect(), Start, ketThuc);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.EMPTY_LIST;
		}
	
	public long countCSMSCongDans(String ho, String dem, String ten,String macongdan,int tinh, int huyen,int xa ,String sohochieu,String name,String ngaysinh,int socmnd) throws SystemException {
		Session session = null;
		try {
		session = openSession();
		String sql = "SELECT count(*) FROM qlcongdan.csmscongdan "
				+ " inner join tinh "
				+ " on tinh.id = csmscongdan.diachithuongtrutinhid "
				+ " inner join huyen "
				+ " on huyen.id = csmscongdan.diachithuongtruhuyenid "
				+ " inner join xa "
				+ " on xa.id = csmscongdan.diachithuongtruxaid "
				+ " where 1=1 ";
		if(!name.equals("")){
			sql += " and csmscongdan.ho like '%"+ ho +"%' ";
			sql += " and csmscongdan.dem like '%"+ dem +"%' ";
			sql += " and csmscongdan.ten like '%"+ ten +"%' ";
		}
		if(!ngaysinh.equals("")){
			sql += " and csmscongdan.ngaysinh >= CAST('"+ngaysinh+"' AS DATE) ";
		}
		if(socmnd !=0){
			sql += " and csmscongdan.socmnd like '%"+ socmnd +"%' ";
		}
		if(!macongdan.equals("")){
			sql += " and csmscongdan.macongdan like '%"+ macongdan +"%' ";
		}
		if(!sohochieu.equals("")){
			sql += " and csmscongdan.sohochieu like '%"+ sohochieu +"%' ";
		}
		if(tinh !=0){
			sql += " and csmscongdan.diachithuongtrutinhid like '%"+ tinh +"%' ";
		}
		if(huyen !=0){
			sql += " and csmscongdan.diachithuongtruhuyenid like '%"+ huyen +"%' ";
		}
		if(xa !=0){
			sql += " and csmscongdan.diachithuongtruxaid like '%"+ xa +"%' ";
		}
		SQLQuery query = session.createSQLQuery(sql);
		@SuppressWarnings("unused")
		QueryPos qPos = QueryPos.getInstance(query);
		return GetterUtil.getLong(query.list().get(0));
		}catch (Exception e) {
		}
		return 0;
		}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> findHuyens(int idh, int Start, int ketThuc) throws SystemException {
		Session session = null;
		try{
		session = openSession();
		
		String sql = "SELECT huyen.id , huyen.name as namehuyen FROM huyen "
				+ " where 1=1 ";
				if(idh != 0){
					sql+= "and huyen.tinhid = "+idh+" ";
				}
		SQLQuery query = session.createSQLQuery(sql);
		@SuppressWarnings("unused")
		QueryPos qPos = QueryPos.getInstance(query);
		return (List<Object[]>)QueryUtil.list(query, getDialect(), Start, ketThuc);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.EMPTY_LIST;
		}
	
	public long countCSMSHuyens(int id) throws SystemException {
		Session session = null;
		try {
		session = openSession();
		String sql = "SELECT huyen.id as idhuyen, huyen.name as namehuyen FROM huyen ";
		SQLQuery query = session.createSQLQuery(sql);
		@SuppressWarnings("unused")
		QueryPos qPos = QueryPos.getInstance(query);
		return GetterUtil.getLong(query.list().get(0));
		}catch (Exception e) {
		}
		return 0;
		}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> findXas(int idx, int Start, int ketThuc) throws SystemException {
		Session session = null;
		try{
		session = openSession();
		
		String sql = "SELECT xa.id, xa.name FROM xa "
				+ " where 1=1  ";
				if(idx != 0){
					sql+= "and xa.huyenid = "+idx+" ";
				}
		SQLQuery query = session.createSQLQuery(sql);
		@SuppressWarnings("unused")
		QueryPos qPos = QueryPos.getInstance(query);
		return (List<Object[]>)QueryUtil.list(query, getDialect(), Start, ketThuc);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.EMPTY_LIST;
		}
	
	public long countXas(int idx) throws SystemException {
		Session session = null;
		try {
		session = openSession();
		String sql = "SELECT xa.id , xa.name as namexa FROM xa "
				+ " inner join huyen "
				+ " where 1=1 "
				+ " and xa.huyenid = xa.id ";
				if(idx != 0){
					sql+= "and xa.huyenid = "+idx+" ";
				}
		SQLQuery query = session.createSQLQuery(sql);
		@SuppressWarnings("unused")
		QueryPos qPos = QueryPos.getInstance(query);
		return GetterUtil.getLong(query.list().get(0));
		}catch (Exception e) {
		}
		return 0;
		}
	
	public List<Object[]> findHoKhaus(int idhk, int Start, int ketThuc) throws SystemException {
		Session session = null;
		try{
		session = openSession();
		
		String sql = "SELECT xa.id, xa.name FROM xa "
				+ " where 1=1  ";
				if(idhk != 0){
					sql+= "and xa.huyenid = "+idhk+" ";
				}
		SQLQuery query = session.createSQLQuery(sql);
		@SuppressWarnings("unused")
		QueryPos qPos = QueryPos.getInstance(query);
		return (List<Object[]>)QueryUtil.list(query, getDialect(), Start, ketThuc);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.EMPTY_LIST;
		}
	
	public List<Object[]> findHoTens(int Start, int ketThuc) throws SystemException {
		Session session = null;
		try{
		session = openSession();
		String sql = "SELECT csmscongdan.idcsmscongdan, csmscongdan.ho,csmscongdan.dem,csmscongdan.ten FROM qlcongdan.csmscongdan "
				+ " where 1=1 ";
		SQLQuery query = session.createSQLQuery(sql);
		@SuppressWarnings("unused")
		QueryPos qPos = QueryPos.getInstance(query);
		return (List<Object[]>)QueryUtil.list(query, getDialect(), Start, ketThuc);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.EMPTY_LIST;
		}
}