<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div class="row">
	<div class="col-md-2 col-xs-2"><h3>Room number</h3></div>
	<div class="col-md-2 col-xs-2"><h3>Rooms in number</h3></div>
	<div class="col-md-2 col-xs-2"><h3>Price of number</h3></div>
	<div class="col-md-3 col-xs-3"><h3>Type of bath room</h3></div>
	<div class="col-md-3 col-xs-3"><h3>Type of room</h3></div>
</div>
<div class="row">
	<div class="col-md-2 col-xs-2"><h3>${roomServices.roomNumber}</h3></div>
	<div class="col-md-2 col-xs-2"><h3>${roomServices.room}</h3></div>
	<div class="col-md-2 col-xs-2"><h3>${roomServices.price} UAH</h3></div>
	<div class="col-md-3 col-xs-3"><h3>${roomServices.typeOfBathRoom.type}</h3></div>
	<div class="col-md-2 col-xs-2"><h3>${roomServices.typeOfRoom.type}</h3></div>
	</div>
<div class="row">
	<div class="col-md-7 col-xs-12"><a href='#' id='trigger'><button>Rent</button></a> <!-- Всё происходит при нажатии на ссылку -->
		 <div id='box' style='display: none;padding:10px;background-color:#f1f1f1;margin:10px;width:50%;'>
		<div class="row">
			<div class="col-md-12 col-xs-12">
				<form:form class="form-horizontal" action="" method="POST" modelAttribute="">
					<div class="form-group">
    					<label for="" class="col-sm-2 control-label">First Date</label>
    					<div class="col-sm-10">
      						<input type="text" class="form-control" name="" id=""/>
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="" class="col-sm-2 control-label">Second Date</label>
    					<div class="col-sm-10">
      						<input type="text" class="form-control" name="" id=""/>
    					</div>
  					</div>
  					<sec:authorize access="!isAuthenticated()">
  					<div class="form-group">
    					<label for="" class="col-sm-2 control-label">Name</label>
    					<div class="col-sm-10">
      						<input type="text" class="form-control" name="" id=""/>
    					</div>
  					</div>
  					<div class="form-group">
    					<label for="" class="col-sm-2 control-label">Phone Number</label>
    					<div class="col-sm-10">
      						<input type="text" class="form-control" name="" id=""/>
    					</div>
  					</div>
  					</sec:authorize>
  					<div class="form-group">
    					<div class="col-sm-offset-2 col-sm-10">
      						<button type="submit" class="btn btn-primary">Rent</button>
<!--       						<a href  = "/user/roomService/" class="btn btn-primary" >Cancel</a> -->
    					</div>
  					</div>
				</form:form>
			</div>
		</div>
	 </div>
</div>
</div>
			
