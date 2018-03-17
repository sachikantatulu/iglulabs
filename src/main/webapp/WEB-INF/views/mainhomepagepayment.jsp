<%@page import="com.iglulabs.constant.Constant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	
	<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">


  <title>iglulabs</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
 <link rel="stylesheet" href="resources/font-awesome/css/font-awesome.min.css">
 <!-- Ionicons -->
 <link rel="stylesheet" href="resources/Ionicons/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="resources/dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
        page. However, you can choose any other skin. Make sure you
        apply the skin class to the body tag so the changes take effect.
  -->
  <link rel="stylesheet" href="resources/dist/css/skins/skin-blue.min.css">
  <link rel="stylesheet" href="resources/JqueryUi/datepicker.css">
<link rel="stylesheet" href="resources/bootstrap/css/dataTables.bootstrap.min.css">
</head>
<body>
<body class="hold-transition skin-blue sidebar-mini" >
<div class="wrapper">
  <!-- Main Header -->
  <header class="main-header">
    <!-- Logo -->
    <a href="#" class="logo">
   <img src="resources/images/sec.png" height="50px" width="50px" class="img-circle" alt="User Image">
    </a>
    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
        <span class="hidden-xs"><a href="user" class="btn btn-danger btn-flat">Sign out</a></span>
          <li class="dropdown user user-menu"><br/>
            <!-- Menu Toggle Button -->
              
          </li>
        </ul>
      </div>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
    <br/>
    <br/>
                 <a href="#">Name   :&nbsp;${users.getPerson().getPerson_Name()}</a><br/>
				 <a href="#">Email  :&nbsp;${users.getPerson().getEmail()}</a><br/>
				 <a href="#">Phone  :&nbsp;${users.getPerson().getMob()}</a><br/>
				 <a href="#">UserId :&nbsp;${users.getPerson().getUserId()}</a>
     
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
   <!-- Main content -->
    <section class="content">
      <!-- =========================================================== -->
	  <div class="row" >
		<div class="col-sm-4">
			<!-- <div class="form-group">
               <label>Date and time range:</label>
               <div class="input-group">
                 <div class="input-group-addon">
                   <i class="fa fa-clock-o"></i>
                 </div>
                <input type="text" class="form-control" placeholder="dd-mm-yyyy" id="ex8" name="dob" readonly='true' />
               </div>
               /.input group
             </div> -->
		</div>
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
		<button type="button" class="btn btn-block btn-success" data-toggle="modal" data-target="#exampleModalLong4">create new task</button>
		</div>
		</div>
		<div class="row">
		<div class="col-sm-12">
		<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
           <tr bgcolor=#97c6c9>
							<th>Task Objective</th>
							<!-- <th>Date</th> -->
							<th>Start time</th>
							<th>end Time</th>
							<th>Status</th>
							<th>Edit</th>
							<th>Delete</th>
						</tr>
        </thead>
       
       
         <tbody id="tdata">

				
					</tbody>
					</table>
		</div>
		</div>
	 
	<!-- Modal -->
	<div class="modal fade" id="exampleModalLong3" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalLongTitle"
		aria-hidden="true">
		<div class="modal-dialog modal-md" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h5 class="modal-title" id="exampleModalLongTitle">
						<strong>UPDATE TASK</strong>
					</h5>

				</div>
				<div class="modal-body">

					<form id="contactForm" method="post" class="form-horizontal">
						<div class="container-fluid">
							<div class="row">
							
										<input type="hidden" class="form-control" id="ex0" name="id" value="" readonly="readonly"/>
									
								<div class="form-group">
									<label class="col-md-3 control-label">Task Objective:</label>
									<div class="col-md-6">
										<textarea class="form-control" id="ex1" name="taskObjective" value=""></textarea>
									</div>
								</div>
								<!-- <div class="form-group">
									<label class="col-md-3 control-label">Date:</label>
									<div class="col-md-6">
										<input type="text" class="form-control" id="ex2" name="createDate" value="" />
									</div>
								</div> -->
								<div class="form-group">
									<label class="col-md-3 control-label">Start Date:</label>
									<div class="col-md-6">
										<input type="text" class="form-control" placeholder="dd-mm-yyyy" id="ex2" name="startTime" value="" />
									</div>
								</div>
								
								<div class="form-group">
									<label class="col-md-3 control-label">End Date:</label>
									<div class="col-md-6">
										<input type="text" class="form-control" placeholder="dd-mm-yyyy" id="ex3" name="endTime" value="" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-3 control-label">Status:</label>
									<div class="col-md-6">
										<input type="text" class="form-control" id="ex4" name="status" value="" />
									</div>
								</div>
							</div>					
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-primary"
						onclick="UpdateTaskDetails()">Update</button>
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
						<!-- <button type="submit" class="btn btn-danger" data-toggle="modal" data-target="#myModal" data-backdrop="static"
						>Delete</button> -->
				</div>
			</div>
		</div>
	</div>
