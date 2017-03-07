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
					<li><a href="/admin/vendorRegion">Vendor Region</a></li>
					<li><a href="/admin/measuringSystem">Measuring system</a></li>
					<li><a href="/admin/vendor">Vendor</a></li>
					<li><a href="/admin/plinthType">Plinth Type</a></li>
					<li><a href="/admin/category">Category</a></li>
					<li><a href="/admin/countryProducer">Country Producer</a></li>
					<li class="active"><a href="/admin/item">Item</a><span class="sr-only">(current)</span></li>
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
				<form class="form-horizontal" action="/admin/item" method="POST">
				<div class="form-group">
    					<label for="item" class="col-sm-2 control-label">Item</label>
    					<div class="col-sm-10">
      						<input type="text" class="form-control" name="name" id="item">
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="item" class="col-sm-2 control-label">Price</label>
    					<div class="col-sm-10">
      						<input type="text" class="form-control" name="price" id="item">
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="catygory" class="col-sm-2 control-label">Category</label>
    					<div class="col-sm-10">
      						<select class="form-control" name="catygoryId" id="catygory">
      							<c:forEach items="${catygorys}" var="catygory">
      								<option value="${catygory.id}">${catygory.name}</option>
      							</c:forEach>
      						</select>
    					</div>
  					</div>
					<div class="form-group">
    					<label for="plinthType" class="col-sm-2 control-label">Plinth Type</label>
    					<div class="col-sm-10">
      						<select class="form-control" name="plinthTypeId" id="plinthType">
      							<c:forEach items="${plinthTypes}" var="plinthType">
      								<option value="${plinthType.id}">${plinthType.name}</option>
      							</c:forEach>
      						</select>
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="vendor" class="col-sm-2 control-label">Vendor</label>
    					<div class="col-sm-10">
      						<select class="form-control" name="vendorId" id="vendor">
      							<c:forEach items="${vendors}" var="vendor">
      								<option value="${vendor.id}">${vendor.name}</option>
      							</c:forEach>
      						</select>
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="measuringSystem" class="col-sm-2 control-label">Measuring system</label>
    					<div class="col-sm-10">
      						<select class="form-control" name="measuringSystemId" id="measuringSystem">
      							<c:forEach items="${measuringSystems}" var="measuringSystem">
      								<option value="${measuringSystem.id}">${measuringSystem.name}</option>
      							</c:forEach>
      						</select>
    					</div>
  					</div>
  					<div class="form-group">
    					<div class="col-sm-offset-2 col-sm-10">
      						<button type="submit" class="btn btn-primary">Create</button>
      						<a href  = "/admin/item/cancel" class="btn btn-primary" >Cancel</a>
    					</div>
  					</div>
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2 col-xs-2"><h3>Item</h3></div>
			<div class="col-md-1 col-xs-1"><h3>Price</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Category</h3></div>
			<div class="col-md-1 col-xs-1"><h3>Plinth Type</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Vendor</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Measuring system</h3></div>
			<div class="col-md-2 col-xs-2"><h3>Options</h3></div>
		</div>
			<c:forEach items="${items}" var="item">
				<div class="row">
					<div class="col-md-2 col-xs-2">${item.name}</div>
					<div class="col-md-1 col-xs-1">${item.price}</div>
					<div class="col-md-1 col-xs-1">${item.catygory.name}</div>
					<div class="col-md-2 col-xs-2">${item.plinthType.name}</div>
					<div class="col-md-2 col-xs-2">${item.vendor.name}</div>
					<div class="col-md-2 col-xs-2">${item.measuringSystem.name}</div>
					<div class="col-md-2 col-xs-2"><a class="btn btn-warning" href="/admin/item/update/${item.id}">update</a>
						<a class="btn btn-danger" href="/admin/item/delete/${item.id}">delete</a></div>
				</div>
			</c:forEach>
	</div>
	<div class="col-md-2 col-xs-12"></div>
</div>