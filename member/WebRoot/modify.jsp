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
  <h3>修改会员</h3>
    <form action="memberAction_modifyMember" method="post" name="f">
    <div>编号&nbsp;</div><div><input type="text"  name="member.mid" value="${member.mid }" readonly="readonly"></div><br>
    <div>姓名&nbsp;</div><div><input type="text"  name="member.mname" value="${member.mname }" readonly="readonly"></div><br>
    <div>联系电话&nbsp;</div><div><input type="text"  name="member.mphone" value="${member.mphone }"></div><br>
    <div>会员卡号&nbsp;</div><div><input type="text"  name="member.mcardno" value="${member.mcardno }"></div><br>
    <div>会员级别&nbsp;</div>
    <div><select class="input" name="member.mlevel">														
		<option value="1">一级</option>
		<option value="2">两级</option>
		<option value="3">三级</option>
		<option value="4">四级</option>
		</select></div>		
		<button type="submit" tabindex="5">提交</button>													
    </form>
  </body>
</html>
