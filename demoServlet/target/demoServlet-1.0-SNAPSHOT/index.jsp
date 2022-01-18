<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Servlet Demo</title>
</head>
<body>
<h1 style="color: crimson">Wellcome to our Demo Servlet page
</h1>

<form action="index" method ='post'>
    <table>
        <tr>
            <td>
                User name:
            </td>
            <td>
                <input type="text" name="username" placeholder="Enter user name here">
            </td>
        </tr>
        <tr>
            <td>
                Password:
            </td>
            <td>
                <input type="password" name="password" placeholder="Enter password here">

            </td>
        </tr>
        <td><input type="submit" value="Login"> </td>
    </table>
</form>


<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>