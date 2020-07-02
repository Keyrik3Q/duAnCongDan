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
	List<CSMSCongDan> cd = (List<CSMSCongDan>)request.getAttribute("congdan");
	CSMSCongDan csmscongdan = (CSMSCongDan)request.getAttribute("csms");
	SimpleDateFormat dateFomat = new SimpleDateFormat("yyyy-MM-dd");
	
	PortletURL interatorURL = renderResponse.createActionURL();
	interatorURL.setParameter(ActionRequest.ACTION_NAME, "congDan");
%>
<h4 style="text-align: center;">ĐƠN XIN CẤP HỘ KHẨU</h4>
<portlet:actionURL var='uhokhaudkURL' name="hokhaucd" />

<aui:form>
 <div class="row-fluid">
      <select id="mySelect" onchange="onSearch();" class="selectpicker" data-live-search="true">
        <%for(int i=0; i<cd.size(); i++){ %>
		<option value="<%=cd.get(i).getIdcsmsCongDan()%>">
			<%=cd.get(i).getHo() %> <%=cd.get(i).getDem() %> <%=cd.get(i).getTen() %>
				</option>
			<%} %>
		</select>
  </div>
	<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.3/css/bootstrap-select.min.css" />
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
		<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.3/js/bootstrap-select.min.js"></script>
</aui:form>

<aui:form name="fm" action="<%=uhokhaudkURL.toString()%>" method="post" enctype="multipart/form-data">
   <input type= "hidden" value="<%=csmscongdan.getIdcsmsCongDan() %>" name="<portlet:namespace/>idcd">
    <table>
		<tr>
			<td>
				<p style="width: 130px;">Họ, tên đêm, tên</p>
			</td>
			<td>
				<input style="height: 28px;" id="ho" type= "text" value="<%=csmscongdan.getHo() %>" name="<portlet:namespace/>ho">
			</td>
			<td>
				<input style="height: 28px;" id="dem" type= "text" value="<%=csmscongdan.getDem() %>" name="<portlet:namespace/>dem">
			</td>
			<td>
				<input style="height: 28px;" id="ten" type= "text" value="<%=csmscongdan.getTen() %>" name="<portlet:namespace/>ten">
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td>
				<p style="width: 130px;">Ngày Sinh</p>
			</td>
			<td>
				<input style="width: 130px; height: 28px;" id="ngaysinh" type= "text"  value="" name="<portlet:namespace/>ngaysinh">
			</td>
			<td>
				<p style="width: 116px;">Nơi Sinh</p>
			</td>
			<td>
				<input style="width: 144px; height: 28px;" id="noisinhchitiet" type= "text" value="<%=csmscongdan.getNoiSinhChiTiet() %>" name="<portlet:namespace/>noisinhchitiet">
			</td>
		</tr>
	</table>
	
	<table>
		<tr>
			<td>
				<p style="width: 130px;">Giấy CMND</p>
			</td>
			<td>
				<input style="width: 130px; height: 28px;" id="socmnd" type= "text" value="<%=csmscongdan.getSocmnd() %>" name="<portlet:namespace/>socmnd">
			</td>
			<td>
				<p style="width: 116px;">Nơi cấp</p>
			</td>
			<td>
				<input style="width: 144px; height: 28px;" id="noicapcmnd" type= "text" value="<%=csmscongdan.getNoiCapCMND() %>" name="<portlet:namespace/>noicapcmnd">
			</td>
		</tr>
	</table>
	
	<table>
		<tr>
			<td>
				<p style="width: 130px;">Dân Tộc</p>
			</td>
			<td>
				<input style="width: 130px; height: 28px;" id="dantoc" type= "text" value="<%=csmscongdan.getDanTocId() %>" name="<portlet:namespace/>dantoc">
			</td>
			<td>
				<p style="width: 116px;">Tôn Giáo</p>
			</td>
			<td>
				<input style="width: 144px; height: 28px;" id="tongiao" type= "text" value="<%=csmscongdan.getTonGiaoId() %>" name="<portlet:namespace/>tongiao">
			</td>
		</tr>
		<tr>
			<td>
				<p style="width: 100px;">Số điện thoại</p>
			</td>
			<td>
				<input style="width: 130px; height: 28px;" type= "text" value="<%=csmscongdan.getSdt() %>" name="<portlet:namespace/>sdt">
			</td>
		</tr>
	</table>
	
	<table>
		<tr>
			<td>
				<p style="width: 130px;">Địa chỉ thường trú</p>
			</td>
			<td>
				<input style="width: 542px; height: 28px;" id="diachithuongtru" type= "text" value="<%=csmscongdan.getDiaChiThuongTru() %>" name="<portlet:namespace/>diachithuongtru">
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td>
				<p style="width: 130px;">Địa chỉ tạm trú</p>
			</td>
			<td>
				<input style="width: 542px; height: 28px;" id="diachihiennay" type= "text" value="<%=csmscongdan.getDiaChiHienNay() %>" name="<portlet:namespace/>diachihiennay">
			</td>
		</tr>
	</table>
	
	<table>
		<tr>
			<td>
				<p style="width: 130px;">Họ, tên cha</p>
			</td>
			<td>
				<input style="height: 28px;" type= "text" value="<%=csmscongdan.getTenCha() %>" name="<portlet:namespace/>tencha">
			</td>
			
			<td>
				<p style="width: 130px;">Ngày sinh</p>
			</td>
			<td>
				<input style="height: 28px;" type= "text" value="" name="<portlet:namespace/>ngaysinhcha">
			</td>
		</tr>
	</table>
	
	<table>
		<tr>
			<td>
				<p style="width: 130px;">Họ, tên mẹ</p>
			</td>
			<td>
				<input style="height: 28px;" type= "text" value="<%=csmscongdan.getTenMe() %>" name="<portlet:namespace/>tenme">
			</td>
			<td>
				<p style="width: 130px;">Ngày sinh</p>
			</td>
			<td>
				<input style="height: 28px;" type= "text" value="" name="<portlet:namespace/>ngaysinhme">
			</td>
		</tr>
	</table>
	
	<table>
		<tr>
			<td>
				<p style="width: 130px;">Họ, tên vợ/ chồng</p>
			</td>
			<td>
				<input style="height: 28px;" type= "text" value="<%=csmscongdan.getTenVo() %>" name="<portlet:namespace/>tenvo">
			</td>
			<td>
				<p style="width: 130px;">Ngày sinh</p>
			</td>
			<td>
				<input style="height: 28px;" type= "text" value="" name="<portlet:namespace/>ngaysinhvo">
			</td>
		</tr>
	</table>
	<tr>
		<td>
			<aui:button style="margin-left: 45%;" type="submit" value="Lưu"></aui:button>
		</td>
		<td>
			<liferay-portlet:actionURL var="quanlyctcongdanURL" name="congDan"></liferay-portlet:actionURL>
			<aui:button href="<%=quanlyctcongdanURL%>" value="THOÁT" ></aui:button>
		</td>
	</tr>
    <portlet:resourceURL var="resourceURL" >
