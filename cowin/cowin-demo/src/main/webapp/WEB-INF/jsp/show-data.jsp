<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>

<head>
<title>Todo's for ${name}</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<div class="container">
		<table class="table table-striped">
			<caption>Available slots are:</caption>
			<thead>
				<tr>
				    <th>Address</th>
				    <th>Vaccine</th>
					<th>Slots</th>
					<th>Fee Type</th>
					<th>Date</th>
					<th>Available</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${rawData}" var="rawData">
					<tr>
						<td>${rawData.value.get('name')}</td>
						<td>${rawData.value.get('vaccine')}</td>
						<td>${rawData.value.get('slots')}</td>
						<td>${rawData.value.get('fee_type')}</td>
						<td>${rawData.value.get('date')}</td>
						<td>${rawData.value.get('available_capacity_dose2')}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<h3>Raw Data:</h3>
		${rawData}
	</div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>