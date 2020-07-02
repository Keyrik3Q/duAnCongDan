<%@page import="java.util.Date"%>
<%@page import="com.congdan.service.XaLocalServiceUtil"%>
<%@page import="com.congdan.service.CSMSCongDanLocalServiceUtil"%>
<%@page import="com.congdan.model.CSMSCongDan"%>
<%@page import="com.congdan.model.Xa"%>
<%@page import="com.congdan.model.Huyen"%>
<%@page import="com.congdan.model.Tinh"%>
<%@page import="com.congdan.model.CSMS_CongDan"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.sun.mail.imap.protocol.Item"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.sun.xml.internal.ws.addressing.model.ActionNotSupportedException"%>
<%@page import="javax.portlet.filter.ActionRequestWrapper"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<portlet:defineObjects />
<%
	CSMSCongDan csmscongdan = (CSMSCongDan)request.getAttribute("csms");
	List<Tinh> tinhp = (List<Tinh>)request.getAttribute("tinhp");
	List<Huyen> huyenp = (List<Huyen>)request.getAttribute("huyenp");
	List<Xa> xap = (List<Xa>)request.getAttribute("xap");
	
	List<Tinh> tinhhn = (List<Tinh>)request.getAttribute("tinhhn");
	List<Huyen> huyenhn = (List<Huyen>)request.getAttribute("huyenhn");
	List<Xa> xahn = (List<Xa>)request.getAttribute("xahn");
	
	List<Tinh> tinhns = (List<Tinh>)request.getAttribute("tinhns");
	List<Huyen> huyenns = (List<Huyen>)request.getAttribute("huyenns");
	List<Xa> xans = (List<Xa>)request.getAttribute("xans");
	long tinh = GetterUtil.getLong(request.getAttribute("tinh"));
	SimpleDateFormat dateFomat = new SimpleDateFormat("yyyy-MM-dd");
	
	PortletURL interatorURL = renderResponse.createActionURL();
	interatorURL.setParameter(ActionRequest.ACTION_NAME, "congDan");
