<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>
			<style>
				@media (min-width: 1000px) and (max-width: 1000px){
					.navbar-nav>li>a {
						padding: 15px 5px
					}
				}
			</style>
<nav class="navbar-default navbar-fixed-top">
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" 
							class="navbar-toggle collapsed wbsi" 
							data-toggle="collapse" 
							data-target="#one"
							data-toggle="tooltip"
							data-placement="bottom"
							title="Tooltip on bottom"
							aria-expanded="false"> 
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<!-- <a href="" class="navbar-brand" style="padding-top:0;">
						<img class="img-thumbnail" width="104" src="http://static-cache.ua.uaprom.net/image/i18n-domain/UA/logo_main-trans.png?r=e8abc69e68fadede022fc4e4a50e327b"></a> -->
					</div>
					<div class="collapse navbar-collapse" id="one">
						<ul class="nav navbar-nav">
							<li><a href="/" role="button" title="Main page"><span class="glyphicon glyphicon-home"></span></a></li>
							<li class="dropdown"><a href="" role="button" 
								class="dropdown-toggle" data-toggle="dropdown"
								aria-haspopup="true"title="YES" aria-expanded="false"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="">Profile</a></li>
									<li><a href="">History</a></li>
									<li><a href="">Your reviews</a></li>
									<li><a href="">Exit</a></li>
								</ul>
							</li>
						</ul>
						<form class="navbar-form navbar-left">
							<div class="form-group">
								<input class="form-control">
							</div>
							<button type="submit" class="btn btn-success wbsi">
								<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
							</button>
						</form>
							<ul class="nav navbar-nav">
								<li><a href="/admin" role="button" title="Admin page"><span class="glyphicon glyphicon-wrench"></span></a></li>
							</ul>
						<security:authorize access="!isAuthenticated()">
	                    <form:form class="navbar-form navbar-right" action="/login" method="POST">
	                        <div class="form-group">
	                            <input class="form-control" placeholder="Login" name="login">
	                        </div>
	                        <div class="form-group">
	                            <input class="form-control" placeholder="Password" type="password" name="password">
	                        </div>
	                        <div class="checkbox">
							    <label>
							      <input name="remember-me" type="checkbox"> Remember me
							    </label>
							</div>
	                        <button class="btn btn-success">Sign in</button>
	                    </form:form>
                    </security:authorize>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="" title="Are you shure" role="button" >
								<span class="glyphicon glyphicon-new-window " aria-hidden="true"></span>  Registration</a>
							</li>
							<li title="Do you like me"><a href=""><span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></a></li>
							<li title="Shit"><a href=""><span class="glyphicon glyphicon-folder-open" aria-hidden="true"></span> Bag</a></li>
						</ul>
					</div>
				</div>
			</nav>