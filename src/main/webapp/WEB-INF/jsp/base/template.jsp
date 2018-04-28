<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/normalize.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"/>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/<tiles:insertAttribute name="style"/>"/>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/<tiles:insertAttribute name="js"/>"></script>

    <title><tiles:insertAttribute name="title"/></title>
    <!--[if (lt IE 9) | (IEMobile)]>
    <style>
        .ie {
            font-size: 50px;
            display: block;
            background-color: red;
            color: black;
            width: 100%;
            height: 500px;
            text-align: center;
            padding-top: 200px;
        }
    </style>
    <![endif]-->
</head>
<body>
<!--[if (lt IE 9) | (IEMobile)]><p class="ie">Ваш браузер устарел!!! Обновить можно тут:<br><a
        href="http://updatebrowser.net/">http://updatebrowser.net/</a></p><![endif]-->
<div class="content">
    <tiles:insertAttribute name="menu"/>
    <tiles:insertAttribute name="body"/>
</div>
<footer><tiles:insertAttribute name="footer"/></footer>
</body>
</html>