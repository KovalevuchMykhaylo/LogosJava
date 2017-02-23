<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
					<li class="active"><a href="/admin/hotelName">Hotel Name</a><span
						class="sr-only">(current)</span></li>
					<li><a href="/admin/typeOfBathRoom">Type Of Bath Room</a></li>
					<li><a href="/admin/typeOfRoom">Type Of Room</a></li>
					<li><a href="/admin/roomService">Room Service</a></li>
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
				<form:form class="form-horizontal" action="/admin/hotelName" method="POST" modelAttribute="hotelName">
					<div class="form-group">
    					<label for="city" class="col-sm-2 control-label">City</label>
    					<div class="col-sm-10">
      						<form:select class="form-control" path="city" id="city" items="${citys}" itemValue="id" itemLabel="name"/>
    					</div>
  					</div>
					<div class="form-group">
    					<label for="hotelName" class="col-sm-2 control-label">Hotel Name</label>
    					<div class="col-sm-10">
      						<form:input type="text" class="form-control" path="name" id="name"/>
    					</div>
  					</div>
  					<div class="form-group">
    					<div class="col-sm-offset-2 col-sm-10">
      						<button type="submit" class="btn btn-primary">Create</button>
      						<a href  = "/admin/hotelName/cancel" class="btn btn-primary" >Cancel</a>
    					</div>
  					</div>
				</form:form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3 col-xs-3"><h3>Hotel name</h3></div>
			<div class="col-md-3 col-xs-3"><h3>City name</h3></div>
			<div class="col-md-3 col-xs-2"><h3>Update</h3></div>
			<div class="col-md-3 col-xs-2"><h3>Delete</h3></div>
		</div>
			<c:forEach items="${hotelNames}" var="hotelName">
				<div class="row">
					<div class="col-md-3 col-xs-3">${hotelName.name}</div>
					<div class="col-md-3 col-xs-3">${hotelName.city.name}</div>
					<div class="col-md-3 col-xs-3"><a class="btn btn-success" href="/admin/hotelName/update/${hotelName.id}">update</a></div>
					<div class="col-md-3 col-xs-3"><a class="btn btn-danger" href="/admin/hotelName/delete/${hotelName.id}">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12"></div>
</div>