<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2021/8/17
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="inclub/base.jsp"%>
</head>
<body>
<script src="js/jquery-1.12.4.js"></script>
<script>
    $(function () {
        //当页面加载时 查询数据
        queryStudent();
        $("#button").click(function () {
            queryStudent();

        })


    })

    function queryStudent() {
        $.ajax({
            url:"Student/query",
            type:"get",
            dataType:"json",
            success:function (data) {
                $("#info").html("")
                $.each(data,function (i,n) {
                    $("#info").append("<tr>").append("<td>"+n.id+"</td>")
                        .append("<td>"+n.name+"</td>").append("<td>"+n.age+"</td>").append("</tr>")
                })
            }
        })
    }
</script>
<div align="conter">
<table>
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>年龄</th>
    </tr>
    <tbody id="info">

    </tbody>
</table>
    <input type="button" id="button" value="tijiao"/>
    <input type="button" id="button1" value="tijiao"/>
</div>
</body>

</html>
