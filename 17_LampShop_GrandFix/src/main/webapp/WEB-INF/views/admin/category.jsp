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
					<li><a href="/admin/vendor">Vendor</a></li>
					<li><a href="/admin/plinthType">Plinth Type</a></li>
					<li class="active"><a href="/admin/category">Category</a><span
						class="sr-only">(current)</span></li>
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
				<form:form class="form-horizontal" action="/admin/category" method="POST" modelAttribute="category">
					<div class="form-group">
    					<label for="vendor" class="col-sm-2 control-label">Vandor</label>
    					<div class="col-sm-10">
      						<form:select class="form-control" path="vendors" id="vendor" items="${vendors}" itemValue="id" itemLabel="name"/>
    					</div>
  					</div>
					<div class="form-group">
    					<label for="category" class="col-sm-2 control-label">Category</label>
    					<div class="col-sm-10">
      						<form:input type="text" class="form-control" path="name" id="category" itemLabel="category"/>
    					</div>
  					</div>
  					<div class="form-group">
    					<div class="col-sm-offset-2 col-sm-10">
      						<button type="submit" class="btn btn-primary">Create</button>
      						<a href  = "/admin/category/cancel" class="btn btn-primary" >Cancel</a>
    					</div>
  					</div>
				</form:form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3 col-xs-3"><h3>Category name</h3></div>
			<div class="col-md-3 col-xs-3"><h3>Vendor</h3></div>
			<div class="col-md-3 col-xs-3"><h3>Update</h3></div>
			<div class="col-md-3 col-xs-3"><h3>Delete</h3></div>
		</div>
			<c:forEach items="${categorys}" var="category">
				<div class="row">
					<div class="col-md-3 col-xs-3">${category.name}</div>
					<div class="col-md-3 col-xs-3">${category.vendors}</div>
					<div class="col-md-3 col-xs-3"><a class="btn btn-warning" href="/admin/category/update/${category.id}">update</a></div>
					<div class="col-md-3 col-xs-3"><a class="btn btn-danger" href="/admin/category/delete/${category.id}">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12"></div>
</div>