%>
<h4>DANH SÁCH CÔNG DÂN</h4>
<portlet:actionURL var='uploadURL' name="upload" />
<aui:form name="fm" action="<%=uploadURL.toString()%>" method="post" enctype="multipart/form-data">
   <input type= "hidden" value="<%=csmscongdan.getIdcsmsCongDan() %>" name="<portlet:namespace/>idcsmscongdan">
   <table>
		<tr>
			<td>
				<p style="width: 130px;">Họ, tên đêm, tên</p>
			</td>
			<td>
				<input id="for130" type= "text" value="<%=csmscongdan.getHo() %>" name="<portlet:namespace/>ho">
			</td>
			<td>
				<input id="for130" type= "text" value="<%=csmscongdan.getDem() %>" name="<portlet:namespace/>dem">
			</td>
			<td>
				<input id="for130" type= "text" value="<%=csmscongdan.getTen() %>" name="<portlet:namespace/>ten">
			</td>
		</tr>
	</table>
	<table style="margin-top: 20px;">
		<tr>
			<td>
				Ngày sinh
			</td>
			<td style="padding-left: 68px;">
				<input style="width: 72px;" <%if(csmscongdan.getIdcsmsCongDan() == 0){%>
					value=""
				<%}else{%>
					value="<%=dateFomat.format(csmscongdan.getNgaySinh()) %>"
				<%} %> name="<portlet:namespace />ngaysinh" placeholder="DD/MM/YYY" type="text"/>
			</td>	
			<td style="padding-left: 10px;">
				Giới Tính
			</td>
			<td>
				<select style="width:145px" name="<portlet:namespace />gioitinh" id="">
					<%if(csmscongdan.getGioiTinhId() == 1){ %>
						<option value="">--Chọn--</option>
						<option value="1" selected>Nam</option>
						<option value="2">Nữ</option>
						<option value="0">Khác</option>
					<%}else if(csmscongdan.getGioiTinhId() == 2){ %>
						<option value="">--Chọn--</option>
						<option value="1">Nam</option>
						<option value="2" selected>Nữ</option>
						<option value="0">Khác</option>
					<%}else{ %>
						<option value="">--Chọn--</option>
						<option value="">Chọn</option>
						<option value="1">Nam</option>
						<option value="2">Nữ</option>
						<option value="0">Khác</option>
					<%} %>
				</select>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td>
				<img src='<%= renderRequest.getContextPath() + "/image/avt.jpg" %>'
		 			alt="no Image" style=" width: 100px;position:absolute;margin-left: 43%;top: 25%; "/>
				<input style="width: 77px; position: absolute; right: 12.7%;top: 37%;" name="fileimage" type="file" onchange="document.getElementById('blah').src = window.URL.createObjectURL(this.files[0])"/>
				<portlet:resourceURL var="imageResourceURL">
					<portlet:param name="imageId" value="<%=String.valueOf(csmscongdan.getIdcsmsCongDan()) %>"/>
				</portlet:resourceURL>
				<div>
					<img id="blah" style="width: 100px; position: absolute;right: 13% ; top:24.7%;" src="<%=imageResourceURL.toString()%>"/>
				</div>
			</td>
		</tr>
	</table>
	<table style="margin-top: 13px;">
		<tr>
			<td>
				Mã công dân
			</td>
			<td style="padding-left: 50px;">
				<input id="for130" type= "text" value="<%=csmscongdan.getMaCongDan() %>" name="<portlet:namespace/>macongdan">
			</td>
		</tr>
	</table>
	<table style="margin-top: 12px;">
		<tr>
			<td>
				<b>Nơi sinh</b>
			</td>
		</tr>
		<tr>
			<td>
				Nơi sinh chi tiết
			</td>
			<td style="padding-left: 34px;">
				<input style="width: 543px;" value="<%=csmscongdan.getNoiSinhChiTiet() %>" type= "text" value="" name="<portlet:namespace/>noisinhchitiet">
			</td>
		</tr>
	 </table>
	 <table>
		<tr>
       		<td id="tdfor">
       			Địa danh hành chính
       		</td>
	       	<td>
		        <select style="width:145px" name="<portlet:namespace />tinhns" id="tinhns">
					<option value="0">--Tỉnh/Thành Phố--</option>
					<%for(int i=0; i<tinhns.size(); i++){ %>
						<%if(csmscongdan.getNoiSinhTinhId() == tinhns.get(i).getId()){ %>
							<option value="<%=tinhns.get(i).getId()%>" selected>
								<%=tinhns.get(i).getName() %>
							</option>
						<%}else{ %>
							<option value="<%=tinhns.get(i).getId()%>">
								<%=tinhns.get(i).getName() %>
							</option>
							<%} %>
						<%} %>
		         </select>
	         </td>
	         <td>
            	<select style="width:145px" name="<portlet:namespace />huyenns" id="huyenns">
            		<option value="0">--Quận/Huyện--</option>
            		<%for(int i=0; i<huyenns.size(); i++){ %>
            		<%if(csmscongdan.getNoiSinhHuyenId() == huyenns.get(i).getId()){ %>
            			<option value="<%=huyenns.get(i).getId()%>" selected>
								<%=huyenns.get(i).getName() %>
							</option>
					<%}else{ %>
							<option value="<%=huyenns.get(i).getId()%>">
								<%=huyenns.get(i).getName() %>
							</option>
							<%} %>
            		<%} %>
            	</select>
            </td>
            <td>
            	<select style="width:145px" name="<portlet:namespace />xans" id="xans">
            		<option value="0">--Phường/Xã--</option>
            		<%if(csmscongdan.getNoiSinhXaId() != 0){ %>
            			<option value="<%=XaLocalServiceUtil.getXa(csmscongdan.getNoiSinhXaId()).getId()%>" selected>
								<%=XaLocalServiceUtil.getXa(csmscongdan.getNoiSinhXaId()).getName()%>
							</option>
            		<%} %>
            	</select>
            </td>
    </tr>    
    </table>
    <table>    
		<tr>
			<td>
				Dân tộc
			</td>
			<td style="padding-left: 82px;">
				<select style="width:145px" name="<portlet:namespace />dantoc" id="">
				<%if(csmscongdan.getDanTocId().equals("Kinh")){ %>
					<option value="">--Chọn--</option>
					<option value="Kinh" selected>Kinh</option>
					<option value="Co">Co</option>
					<option value="H'Mông">H'Mông</option>
				<%}else if(csmscongdan.getDanTocId().equals("Co")){ %>
					<option value="">--Chọn--</option>
					<option value="Kinh">Kinh</option>
					<option value="Co" selected>Co</option>
					<option value="H'Mông">H'Mông</option>
				<%}else if(csmscongdan.getDanTocId().equals("H'Mông")){ %>
					<option value="">--Chọn--</option>
					<option value="Kinh">Kinh</option>
					<option value="Co">Co</option>
					<option value="H'Mông" selected>H'Mông</option>
				<%}else{ %>
					<option value="">--Chọn--</option>
					<option value="Kinh">Kinh</option>
					<option value="Co">Co</option>
					<option value="H'Mông">H'Mông</option>
				<%} %>
				</select>
			</td>
			<td>
				Quốc tịch
			</td>
			<td>
				<select style="width:145px" name="<portlet:namespace />quoctich" id="">
				<%if(csmscongdan.getQuocTichId().equals("Việt Nam")){ %>
					<option value="">Chọn</option>
					<option value="Việt Nam" selected>Việt Nam</option>
					<option value="Pháp">Pháp</option>
					<option value="Italia">Italia</option>
				<%}else if(csmscongdan.getQuocTichId().equals("Pháp")){ %>
					<option value="">Chọn</option>
					<option value="Việt Nam">Việt Nam</option>
					<option value="Pháp" selected>Pháp</option>
					<option value="Italia">Italia</option>
				<%}else if(csmscongdan.getQuocTichId().equals("Italia")){ %>
					<option value="">Chọn</option>
					<option value="Việt Nam">Việt Nam</option>
					<option value="Pháp">Pháp</option>
					<option value="Italia" selected>Italia</option>
				<%}else{ %>
					<option value="">Chọn</option>
					<option value="Việt Nam">Việt Nam</option>
					<option value="Pháp">Pháp</option>
					<option value="Italia">Italia</option>
				<%} %>
				</select>
			</td>
			<td>
				Tôn giáo
			</td>
			<td>
			<select style="width:145px" name="<portlet:namespace />tongiao" id="">
				<%if(csmscongdan.getTonGiaoId().equals("Phật")){ %>
					<option value="">--Chọn--</option>
					<option value="Không">Không</option>
					<option value="Phật" selected>Phật</option>
					<option value="Thiên chúa">Thiên chúa</option>
				<%}else if(csmscongdan.getTonGiaoId().equals("Thiên chúa")){ %>
					<option value="">--Chọn--</option>
					<option value="Không">Không</option>
					<option value="Phật">Phật</option>
					<option value="Thiên chúa" selected>Thiên chúa</option>
				<%}else{ %>
					<option value="">--Chọn--</option>
					<option value="Không">Không</option>
					<option value="Phật">Phật</option>
					<option value="Thiên chúa">Thiên chúa</option>
				<%} %>
				</select>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td>
				<b>Địa chỉ thường trú</b>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td>
				Số nhà/tổ/thôn/xóm
			</td>
			<td style="padding-left: 9px;">
				<input style="width: 543px;" value="<%=csmscongdan.getDiaChiThuongTru() %>" type= "text" value="" name="<portlet:namespace/>diachithuongtru">
			</td>
		</tr>
	</table>
	<table>
		<tr>
       		<td id="tdfor">
       			Địa danh hành chính
       		</td>
	       	<td>
		        <select style="width:145px" name="<portlet:namespace />tinhp" id="tinhp">
					<option value="0">--Tỉnh/Thành Phố--</option>
					<%for(int i=0; i<tinhp.size(); i++){ %>
						<%if(csmscongdan.getDiaChiThuongTruTinhId() == tinhp.get(i).getId()){ %>
							<option value="<%=tinhp.get(i).getId()%>" selected>
								<%=tinhp.get(i).getName() %>
							</option>
						<%}else{ %>
							<option value="<%=tinhp.get(i).getId()%>">
								<%=tinhp.get(i).getName() %>
							</option>
							<%} %>
						<%} %>
		         </select>
	         </td>
	         <td>
            	<select style="width:145px" name="<portlet:namespace />huyenp" id="huyenp">
            		<option value="0">--Quận/Huyện--</option>
					<%for(int i=0; i<huyenp.size(); i++){ %>
						<%if(csmscongdan.getDiaChiThuongTruHuyenId() == huyenp.get(i).getId()){ %>
							<option value="<%=huyenp.get(i).getId()%>" selected>
								<%=huyenp.get(i).getName() %>
							</option>
						<%}else{ %>
							<option value="<%=huyenp.get(i).getId()%>">
								<%=huyenp.get(i).getName() %>
							</option>
							<%} %>
						<%} %>
            	</select>
            </td>
            <td>
            	<select style="width:145px" name="<portlet:namespace />xap" id="xap">
            		<option>--Phường/Xã--</option>
						<%if(csmscongdan.getDiaChiThuongTruXaId() != 0){ %>
							<option value="<%=XaLocalServiceUtil.getXa(csmscongdan.getDiaChiThuongTruXaId()).getId()%>" selected>
								<%=XaLocalServiceUtil.getXa(csmscongdan.getDiaChiThuongTruXaId()).getName()%>
							</option>
							<%} %>
            	</select>
            </td>
    </tr>   
    </table>
    <table>     
		<tr>
			<td>
				<b>Địa chỉ hiện nay</b>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td>
				Số nhà/tổ/thôn/xóm
			</td>
			<td style="padding-left: 9px;">
				<input style="width: 543px;" value="<%=csmscongdan.getDiaChiHienNay() %>" type= "text" value="" name="<portlet:namespace/>diachihiennay">
			</td>
		</tr>
	</table>
	<table>
		<tr>
       		<td id="tdfor">
       			Địa danh hành chính
       		</td>
	       	<td>
		        <select style="width:145px" name="<portlet:namespace />tinhhn" id="tinhhn">
					<option value="0">--Tỉnh/Thành Phố--</option>
					<%for(int i=0; i<tinhhn.size(); i++){ %>
						<%if(csmscongdan.getDiaChiHienNayTinhId() == tinhhn.get(i).getId()){ %>
							<option value="<%=tinhhn.get(i).getId()%>" selected>
								<%=tinhhn.get(i).getName() %>
							</option>
						<%}else{ %>
							<option value="<%=tinhhn.get(i).getId()%>">
								<%=tinhhn.get(i).getName() %>
							</option>
							<%} %>
						<%} %>
		         </select>
	         </td>
	         <td>
            	<select style="width:145px" name="<portlet:namespace />huyenhn" id="huyenhn">
            		<option value="0">--Quận/Huyện--</option>
					<%for(int i=0; i<huyenhn.size(); i++){ %>
						<%if(csmscongdan.getDiaChiHienNayHuyenId() == huyenhn.get(i).getId()){ %>
							<option value="<%=huyenhn.get(i).getId()%>" selected>
								<%=huyenhn.get(i).getName() %>
							</option>
						<%}else{ %>
							<option value="<%=huyenp.get(i).getId()%>">
								<%=huyenhn.get(i).getName() %>
							</option>
							<%} %>
						<%} %>
            	</select>
            </td>
            <td>
            	<select style="width:145px" name="<portlet:namespace />xahn" id="xahn">
            		<option>--Phường/Xã--</option>
						<%if(csmscongdan.getDiaChiHienNayXaId() != 0){ %>
							<option value="<%=XaLocalServiceUtil.getXa(csmscongdan.getDiaChiHienNayXaId()).getId()%>" selected>
								<%=XaLocalServiceUtil.getXa(csmscongdan.getDiaChiHienNayXaId()).getName()%>
							</option>
							<%} %>
            	</select>
            </td>
    </tr>   
    </table>
    <table>
    	<tr>
			<td>
				Tình trạng
			</td>
			<td style="display: inline-flex; padding-left: 100px;">
				<%if(csmscongdan.getTinhTrang() == 1){ %>
				<input value="1" name="<portlet:namespace />tinhtrang" type="radio" checked>Còn sống
				<input style="margin-left: 100px;" type="radio" value="2" name="<portlet:namespace />tinhtrang">Đã chết
				<%}else{ %>
				<input value="1" name="<portlet:namespace />tinhtrang" type="radio">Còn sống
				<input style="margin-left: 100px;" type="radio" value="2" name="<portlet:namespace />tinhtrang" checked>Đã chết
				<% }%>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td>
				Tình trạng hôn nhân
			</td>
				<td style="padding-left: 2px;">
				<select style="width:145px" name="<portlet:namespace/>tinhtranghonnhan">
					<option value="1">chung sống</option>
					<option value="2">đã ly hôn</option>
				</select>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td>
				Số CMND
			</td>
			<td style="padding-left: 65px;">
				<input value="<%=csmscongdan.getSocmnd() %>" id="for130" type= "text" value="" name="<portlet:namespace/>socmnd">
			</td>
			<td>
				Ngày cấp
			</td>
			<td>
				<input style="width: 72px;" <%if(csmscongdan.getIdcsmsCongDan() == 0){%>
					value=""
				<%}else{%>
					value="<%=dateFomat.format(csmscongdan.getNgayCapCMND()) %>"
				<%} %> name="<portlet:namespace />ngaycapcmnd" placeholder="DD/MM/YYY" type="text"/>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td style="width: 128px;">
				Nơi cấp
			</td>
				<td>
		        <select style="width:145px" name="<portlet:namespace />noicapcmnd" id="">
				<%if(csmscongdan.getNoiCapCMND().equals("Đà Nẵng")){ %>
					<option value="">--Chọn--</option>
					<option value="Đà Nẵng" selected>Đà Nẵng</option>
					<option value="Hồ Chí Minh">Hồ Chí Minh</option>
					<option value="Hà Nội">Hà Nội</option>
				<%}else if(csmscongdan.getNoiCapCMND().equals("Hồ Chí Minh")){ %>
					<option value="">--Chọn--</option>
					<option value="Đà Nẵng">Đà Nẵng</option>
					<option value="Hồ Chí Minh" selected>Hồ Chí Minh</option>
					<option value="Hà Nội">Hà Nội</option>
				<%}else if(csmscongdan.getNoiCapCMND().equals("Hà Nội")){ %>
					<option value="">--Chọn--</option>
					<option value="Đà Nẵng">Đà Nẵng</option>
					<option value="Hồ Chí Minh">Hồ Chí Minh</option>
					<option value="Hà Nội" selected>Hà Nội</option>
				<%}else{ %>
					<option value="">--Chọn--</option>
					<option value="Đà Nẵng">Đà Nẵng</option>
					<option value="Hồ Chí Minh">Hồ Chí Minh</option>
					<option value="Hà Nội">Hà Nội</option>
				<%} %>
				</select>
	         </td>
			
		</tr>
	</table>
	<table>
		<tr>
			<td style="width: 128px;">
				Số hộ chiếu
			</td>
			<td>
				<input value="<%=csmscongdan.getSoHoChieu() %>" id="for130" type= "text" value="" name="<portlet:namespace/>sohochieu">
			</td>
			<td>
				Ngày cấp
			</td>
			<td>
				<input style="width: 72px;" <%if(csmscongdan.getIdcsmsCongDan() == 0){%>
					value=""
				<%}else{%>
					value="<%=dateFomat.format(csmscongdan.getNgayCapSHC()) %>"
				<%} %> name="<portlet:namespace />ngaycapshc" placeholder="DD/MM/YYY" type="text"/>
			</td>
			<td>
				Ngày hết hạn
			</td>
			<td>
				<input style="width: 72px;" <%if(csmscongdan.getIdcsmsCongDan() == 0){%>
					value=""
				<%}else{%>
					value="<%=dateFomat.format(csmscongdan.getNgayHetHanSHC()) %>"
				<%} %> name="<portlet:namespace />ngayhethanshc" placeholder="DD/MM/YYY" type="text"/>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td style="width: 128px;">
				Nơi cấp
			</td>
			<td>
			<select style="width:145px" name="<portlet:namespace />noicapshc" id="">
				<%if(csmscongdan.getNoiCapSHC().equals("Đà Nẵng")){ %>
					<option value="">--Chọn--</option>
					<option value="Đà Nẵng" selected>Đà Nẵng</option>
					<option value="Hồ Chí Minh">Hồ Chí Minh</option>
					<option value="Hà Nội">Hà Nội</option>
				<%}else if(csmscongdan.getNoiCapSHC().equals("Hồ Chí Minh")){ %>
					<option value="">--Chọn--</option>
					<option value="Đà Nẵng">Đà Nẵng</option>
					<option value="Hồ Chí Minh" selected>Hồ Chí Minh</option>
					<option value="Hà Nội">Hà Nội</option>
				<%}else if(csmscongdan.getNoiCapSHC().equals("Hà Nội")){ %>
					<option value="">--Chọn--</option>
					<option value="Đà Nẵng">Đà Nẵng</option>
					<option value="Hồ Chí Minh">Hồ Chí Minh</option>
					<option value="Hà Nội" selected>Hà Nội</option>
				<%}else{ %>
					<option value="">--Chọn--</option>
					<option value="Đà Nẵng">Đà Nẵng</option>
					<option value="Hồ Chí Minh">Hồ Chí Minh</option>
					<option value="Hà Nội">Hà Nội</option>
				<%} %>
				</select>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td>
				Số hộ khẩu
			</td>
			<td style="padding-left: 57px;">
				<input value="<%=csmscongdan.getSoHoKhau() %>" id="for130" type= "text" value="" name="<portlet:namespace/>sohokhau">
			</td>
			<td style="display: inline-flex;padding-left: 100px;">
				<input type="checkbox" value="1" id="check" checked="checked" />là chủ hộ
				<input type="hidden" value="1" id="check1" name="<portlet:namespace/>lachuho" />
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td>
				Quan hệ với chủ hộ
			</td>
			<td style="padding-left: 5px;">
			
				<select style="width:145px" name="<portlet:namespace/>quanhevoichuho" id="">
					<%if(csmscongdan.getQuanHeChuHoId() == 1){ %>
						<option value="">--Chọn--</option>
						<option value="1" selected>con</option>
						<option value="2">vợ</option>
						<option value="3">cháu</option>
						<option value="4">chồng</option>
					<%}else if(csmscongdan.getQuanHeChuHoId() == 2){ %>
						<option value="">--Chọn--</option>
						<option value="1">con</option>
						<option value="2" selected>vợ</option>
						<option value="3">cháu</option>
						<option value="4">chồng</option>
					<%}else if(csmscongdan.getQuanHeChuHoId() == 3){ %>
						<option value="">--Chọn--</option>
						<option value="1">con</option>
						<option value="2">vợ</option>
						<option value="3" selected>cháu</option>
						<option value="4">chồng</option>
					<%}else if(csmscongdan.getQuanHeChuHoId() == 4){ %>
						<option value="">--Chọn--</option>
						<option value="1">con</option>
						<option value="2">vợ</option>
						<option value="3">cháu</option>
						<option value="4" selected>chồng</option>	
					<%}else{ %>
						<option value="">--Chọn--</option>
						<option value="1">con</option>
						<option value="2">vợ</option>
						<option value="3">cháu</option>
						<option value="4">chồng</option>
					<%} %>
				</select>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td>
				<aui:button style="margin-left: 350px;" type="submit" value="LƯU"></aui:button>
			</td>
			<td>
				<liferay-portlet:actionURL var="quanlyctcongdanURL" name="congDan"></liferay-portlet:actionURL>
				<aui:button href="<%=quanlyctcongdanURL%>" value="THOÁT" ></aui:button>
			</td>
		</tr>
	</table>
    <portlet:resourceURL var="resourceURL" >
