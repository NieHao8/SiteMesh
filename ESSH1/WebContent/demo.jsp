<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<content tag="pageTitle">All USER List</content>
</head>
<body>

<table>
		<caption>user list</caption>
		<tr>
		<th>user name</th>
			<th>user age</th>
			<th>user sex</th>
			<th>user permission</th>
		</tr>
		<c:forEach items="${clist}" var="cus">
			<tr>
				<td>${cus.name }</td>
				<td>${cus.age }</td>
				<td>${cus.sex }</td>
				<td>${cus.role }</td>
			</tr>
		</c:forEach>


	</table>

</body>
</html>