<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>HotelName: ${hotelName.name}</h2>
<div class="row">
			<div class="col-md-4 col-xs-4"><h3>Room number</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Rooms in number</h3></div>
			<div class="col-md-4 col-xs-4"><h3>Price of number</h3></div>
			</div>
<c:forEach items = "${roomServices}" var="roomService">
			<div class="row">
			<div class="col-md-4 col-xs-4"><h3> <a href="/roomService/${roomService.id}">${roomService.roomNumber}</a></h3></div>
			<div class="col-md-4 col-xs-4"><h3>${roomService.room}</h3></div>
			<div class="col-md-4 col-xs-4"><h3>${roomService.price}</h3></div>
			</div>
</c:forEach>
<c:if test="${empty roomServices}">
	<h3>No room for rent</h3>
</c:if>