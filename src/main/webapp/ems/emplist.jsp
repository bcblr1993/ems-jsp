<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/ems/css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							2009/11/20
							<br />
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome ${sessionScope.user.username} !
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								姓名
							</td>
							<td>
								薪资
							</td>
							<td>
								生日
							</td>
							<td>
								性别
							</td>
							<td>
								操作
							</td>
						</tr>
						<c:forEach items="${requestScope.lists}" var="emp">
							<tr class="row1">
								<td >${emp.id}</td>
								<td >${emp.name}</td>
								<td >${emp.salary}</td>
								<td ><fmt:formatDate value="${emp.birthday}" /></td>
								<td >${emp.gender?'男':'女'}</td>
								<td>
									<a href="${pageContext.request.contextPath}/delete?id=${emp.id}">删除</a>&nbsp;
									<a href="${pageContext.request.contextPath}/queryById?id=${emp.id}">更新</a>
								</td>
							</tr>
						</c:forEach>
					</table>
					<p>
						<a href="${pageContext.request.contextPath}/ems/addEmp.jsp">添加员工信息</a>
					</p>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
				ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
