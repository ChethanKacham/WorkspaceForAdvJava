<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB Demo</title>
</head>
<body>
	<form action="MainServlet" method="get">
		<p style="color:black">Department:
		<select name="department">
			<option value="Customer Service" selected>Customer Service</option>
			<option value="Development">Development</option>
			<option value="Finance">Finance</option>
			<option value="Human Resources">Human Resources</option>
			<option value="Marketing">Marketing</option>
			<option value="Production">Production</option>
			<option value="Quality Management">Quality Management</option>
			<option value="Research">Research</option>
			<option value="Sales">Sales</option>
		</select>
		<input type="submit" name="action" style="height:50px">
		</form>
</body>
</html>