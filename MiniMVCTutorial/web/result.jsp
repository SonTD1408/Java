<%@ page import="java.util.*" %>
<html>
    <body>
        <h1 align="center">Select using jsp</h1>
        <p>
            <%
                List styles = (List) request.getAttribute("styles");
                Iterator re = styles.iterator();
                while (re.hasNext()){
                    out.print("<br>try: "+re.next());
                }
            %>
        </p>
    </body>
</html>