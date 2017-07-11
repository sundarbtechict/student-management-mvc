<!DOCTYPE html>
<html lang="en">
<head>
  <title>Student Management</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  	<div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="./././index.jsp">Student Management</a>
    </div>
    </div>
	</nav>
	<br><br>
  <div class="container">
<h4 style='color:#000080;' >Enter your full details:</h4>
	<form class="form-inline" action="./createStudent" method="POST">
		<table class="table table-striped">
			<tr>
				<th>Name:</th>
				<td><input type="text"  class="form-control" name="name"></td>
			</tr>
			<tr>
				<th>Register No:</th>
				<td><input type="text"  class="form-control" name="regno"></td>
			</tr>
			<tr>
				<th>DOB:</th>
				<td><input type="date" class="form-control" name="dob" max="2000-12-31"></td>
			</tr>
			<tr>
				<th>Email:</th>
				<td><input type="email" class="form-control" name="email"></td>
			</tr>
			<tr>
				<th>Mobile:</th>
				<td><input type="text" class="form-control" name="mobile"></td>
			</tr>
			<tr>
				<th>Department:</th>
				<td><input type="text" class="form-control" name="dept"></td>
			</tr>
		</table>
		<div style="float: right;right:10%;">
			<input type="submit" class="btn btn-info" value="save">
			<button href="./././index.jsp "class="btn btn-info">cancel</button>
		</div>
	</form>
	</div>
</body>
</html>