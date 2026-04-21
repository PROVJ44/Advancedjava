<%@ page language="java" %>
<html>
<head>
    <title>Factorial Program</title>
</head>
<body>

<h2>Factorial Calculator</h2>

<form method="post">
    Enter number:
    <input type="number" name="num" required>
    <input type="submit" value="Calculate">
</form>

<%
    String numStr = request.getParameter("num");

    if (numStr != null && !numStr.isEmpty()) {

        int num = Integer.parseInt(numStr);
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

%>

    <h3>Factorial of <%= num %> is: <%= fact %></h3>

<%
    }
%>

</body>
</html>