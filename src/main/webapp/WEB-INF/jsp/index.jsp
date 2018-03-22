<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Список данных датчиков</h1>
<table>
    <thead>
    <tr>
        <td>id</td>
        <td>data</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="sensor" items="${sensors}">
        <tr>
            <td>${sensor.id}</td>
            <td>${sensor.value}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>


