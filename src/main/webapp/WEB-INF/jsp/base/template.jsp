<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/normalize.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jQuery/jquery-3.3.1.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/header.css"/>

    <tiles:importAttribute name="style" ignore="true"/>
    <c:if test="${not empty style}">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/${style}"/>
    </c:if>

    <tiles:importAttribute name="script" ignore="true"/>
    <c:if test="${not empty script}">
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/${script}"></script>
    </c:if>
    <title><tiles:getAsString name="title"/></title>
</head>
<body>
<%--Header--%>
<tiles:importAttribute name="header"/>
<%--Left side menu--%>
<%--<tiles:insertAttribute name="menu"/>--%>

<%--Main content--%>
<div class="content">
    <tiles:insertAttribute name="body"/>
    <%--<footer><tiles:insertAttribute name="footer"/></footer>--%>
</div>

<!--[if (lt IE 9) | (IEMobile)]>
<p style="font-size: 50px; display: block; background-color: red; color: black; width: 100%; height: 500px; text-align: center; padding-top: 200px;">
    Ваш браузер устарел!!! Обновить можно тут:<br><a href="http://updatebrowser.net/">http://updatebrowser.net/</a></p>
<![endif]-->
</body>
</html>