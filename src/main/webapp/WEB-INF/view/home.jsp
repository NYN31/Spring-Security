<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>X Company Home Page</title>
</head>
<body>
    <h2>X Company Home Page</h2>
    <hr>

    <p>Welcome to the X company home page</p>

    <!-- Display username and role -->
    <p>
        User: <security:authentication property="principal.username" />
        <br><br>
        Role(s): <security:authentication property="principal.authorities" />
    </p>
    <!---- Add a logout button ---->
    <hr>
    <div pt="50px"></div>
    <form:form action="${pageContext.request.contextPath}/logout"
               method="POST">

        <input type="submit" value="Logout" />

    </form:form>
</body>
</html>