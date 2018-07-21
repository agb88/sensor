<%--
  Created by AlexBal 18.07.2018
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<header class="header">
    <%--Center logo--%>
    <div class="logo">
        <h1><a href="/" title="Главная">Sensor</a></h1>
    </div>

    <%--Rigth menu--%>
    <ul class="nav-bar">
        <li class="nav-bar__element">
            <a href="${pageContext.request.contextPath}/logout" title="Выйти">
                <i class="glyphicon glyphicon-log-out"></i>
            </a>
        </li>
    </ul>
</header>