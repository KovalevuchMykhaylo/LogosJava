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
					<li><a href="/admin/vendorRegion">Vendor Region</a></li>
					<li><a href="/admin/measuringSystem">Measuring system</a></li>
					<li class="active"><a href="/admin/vendor">Vendor</a><span
						class="sr-only">(current)</span></li>
					<li><a href="/admin/plinthType">Plinth Type</a></li>
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
				<form:form class="form-horizontal" action="/admin/vendor" method="POST" modelAttribute="vendor">
					<div class="form-group">
    					<label for="name" class="col-sm-2 control-label">Vendor name</label>
    					<div class="col-sm-10">
      						<form:input type="text" class="form-control" path="name" id="vendor"/>
    					</div>
  					</div>
  					<div class="form-group">
						<label for="vendorRegion" class="col-sm-2 control-label">Vandor region</label>
	    					<div class="col-sm-10">
	      						<form:select class="form-control" path="vendorRegion" id="vendorRegion" items="${vendorRegions}" itemValue="id" itemLabel="name"/>
	    					</div>
  					</div>
  					<div class="form-group">
    					<div class="col-sm-offset-2 col-sm-10">
      						<button type="submit" class="btn btn-primary">Create</button>
      						<a href  = "/admin/vendor/cancel" class="btn btn-primary" >Cancel</a>
    					</div>
  					</div>
				</form:form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3 col-xs-3"><h3>Vendor name</h3></div>
			<div class="col-md-3 col-xs-3"><h3>Vendor Region name</h3></div>
			<div class="col-md-3 col-xs-3"><h3>Update</h3></div>
			<div class="col-md-3 col-xs-3"><h3>Delete</h3></div>
		</div>
			<c:forEach items="${vendors}" var="vendor">
				<div class="row">
					<div class="col-md-3 col-xs-3">${vendor.name}</div>
					<div class="col-md-3 col-xs-3">${vendor.vendorRegion.name}</div>
					<div class="col-md-3 col-xs-3"><a class="btn btn-warning" href="/admin/vendor/update/${vendor.id}">update</a></div>
					<div class="col-md-3 col-xs-3"><a class="btn btn-danger" href="/admin/vendor/delete/${vendor.id}">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12"></div>
</div>