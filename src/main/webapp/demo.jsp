<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>demo</title>

<jsp:include page="resources/cite/layui.jsp"></jsp:include>
</head>
<body>
<table class="layui-hide" id="dept-table"></table>

<script>
layui.use('table', function(){
  var table = layui.table;
  
  table.render({
    elem: '#dept-table'
    ,url:'dept/tableInfos.do'
    ,cellMinWidth: 200 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
    ,cols: [[
      {field:'deptno', width:200, title: '部门id', sort: true}
      ,{field:'dname', width:200, title: '名称'}
      ,{field:'loc', title: '城市', sort: true}
    ]]
  });
});
</script>
</body>
</html>