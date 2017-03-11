<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="row">
			<div class="col-md-2 col-xs-2"><h3>Room number</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Rooms in number</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Price of number</h3></div>
			<div class="col-md-3 col-xs-3"><h3>Type of bath room</h3></div>
			<div class="col-md-3 col-xs-3"><h3>Type of room</h3></div>
			</div>
			<div class="row">
			<div class="col-md-2 col-xs-2"><h3>${roomServices.roomNumber}</h3></div>
			<div class="col-md-2 col-xs-2"><h3>${roomServices.room}</h3></div>
			<div class="col-md-2 col-xs-2"><h3>${roomServices.price} UAH</h3></div>
			<div class="col-md-3 col-xs-3"><h3>${roomServices.typeOfBathRoom.type}</h3></div>
			<div class="col-md-2 col-xs-2"><h3>${roomServices.typeOfRoom.type}</h3></div>
			<div class="col-md-1 col-xs-1"> <button class="btn btn-success">Rent</button></div>
			</div>
