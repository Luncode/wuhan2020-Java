package test;

import Model.news;
import Util.HttpUtil;
import Model.overAll;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;


public class test {
	//https://lab.isaaclin.cn/nCoV/api/overall
	public static void main(String[] args) {
		String baseurl = "https://lab.isaaclin.cn/nCoV";
		HttpUtil httpUtil = new HttpUtil();
		String overAllData=httpUtil.HttpGet(baseurl+"/api/overall");
		overAll overall = new Gson().fromJson(overAllData,overAll.class);
		List<overAll.ResultsBean> list = overall.getResults();
		for (overAll.ResultsBean s: list ) {

			System.out.println("全国疫情信息概览："+s.getCountRemark());
			System.out.println("病毒名称："+s.getVirus());
			System.out.println("传播途径："+s.getPassWay());
			System.out.println("传染源："+s.getInfectSource());
			System.out.println(s.getRemark1());
			System.out.println(s.getRemark2());
			System.out.print("确诊人数："+s.getConfirmedCount());
			System.out.print("\t治愈人数："+s.getCuredCount());
			System.out.print("\t死亡人数："+s.getDeadCount()+"\n");
			System.out.println("最后更新时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(s.getUpdateTime()));

		}

		System.out.println("------------------------相关最新新闻-----------------------------");
		String allnews = httpUtil.HttpGet(baseurl+"/api/news?num=all");
		news news = new Gson().fromJson(allnews, Model.news.class);
		List<news.ResultsBean> list2 = news.getResults();
		for (int i = 0;i<list2.size();i++) {
			System.out.println("新闻标题："+list2.listIterator(i).next().getTitle());
			System.out.println("新闻内容概述："+list2.listIterator(i).next().getSummary());
			System.out.println("数据来源："+list2.listIterator(i).next().getInfoSource());
			System.out.println("来源链接："+list2.listIterator(i).next().getSourceUrl());
			System.out.println("发布时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(list2.listIterator(i).next().getPubDate()));
			System.out.println("-------------------------------------------------------");
		}
	}
}
