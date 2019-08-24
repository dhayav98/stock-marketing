
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>User Registration</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body class="bodystyle">

	<header class="header">
		<ul class="header-list">
			<li><img class="header-logo" src="images/stock-logo.png"></li>
			<li><span class="header-title">STOCK MARKET</span></li>
			<li id="logout-link"><a class="logout-link" href="#">Logout</a></li>

		</ul>
	</header>
	<div class="main">
		<h1 style="text-align: center; line-height: 200px">USER
			REGISTRATION</h1>
		<div class="file-upload">
			<form:form method="POST" id="form-summary" action="user_register"
				modelAttribute="user">
				<table id="summary-table">
					<tr>
						<td><label for="userName">User Name</label></td>
		 			<td><form:input type="text" class="input-type"
								id="user_name" path="userName" placeholder="User Name" /></td>
					</tr>
					<tr>
						<td><label for="userPassword">Password</label></td>
						<td><form:input type="password" class="input-type"
								path="userPassword" id="userpassword" placeholder="Password" /></td>
					</tr>
					<tr>
						<td><label for="email">Email</label></td>
						<td><form:input type="text" class="input-type"
								path="email" id="useremail" placeholder="Email" /></td>
					</tr>
					<tr>
						<td><label for="mobileNumber">Mobile Number</label></td>
						<td><form:input type="text" class="input-type"
								path="mobileNumber" id="usermobilenumber"
								placeholder="Mobile Number" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input class="save_button" type="submit" value="REGISTER"></td>
					</tr>
				</table>
			</form:form>
		</div>
	</div>
	<footer class="footer">
		<p style="line-height: 60px; padding: 1px 16px;">&copy; 2019
			StockManagement.com</p>
	</footer>
</body>

</html>