<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Subract.jsp">

		a:<input type="number" name="a"> b:<input type="number"
			name="b"> <input type="submit">

		<%
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		int sum = 0;

		if (a != null && b != null) {
			sum = Integer.parseInt(a) - Integer.parseInt(b);
		}
		%>

		<h1>
			The value Of Two Numbers
			<%=sum%>
		</h1>


	</form>



</body>
</html>