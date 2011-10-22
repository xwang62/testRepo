<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${testBean.wrong}">
    <p><b>Wrong!</b></p>
</c:if>
<p>Can you guess my name?</p>
    <c:url var="url" value="/welcome.do"/>
    <form:form action="${url}" commandName="testBean" method="post">
        <form:input path="name" />
        <input name="submit" type="submit" value="Guess"/>
    </form:form>
</body>
</html>