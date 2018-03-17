<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
  <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
  <!-- <script src="resources/bootstrap/js/bootstrap.min.js"></script> -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="resources/font-awesome/css/font-awesome.min.css">
     <link rel="stylesheet" href="resources/bootstrap/css/custom.css">
     <link rel="stylesheet" href="resources/bootstrap/css/sachi.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
    <script src='https://www.google.com/recaptcha/api.js'></script>
    <script src="resources/js/jquery.min.js"></script>
    <script src="resources/js/login.js"></script>
    <script src="resources/bootstrap/js/bootstrap.min.js"></script>
    <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->
  <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->
   <!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
</head>

<body>
    <div class="container" style="margin-top: 100px;">
        <div class="row">
            <div class="col-md-4">
            </div>
            <div class="col-md-4">
                <div class="panel panel-default">
                    <div class="lock">
                        <i class="fa fa-lock"></i>
                    </div>
                    <h4>Online Task</h4>
                    <h5>Secure Login</h5>
                    <div class="form-group" align="center"style="color:green;">
                          <h4><strong>${msg1}</strong></h4>
                         <h4><strong>${msg}</strong></h4>
                          </div>
                    <div class="panel-body">
                        <form action="user"  commandName="loginForm" method="post">
                            <div class="form-group">
                                <input type="text" name="mob" class="form-control"  id="num" placeholder="enter UserId" style="width:87%;margin:20px"
                                     required>

                                <input type="password" name="password" id="password" class="form-control" placeholder="enter password" style="width:87%;margin:20px">

                                <div class="g-recaptcha" data-sitekey="6LeUtD4UAAAAAKD8txHlN1o397pXrSKkDL_9eCt9" data-callback="enableBtn" align="center"></div>
                                <input type="submit" name="" class="btn btn-success btn-lg btn-block" value="Sign In" style="width:87%;margin:20px" id="sub"disabled>
						   <a class="hover1" id="myBtn" data-toggle="modal" data-target="#exampleModalLong4" data-backdrop="static" data-keyboard="false"><strong>New User?</strong></a>  
						  <!-- <img src="resources/bootstrap/css/images/logo1.png" alt="Mountain View"> -->
                            </div>
                        </form>
                          
                    </div>
                </div>
            </div>
            <div class="col-md-4">
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
						<span aria-hidden="true"><i class="fa fa-close" style="font-size:30px;color:red"></i></span>
					</button>
					<h5 class="modal-title" id="exampleModalLongTitle">
						<strong>USER PROFILE</strong>
					</h5>

				</div>
				<div class="modal-body">

					<form id="contactForm" method="post" class="form-horizontal">
						<div class="container-fluid">
							<div class="row">
								<div class="form-group">
									<label class="col-md-3 control-label">Name:</label>
									<div class="col-md-6">
										<input type="text" class="form-control" id="ex3" name="name" value=""/>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-3 control-label">Mobile No:</label>
									<div class="col-md-6">
										<input type="text" class="form-control" id="ex4" name="mob" value="" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-3 control-label">Email ID:</label>
									<div class="col-md-6">
										<input type="text" class="form-control" id="ex5" name="email" value="" />
									</div>
								</div>
								
								<div class="form-group">
									<label class="col-md-3 control-label">User Id:</label>
									<div class="col-md-6">
										<input type="text" class="form-control" id="ex6" name="uid" value="" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-3 control-label">password:</label>
									<div class="col-md-6">
										<input type="text" class="form-control" id="ex7" name="pwd" value="" />
									</div>
								</div>
							</div>					
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-primary"
						onclick="SubmitPersonDetails()">Submit</button>
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
						<span aria-hidden="true"><i class="fa fa-close" style="font-size:30px;color:red"></i></span>
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

</div>
</body>
<script>

function SubmitPersonDetails() {
	var personName=document.getElementById("ex3").value;
	var mobileNo=document.getElementById("ex4").value;
	var emailId=document.getElementById("ex5").value;
	var userid=document.getElementById("ex6").value;
	var password=document.getElementById("ex7").value;
	var object=new Object();
	object.person_Name=personName;
	object.mob=mobileNo;
	object.email=emailId;
	object.userId=userid;
	object.password=password;
	//alert(JSON.stringify(object));
	$.ajax({
		type:'POST',
		data:JSON.stringify(object),
		url:'PersonRestService/UpdatePersonRegistration',
		contentType:'application/json',
		dataType:'json',
		 success:function(data){
			 if(data==0){
			 document.getElementById('modaldata').innerHTML = '<h3><strong>'
					+ '</strong>Student not created successfully<strong>';
				$('#myModal').modal('show');
			 }else{
				 document.getElementById('modaldata').innerHTML = '<h3><strong>'
						+ '</strong> Student has been created successfully<strong>';
					$('#myModal').modal('show');
			 }
		} 
	});


}
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
</script>
</html>