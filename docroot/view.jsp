<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />
<%
long plidDSCongDan = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"quanlyctcongdan_WAR_QuanLyCongDanportlet");

%>
<portlet:defineObjects />

<liferay-portlet:actionURL var="quanlyctcongdanURL" name="congDan" portletName="quanlyctcongdan_WAR_QuanLyCongDanportlet" plid="<%=plidDSCongDan %>"></liferay-portlet:actionURL>


<li><a href="<%=quanlyctcongdanURL%>">Danh Sách Công Dân</a></li>
