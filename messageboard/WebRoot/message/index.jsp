<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML >
<html>
<head>
<title>My JSP 'login.jsp' starting page</title>
<meta charset="UTF-8">
</head>
  <body>
    
    <form action="addMessage.html" method="post" name="f">
    	<table align="center" border=0 style="border-collapse:separate; border-spacing:0px 10px;padding:10px">
    		<tr><td>业务种类:</td>
    		<td><select name="mbtype">
    			<option>请选择</option>
    			<option value="信用卡">信用卡</option>
    			<option value="其他业务">其他业务</option>
    		</select></td></tr>
    		
    		<tr><td>留言类型:</td> 
    		<td><input type="radio" name="mbclass" value=1>咨询
    		<input type="radio" name="mbclass" value=2>建议
    		<input type="radio" name="mbclass" value=3>投诉
    		<input type="radio" name="mbclass" value=4>表扬</td></tr>
    		
    		<tr><td>所在地区</td> 
    		<td><select name="mbarea"><option value="湖南省">湖南省</option>
    		<option value="四川省">四川省</option>
    		<option value="天津市">天津市</option>
    		</select>
    		<select name="mbarea"><option value="长沙市">长沙市</option>
    		<option value="成都市">成都市</option>
    		<option value="天津市">天津市</option>
    		</select>
    		</td></tr>
    		
    		<tr><td>您的留言:</td> 
    		<td><input type="text" name="message" style="height:120px;width:300"></td></tr>
    		<tr><td colspan="2"></td></tr>
    		
    		<tr><td colspan="2"><input type="radio" name="rtype" value=1>邮件回复
    		<input type="radio" name="rtype" value=2>电话回复
    		<input type="radio" name="rtype" value=3>无需回复</td></tr>
    		
    		<tr><td>您的姓名:</td> <td><input type="text" name="mname"></td></tr>
    		<tr><td><input type="submit" value="提交"></td></tr>
    	</table>
    	
    </form>
  </body>

  
</html>
