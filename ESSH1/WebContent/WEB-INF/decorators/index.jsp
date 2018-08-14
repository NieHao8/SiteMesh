<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%-- Define login user as local variable principal --%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index title || <decorator:title/>
 <decorator:getProperty property="page.pageTitle" /> </title>
</head>
<body>
<h1>HELLO ECLIPSE SSM</h1>
<decorator:body />
</body>
</html>