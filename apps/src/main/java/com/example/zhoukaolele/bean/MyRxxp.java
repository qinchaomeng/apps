package com.example.zhoukaolele.bean;

import java.util.List;

/**
 * Time:2019/4/7
 * Author:秦超蒙
 * Description:
 */
public class MyRxxp {
    private List<News> commodityList;

    public MyRxxp(List<News> commodityList) {
        this.commodityList = commodityList;
    }

    public List<News> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<News> commodityList) {
        this.commodityList = commodityList;
    }

    @Override
    public String toString() {
        return "MyRxxp{" +
                "commodityList=" + commodityList +
                '}';
    }
}