<!-- Modal -->
	<div class="modal fade" id="exampleModalLong4" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalLongTitle"
		aria-hidden="true">
		<div class="modal-dialog modal-md" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h5 class="modal-title" id="exampleModalLongTitle">
						<strong>CREATE TASK</strong>
					</h5>

				</div>
				<div class="modal-body">

					<form id="contactForm" method="post" class="form-horizontal">
						<div class="container-fluid">
							<div class="row">
								<div class="form-group">
									<label class="col-md-3 control-label">Task Objective:</label>
									<div class="col-md-6">
										<textarea class="form-control" id="taskobj" name="taskObjective" value=""></textarea>
									</div>
								</div>
								<!-- <div class="form-group">
									<label class="col-md-3 control-label">Date:</label>
									<div class="col-md-6">
										<input type="text" class="form-control" id="ex2" name="createDate" value="" />
									</div>
								</div> -->
								<div class="form-group">
									<label class="col-md-3 control-label">Start Date:</label>
									<div class="col-md-6">
										<input type="text" class="form-control" placeholder="dd-mm-yyyy" id="ex10" name="startTime" value="" />
									</div>
								</div>
								
								<div class="form-group">
									<label class="col-md-3 control-label">End Date:</label>
									<div class="col-md-6">
										<input type="text" class="form-control" placeholder="dd-mm-yyyy" id="ex11" name="endTime" value="" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-3 control-label">Status:</label>
									<div class="col-md-6">
										<input type="text" class="form-control" id="status" name="status" value="" />
									</div>
								</div>
							</div>					
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-primary"
						onclick="SubmitstatusDetails()">Submit</button>
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
						<!-- <button type="submit" class="btn btn-danger" data-toggle="modal" data-target="#myModal" data-backdrop="static"
						>Delete</button> -->
				</div>
			</div>
		</div>
	</div>

<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLongTitle" aria-hidden="true"
		onClick="windows.close();">
		<div class="modal-dialog modal-md" role="document">
			<div class="modal-content">
				<div class="modal-header" style="background-color:#357ca5;">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>

					<h3 class="modal-title" id="exampleModalLongTitle" style="text-align:center;">
						<strong>User</strong>
					</h3>

				</div>
				<div class="modal-body" id="modaldata"></div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary"
						data-dismiss="modal" onClick="window.location.reload();">Close</button>
				</div>
			</div>
		</div>
	</div>
    </section>
    
  </div>

  <!-- Main Footer -->
  <footer class="main-footer">
    <!-- To the right -->
    <div class="pull-right  hidden-xs">
    </div>
    <!-- Default to the left -->
    <strong>Copyright &copy; 2016 <a href="http://www.softechnocon.com/" target="_blank">Softechnocon</a>.</strong> All rights reserved.
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Create the tabs -->
    <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
      <li class="active"><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
      <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
    </ul>
    <!-- Tab panes -->
    <div class="tab-content">
      
  <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- REQUIRED JS SCRIPTS -->
<!-- jQuery 2.2.3 -->
<script src="resources/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="resources/js/jquery.min.js"></script>
<!-- <link rel="stylesheet" href="resources/js/jquery.min.js"> -->
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js "></script>
<!-- Bootstrap 3.3.6 -->
<script src="resources/bootstrap/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<!-- <script src="resources/JqueryUi/jquerydatepicker.js"></script> -->
<script src="resources/dist/js/app.min.js"></script>
<script src="resources/js/jquery.dataTables.min.js"></script>
<script src="resources/js/dataTables.bootstrap.min.js"></script>

<!-- Active buttons functions-->
<script type="text/javascript">
$(document).ready(function() {
    $('#example').DataTable();
    dispalytask();
} );
var data1;
function dispalytask(){
	$("#tdata").html("");
	var html="";
	$.ajax({
        url: 'PersonRestService/viewalltask',
         type: "GET",
         contentType:'application/json',
         dataType: "json",
         success: function(data) {
        	data1=data;
        	 for (var i = 0; i < data.length; i++) {
        		html=html+"<tr><td>"+data[i].taskObjective+"</td>"+
        		/* "<td>"+data[i].createDate+"</td>"+ */
        		"<td>"+data[i].startTime+"</td>"+
        		"<td>"+data[i].endTime+"</td>"+
        		"<td>"+data[i].status+"</td>"+
        		'<td><button type="submit" value="Edit" class="btn btn-primary" onclick="SearchEventDetails2('+i+')" data-toggle="modal" data-target="#exampleModalLong3" data-backdrop="static">Edit</button></td>'+
       		  '<td><button type="submit" class="btn btn-danger" onclick="deletetask('+data[i].id+')">Delete</button></td>'+"</tr>"
			} 
        	$("#tdata").html(html);
        	 
         }
         });

}
function deletetask(id){
	$.ajax({
		type:'GET',
		url:'PersonRestService/deletetask?id='+id,
		contentType:'application/json',
		dataType:'json',
		 success:function(data){
			 if(data==0){
			 document.getElementById('modaldata').innerHTML = '<h3><strong>'
					+ '</strong>Task not deleteed successfully<strong>';
				$('#myModal').modal('show');
			 }else{
				 document.getElementById('modaldata').innerHTML = '<h3><strong>'
						+ '</strong> Task has been deleted successfully<strong>';
					$('#myModal').modal('show');
			 }
		} 
	});
	//alert(id);
}
function SearchEventDetails2(id){
	//console.log("hiiii"+data[id].id)
	//alert(data1[id].id);
	document.getElementById("ex0").value = data1[id].id;
	 document.getElementById("ex1").value = data1[id].taskObjective;
	document.getElementById("ex2").value = data1[id].startTime;
	document.getElementById("ex3").value = data1[id].endTime;
	document.getElementById("ex4").value = data1[id].status;
	}


