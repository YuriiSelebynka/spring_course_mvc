<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, Please enter your details</h2>

<br>
<br>

<form:form action = "showDetails" modelAttribute = "employee">

    Name <form:input path = "name"/>
    <br><br>
    Surname <form:input path = "surname"/>
    <br><br>
    Salary <form:input path = "salary"/>
    <br><br>
    Department <form:select path = "department">
    <form:options items = "${employee.departments}"/>
<%--    <form:option value = "Information Technology" label = "IT"/>--%>
<%--    <form:option value = "Human Resources" label = "HR"/>--%>
<%--    <form:option value = "Sales" label = "Sales"/>--%>
    </form:select>
    <br><br>
    Which car do you want?
    <form:radiobuttons path="carBrand" items = "${employee.carBrands}"/>
<%--    MB <form:radiobutton path="carBrand" value = "Mercedes-Benz"/>--%>
<%--    Audi <form:radiobutton path="carBrand" value = "Audi"/>--%>
<%--    BMW <form:radiobutton path="carBrand" value = "BMW"/>--%>
    <br><br>
    Foreign Language(s)

    <form:checkboxes path = "languages" items = "${employee.languageList}"/>
<%--    EN <form:checkbox path = "languages" value = "English"/>--%>
<%--    DE <form:checkbox path = "languages" value = "Deutch"/>--%>
<%--    FR <form:checkbox path = "languages" value = "French"/>--%>

    <input type = "submit" value = "OK">

    </form:form>

<%--<form action = "showDetails" method = "get">--%>
<%--    <input type = "text" name = "employeeName"--%>
<%--           placeholder = "Write your name"/>--%>

<%--    <input type = "submit"/>--%>

<%--</form>--%>

</body>

</html>