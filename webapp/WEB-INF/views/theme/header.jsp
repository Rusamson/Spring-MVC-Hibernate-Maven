<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
  <!--  <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet"> 
  <script src="<c:url value="/resources/js/main.js" />"></script>
  
  OR <link href="${pageContext.request.contextPath}/resources/theme1/css/main.css" rel="stylesheet" >
  -->
  	<spring:url value="/resources/theme1/css/main.css" var="mainCss" /> 
	<spring:url value="/resources/theme1/js/main.js" var="mainJs" />

	<link href="${mainCss}" rel="stylesheet" /> 
    <script src="${mainJs}"></script>
    

    <link href="${pageContext.request.contextPath}/resources/theme1/css/sidebar.css" rel="stylesheet" > 
    <link href="${pageContext.request.contextPath}/resources/theme1/css/page.css" rel="stylesheet" >   
     <link href="${pageContext.request.contextPath}/resources/theme1/css/topbar.css" rel="stylesheet" >
     
     <script language="JavaScript" type="text/javascript"  src="http://maps.google.com/maps/api/js?key=AIzaSyDCs-5rItEDvTU4vsvlLzNtqNnUYXQnuLA" 
          type="text/javascript"></script>  
<title>Trackos</title>
</head>
<body>