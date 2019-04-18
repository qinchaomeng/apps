package com.example.zhoukaolele.bean;

import java.util.List;

/**
 * Time:2019/4/7
 * Author:秦超蒙
 * Description:
 */
public class MyPzsh {
    private List<News> commodityList;

    public MyPzsh(List<News> commodityList) {
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
        return "MyPzsh{" +
                "commodityList=" + commodityList +
                '}';
    }
}
