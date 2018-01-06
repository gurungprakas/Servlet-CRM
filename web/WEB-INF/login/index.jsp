<%-- 
    Document   : index
    Created on : Jun 29, 2017, 9:47:33 PM
    Author     : Prakas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="post" action="">
            <div>
                <label>User Name</label>
                <input type="text" name="username" required="required">
                
            </div>
            <div>
                <label>Password</label>
                <input type="password" name="password" required="required">
                
            </div>
            <button type="submit">Login</button>
        </form>
    </body>
</html>
