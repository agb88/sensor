<%--
  Created by AlexBal 12.05.2018
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header class="content__title">
    <span>Список данных датчиков</span>
</header>
<div>
    <c:forEach var="sensor" items="${sensors}">
        <div style="padding-left: 60px;">Датчик с id = ${sensor.id}</div>
        <table>
            <thead>
            <tr>
                <td>№</td>
                <td>Данные</td>
                <td>Время добавления</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="sensorData" items="${sensor.sensorData}" varStatus="count">
                <tr>
                    <td>${count.index}</td>
                    <td>${sensorData.data}</td>
                    <td>${sensorData.creatingDate}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <br>
    </c:forEach>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>

</div>
