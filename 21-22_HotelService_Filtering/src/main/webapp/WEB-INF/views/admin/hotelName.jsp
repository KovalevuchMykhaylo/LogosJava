<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>
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
					<li class="active"><a href="/admin/hotelName<custom:allParams/>">Hotel Name</a><span
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
	<div class="col-md-3 col-xs-12">
		<form:form class="form-horizontal" action="/admin/hotelName" method="GET" modelAttribute="filter">
			<custom:hiddenInputs excludeParams="name, cityId, _cityId"/>
			<div class="form-group">
				<div class="col-sm-6">
					<form:input path="name" class="form-control" placeholder="Name"/>
				</div>
			</div>
			<div class="form-group">
				<label class="contol-label col-sm-12">Citys</label>
				<div class="col-sm-12">
					<form:checkboxes element="div" items="${citys}" itemValue="id" itemLabel="name" path="cityId"/>
				</div>
			</div>
			<button type="submit" class="btn btn-primary">Ok</button>
		</form:form>
	</div>
	<div class="col-md-7 col-xs-12">
		<div class="row">
			<div class="col-md-12 col-xs-12">
				<form:form class="form-horizontal" action="/admin/hotelName" method="POST" modelAttribute="hotelName">
					<custom:hiddenInputs excludeParams="name, city,"/>
					<div class="form-group">
    					<label for="city" class="col-sm-2 control-label">City</label>
    					<div class="col-sm-10">
      						<form:select class="form-control" path="city" id="city" items="${citys}" itemValue="id" itemLabel="name"/>
    					</div>
  					</div>
  					<div class="form-group">
						<label for="hotelName" style="color:red;text-align:left;" class="col-sm-10 col-sm-offset-2 control-label"><form:errors path="name"/></label>
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
			<c:forEach items="${page.content}" var="hotelName">
				<div class="row">
					<div class="col-md-3 col-xs-3">${hotelName.name}</div>
					<div class="col-md-3 col-xs-3">${hotelName.city.name}</div>
					<div class="col-md-3 col-xs-3"><a class="btn btn-success" href="/admin/hotelName/update/${hotelName.id}<custom:allParams/>">update</a></div>
					<div class="col-md-3 col-xs-3"><a class="btn btn-danger" href="/admin/hotelName/delete/${hotelName.id}<custom:allParams/>">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12">
		<div class="row">
					<div class="col-md-6 col-xs-6 text-center">
						<div class="dropdown">
							<button class="btn btn-primary dropdown-toggle" type="button"
								data-toggle="dropdown">
								Sort <span class="caret"></span>
							</button>
							<ul class="dropdown-menu">
								<custom:sort innerHtml="Hotel name asc" paramValue="name" />
								<custom:sort innerHtml="Hotel name desc" paramValue="name,desc" />
								<custom:sort innerHtml="City name asc" paramValue="city.name" />
								<custom:sort innerHtml="City name desc" paramValue="city.name,desc" />
							</ul>
						</div>
					</div>
					<div class="col-md-6 col-xs-6 text-center">
						<custom:size posibleSizes="1,2,5,10" size="${page.size}" />
					</div>
				</div>
	</div>
</div>
<div class="row">
	<div class="col-md-12 col-xs-12 text-center">
		<custom:pageable page="${page}" cell="<li></li>" container="<ul class='pagination'></ul>" />
	</div>
</div>
<script>
	$('label').each(function() {
		if(!$(this).html()) $(this).parent('div').hide();
	});
</script>