<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2 align="center">Welcome USER</h2>
<style>
</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf8" />
<link href="calendar.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="calendar.js"></script>
<label for="date">Dete: </label><input type="text" id="date" name="date" readonly="readonly" size="10" onclick="showcalendar(this)"/>
<label for="date">Dete: </label><input type="text" id="date" name="date" readonly="readonly" size="10" onclick="showcalendar(this)"/>
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