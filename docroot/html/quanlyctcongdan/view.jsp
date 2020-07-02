<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@page import="java.sql.Date"%>
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
	List<Object[]> data = (List<Object[]>)request.getAttribute("data");
	List<Tinh> tinhp = (List<Tinh>)request.getAttribute("tinhp");
	List<Huyen> huyenp = (List<Huyen>)request.getAttribute("huyenp");
	List<Xa> xap = (List<Xa>)request.getAttribute("xap");
	int delta = GetterUtil.getInteger(request.getAttribute("delta"));
	int tong = GetterUtil.getInteger(request.getAttribute("tong"));
	String name = GetterUtil.getString(request.getAttribute("name"),"");
	String macongdan = GetterUtil.getString(request.getAttribute("macongdan"));
	String sohochieu = GetterUtil.getString(request.getAttribute("sohochieu"));
	int socmnd = GetterUtil.getInteger(request.getAttribute("socmnd"));
	String ngaysinh = GetterUtil.getString(request.getAttribute("ngaysinh"));
	int tinh = GetterUtil.getInteger(request.getAttribute("tinh"));
	int huyen = GetterUtil.getInteger(request.getAttribute("huyen"));
	int xa = GetterUtil.getInteger(request.getAttribute("xa"));
	SimpleDateFormat dateFomat = new SimpleDateFormat("dd-MM-yyyy");
	
	
	PortletURL interatorURL = renderResponse.createActionURL();
	interatorURL.setParameter(ActionRequest.ACTION_NAME, "congDan");
	interatorURL.setParameter("name", name);
	interatorURL.setParameter("socmnd", String.valueOf(socmnd));
	interatorURL.setParameter("tinh", String.valueOf(tinh));
	interatorURL.setParameter("huyen", String.valueOf(huyen));
	interatorURL.setParameter("xa", String.valueOf(xa));
	interatorURL.setParameter("ngaysinh", ngaysinh);
	interatorURL.setParameter("macongdan", macongdan);
	interatorURL.setParameter("sohochieu", sohochieu);
%>
<h4>DANH SÁCH CÔNG DÂN</h4>
<liferay-portlet:actionURL var="dkhokhauURL" name="dkhokhau"></liferay-portlet:actionURL>
<aui:button id="dloat" href="<%=dkhokhauURL %>" type="submit" value="Đăng ký hộ khẩu"></aui:button>

<liferay-portlet:actionURL var="inputURL" name="input"></liferay-portlet:actionURL>
<aui:button id="dloat" href="<%=inputURL %>" type="submit" value="Thêm mới Công dân"></aui:button>
<hr>
<liferay-portlet:actionURL var="quanlyctcongdanURL" name="congDan"></liferay-portlet:actionURL>
<form name="frm" method="POST" action="<%=quanlyctcongdanURL%>">
	<table id="tablecontent">
		<tr>
			<td id="fmr">
				Họ và tên
			</td>
			<td>
				<input id="format" type="text" value="<%=name %>" name="<portlet:namespace />name"></input>
			</td>
			<td id="left">
				Ngày sinh
			</td>
			<td>
				<input style="width: 130px;" value="<%=ngaysinh %>" type="text" class="startDate" name="<portlet:namespace />ngaysinh"></input>
			</td>
		</tr>
		<tr>
			<td id="fmr">
				Số CMND
			</td>
			<td>
				<input id="format" type="text" value="<%=socmnd %>" name="<portlet:namespace />socmnd"></input>
			</td>
			<td id="left">
				Số Hộ chiếu
			</td>
			<td>
				<input id="formatt" type="text" value="<%=sohochieu %>" name="<portlet:namespace />sohochieu"></input>
			</td>
		</tr>
		<tr>
			<td id="fmr">
				Mã công dân
			</td>
			<td>
				<input id="format" type="text" value="<%=macongdan %>" name="<portlet:namespace />macongdan"></input>
			</td>
		</tr>
     </table>       
   <SCRIPT SRC="jquery.js" TYPE="text/javascript"></SCRIPT>
   <table id="tablecontent">
        <tr>
       		<td id="tdfor">
       			Địa chỉ thường trú
       		</td>
	       	<td>
		        <select name="<portlet:namespace />tinh" id="tinhp">
					<option selected>--Tỉnh/Thành Phố--</option>
					<%for(int i=0; i<tinhp.size(); i++){ %>
						<option value="<%=tinhp.get(i).getId()%>">
							<%=tinhp.get(i).getName() %>
						</option>
					<%} %>
		         </select>
	         </td>
	         <td>
            	<select name="<portlet:namespace />huyen" id="huyenp">
            		<option selected>--Quận/Huyện--</option >
            	</select>
            </td>
            <td>
            	<select name="<portlet:namespace />xa" id="xap">
            		<option selected>--Phường/Xã--</option>
            	</select>
            </td>
    </tr>        
   	</table>
    <aui:button type="submit" id="dloatr" value="Tìm Kiếm"></aui:button>