function UpdateTaskDetails(){
	//alert("sachi");
	//var exam_id= document.getElementById("ex11").value;
	var id=document.getElementById("ex0").value;
	var taskObjective=document.getElementById("ex1").value;
	var startTime=document.getElementById("ex2").value;
	var endTime=document.getElementById("ex3").value;
	var status=document.getElementById("ex4").value;
	//var password=document.getElementById("ex7").value;
	var object=new Object();
	object.taskObjective=taskObjective;
	//object.createDate=createDate;
	object.startTime=startTime;
	object.endTime=endTime;
	object.status=status;
	object.id=id;
	//object.rightOption=rightOption;
	//alert(JSON.stringify(object));
	console.log(JSON.stringify(object));
	//var dataString = JSON.stringify(object);
	$.ajax({
		type:'POST',
		data:JSON.stringify(object),
		url:'PersonRestService/updatetask',
		contentType:'application/json',
		dataType:'json',
		 success:function(data){
			 if(data==0){
			 document.getElementById('modaldata').innerHTML = '<h3><strong>'
					+ '</strong>Task not updated successfully<strong>';
				$('#myModal').modal('show');
			 }else{
				 document.getElementById('modaldata').innerHTML = '<h3><strong>'
						+ '</strong> Task has been updated successfully<strong>';
					$('#myModal').modal('show');
			 }
		} 
	});
}




function SubmitstatusDetails() {
	var taskObjective=document.getElementById("taskobj").value;
	//var createDate=document.getElementById("ex4").value;
	var startTime=document.getElementById("ex10").value;
	var endTime=document.getElementById("ex11").value;
	var status=document.getElementById("status").value;
	var object=new Object();
	object.taskObjective=taskObjective;
	//object.createDate=createDate;
	object.startTime=startTime;
	object.endTime=endTime;
	object.status=status;
	//alert(JSON.stringify(object));
	$.ajax({
		type:'POST',
		data:JSON.stringify(object),
		url: 'PersonRestService/createtask',
		contentType:'application/json',
		dataType:'json',
		 success:function(data){
			 if(data==0){
			 document.getElementById('modaldata').innerHTML = '<h3><strong>'
					+ '</strong>Task not created successfully<strong>';
				$('#myModal').modal('show');
			 }else{
				 document.getElementById('modaldata').innerHTML = '<h3><strong>'
						+ '</strong> Task has been created successfully<strong>';
					$('#myModal').modal('show');
			 }
		} 
	});


}
  //<!--
  function OpenInMyFrame(var1)
  {
    window.document.getElementById("MyFrame1").src = var1;
  }
  //-->
</script>

  <script type = "text/javascript" >
   /* function preventBack(){
	   console.log("hii backkkkkk")
	   window.history.backward();
	   }
    setTimeout("preventBack()", 0);
    window.onunload=function(){null}; */
    
     window.onbeforeunload = function() {
    	location.reload(true);
        
    	   console.log("hii backkkkkkiiii")
    	  // window.location.href='https://www.google.co.in/';
    	   //location.href = "https://www.w3schools.com";
	    	// window.location.reload();
	    	// location.reload();
    	//return "You work will be lost.";
    	} 
    	
//prevent back button
 function changeHashOnLoad() {
    window.location.href += '#';
    setTimeout('changeHashAgain()', '50'); 
}

function changeHashAgain() {
 window.location.href += '1';
}

var storedHash = window.location.hash;
window.setInterval(function () {
   if (window.location.hash != storedHash) {
        window.location.hash = storedHash;
   }
}, 50);
window.onload=changeHashOnLoad;

//date picker
$(function () {
		 //Date picker
    $('#ex8,#ex2,#ex3,#ex10,#ex11').datepicker({
      changeYear: true,
    changeMonth: true,
    yearRange: "-100:+0",
	  dateFormat: 'dd-mm-yy'
    });
	  });
</script>
</body>
</html>