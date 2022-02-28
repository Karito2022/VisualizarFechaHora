<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Date Page</title>
</head>
<body>
	<div class="container date">
		<h2 class="blue"><c:out value="${date}" /></h2>
	</div>
	<script src="/js/date.js"></script>
</body>
</html>