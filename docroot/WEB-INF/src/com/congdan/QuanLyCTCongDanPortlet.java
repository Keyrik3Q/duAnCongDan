package com.congdan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletModeException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.WindowStateException;

import com.congdan.model.CSMSCongDan;
import com.congdan.model.Huyen;
import com.congdan.model.Tinh;
import com.congdan.model.Xa;
import com.congdan.model.impl.CSMSCongDanImpl;
import com.congdan.model.impl.HuyenImpl;
import com.congdan.model.impl.TinhImpl;
import com.congdan.model.impl.XaImpl;
import com.congdan.service.CSMSCongDanLocalServiceUtil;
import com.congdan.service.HuyenLocalServiceUtil;
import com.congdan.service.TinhLocalServiceUtil;
import com.congdan.service.XaLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.jdbc.OutputBlob;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.LiferayPortletMode;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
public class QuanLyCTCongDanPortlet extends MVCPortlet {
	public void congDan(ActionRequest req, ActionResponse res ) throws SystemException, ParseException{
		int Start=0;
		int ketThuc=0;
		Start = (ParamUtil.getInteger(req, "cur",1)-1)*ParamUtil.getInteger(req, "delta", 5);
		ketThuc = Start+ParamUtil.getInteger(req, "delta", 5);
		int cur = ParamUtil.getInteger(req, "cur",1);
		int delta = ParamUtil.getInteger(req, "delta", 5);
		String name = ParamUtil.get(req, "name", "");
		String ho = "";
		String dem = "";
		String ten = "";
		String[] output =  name.split("");
			if(output.length == 1){
				ho = output[0].toString();
			}else if(output.length == 2){
				ho = output[0].toString();
				dem = output[1].toString();
			}else{
				ho = output[0].toString();
				dem = output[1].toString();
				ten = output[2].toString();
			}
		String ngaysinh = ParamUtil.getString(req, "ngaysinh");
		String macongdan = ParamUtil.getString(req, "macongdan");
		String sohochieu = ParamUtil.getString(req, "sohochieu");
		int socmnd = ParamUtil.getInteger(req, "socmnd");
		int tinh = ParamUtil.getInteger(req, "tinh");
		int huyen = ParamUtil.getInteger(req, "huyen");
		int xa = ParamUtil.getInteger(req, "xa");
		long tong = CSMSCongDanLocalServiceUtil.countCSMSCongDans(ho, dem, ten, macongdan, tinh, huyen, xa, sohochieu, name, ngaysinh, socmnd);
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(TinhImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<Tinh> tinhp = TinhLocalServiceUtil.dynamicQuery(q);
		DynamicQuery h = DynamicQueryFactoryUtil.forClass(HuyenImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<Huyen> huyenp = HuyenLocalServiceUtil.dynamicQuery(h);
		DynamicQuery x = DynamicQueryFactoryUtil.forClass(XaImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<Xa> xap = XaLocalServiceUtil.dynamicQuery(x);
		
		DynamicQuery tinhn = DynamicQueryFactoryUtil.forClass(TinhImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<Tinh> tinhns = TinhLocalServiceUtil.dynamicQuery(tinhn);
		DynamicQuery huyenn = DynamicQueryFactoryUtil.forClass(HuyenImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<Huyen> huyenns = HuyenLocalServiceUtil.dynamicQuery(huyenn);
		DynamicQuery xan = DynamicQueryFactoryUtil.forClass(XaImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<Xa> xans = XaLocalServiceUtil.dynamicQuery(xan);
		
		DynamicQuery tinhhiennay = DynamicQueryFactoryUtil.forClass(TinhImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<Tinh> tinhhn = TinhLocalServiceUtil.dynamicQuery(tinhhiennay);
		DynamicQuery huyenhiennay = DynamicQueryFactoryUtil.forClass(HuyenImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<Huyen> huyenhn = HuyenLocalServiceUtil.dynamicQuery(huyenhiennay);
		DynamicQuery xahiennay = DynamicQueryFactoryUtil.forClass(XaImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<Xa> xahn = XaLocalServiceUtil.dynamicQuery(xahiennay);
		
		DynamicQuery cd = DynamicQueryFactoryUtil.forClass(CSMSCongDanImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<CSMSCongDan> csmscongdan = CSMSCongDanLocalServiceUtil.dynamicQuery(cd);
		List<Object[]> data = CSMSCongDanLocalServiceUtil.findCSMSCongDans(ho, dem, ten, macongdan, tinh, huyen, xa, sohochieu, name, ngaysinh, socmnd, Start, ketThuc);
		SessionMessages.add(req, PortalUtil.getPortletId(req)+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		req.setAttribute("data", data);
		req.setAttribute("tong", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("tinh", tinh);
		req.setAttribute("huyen", huyen);
		req.setAttribute("xa", xa);
		req.setAttribute("tinhp", tinhp);
		req.setAttribute("huyenp", huyenp);
		req.setAttribute("ngaysinh", ngaysinh);
		req.setAttribute("tinhns", tinhns);
		req.setAttribute("huyenns", huyenns);
		req.setAttribute("xans", xans);
		req.setAttribute("tinhhn", tinhhn);
		req.setAttribute("huyenhn", huyenhn);
		req.setAttribute("xahn", xahn);
		req.setAttribute("socmnd", socmnd);
		req.setAttribute("macongdan", macongdan);
		req.setAttribute("sohochieu", sohochieu);
		req.setAttribute("xap", xap);
		req.setAttribute("start", Start);
		req.setAttribute("end", ketThuc);
		req.setAttribute("name", name);
		req.setAttribute("csmscongdan", csmscongdan);
		res.setRenderParameter("jspPage","/html/quanlyctcongdan/view.jsp");
		res.setRenderParameter("cur", String.valueOf(cur));
		res.setRenderParameter("delta", String.valueOf(delta));
	}
	
public void serveResource(ResourceRequest request, ResourceResponse response) throws IOException, PortletException {	
        int idh = ParamUtil.getInteger(request,"idh");
        int idx = ParamUtil.getInteger(request,"idx");
        long imageId=ParamUtil.getLong(request,"imageId");
        long id = ParamUtil.getLong(request, "code");
        
        if(idh != 0 || idx !=0){
        	thanhpho(request, response, idh, idx);
        } 
        
        if(id != 0){
        	hotenhk(request, response, id);
        }
        
        if(imageId != 0){
        	try {
                CSMSCongDan photo=CSMSCongDanLocalServiceUtil.getCSMSCongDan(imageId);
                if(photo!=null){
                            Blob image=photo.getImageData();
                            byte[ ] imgData = image.getBytes(1,(int)image.length());
                            response.setContentType("image/jpg");
					OutputStream o = response.getPortletOutputStream();
					o.write(imgData);
					o.flush();
					o.close();
                }
               
		    }
		    catch (Exception e) {
		                //_log.error(e);
		    }
        }
	 }
		
		public void input(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
			SessionMessages.add(req, PortalUtil.getPortletId(req)+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			DynamicQuery q = DynamicQueryFactoryUtil.forClass(TinhImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Tinh> tinhp = TinhLocalServiceUtil.dynamicQuery(q);
			DynamicQuery h = DynamicQueryFactoryUtil.forClass(HuyenImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Huyen> huyenp = HuyenLocalServiceUtil.dynamicQuery(h);
			DynamicQuery x = DynamicQueryFactoryUtil.forClass(XaImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Xa> xap = XaLocalServiceUtil.dynamicQuery(x);
			
			DynamicQuery tinhhiennay = DynamicQueryFactoryUtil.forClass(TinhImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Tinh> tinhhn = TinhLocalServiceUtil.dynamicQuery(tinhhiennay);
			DynamicQuery huyenhiennay = DynamicQueryFactoryUtil.forClass(HuyenImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Huyen> huyenhn = HuyenLocalServiceUtil.dynamicQuery(huyenhiennay);
			DynamicQuery xahiennay = DynamicQueryFactoryUtil.forClass(XaImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Xa> xahn = XaLocalServiceUtil.dynamicQuery(xahiennay);
			
			DynamicQuery tinhn = DynamicQueryFactoryUtil.forClass(TinhImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Tinh> tinhns = TinhLocalServiceUtil.dynamicQuery(tinhn);
			DynamicQuery huyenn = DynamicQueryFactoryUtil.forClass(HuyenImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Huyen> huyenns = HuyenLocalServiceUtil.dynamicQuery(huyenn);
			DynamicQuery xan = DynamicQueryFactoryUtil.forClass(XaImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Xa> xans = XaLocalServiceUtil.dynamicQuery(xan);
			
			DynamicQuery ns = DynamicQueryFactoryUtil.forClass(CSMSCongDanImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<CSMSCongDan> ngaysinh = CSMSCongDanLocalServiceUtil.dynamicQuery(ns);
			long idcsmscongdan = ParamUtil.getLong(req, "idcsmscongdan");
			if(idcsmscongdan!=0){
				CSMSCongDan csms = CSMSCongDanLocalServiceUtil.getCSMSCongDan(idcsmscongdan);
				req.setAttribute("csms", csms);
				req.setAttribute("tinhp", tinhp);
				req.setAttribute("huyenp", huyenp);
				req.setAttribute("xap", xap);
				req.setAttribute("ngaysinh", ngaysinh);
				
				req.setAttribute("tinhns", tinhns);
				req.setAttribute("huyenns", huyenns);
				req.setAttribute("xans", xans);
				
				req.setAttribute("tinhhn", tinhhn);
				req.setAttribute("huyenhn", huyenhn);
				req.setAttribute("xahn", xahn);
			}else if(idcsmscongdan==0){
				CSMSCongDan csms = new CSMSCongDanImpl();
				req.setAttribute("csms", csms);
				req.setAttribute("tinhp", tinhp);
				req.setAttribute("huyenp", huyenp);
				req.setAttribute("xap", xap);
				req.setAttribute("ngaysinh", ngaysinh);
				
				req.setAttribute("tinhns", tinhns);
				req.setAttribute("huyenns", huyenns);
				req.setAttribute("xans", xans);
				
				req.setAttribute("tinhhn", tinhhn);
				req.setAttribute("huyenhn", huyenhn);
				req.setAttribute("xahn", xahn);
			}
			res.setRenderParameter("jspPage","/html/quanlyctcongdan/input.jsp");
		}
		
		public void deleteSach(ActionRequest req, ActionResponse res) throws PortalException, SystemException, WindowStateException, PortletModeException, IOException{
			SessionMessages.add(req, PortalUtil.getPortletId(req)+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			long[] deleteSachId = ParamUtil.getLongValues(req, "deleteSachId");
			for(int i=0; i<deleteSachId.length; i++){
				CSMSCongDan csms = CSMSCongDanLocalServiceUtil.getCSMSCongDan(deleteSachId[i]);
				CSMSCongDanLocalServiceUtil.deleteCSMSCongDan(csms);
			}
			ThemeDisplay themeDisplay = (ThemeDisplay)req.getAttribute(WebKeys.THEME_DISPLAY);
			long plid = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(), "quanlyctcongdan_WAR_QuanLyCongDanportlet");
			PortletURL url = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(req), "quanlyctcongdan_WAR_QuanLyCongDanportlet", plid, PortletRequest.ACTION_PHASE);
			url.setWindowState(LiferayWindowState.NORMAL);
			url.setPortletMode(LiferayPortletMode.VIEW);
			url.setParameter("javax.portlet.action", "congDan");
			res.sendRedirect(url.toString());
		}
		
		
		public void upload(ActionRequest actionRequest,
	            ActionResponse actionResponse) throws SystemException,
	            PortalException, WindowStateException, PortletModeException, IOException {
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest)+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			long idcsmscongdan = ParamUtil.getLong(actionRequest, "idcsmscongdan");
			UploadRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
			String uploadedFileName=ParamUtil.getString(uploadRequest,"file");
	        File file = uploadRequest.getFile("fileimage");
			if(idcsmscongdan!=0){
					CSMSCongDan csms = CSMSCongDanLocalServiceUtil.getCSMSCongDan(idcsmscongdan);
					if(!file.equals("")){
				        InputStream inputStream = new FileInputStream(file);
				        
				        OutputBlob blobData = new OutputBlob(inputStream, file.length());
				        csms.setImageData(blobData);
				        csms.setImgName(uploadedFileName);
			        }
					csms.setHo(ParamUtil.getString(actionRequest, "ho"));
					csms.setDem(ParamUtil.getString(actionRequest, "dem"));
					csms.setTen(ParamUtil.getString(actionRequest, "ten"));
					SimpleDateFormat ns = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinh(ParamUtil.getDate(actionRequest,"ngaysinh", ns));
					csms.setGioiTinhId(ParamUtil.getLong(actionRequest, "gioitinh"));
					csms.setNoiSinhChiTiet(ParamUtil.getString(actionRequest, "noisinhchitiet"));
					csms.setNoiSinhXaId(ParamUtil.getLong(actionRequest, "xans"));
					csms.setNoiSinhHuyenId(ParamUtil.getLong(actionRequest, "huyenns"));
					csms.setNoiSinhTinhId(ParamUtil.getLong(actionRequest, "tinhns"));
					csms.setDanTocId(ParamUtil.getString(actionRequest, "dantoc"));
					csms.setQuocTichId(ParamUtil.getString(actionRequest, "quoctich"));
					csms.setTonGiaoId(ParamUtil.getString(actionRequest, "tongiao"));
					csms.setDiaChiThuongTru(ParamUtil.getString(actionRequest, "diachithuongtru"));
					csms.setDiaChiThuongTruXaId(ParamUtil.getLong(actionRequest, "xap"));
					csms.setDiaChiThuongTruHuyenId(ParamUtil.getLong(actionRequest, "huyenp"));
					csms.setDiaChiThuongTruTinhId(ParamUtil.getLong(actionRequest, "tinhp"));
					csms.setDiaChiHienNay(ParamUtil.getString(actionRequest, "diachihiennay"));
					csms.setDiaChiHienNayXaId(ParamUtil.getLong(actionRequest, "xahn"));
					csms.setDiaChiHienNayHuyenId(ParamUtil.getLong(actionRequest, "huyenhn"));
					csms.setDiaChiHienNayTinhId(ParamUtil.getLong(actionRequest, "tinhhn"));
					csms.setTinhTrang(ParamUtil.getLong(actionRequest, "tinhtrang"));
					csms.setTinhtTranghonNhanId(ParamUtil.getLong(actionRequest, "tinhtranghonnhan"));
					csms.setSocmnd(ParamUtil.getString(actionRequest, "socmnd"));
					SimpleDateFormat nc = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgayCapCMND(ParamUtil.getDate(actionRequest,"ngaycapcmnd", nc));
					csms.setNoiCapCMND(ParamUtil.getString(actionRequest, "noicapcmnd"));
					csms.setSoHoKhau(ParamUtil.getString(actionRequest, "sohokhau"));
					csms.setLaChuHo(ParamUtil.getLong(actionRequest, "lachuho"));
					csms.setQuanHeChuHoId(ParamUtil.getLong(actionRequest, "quanhevoichuho"));
					SimpleDateFormat ncshc = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgayCapSHC(ParamUtil.getDate(actionRequest,"ngaycapshc", ncshc));
					SimpleDateFormat nhhshc = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgayHetHanSHC(ParamUtil.getDate(actionRequest,"ngayhethanshc", nhhshc));
					csms.setNoiCapSHC(ParamUtil.getString(actionRequest, "noicapshc"));
					csms.setSoHoChieu(ParamUtil.getString(actionRequest, "sohochieu"));
					csms.setMaCongDan(ParamUtil.getLong(actionRequest, "macongdan"));
					
					csms.setTenCha(ParamUtil.getString(actionRequest, "tencha"));
					SimpleDateFormat nsc = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinhCha(ParamUtil.getDate(actionRequest,"ngaysinhcha", nsc));
					csms.setTenMe(ParamUtil.getString(actionRequest, "tenme"));
					SimpleDateFormat nsm = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinhMe(ParamUtil.getDate(actionRequest,"ngaysinhme", nsm));
					csms.setTenVo(ParamUtil.getString(actionRequest, "tenvo"));
					SimpleDateFormat nsv = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinhVo(ParamUtil.getDate(actionRequest,"ngaysinhvo", nsv));
					
					csms.setSdt(ParamUtil.getLong(actionRequest, "sdt"));
					CSMSCongDanLocalServiceUtil.updateCSMSCongDan(csms);	
			}else{
					long id = CounterLocalServiceUtil.increment(CSMSCongDan.class.getName());
			        CSMSCongDan csms = CSMSCongDanLocalServiceUtil.createCSMSCongDan(id);
			        if(!file.equals("")){
				        InputStream inputStream = new FileInputStream(file);
				        OutputBlob blobData = new OutputBlob(inputStream, file.length());
				        csms.setImageData(blobData);
				        csms.setImgName(uploadedFileName);
			        }
					csms.setHo(ParamUtil.getString(actionRequest, "ho"));
					csms.setDem(ParamUtil.getString(actionRequest, "dem"));
					csms.setTen(ParamUtil.getString(actionRequest, "ten"));
					SimpleDateFormat ns = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinh(ParamUtil.getDate(actionRequest,"ngaysinh", ns));
					csms.setGioiTinhId(ParamUtil.getLong(actionRequest, "gioitinh"));
					csms.setNoiSinhChiTiet(ParamUtil.getString(actionRequest, "noisinhchitiet"));
					csms.setNoiSinhXaId(ParamUtil.getLong(actionRequest, "xans"));
					csms.setNoiSinhHuyenId(ParamUtil.getLong(actionRequest, "huyenns"));
					csms.setNoiSinhTinhId(ParamUtil.getLong(actionRequest, "tinhns"));
					csms.setDanTocId(ParamUtil.getString(actionRequest, "dantoc"));
					csms.setQuocTichId(ParamUtil.getString(actionRequest, "quoctich"));
					csms.setTonGiaoId(ParamUtil.getString(actionRequest, "tongiao"));
					csms.setDiaChiThuongTru(ParamUtil.getString(actionRequest, "diachithuongtru"));
					csms.setDiaChiThuongTruXaId(ParamUtil.getLong(actionRequest, "xap"));
					csms.setDiaChiThuongTruHuyenId(ParamUtil.getLong(actionRequest, "huyenp"));
					csms.setDiaChiThuongTruTinhId(ParamUtil.getLong(actionRequest, "tinhp"));
					csms.setDiaChiHienNay(ParamUtil.getString(actionRequest, "diachihiennay"));
					csms.setDiaChiHienNayXaId(ParamUtil.getLong(actionRequest, "xahn"));
					csms.setDiaChiHienNayHuyenId(ParamUtil.getLong(actionRequest, "huyenhn"));
					csms.setDiaChiHienNayTinhId(ParamUtil.getLong(actionRequest, "tinhhn"));
					csms.setTinhTrang(ParamUtil.getLong(actionRequest, "tinhtrang"));
					csms.setTinhtTranghonNhanId(ParamUtil.getLong(actionRequest, "tinhtranghonnhan"));
					csms.setSocmnd(ParamUtil.getString(actionRequest, "socmnd"));
					SimpleDateFormat nc = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgayCapCMND(ParamUtil.getDate(actionRequest,"ngaycapcmnd", nc));
					csms.setNoiCapCMND(ParamUtil.getString(actionRequest, "noicapcmnd"));
					csms.setSoHoKhau(ParamUtil.getString(actionRequest, "sohokhau"));
					csms.setLaChuHo(ParamUtil.getLong(actionRequest, "lachuho"));
					csms.setQuanHeChuHoId(ParamUtil.getLong(actionRequest, "quanhevoichuho"));
					SimpleDateFormat ncshc = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgayCapSHC(ParamUtil.getDate(actionRequest,"ngaycapshc", ncshc));
					SimpleDateFormat nhhshc = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgayHetHanSHC(ParamUtil.getDate(actionRequest,"ngayhethanshc", nhhshc));
					csms.setNoiCapSHC(ParamUtil.getString(actionRequest, "noicapshc"));
					csms.setSoHoChieu(ParamUtil.getString(actionRequest, "sohochieu"));
					csms.setMaCongDan(ParamUtil.getLong(actionRequest, "macongdan"));
					
					csms.setTenCha(ParamUtil.getString(actionRequest, "tencha"));
					SimpleDateFormat nsc = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinhCha(ParamUtil.getDate(actionRequest,"ngaysinhcha", nsc));
					csms.setTenMe(ParamUtil.getString(actionRequest, "tenme"));
					SimpleDateFormat nsm = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinhMe(ParamUtil.getDate(actionRequest,"ngaysinhme", nsm));
					csms.setTenVo(ParamUtil.getString(actionRequest, "tenvo"));
					SimpleDateFormat nsv = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinhVo(ParamUtil.getDate(actionRequest,"ngaysinhvo", nsv));
					
					csms.setSdt(ParamUtil.getLong(actionRequest, "sdt"));
			        CSMSCongDanLocalServiceUtil.addCSMSCongDan(csms);
				}
			
	        ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			long plid = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(), "quanlyctcongdan_WAR_QuanLyCongDanportlet");
			PortletURL url = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(actionRequest), "quanlyctcongdan_WAR_QuanLyCongDanportlet", plid, PortletRequest.ACTION_PHASE);
			url.setWindowState(LiferayWindowState.NORMAL);
			url.setPortletMode(LiferayPortletMode.VIEW);
			url.setParameter("javax.portlet.action", "congDan");
			actionResponse.sendRedirect(url.toString());
	    }
		
		public void detail(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
			SessionMessages.add(req, PortalUtil.getPortletId(req)+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			long id = ParamUtil.getLong(req, "id");
			CSMSCongDan csmscongdan = CSMSCongDanLocalServiceUtil.getCSMSCongDan(id);
			req.setAttribute("csmscongdan", csmscongdan);
			res.setRenderParameter("jspPage","/html/quanlyctcongdan/detail.jsp");
		}
		
		
		public void thanhpho(ResourceRequest request, ResourceResponse response, int idh, int idx) throws IOException{
			response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        if(idh != 0){
	        try {	
	        	int Start = -1;
	    		int ketThuc= -1;
	        	List<Object[]> data = CSMSCongDanLocalServiceUtil.findHuyens(idh, Start, ketThuc);
	        	out.print(
	        			"<select><option> --Quận/Huyện-- </option></select>"
	        		);
	        	for(Object[] eq:data){
	            	out.print(
	            			"<select><option value="+eq[0]+">"+eq[1]+"</option></select>"
	            	  );
	            }
	        }  catch (Exception ex) {
	            out.print("NOooooooooooooo..." + ex.toString());
	        }
	        finally {
	            out.close();
	        }
	        }
	        
	        if(idx != 0){
		        try {
		        	int Start = -1;
		    		int ketThuc= -1;
		        	List<Object[]> data = CSMSCongDanLocalServiceUtil.findXas(idx, Start, ketThuc);
		        	out.print(
		        			"<select><option> --Phường/Xã-- </option></select>"
		        		);
		            for(Object[] eq:data){
		            	out.print(
		            			"<select><option value="+eq[0]+">"+eq[1]+"</option></select>"
		            	  );
		            }
		        }  catch (Exception ex) {
		            out.print("NOooooooooooooo..." + ex.toString());
		        }
		        finally {
		            out.close();
		        }
	        } 
		}
		
		
		public void dkhokhau(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
			SessionMessages.add(req, PortalUtil.getPortletId(req)+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			DynamicQuery q = DynamicQueryFactoryUtil.forClass(TinhImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Tinh> tinhp = TinhLocalServiceUtil.dynamicQuery(q);
			DynamicQuery h = DynamicQueryFactoryUtil.forClass(HuyenImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Huyen> huyenp = HuyenLocalServiceUtil.dynamicQuery(h);
			DynamicQuery x = DynamicQueryFactoryUtil.forClass(XaImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Xa> xap = XaLocalServiceUtil.dynamicQuery(x);
			
			DynamicQuery tinhhiennay = DynamicQueryFactoryUtil.forClass(TinhImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Tinh> tinhhn = TinhLocalServiceUtil.dynamicQuery(tinhhiennay);
			DynamicQuery huyenhiennay = DynamicQueryFactoryUtil.forClass(HuyenImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Huyen> huyenhn = HuyenLocalServiceUtil.dynamicQuery(huyenhiennay);
			DynamicQuery xahiennay = DynamicQueryFactoryUtil.forClass(XaImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Xa> xahn = XaLocalServiceUtil.dynamicQuery(xahiennay);
			
			DynamicQuery tinhn = DynamicQueryFactoryUtil.forClass(TinhImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Tinh> tinhns = TinhLocalServiceUtil.dynamicQuery(tinhn);
			DynamicQuery huyenn = DynamicQueryFactoryUtil.forClass(HuyenImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Huyen> huyenns = HuyenLocalServiceUtil.dynamicQuery(huyenn);
			DynamicQuery xan = DynamicQueryFactoryUtil.forClass(XaImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<Xa> xans = XaLocalServiceUtil.dynamicQuery(xan);
			
			DynamicQuery p = DynamicQueryFactoryUtil.forClass(CSMSCongDanImpl.class, PortalClassLoaderUtil.getClassLoader());
			List<CSMSCongDan> congdan = CSMSCongDanLocalServiceUtil.dynamicQuery(p);
			long idcd = ParamUtil.getLong(req, "idcd");
			System.out.println(idcd);
			if(idcd!=0){
				CSMSCongDan csms = CSMSCongDanLocalServiceUtil.getCSMSCongDan(idcd);
				req.setAttribute("csms", csms);
				req.setAttribute("tinhp", tinhp);
				req.setAttribute("huyenp", huyenp);
				req.setAttribute("xap", xap);
				
				req.setAttribute("tinhns", tinhns);
				req.setAttribute("huyenns", huyenns);
				req.setAttribute("xans", xans);
				
				req.setAttribute("tinhhn", tinhhn);
				req.setAttribute("huyenhn", huyenhn);
				req.setAttribute("xahn", xahn);
				
				req.setAttribute("congdan", congdan);
			}else if(idcd==0){
				CSMSCongDan csms = new CSMSCongDanImpl();
				req.setAttribute("csms", csms);
				req.setAttribute("tinhp", tinhp);
				req.setAttribute("huyenp", huyenp);
				req.setAttribute("xap", xap);
				
				req.setAttribute("tinhns", tinhns);
				req.setAttribute("huyenns", huyenns);
				req.setAttribute("xans", xans);
				
				req.setAttribute("tinhhn", tinhhn);
				req.setAttribute("huyenhn", huyenhn);
				req.setAttribute("xahn", xahn);
				
				req.setAttribute("congdan", congdan);
			}
			res.setRenderParameter("jspPage","/html/quanlyctcongdan/dkhokhau.jsp");
		}
		
		public void hokhaucd(ActionRequest actionRequest,
	            ActionResponse actionResponse) throws SystemException,
	            PortalException, WindowStateException, PortletModeException, IOException {
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest)+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			long idcd = ParamUtil.getLong(actionRequest, "idcd");
			if(idcd!=0){
					CSMSCongDan csms = CSMSCongDanLocalServiceUtil.getCSMSCongDan(idcd);
					csms.setHo(ParamUtil.getString(actionRequest, "ho"));
					csms.setDem(ParamUtil.getString(actionRequest, "dem"));
					csms.setTen(ParamUtil.getString(actionRequest, "ten"));
					SimpleDateFormat ns = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinh(ParamUtil.getDate(actionRequest,"ngaysinh", ns));
					csms.setGioiTinhId(ParamUtil.getLong(actionRequest, "gioitinh"));
					csms.setNoiSinhChiTiet(ParamUtil.getString(actionRequest, "noisinhchitiet"));
					csms.setDanTocId(ParamUtil.getString(actionRequest, "dantoc"));
					csms.setQuocTichId(ParamUtil.getString(actionRequest, "quoctich"));
					csms.setTonGiaoId(ParamUtil.getString(actionRequest, "tongiao"));
					csms.setDiaChiThuongTru(ParamUtil.getString(actionRequest, "diachithuongtru"));
					csms.setDiaChiHienNay(ParamUtil.getString(actionRequest, "diachihiennay"));
					csms.setSocmnd(ParamUtil.getString(actionRequest, "socmnd"));
					SimpleDateFormat nc = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgayCapCMND(ParamUtil.getDate(actionRequest,"ngaycapcmnd", nc));
					csms.setNoiCapCMND(ParamUtil.getString(actionRequest, "noicapcmnd"));
					csms.setTenCha(ParamUtil.getString(actionRequest, "tencha"));
					SimpleDateFormat nsc = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinhCha(ParamUtil.getDate(actionRequest,"ngaysinhcha", nsc));
					csms.setTenMe(ParamUtil.getString(actionRequest, "tenme"));
					SimpleDateFormat nsm = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinhMe(ParamUtil.getDate(actionRequest,"ngaysinhme", nsm));
					csms.setTenVo(ParamUtil.getString(actionRequest, "tenvo"));
					SimpleDateFormat nsv = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinhVo(ParamUtil.getDate(actionRequest,"ngaysinhvo", nsv));
					
					csms.setSdt(ParamUtil.getLong(actionRequest, "sdt"));
					CSMSCongDanLocalServiceUtil.updateCSMSCongDan(csms);	
			}else{
					long id = CounterLocalServiceUtil.increment(CSMSCongDan.class.getName());
			        CSMSCongDan csms = CSMSCongDanLocalServiceUtil.createCSMSCongDan(id);
					csms.setHo(ParamUtil.getString(actionRequest, "ho"));
					csms.setDem(ParamUtil.getString(actionRequest, "dem"));
					csms.setTen(ParamUtil.getString(actionRequest, "ten"));
					SimpleDateFormat ns = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinh(ParamUtil.getDate(actionRequest,"ngaysinh", ns));
					csms.setGioiTinhId(ParamUtil.getLong(actionRequest, "gioitinh"));
					csms.setNoiSinhChiTiet(ParamUtil.getString(actionRequest, "noisinhchitiet"));
					csms.setDanTocId(ParamUtil.getString(actionRequest, "dantoc"));
					csms.setQuocTichId(ParamUtil.getString(actionRequest, "quoctich"));
					csms.setTonGiaoId(ParamUtil.getString(actionRequest, "tongiao"));
					csms.setDiaChiThuongTru(ParamUtil.getString(actionRequest, "diachithuongtru"));
					csms.setDiaChiHienNay(ParamUtil.getString(actionRequest, "diachihiennay"));
					csms.setSocmnd(ParamUtil.getString(actionRequest, "socmnd"));
					SimpleDateFormat nc = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgayCapCMND(ParamUtil.getDate(actionRequest,"ngaycapcmnd", nc));
					csms.setNoiCapCMND(ParamUtil.getString(actionRequest, "noicapcmnd"));
					csms.setTenCha(ParamUtil.getString(actionRequest, "tencha"));
					SimpleDateFormat nsc = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinhCha(ParamUtil.getDate(actionRequest,"ngaysinhcha", nsc));
					csms.setTenMe(ParamUtil.getString(actionRequest, "tenme"));
					SimpleDateFormat nsm = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinhMe(ParamUtil.getDate(actionRequest,"ngaysinhme", nsm));
					csms.setTenVo(ParamUtil.getString(actionRequest, "tenvo"));
					SimpleDateFormat nsv = new SimpleDateFormat("yyyy-MM-dd");
					csms.setNgaySinhVo(ParamUtil.getDate(actionRequest,"ngaysinhvo", nsv));
					
					csms.setSdt(ParamUtil.getLong(actionRequest, "sdt"));
			        CSMSCongDanLocalServiceUtil.addCSMSCongDan(csms);
				}
			
	        ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			long plid = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(), "quanlyctcongdan_WAR_QuanLyCongDanportlet");
			PortletURL url = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(actionRequest), "quanlyctcongdan_WAR_QuanLyCongDanportlet", plid, PortletRequest.ACTION_PHASE);
			url.setWindowState(LiferayWindowState.NORMAL);
			url.setPortletMode(LiferayPortletMode.VIEW);
			url.setParameter("javax.portlet.action", "congDan");
			actionResponse.sendRedirect(url.toString());
	    }
		
		
		public void addPhoto(ActionRequest actionRequest, ActionResponse actionResponse)throws IOException, PortletException {
			UploadRequest uploadRequest=PortalUtil.getUploadPortletRequest(actionRequest);
			File photoImage = uploadRequest.getFile("photo");
			String title=ParamUtil.getString(uploadRequest,"title");
			InputStream fis =new FileInputStream(photoImage);
			OutputBlob dataOutputBlob = new OutputBlob(fis, photoImage.length());
			try{
				CSMSCongDan photo= CSMSCongDanLocalServiceUtil.createCSMSCongDan(CounterLocalServiceUtil.increment());
				photo.setImgName(title);
				photo.setImageData(dataOutputBlob);
				photo=CSMSCongDanLocalServiceUtil.addCSMSCongDan(photo);
				if(photo!=null){
					SessionMessages.add(actionRequest.getPortletSession(),"photo-added-success");
					System.out.println("photo-added-success");
					
				}else{
					SessionErrors.add(actionRequest.getPortletSession(),"photo-added-failed");
					System.out.println("photo-added-failed::");
				}
				
			}catch(Exception e){
				
					e.printStackTrace();
				
				
			}
		}
	
		public void hotenhk(ResourceRequest request, ResourceResponse response, long id) throws IOException, PortletException {	
			if(id != 0){
			try {
				CSMSCongDan csms = CSMSCongDanLocalServiceUtil.getCSMSCongDan(id);
				SimpleDateFormat dateFomat = new SimpleDateFormat("yyyy-MM-dd");

				JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

				jsonObject.put("ho", csms != null ? csms.getHo() : "");
				jsonObject.put("dem", csms != null ? csms.getDem() : "");
				jsonObject.put("ten", csms != null ? csms.getTen() : "" );
				jsonObject.put("gioitinh", csms != null ? csms.getGioiTinhId() : 0 );
				jsonObject.put("ngaysinh", csms != null ? dateFomat.format(csms.getNgaySinh()) : null );
				jsonObject.put("noisinhchitiet", csms != null ? csms.getNoiSinhChiTiet() : "" );
				jsonObject.put("macongdan", csms != null ? csms.getMaCongDan() : 0 );
				jsonObject.put("dantoc", csms != null ? csms.getDanTocId() : "" );
				jsonObject.put("tongiao", csms != null ? csms.getTonGiaoId() : "" );
				jsonObject.put("diachithuongtru", csms != null ? csms.getDiaChiThuongTru() : "" );
				jsonObject.put("diachihiennay", csms != null ? csms.getDiaChiHienNay() : "" );
				jsonObject.put("socmnd", csms != null ? csms.getSocmnd() : "" );
				jsonObject.put("noicapcmnd", csms != null ? csms.getNoiCapCMND() : "" ); 
				response.setContentType("text/javascript");
				response.setCharacterEncoding("UTF-8");

				PrintWriter printWriter;
				printWriter = response.getWriter();
				printWriter.write(jsonObject.toString());

				printWriter.flush();
				printWriter.close();
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}

		}
		}
}
