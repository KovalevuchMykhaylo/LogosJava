<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>VendorRegion: ${vendorRegion.name}</h2>
<c:forEach items="${vendors}" var="vendor">
	<div>${vendor.name}$</div>
</c:forEach>
<c:if test="${empty vendors}">
	<h3>No vendors in this region</h3>
</c:if>
