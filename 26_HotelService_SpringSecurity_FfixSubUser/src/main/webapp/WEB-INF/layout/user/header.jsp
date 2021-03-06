<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>
<style>
@media ( min-width : 1000px) and (max-width: 1000px) {
	.navbar-nav>li>a {
		padding: 15px 5px
	}
}
</style>
<nav class="navbar-default navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#one" data-toggle="tooltip"
				data-placement="bottom" title="Tooltip on bottom"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<!-- <a href="" class="navbar-brand" style="padding-top:0;">
						<img class="img-thumbnail" width="104" src="http://static-cache.ua.uaprom.net/image/i18n-domain/UA/logo_main-trans.png?r=e8abc69e68fadede022fc4e4a50e327b"></a> -->
		</div>
		<div class="collapse navbar-collapse" id="one">
			<ul class="nav navbar-nav">
				<li><a href="/" role="button" title="Main page"><span
						class="glyphicon glyphicon-home" aria-hidden="true"></span></a></li>
						<sec:authorize access="isAuthenticated()">
				<li><a href='/myProfile/<sec:authentication property="principal.id"/>' role="button" title="YES"><span
						class="glyphicon glyphicon-user" aria-hidden="true"></span></a>
					</sec:authorize>
			</ul>
			<form class="navbar-form navbar-left">
				<div class="form-group">
					<input class="form-control">
				</div>
				<button type="submit" class="btn btn-success">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
				</button>
			</form>
			<sec:authorize access="isAuthenticated()">
				<sec:authorize access="hasRole('ROLE_ADMIN')">
					<ul class="nav navbar-nav">
						<li><a href="/admin" role="button" title="Admin page"><span
								class="glyphicon glyphicon-wrench"></span></a></li>
					</ul>
				</sec:authorize>
				<form:form class="navbar-form navbar-right" action="/logout" method="POST">
					<button type="submit" class="btn btn-danger">Logout</button>
				</form:form>
			</sec:authorize>
			<sec:authorize access="hasRole('ROLE_SUBADMIN') or hasRole('ROLE_ADMIN')">
					<ul class="nav navbar-nav">
						<li><a href="/subuser/" role="button" title="Admin page"><span
								class="glyphicon glyphicon-screenshot"></span></a></li>
					</ul>
				</sec:authorize>
			<sec:authorize access="!isAuthenticated()">
				<form:form class="navbar-form navbar-right" action="/login"	method="POST">
					<div class="form-group">
						<input class="form-control" placeholder="Login" name="login"
							id="login">
					</div>
					<div class="form-group">
						<input class="form-control" placeholder="Password" type="password"
							name="password" id="password">
					</div>
					<div class="checkbox">
						<label> <input name="remember-me" type="checkbox">
							Remember me
						</label>
					</div>
					<button class="btn btn-success">Sign in</button>
				</form:form>
			</sec:authorize>
			<ul class="nav navbar-nav navbar-right">
				<sec:authorize access="!isAuthenticated() or hasRole('ROLE_ADMIN')">
					<li><a href="/registration" title="Are you shure"
						role="button"> <span class="glyphicon glyphicon-new-window "
							aria-hidden="true"></span>Registration
					</a></li>
				</sec:authorize>
				<sec:authorize access="hasRole('ROLE_ADMIN')">
					<li><a href="/registrationSub" title="Are you shure"
						role="button"> <span class="glyphicon glyphicon-plus-sign"
							aria-hidden="true"></span>RegistrationSub
					</a></li>
				</sec:authorize>
				<li title="Do you like me"><a href=""><span
						class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></a></li>
				<li title="Shit"><a href=""><span
						class="glyphicon glyphicon-folder-open" aria-hidden="true"></span>
						Bag</a></li>
			</ul>
		</div>
	</div>
</nav>