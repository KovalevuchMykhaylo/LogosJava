<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2>Hello</h2>
<h2>Categoryes</h2>
<ul>
	<c:forEach items="${categorys}" var="category">
		<li><a href="/category/${category.id}">${category.name}</a></li>
	</c:forEach>
</ul>
<h2>Plinth Types</h2>
<ul>
	<c:forEach items="${plinthTypes}" var="plinthType">
		<li><a href="/plinthType/${plinthType.id}">${plinthType.name}</a></li>
	</c:forEach>
</ul>
<h2>Vendor Regions</h2>
<ul>
	<c:forEach items="${vendorRegions}" var="vendorRegion">
		<li><a href="/vendorRegion/${vendorRegion.id}">${vendorRegion.name}</a></li>
	</c:forEach>
</ul>

<a href="/admin">Admin</a>
<h2>conn</h2>
<a href="/conn">DoSomethink</a>
<h2>Go</h2>
<a href="/gogo">GO</a>
<h2>Dos</h2>
<a href="/dos">Dos</a>