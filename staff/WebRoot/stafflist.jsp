<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>Staff MS</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/easyui/themes/icon.css" />
<script
	src="${pageContext.request.contextPath }/resources/easyui/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath }/resources/easyui/jquery.easyui.min.js"></script>
<script
	src="${pageContext.request.contextPath }/resources/easyui/locale/easyui-lang-zh_CN.js"></script>
</head>

<body>
	<h1>Staff MS</h1>
	<h3>easyui - SpringMVC - Spring - Mybatis - Oracle</h3>

	<div style="margin: 10px 30px">

		<div style="margin-top: 10px;margin-right: 20px">
			<table id="staffDataGrid">

			</table>
		</div>
	</div>
	<script type="text/javascript">
	  $(function(){
		$("#staffDataGrid").datagrid({
		url : "staffController_list.html",
        title : '员工信息列表',
        fitColumns : true, 
        striped : true,    
        rownumbers : true, 
        columns:[[{ 
          field : 'id',  // field 名必需与json中的名一致
          title : '编号',
          width : 50,
          length:200,
          checkbox : true,
          sortable : true
        }, {
          field : 'ename',
          title : '姓名',
          width : 500,
          length:200,
          sortable : true,
        }, {
          field : 'job',
          title : '职位',
          width : 500,
          length:200,
          sortable : true,
        }, {
         field : 'dname',
         title : '部门名称',
         width : 500,
         length:200,
         sortable : true,
       }, {
         field : 'loc',
         title : '部门所在地',
         width : 500,
         length:200,
         sortable : true,
       }, {
         field : 'sal',
         title : '工资',
         width : 500,
         length:200,
         sortable : true,
       }]],
       toolbar : "#searchCarForm",
       pagination : true, 
       pageSize : 5,
       pageList : [5, 10, 15, 20, 50 ],
       sortName : "sal", 
       sortOrder : "desc", 
		  });
	  });
	</script>
</body>
</html>