<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login</h1>
	<form method="post"
			action="${pageContext.request.contextPath}/test/resetpw">
		<table>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" placeholder="Fill in your new password"></td>
			</tr>

				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form>
</body>
</html>