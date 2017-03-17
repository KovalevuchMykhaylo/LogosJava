<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
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
					<li><a href="/admin/city">City</a>
					<li><a href="/admin/hotelName">Hotel Name</a></li>
					<li><a href="/admin/typeOfBathRoom">Type Of Bath Room</a></li>
					<li><a href="/admin/typeOfRoom">Type Of Room</a></li>
					<li><a href="/admin/roomService">Room Service</a></li>
					<li><a href="/admin/rentDate">Rent Date</a></li>
					<li class="active"><a href="/admin/user<custom:allParams/>">Users</a><span
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
				<form:form class="form-horizontal" action="/admin/user" method="POST" modelAttribute="users">
<%-- 					<custom:hiddenInputs excludeParams="name, email, password, username"/> --%>
					<div class="form-group">
<%-- 						<label for="username" style="color:red;text-align:left;" class="col-sm-10 col-sm-offset-2 control-label"><form:errors path="email"/></label> --%>
<!-- 					</div> -->
<!--     					<label for="user" class="col-sm-2 control-label">Email</label> -->
<!--     					<div class="col-sm-10"> -->
<%--       						<form:input type="text" class="form-control" path="username" id="user"/> --%>
<!--     					</div> -->
<!--   					<div class="form-group"> -->
<%-- 						<label for="user" style="color:red;text-align:left;" class="col-sm-10 col-sm-offset-2 control-label"><form:errors path="name"/></label> --%>
<!-- 					</div> -->
<!-- 					<div class="form-group"> -->
<!--     					<label for="user" class="col-sm-2 control-label">Name</label> -->
<!--     					<div class="col-sm-10"> -->
<%--       						<form:input type="text" class="form-control" path="name" id="user"/> --%>
<!--     					</div> -->
<!--   					</div> -->
<!--   					<div class="form-group"> -->
<%-- 						<label for="password" style="color:red;text-align:left;" class="col-sm-10 col-sm-offset-2 control-label"><form:errors path="password"/></label> --%>
<!-- 					</div> -->
<!-- 					<div class="form-group"> -->
<!--     					<label for="password" class="col-sm-2 control-label">Password</label> -->
<!--     					<div class="col-sm-10"> -->
<%--       						<form:input type="text" class="form-control" path="password" id="user"/> --%>
<!--     					</div> -->
  					</div>
  					<div class="form-group">
    					<div class="col-sm-offset-2 col-sm-10">
      						<button type="submit" class="btn btn-primary">Create</button>
      						<a href  = "/admin/user/cancel" class="btn btn-primary" >Cancel</a>
    					</div>
  					</div>
				</form:form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3 col-xs-3"><h3>Email</h3></div>
			<div class="col-md-3 col-xs-3"><h3>Name</h3></div>
			<div class="col-md-3 col-xs-3"><h3>Update</h3></div>
			<div class="col-md-3 col-xs-3"><h3>Delete</h3></div>
		</div>
			<c:forEach items="${users}" var="user">
				<div class="row">
					<div class="col-md-3 col-xs-3">${user.email}</div>
					<div class="col-md-3 col-xs-3">${user.name}</div>
					<div class="col-md-3 col-xs-3"><a class="btn btn-success" href="/admin/user/update/${user.id}<custom:allParams/>">update</a></div>
					<div class="col-md-3 col-xs-3"><a class="btn btn-danger" href="/admin/user/delete/${user.id}<custom:allParams/>">delete</a></div>
				</div>
			</c:forEach>
	</div>
</div>
<script>
	$('label').each(function() {
		if(!$(this).html()) $(this).parent('div').hide();
	});
</script>