</form>
<style type="text/css">
	#format{
		width: 130px;
		margin-right: 20px;
	}
	#left{
		padding-right: 50px;
	}
	#tinhp{
		width: 145px;
	}
	#huyenp{
		width: 145px;
	}
	#xap{
		width: 145px;
	}
	h4{
		display: contents;
	}
	#dloat{
		float: right;
	}
	#tablecontent{
		display: inline-block;
	}
	#dloatr{
		float: right;
	    display: inline-block;
	    margin-right: 40px;
	}
	#tdfor{
		padding-right: 16px;
	}
	#fmr{
		padding-right: 48px;
	}
	#formatt{
		width: 130px;
	}
</style>
<liferay-portlet:actionURL var="deleteStudentsURL" name="deleteSach"></liferay-portlet:actionURL>
<aui:form style="width: 100%" name="fm" method="POST" action="<%=deleteStudentsURL%>">
	<aui:button icon="icon-bitbucket" style="background: #f00;" onClick='<%= renderResponse.getNamespace() + "deleteSach();" %>' type="submit" value="delete"/>
	<aui:input name="deleteSachId" type="hidden"></aui:input>
<liferay-ui:search-container iteratorURL="<%=interatorURL%>" 
											rowChecker="<%=new RowChecker(renderResponse) %>" 
											delta="<%=delta%>" 
											emptyResultsMessage="khong tim thay" 
											deltaConfigurable="true" var="searchContainer">
	<liferay-ui:search-container-results results="<%=data%>" total="<%=tong%>"/>	
	<liferay-ui:search-container-row className="java.lang.Object[]"
		modelVar="item" indexVar="itemIdex" escapedModel="<%=true%>"
		rowVar="itemRow" keyProperty="[0]">
		<liferay-ui:search-container-column-text name="STT">
			<%=String.valueOf(itemIdex + 1)%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Mã Công Dân">
			<%=item[9]%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Họ và Tên">
		<liferay-portlet:actionURL var="detailURL" name="detail">
				<liferay-portlet:param name="id" value="<%=String.valueOf(item[0])%>"/>
		</liferay-portlet:actionURL>
			<a href="<%=detailURL%>"><%=item[4]%> <%=item[5]%> <%=item[6]%></a>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Địa Chỉ Thường Trú">
			<%=item[1]%>, <%=item[2]%>, <%=item[3]%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Ngày Sinh">
			<%=dateFomat.format(item[7])%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Số CMND">
			<%=item[8]%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Số Hộ Chiếu">
			<%=item[10]%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Chức năng">
			<liferay-portlet:actionURL var="updateURL" name="input">
				<liferay-portlet:param name="idcsmscongdan" value="<%=String.valueOf(item[0])%>"/>
			</liferay-portlet:actionURL>
			<aui:button value="Sửa" href="<%=updateURL%>"></aui:button>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator paginate="true"/>
	</liferay-ui:search-container>
</aui:form>
	
	
	<portlet:resourceURL var="resourceURL" >
	</portlet:resourceURL>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script type="text/javascript" charset="utf-8">
	AUI().use(
	        'aui-datepicker',
	        function(A) {
	        	new A.DatePicker({
	        	    trigger: '.startDate',
	                mask: '%Y-%m-%d',
	                popover: {
	                    zIndex: 1000
	                }
	            });
	        }
	    );
		
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
        
        Liferay.provide(
    			window,
    				'<portlet:namespace />deleteSach',
    					function() {
    					var deleteSachId = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, '<portlet:namespace />allRowIds');
    					if (deleteSachId && confirm('<%= UnicodeLanguageUtil.get(pageContext, "Nếu thực hiện bạn sẽ xoá") %>')) {
    					document.<portlet:namespace />fm.<portlet:namespace />deleteSachId.value = deleteSachId;
    					submitForm(document.<portlet:namespace />fm, '<%=deleteStudentsURL%>');
    					}
    					},
    				['liferay-util-list-fields']
    			);
	</script>