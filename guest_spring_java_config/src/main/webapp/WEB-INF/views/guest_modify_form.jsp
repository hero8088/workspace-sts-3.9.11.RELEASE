<%@page import="com.itwill.guest.Guest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 	
<fmt:setBundle basename="com/itwill/guest/guest" scope="session"/>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><fmt:message key="title.main"/></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet"
	href="css/styles.css">
<link rel="stylesheet"
	href="css/guest.css">

<script type="text/javascript" src="js/guest.js"></script>
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0
	marginwidth=0 marginheight=0>
	<!-- container start-->
	<div id="container">
		<!-- header start -->
		<div id="header">
		<!-- include_common_top.jsp start-->
		<%@ include file="include_common_top.jsp" %>	
		<!-- include_common_top.jsp end-->
		</div>
		<!-- header end -->
		<!-- navigation start-->
		<div id="navigation">
			<!-- include_common_left.jsp start-->
			<%@ include file="include_common_left.jsp" %>
			<!-- include_common_left.jsp end-->
		</div>
		<!-- navigation end-->
		<!-- wrapper content start -->
		<div id="wrapper">
			




<div id="content">
	<table border=0 cellpadding=0 cellspacing=0>
		<tr>
			<td><br />
				<table style="padding-left: 10px" border=0 cellpadding=0
					cellspacing=0>
					<tr>
						<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b><fmt:message key="title.modify"/></b></td>
					</tr>
				</table> <!-- modify Form  -->
				<form name="f" method="post">
					<input type="hidden" name="guest_no" value="${guest.guest_no}" />
					<table border="0" cellpadding="0" cellspacing="1" width="590"
						bgcolor="BBBBBB">
						<tr>
							<td width=100 align=center bgcolor="E6ECDE" height="22"><fmt:message key="modify.label.no"/></td>
							<td align="left" width=490 bgcolor="ffffff"
								style="padding-left: 10px">${guest.guest_no}</td>
						</tr>
						<tr>
							<td width=100 align=center bgcolor="E6ECDE" height="22"><fmt:message key="modify.label.name"/></td>
							<td align="left" width=490 bgcolor="ffffff"
								style="padding-left: 10px"><input type="text"
								style="width: 150" name="guest_name" 
								value="${guest.guest_name }"></td>
						</tr>
						<tr>
							<td width=100 align=center bgcolor="E6ECDE" height="22"><fmt:message key="modify.label.homepage"/></td>
							<td align="left" width=490 bgcolor="ffffff"
								style="padding-left: 10px"><input type="text"
								style="width: 150" name="guest_homepage"
								value="${guest.guest_homepage}"></td>
						</tr>
						<tr>
							<td width=100 align=center bgcolor="E6ECDE" height="22"><fmt:message key="modify.label.email"/></td>
							<td align="left" width=490 bgcolor="ffffff"
								style="padding-left: 10px"><input type="text"
								style="width: 240" name="guest_email"
								value="${guest.guest_email}"></td>
						</tr>
						<tr>
							<td width=100 align=center bgcolor="E6ECDE" height="22"><fmt:message key="modify.label.title"/></td>
							<td align="left" width=490 bgcolor="ffffff"
								style="padding-left: 10px"><input type="text"
								style="width: 240" name="guest_title"
								value="${guest.guest_title}"></td>
						</tr>
						<tr>
							<td width=100 align=center bgcolor="E6ECDE" height="22"><fmt:message key="modify.label.content"/></td>
							<td align="left" width=490 bgcolor="ffffff"
								style="padding-left: 10px"><textarea wrap="soft"
									style="width: 240px" rows="10" name="guest_content">${guest.guest_content}</textarea>

							</td>
						</tr>
					</table>
				</form>

				<table width=590 border=0 cellpadding=0 cellspacing=0>
					<tr>
						<td align=center>
						<input type="button" value="<fmt:message key="modify.button.modify"/>" onClick="guestModifyAction()"> &nbsp; 
						<input type="button" value="<fmt:message key="modify.button.list"/>" onClick="guestList()"></td>
					</tr>
				</table></td>
		</tr>
	</table>
</div>

		</div>
		<!-- wrapper content end-->
		<!-- footer start-->
		<div id="footer">
			<!-- include_common_bottom.jsp start-->
			<%@ include file="include_common_bottom.jsp" %>
			<!-- include_common_bottom.jsp end-->
		</div>
		<!-- footer end -->
	</div>
	<!--container end-->
</body>
</html>