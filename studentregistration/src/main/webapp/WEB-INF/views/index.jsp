<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
<div class="container mt-3">

		<div class="row">

			<div class="col-md-12">

				<h1 class="text-center mb-3">Welcome to Student Registration Management</h1>

				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Name</th>
							<th scope="col">Department</th>
							<th scope="col">Country</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${students }" var="p">
							<tr>
								<th scope="row">${p.studentid }</th>
								<td>${p.name }</td>
								<td>${p.department }</td>
								<td>${p.country }</td>
								<td>
								
								<a href="update/${p.studentid }"><i class="fas fa-pen-nib text-primary" style="font-size: 30px;"></i></a>
							    <a href="delete/${p.studentid }" onclick="return checkdelete()"><i class="fas fa-trash text-danger" style="font-size: 30px;"></i></a>
								
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

				<div class="container text-center">

					<a href="add-student" class="btn btn-outline-success">Add
						Student</a>

				</div>


			</div>


		</div>

	</div>
	<script type="text/javascript">
	function checkdelete(){
		return confirm("Are u sure you want to delete this Student record?");
	}
	</script>
</body>
</html>
