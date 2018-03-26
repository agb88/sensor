<%--
  Created by AlexBal 26.03.2018
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="credentials">
    <div class="header">
        <h3>Авторизация</h3>
    </div>
    <br>
    <form action="<c:url value='/login'/>" method="POST">
        <div class="form-group">
            <c:if test="${param.containsKey('error')}">
                <div class="danger">Username or password is not valid or user blocked</div>
            </c:if>
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" id="email" class="form-control" name="email"/>
        </div>
        <div class="form-group">
            <label for="password" id="password">Пароль</label>
            <input type="password" class="form-control" name="password"/>
        </div>
        <div class="form-group">
            <input type="submit" class="btn" value="Войти"/>
        </div>
    </form>
</div>
