
<%--
  Created by IntelliJ IDEA.
  User: RB076
  Date: 1/12/2022
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show info</title>
    <style>
        table, th, td {
            border: 1px solid black;
        }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<%@ page import="src.controller.Index" %>
<%@ page import="java.sql.ResultSet" %>
    <%
        Index control = new Index();
        ResultSet res = control.showAllUser();
    %>
    <table style="border: solid black">
        <tr>
            <th>name</th>
            <th>password</th>
            <th>gender</th>
        </tr>
        <%
            while (res.next()){ %>
        <tr>
            <td> <%= res.getString("user_name") %></td>
            <td> <%= res.getString("password") %></td>
            <td> <%= res.getString("gender") %></td>
        </tr>
        <% } %>
    </table>
    <h1>hello chi duong</h1>
    <button type="submit" name="sub" value="sub" id="addbutton">Add account</button><br>
    <div hidden>
        <form action="insert-account" method="post" >
            Name: <input type="text" name="name">
            Password: <input type="text" name="pass">
            Gender: <input type="text" name="gender">
            <input type="submit" name="submit">
        </form>
    </div>
<script>
    $(document).ready(function(){
        // $("form").hide();
        $("#addbutton").click(function(){
            $("div").removeAttr("hidden")
        });

    });
</script>
</body>
</html>
