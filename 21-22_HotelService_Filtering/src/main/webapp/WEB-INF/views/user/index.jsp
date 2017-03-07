<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2>Hello</h2>
<ul>
	<c:forEach items="${citys}" var="city">
		<li><a href="/city/${city.id}">${city.name}</a></li>
	</c:forEach>
</ul>
<a href="/admin">Admin</a>
<h2>conn</h2>
<a href="/conn">DoSomethink</a>
<h2>Go</h2>
<a href="/gogo">GO</a>
<h2>Dos</h2>
<a href="/dos">Dos</a>
<h2>Link</h2>
<a href="/link">Link</a>