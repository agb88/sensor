<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Список данных датчиков</h1>
<c:forEach var="sensor" items="${sensors}">
    <div>Датчик с id = ${sensor.id}</div>
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