</portlet:resourceURL>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script >
        $category = $('#tinhp');
        $category.change (
            function() {
            	var id = document.getElementById("tinhp").value;
                $.ajax({
                    type: "GET",
                    url : '${resourceURL}',
                    data: {'<portlet:namespace/>idh': id},
                    success: function(data){
                        $("#huyenp").html(data)
                    }
                });
            }
        );
        
        $category = $('#huyenp');
        $category.change (
                function() {
                	var id = document.getElementById("huyenp").value;
                    $.ajax({
                        type: "GET",
                        url : '${resourceURL}',
                        data: {'<portlet:namespace/>idx': id},
                        success: function(data){
                            $("#xap").html(data)
                        }
                    });
                }
            );

        $category = $('#tinhns');
        $category.change (
            function() {
            	var id = document.getElementById("tinhns").value;
                $.ajax({
                    type: "GET",
                    url : '${resourceURL}',
                    data: {'<portlet:namespace/>idh': id},
                    success: function(data){
                        $("#huyenns").html(data)
                    }
                });
            }
        );
        
        $category = $('#huyenns');
        $category.change (
                function() {
                	var id = document.getElementById("huyenns").value;
                    $.ajax({
                        type: "GET",
                        url : '${resourceURL}',
                        data: {'<portlet:namespace/>idx': id},
                        success: function(data){
                            $("#xans").html(data)
                        }
                    });
                }
            );
        
        $category = $('#tinhhn');
        $category.change (
            function() {
            	var id = document.getElementById("tinhhn").value;
                $.ajax({
                    type: "GET",
                    url : '${resourceURL}',
                    data: {'<portlet:namespace/>idh': id},
                    success: function(data){
                        $("#huyenhn").html(data)
                    }
                });
            }
        );
        
        $category = $('#huyenhn');
        $category.change (
                function() {
                	var id = document.getElementById("huyenhn").value;
                    $.ajax({
                        type: "GET",
                        url : '${resourceURL}',
                        data: {'<portlet:namespace/>idx': id},
                        success: function(data){
                            $("#xahn").html(data)
                        }
                    });
                }
            );
        $('#check').on('change', function(){
        	   $('#check1').val(this.checked ? 1 : 0);
        	});
        
        AUI().use(
    	        'aui-datepicker',
    	        function(A) {
    	        	new A.DatePicker({
    	        		dateFormat: 'dd-mm-yy',
    	        	    trigger: '.startDate',
    	                mask: '%d-%m-%Y',
    	                min: '01-01-1999',
    	                popover: {
    	                    zIndex: 1000
    	                }
    	            });
    	        }
    	    );
    </script>
</aui:form>
<style type="text/css">
	#for130{
		width: 130px;
	}
</style>

	<head>
		<script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
		<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
	</head>
<script>
    $(document).ready(function(){
      var date_input=$('input[name="<portlet:namespace />ngaycapcmnd"], input[name="<portlet:namespace />ngaysinh"], input[name="<portlet:namespace />ngaycapshc"], input[name="<portlet:namespace />ngayhethanshc"]'); 
      var options={
    	format: 'yyyy-mm-dd',
        autoclose: true,
      };
      date_input.datepicker(options);
    })
</script>