</portlet:resourceURL>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script type="text/javascript">  
        Liferay.provide(
        		
        		window, 
        		"onSearch", 
        		function () {
        			var code = document.getElementById("mySelect").value;
        			var resourceURL = '<%=resourceURL.toString()%>';
        			var ajaxrequest = AUI().io.request(
        				resourceURL,
        				{       					
        					data: {'<portlet:namespace/>code': code},
        					dataType: 'json',
        					method: 'post',
        					autoLoad: false,
        					sync: true,
        					on: {
        						success: function() {
        							document.getElementById('ho').value = this.get('responseData').ho;
        							document.getElementById('dem').value = this.get('responseData').dem;
        							document.getElementById('ten').value = this.get('responseData').ten;
        							document.getElementById('socmnd').value = this.get('responseData').socmnd;
        							document.getElementById('dantoc').value = this.get('responseData').dantoc;
        							document.getElementById('tongiao').value = this.get('responseData').tongiao;
        							document.getElementById('noicapcmnd').value = this.get('responseData').noicapcmnd;
        							document.getElementById('diachithuongtru').value = this.get('responseData').diachithuongtru;
        							document.getElementById('diachihiennay').value = this.get('responseData').diachihiennay;
        							document.getElementById('ngaysinh').value = this.get('responseData').ngaysinh;
        							document.getElementById('noisinhchitiet').value = this.get('responseData').noisinhchitiet;
        						}
        					}
        				}
        			);
        			
        			ajaxrequest.start();
        		},['liferay-util-window']
        	);
        $(document).ready(function(){
        	  //Chosen
        	  $(".limitedNumbChosen").chosen({
        	        max_selected_options: 2,
        	    placeholder_text_multiple: "Which are two of most productive days of your week"
        	    })
        	    .bind("chosen:maxselected", function (){
        	        window.alert("You reached your limited number of selections which is 2 selections!");
        	    })
        	  //Select2
        	  $(".limitedNumbSelect2").select2({
        	        maximumSelectionLength: 2,
        	    placeholder: "Which are two of most productive days of your week"
        	    })
        	});
    </script>
    
    <head>
		<script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
		<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
	</head>
<script>
    $(document).ready(function(){
      var date_input=$('input[name="<portlet:namespace />ngaysinh"], input[name="<portlet:namespace />ngaysinhcha"], input[name="<portlet:namespace />ngaysinhme"], input[name="<portlet:namespace />ngaysinhvo"]'); 
      var options={
    	format: 'yyyy-mm-dd',
        autoclose: true,
      };
      date_input.datepicker(options);
    })
</script>
</aui:form>
<style type="text/css">
	#ho{
		width: 130px;
	}
	#dem{
		width: 130px;
	}
	#ten{
		width: 130px;
	}
	.input{
		height: 28px;
	}
</style>
