<%@ page contentType="text/html; UTF-8" pageEncoding="UTF-8" language="java" %><html>
<%@ page import="Util.HttpUtil" %>
<%@ page import="com.google.gson.Gson" %>
<%@ page import="Model.overAll" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>
<head>
    <title>全国疫情信息</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <link href="https://netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
<div class="alert alert-danger" role="alert">
    <h2 align="center">全国疫情信息查看<i class="fa fa-bug"></i></h2>
</div>
<%
    String baseurl = "https://lab.isaaclin.cn/nCoV";
    HttpUtil httpUtil = new HttpUtil();
    String overAllData=httpUtil.HttpGet(baseurl+"/api/overall");
    overAll overall = new Gson().fromJson(overAllData,overAll.class);
    List<overAll.ResultsBean> list = overall.getResults();
    for (overAll.ResultsBean s: list ) {
%>
<div class="container" style="text-align: center;margin-bottom: 10px;">
    <div class="row">
        <div class="col-xs-6 col-sm-3"><h4><span class="label label-danger">确诊人数：<%=s.getConfirmedCount()%></span></h4></div>
        <div class="col-xs-6 col-sm-3"><h4><span class="label label-warning">疑似人数：<%=s.getSuspectedCount()%></span></h4></div>
        <div class="col-xs-6 col-sm-3"><h4><span class="label label-success">治愈人数：<%=s.getCuredCount()%></span></h4></div>
        <div class="col-xs-6 col-sm-3"><h4><span class="label label-default">死亡人数：<%=s.getDeadCount()%></span></h4></div>
    </div>
</div>
<div class="container">
    <h5><i class="fa fa-bug"></i>病毒名称：<%=s.getVirus()%></h5>
    <h5><i class="fa fa-certificate"></i>传播途径：<%=s.getPassWay()%></h5>
    <h5><i class="fa fa-linode"></i>传染源：<%=s.getInfectSource()%></h5>
    <h5><i class="fa fa-users"></i>易感人群: <%=s.getRemark1()%></h5>
    <h5><i class="fa fa-warning"></i>潜伏期: <%=s.getRemark2()%></h5>
    <h5><i class="fa fa-clock-o"></i>最后更新时间：<%=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(s.getUpdateTime())%></h5>
</div>
<%}%>
<div class="container">
    <p align="center">其他功能开发中</p>
    <p align="center">开发者:Luncode</p>
    <p align="center">API来自BlankerL开源项目DXY-2019-nCoV-Crawler</p>
</div>
</body>
</html>