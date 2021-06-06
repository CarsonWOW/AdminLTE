<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="comm.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>

	<head>
		<!-- 页面meta -->
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">

		<title>数据 - AdminLTE2定制版</title>
		<meta name="description" content="AdminLTE2定制版">
		<meta name="keywords" content="AdminLTE2定制版">

		<!-- Tell the browser to be responsive to screen width -->
		<meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
		
	</head>

	<body class="hold-transition skin-purple sidebar-mini">

		<div class="wrapper">
			<!-- 页面头部 -->
			
						
			<jsp:include page="header.jsp"></jsp:include>
			<!-- 导航侧栏 -->
			<!-- 导航侧栏 -->
							
			<jsp:include page="sidebar.jsp"></jsp:include>
			<!-- 导航侧栏 /-->
			<!-- 内容区域 -->
		<div class="content-wrapper">

			<!-- 内容头部 -->
			<section class="content-header">
			<h1>
				产品管理 <small>产品表单</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="${pageContext.request.contextPath}/pages/index.jsp"><i
						class="fa fa-dashboard"></i> 首页</a></li>
				<li><a
					href="${pageContext.request.contextPath}/rest/product/AddProduct">产品管理</a></li>
				<li class="active">产品表单</li>
			</ol>
			</section>
			<!-- 内容头部 /-->

			<form action="${pageContext.request.contextPath}/rest/product/updateProduct"
				method="post">
				<!-- 正文区域 -->
				<section class="content"> <!--产品信息-->
					<%--修改需要id--%>
					<input type="hidden" class="form-control" name="id" value="${product.id}">
				<div class="panel panel-default">
					<div class="panel-heading">产品信息</div>
					<div class="row data-type">

						<div class="col-md-2 title">产品编号</div>
						<div class="col-md-4 data">
							<input type="text" class="form-control" name="productnum"
								placeholder="产品编号" value="${product.productnum}">
						</div>
						<div class="col-md-2 title">产品名称</div>
						<div class="col-md-4 data">
							<input type="text" class="form-control" name="productname"
								placeholder="产品名称" value="${product.productname}">
						</div>
						<div class="col-md-2 title">出发时间</div>
						<div class="col-md-4 data">
							<div class="input-group date">
								<div class="input-group-addon">
									<i class="fa fa-calendar"></i>
								</div>
								<input type="text" class="form-control pull-right"
									id="datepicker-a3" name="departuretime" value="${product.departuretime}">
							</div>
						</div>


						<div class="col-md-2 title">出发城市</div>
						<div class="col-md-4 data">
							<input type="text" class="form-control" name="cityname"
								placeholder="出发城市" value="${product.cityname}">
						</div>

						<div class="col-md-2 title">产品价格</div>
						<div class="col-md-4 data">
							<input type="text" class="form-control" placeholder="产品价格"
								name="productprice" value="${product.productprice}">
						</div>

						<div class="col-md-2 title">产品状态</div>
						<div class="col-md-4 data">
							<select class="form-control select2" style="width: 100%"
								name="productstatus">
								<c:if test="${product.productstatus==0}" var="flag">
									<option value="0" selected="selected">关闭</option>
									<option value="1">开启</option>
								</c:if>
								<c:if test="${!flag}">
									<option value="1" selected="selected">开启</option>
									<option value="0" >关闭</option>
								</c:if>


							</select>
						</div>

						<div class="col-md-2 title rowHeight2x">其他信息</div>
						<div class="col-md-10 data rowHeight2x">
							<textarea class="form-control" rows="3" placeholder="其他信息"
								name="productdesc" >${product.productdesc}</textarea>
						</div>

					</div>
				</div>
				<!--订单信息/--> <!--工具栏-->
				<div class="box-tools text-center">
					<button type="submit" class="btn bg-maroon">保存</button>
					<button type="button" class="btn bg-default"
						onclick="history.back(-1);">返回</button>
				</div>
				<!--工具栏/--> </section>
				<!-- 正文区域 /-->
			</form>
		</div>
		<!-- 内容区域 /-->
			<!-- 底部导航 -->
			<footer class="main-footer">
				<div class="pull-right hidden-xs">
					<b>Version</b> 1.0.8
				</div>
				<strong>Copyright &copy; 2028-2038 <a href="">研究院研发部</a>.</strong> All rights reserved.
			</footer>
			<!-- 底部导航 /-->
		</div>

		
		<script>
			$(document).ready(function() {
			            // 选择框
			            $(".select2").select2();
			
			            // WYSIHTML5编辑器
			            $(".textarea").wysihtml5({
			                locale: 'zh-CN'
			            });
			        });
			
			
			        // 设置激活菜单
			        function setSidebarActive(tagUri) {
			            var liObj = $("#" + tagUri);
			            if (liObj.length > 0) {
			                liObj.parent().parent().addClass("active");
			                liObj.addClass("active");
			            }
			        }
			
			
			        $(document).ready(function() {
			            // 激活导航位置
			            setSidebarActive("admin-index");
			        });
			        
			        $(document).ready(function() {
					// 激活导航位置
					setSidebarActive("order-manage");
					$("#datepicker-a3").datetimepicker({
						format : "yyyy-mm-dd hh:ii",
		
					});

		});
		</script>
	</body>

</html>
<!---->