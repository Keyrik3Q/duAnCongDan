<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.congdan.model.CSMSCongDan"%>
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

<liferay-theme:defineObjects/>
<portlet:defineObjects />
<%CSMSCongDan csms = (CSMSCongDan)request.getAttribute("csmscongdan");
  SimpleDateFormat dateFomat = new SimpleDateFormat("dd-MM-yyyy");
%>
<h4 style="text-align: left">CHI TIẾT THÔNG TIN CÔNG DÂN</h4>
<p id="pdtop"><b>Thông tin cơ bản</b></p><hr>
	<div>
				<portlet:resourceURL var="imageResourceURL">
					<portlet:param name="imageId" value="<%=String.valueOf(csms.getIdcsmsCongDan()) %>"/>
				</portlet:resourceURL>
				<img style="width: 100px;position: absolute;right: 8%;top: 47.7%;z-index: 1;" src="<%=imageResourceURL.toString()%>" alt="no Image"/>
		<img src='<%= renderRequest.getContextPath() + "/image/avt.jpg" %>'
		 alt="no Image" style=" width: 100px;position:absolute;margin-left: 48%; "/>
	</div>
	
	<table>
		<tr>
			<td id="width">
				Họ, tên đêm, tên:
			</td>
			<td>
				<b>
				<%=csms.getHo() %> <%=csms.getDem() %> <%=csms.getTen() %>
				</b>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td id="width">
				Mã công dân:
			</td>
			<td>
				<b><%=csms.getMaCongDan() %></b>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td id="width">
				Giới tính:
			</td>
			<td>
				<b><%=csms.getGioiTinhId() %></b>
			</td>
			<td>
				Ngày sinh:
			</td>
			<td style="width: 100px;">
				<b>
				<%=dateFomat.format(csms.getNgaySinh()) %>
				</b>
			</td>
			
			<td>
				Nơi sinh:
			</td>
			<td >
				<b>
				<%=csms.getNoiSinhChiTiet() %>
				</b>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td id="width">
				Dân tộc:
			</td>
			<td>
				<b>
					<%=csms.getDanTocId() %>
				</b>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td id="width">
				Địa chỉ thường trú:
			</td>
			<td style="width: 90px">
				<b>
				<%=csms.getDiaChiThuongTru() %>
				</b>
			</td>
			
			<td>
				Địa chỉ hiện nay:
			</td>
			<td >
				<b>
				<%=csms.getDiaChiHienNay() %>
				</b>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td id="width">
				Tình trạng:
			</td>
			<td style="width:90px">
				<b>
					<%if(csms.getTinhTrang() == 1){ %>
						Còn sống
					<%}else if(csms.getTinhTrang() == 0){ %>
						Đã chết
				<%} %>
				</b>
			</td>
			
			<td>
				Tình trạng hôn nhân:
			</td>
			<td >
				<b>
				<%if(csms.getTinhtTranghonNhanId() == 1){ %>
					Đã kết hôn
				<%}else { %>
					Đã ly hôn
				<%} %>
				</b>
			</td>
		</tr>
	</table>
	<p id="pdtop"><b>Giấy tờ cá nhân</b></p><hr>
	<table>
		<tr>
			<td id="width">
				Số CMND:
			</td>
			<td style="width:90px">
				<b>
				<%=csms.getSocmnd() %>
				</b>
			</td>
			
			<td>
				Nơi cấp:
			</td>
			<td>
				<b>
					<%=csms.getNoiCapCMND() %>
				</b>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td id="width">
				Số hộ chiếu:
			</td>
			<td style="width:90px">
				<b>
				<%=csms.getSoHoChieu() %>
				</b>
			</td>
			
			<td>
				Ngày cấp:
			</td>
			<td style="width:100px">
				<b>
				<%=dateFomat.format(csms.getNgayCapSHC()) %>
				</b>
			</td>
			
			<td>
				Ngày hết hạn:
			</td>
			<td >
				<b>
				<%=dateFomat.format(csms.getNgayHetHanSHC()) %>
				</b>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td id="width">
				Nơi cấp:
			</td>
			<td >
				<b>
				<%=csms.getNoiCapSHC() %>
				</b>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td id="width">
				Số hộ khẩu:
			</td>
			<td style="width:90px">
				<b>
				<%=csms.getSoHoKhau() %>
				</b>
			</td>
			
			<td >
				là chủ hộ:
			</td>
			<td >
				<b>
				<%if(csms.getLaChuHo() == 1){ %>
					Là chủ hộ
				<%}else{%>
					Ở ké
				<% } %>
				</b>
			</td>
		</tr>
	</table>
	<liferay-portlet:actionURL var="quanlyctcongdanURL" name="congDan"></liferay-portlet:actionURL>
	<aui:button style="margin-left: 50%;" href="<%=quanlyctcongdanURL%>" value="THOÁT" ></aui:button>
	<style type="text/css">
	#width{
		width:150px;
	}
	#pdtop{
		padding-top: 20px;
	}
	</style>