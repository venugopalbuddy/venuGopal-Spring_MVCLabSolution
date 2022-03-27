<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">

		<div class="row">

			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Fill the Student details</h1>

				<form action="handle-student" method="post">
					<div class="form-group">
						<label for="name">Name:</label> <input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="name" placeholder="Enter name here">
					</div>
					<div class="form-group">
						<label for="department">Department:</label> <input type="text"
							class="form-control" id="department" aria-describedby="emailHelp"
							name="department" placeholder="Enter the department name here">
					</div>

					<div class="form-group">
						<label for="country">Country:</label> <input type="text"
							id="country" aria-describedby="emailHelp" placeholder="Enter country here" name="country"
							class="form-control" id="country">
					</div>

					<div class="container text-center">

						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>


						<button type="submit" class="btn btn-primary">Save</button>
					</div>
				</form>


			</div>

		</div>

	</div>

</body>
</html>