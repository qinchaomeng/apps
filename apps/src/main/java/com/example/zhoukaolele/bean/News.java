package com.example.zhoukaolele.bean;

/**
 * Time:2019/4/7
 * Author:秦超蒙
 * Description:
 */
public class News {

    private String commodityName;
    private String price;
    private String masterPic;

    public News(String commodityName, String price, String masterPic) {
        this.commodityName = commodityName;
        this.price = price;
        this.masterPic = masterPic;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMasterPic() {
        return masterPic;
    }

    public void setMasterPic(String masterPic) {
        this.masterPic = masterPic;
    }

    @Override
    public String toString() {
        return "News{" +
                "commodityName='" + commodityName + '\'' +
                ", price='" + price + '\'' +
                ", masterPic='" + masterPic + '\'' +
                '}';
    }
}
