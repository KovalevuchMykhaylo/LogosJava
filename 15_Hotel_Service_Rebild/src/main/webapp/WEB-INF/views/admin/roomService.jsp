<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="row">
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li><a href="/admin/aditionalService">Aditional Service</a></li>
					<li><a href="/admin/city">City</a></li>
					<li><a href="/admin/hotelName">Hotel Name</a></li>
					<li><a href="/admin/typeOfBathRoom">Type Of Bath Room</a></li>
					<li><a href="/admin/typeOfRoom">Type Of Room</a></li>
					<li class="active"><a href="/admin/roomService">Room Service</a><span
						class="sr-only">(current)</span></li>
				</ul>
			</div>
		</div>
	</nav>
</div>
<div class="row">
	<div class="col-md-3 col-xs-12"></div>
	<div class="col-md-7 col-xs-12">
		<div class="row">
			<div class="col-md-12 col-xs-12">
				<form class="form-horizontal" action="/admin/roomService" method="POST">
  					<div class="form-group">
    					<label for="hotelName" class="col-sm-2 control-label">Hotel Name</label>
    					<div class="col-sm-10">
      						<select class="form-control" name="hotelNameId" id="hotelName">
      							<c:forEach items="${hotelNames}" var="hotelName">
      								<option value="${hotelName.id}">${hotelName.name}</option>
      							</c:forEach>
      						</select>
    					</div>
  					</div>
					<div class="form-group">
    					<label for="roomService" class="col-sm-2 control-label">Room №</label>
    					<div class="col-sm-10">
      						<input type="text" class="form-control" name="roomNumber" id="roomService">
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="roomService" class="col-sm-2 control-label">Rooms</label>
    					<div class="col-sm-10">
      						<input type="text" class="form-control" name="room" id="roomService">
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="roomService" class="col-sm-2 control-label">Price</label>
    					<div class="col-sm-10">
      						<input type="text" class="form-control" name="price" id="roomService">
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="typeOfBathRoom" class="col-sm-2 control-label">TypeOfBathRoom</label>
    					<div class="col-sm-10">
      						<select class="form-control" name="typeOfBathRoomId" id="typeOfBathRoom">
      							<c:forEach items="${typeOfBathRooms}" var="typeOfBathRoom">
      								<option value="${typeOfBathRoom.id}">${typeOfBathRoom.type}</option>
      							</c:forEach>
      						</select>
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="typeOfRoom" class="col-sm-2 control-label">Type Of Room</label>
    					<div class="col-sm-10">
      						<select class="form-control" name="typeOfRoomId" id="typeOfRoom">
      							<c:forEach items="${typeOfRooms}" var="typeOfRoom">
      								<option value="${typeOfRoom.id}">${typeOfRoom.type}</option>
      							</c:forEach>
      						</select>
    					</div>
  					</div>
  					<div class="form-group">
    					<div class="col-sm-offset-2 col-sm-10">
      						<button type="submit" class="btn btn-primary">Create</button>
    					</div>
  					</div>
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2 col-xs-2"><h3>Hotel Name</h3></div>
			<div class="col-md-1 col-xs-1"><h3>Room Number</h3></div>
			<div class="col-md-1 col-xs-1"><h3>Rooms in number</h3></div>
			<div class="col-md-1 col-xs-1"><h3>Price</h3></div>
			<div class="col-md-3 col-xs-3"><h3>Type of bath room</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Type of room</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Options</h3></div>
		</div>
			<c:forEach items="${roomServices}" var="roomService">
				<div class="row">
					<div class="col-md-2 col-xs-2">${roomService.hotelName.name}</div>
					<div class="col-md-1 col-xs-1">${roomService.roomNumber}</div>
					<div class="col-md-1 col-xs-1">${roomService.room}</div>
					<div class="col-md-1 col-xs-1">${roomService.price}</div>
					<div class="col-md-3 col-xs-3">${roomService.typeOfBathRoom.type}</div>
					<div class="col-md-2 col-xs-2">${roomService.typeOfRoom.type}</div>
					<div class="col-md-2 col-xs-2"><a class="btn btn-success" href="/admin/roomService/update/${roomService.id}">update</a>
						<a class="btn btn-danger" href="/admin/roomService/delete/${roomService.id}">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12"></div>
</div>