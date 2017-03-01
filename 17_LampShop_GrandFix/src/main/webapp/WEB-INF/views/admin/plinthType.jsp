<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="row">
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li><a href="/admin/vendorRegion">Vendor Region</a></li>
					<li><a href="/admin/measuringSystem">Measuring system</a></li>
					<li><a href="/admin/vendor">Vendor</a></li>
					<li class="active"><a href="/admin/plinthType">Plinth Type</a> <span
						class="sr-only">(current)</span></li>
					<li><a href="/admin/category">Category</a></li>
					<li><a href="/admin/countryProducer">Country Producer</a></li>
					<li><a href="/admin/item">Item</a></li>
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
				<form:form class="form-horizontal" action="/admin/plinthType" method="POST" modelAttribute="plinthType">
					<div class="form-group">
						<label for="plinthType" class="col-sm-2 control-label">Name</label>
						<div class="col-sm-10">
							<form:input type="text" class="form-control" path="name" id="plinthType" itemLabel="plinthType"/>
						</div>
					</div>
					<div class="form-group">
						<label for="vendor" class="col-sm-2 control-label">Vandor</label>
	    					<div class="col-sm-10">
	      						<form:select class="form-control" path="vendors" id="vendor" items="${vendors}" itemValue="id" itemLabel="vendor"/>
	    					</div>
  					</div>
  					<div class="form-group">
						<label for="category" class="col-sm-2 control-label">Category</label>
	    					<div class="col-sm-10">
	      						<form:select class="form-control" path="categorys" id="category" items="${categorys}" itemValue="id" itemLabel="categorys"/>
	    					</div>
	  					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-primary">Create</button>
							<a href  = "/admin/plinthType/cancel" class="btn btn-primary" >Cancel</a>
						</div>
					</div>
				</form:form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3 col-xs-3"><h3>Plinth Type name</h3></div>
			<div class="col-md-3 col-xs-3"><h3>Vendor</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Categorry</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Update</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Delete</h3></div>
		</div>
		<c:forEach items="${plinthTypes}" var="plinthType">
			<div class="row">
				<div class="col-md-3 col-xs-3">${plinthType.name}</div>
				<div class="col-md-3 col-xs-3">${plinthType.vendors.name}</div>
				<div class="col-md-2 col-xs-2">${plinthType.category.name}</div>
				<div class="col-md-2 col-xs-2"><a class="btn btn-warning" href="/admin/plinthType/update/${plinthType.id}">update</a></div>
				<div class="col-md-2 col-xs-2"><a class="btn btn-danger" href="/admin/plinthType/delete/${plinthType.id}">delete</a></div>
			</div>
		</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12"></div>
</div>