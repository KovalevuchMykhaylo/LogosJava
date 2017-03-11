<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2>City: ${city.name}</h2>
<c:forEach items="${hotelNames}" var="hotelName">
	<li><a href="/hotelName/${hotelName.id}">${hotelName.name}</a></li>
</c:forEach>
<c:if test="${empty hotelNames}">
	<h3>Hotel not found</h3>
</c:if>