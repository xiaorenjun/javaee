<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>SSHO Demo</title>
</head>

<body>
	<h1>会员管理系统</h1>
	
	<!-- 
	出现此异常java.lang.NoSuchMethodError: antlr.collections.AST.getLine()I
	是因为包 antlr-*.jar 冲突
	 -->

  <form action="memberAction_list" method="post" name="f">
    <input type="text" name="member.mname" placeholder="会员名" size="6">
    <input type="text" name="member.mcardno" placeholder="会员卡号">
    <input type="submit" value="查询">&nbsp;&nbsp;&nbsp;<a href="add.jsp" >新增</a>    
  </form>
  <br><br/>
	<table border="1">
	  <tr>
	    <th>序号</th>
	    <th>会员ID</th>
	    <th>姓名</th>
	    <th>联系电话</th>
	    <th>会员级别</th>
	    <th>入会时间</th>
	    <th>会员卡号</th>
	    <th colspan="2">操作</th>
	  </tr>
	  
	  <c:forEach var="member" items="${requestScope.members }" varStatus="rows">
	    <tr>
	      <td>${rows.index + 1 }</td>
	      <td>${member.mid }</td>
	      <td>${member.mname }</td>
	      <td>${member.mphone }</td>
	      <td>${member.mlevel }</td>
	      <td>${member.mintime }</td>
	      <td>${member.mcardno }</td>
	      <td>
					<form action="memberAction_findMember" method="post">
					<input type="hidden" name="member.mid" value="${member.mid }">
						<input type="submit" value="编辑">
					</form>
				</td>
				<td>
					<form action="memberAction_removeMember" method="post">
					<input type="hidden" name="member.mid" value="${member.mid }">
						<input type="submit" value="删除">
					</form>
				</td>
	    </tr>
	  </c:forEach>
	</table>
</body>
</html>
