package com.example.zhoukaolele.bean;

/**
 * Time:2019/4/7
 * Author:秦超蒙
 * Description:
 */
public class MyResult {
    private MyRxxp rxxp;
    private MyPzsh pzsh;
    private MyMlss mlss;

    public MyResult(MyRxxp rxxp, MyPzsh pzsh, MyMlss mlss) {
        this.rxxp = rxxp;
        this.pzsh = pzsh;
        this.mlss = mlss;
    }

    public MyRxxp getRxxp() {
        return rxxp;
    }

    public void setRxxp(MyRxxp rxxp) {
        this.rxxp = rxxp;
    }

    public MyPzsh getPzsh() {
        return pzsh;
    }

    public void setPzsh(MyPzsh pzsh) {
        this.pzsh = pzsh;
    }

    public MyMlss getMlss() {
        return mlss;
    }

    public void setMlss(MyMlss mlss) {
        this.mlss = mlss;
    }

    @Override
    public String toString() {
        return "MyResult{" +
                "rxxp=" + rxxp +
                ", pzsh=" + pzsh +
                ", mlss=" + mlss +
                '}';
    }
}
