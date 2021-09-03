<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2021/8/11
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String base=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/"+request.getContextPath()+"/";

%>
<base href="${base}"/>
</body>
</html>
