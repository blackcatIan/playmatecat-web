<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tilesx"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- tile <put-attribute name="title" value="title" />-->
<title><tiles:getAsString name="title"/></title>
<!-- stylesheets 要和tiles <put-list-attribute name="stylesheets"> name 一致 -->
<!-- classname 定义类型 -->
<%-- <tilesx:useAttribute name="stylesheets" classname="java.util.List" /> --%>
<%-- <c:forEach items="${stylesheets}" var="src"> --%>
<!-- 	<link rel="stylesheet" type="text/css" -->
<%-- 		href="<%=basePath %><c:url value='${src}.css' />" /> --%>
<%-- </c:forEach> --%>
<%-- <tilesx:useAttribute id="scripts" name="scripts" --%>
<%-- 	classname="java.util.List" /> --%>
<%-- <c:forEach items="${scripts}" var="src"> --%>
<!-- 	<script type="text/javascript" -->
<%-- 		src="<%=basePath %><c:url value='${src}.js' />"></script> --%>
<%-- </c:forEach> --%>


</head>
<body>
	<div id="main">
		<tiles:insertAttribute name="main" ignore="true"/>
	</div>
</body>
</html>