package com.example.zhoukaolele.bean;

/**
 * Time:2019/4/7
 * Author:秦超蒙
 * Description:
 */
public class Product {
    private MyResult result;

    public Product(MyResult result) {
        this.result = result;
    }

    public MyResult getResult() {
        return result;
    }

    public void setResult(MyResult result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "result=" + result +
                '}';
    }
}
