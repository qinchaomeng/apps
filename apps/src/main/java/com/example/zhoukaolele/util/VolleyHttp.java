package com.example.zhoukaolele.util;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.zhoukaolele.MyApp;

/**
 * Time:2019/4/18
 * Author:秦超蒙
 * Description:
 */
public class VolleyHttp {
    private static VolleyHttp volleyHttp=new VolleyHttp();
    //饿汉式
    public static VolleyHttp getInstance(){
        return volleyHttp;
    }

    //请求数据
    public void VolleyGet(String url, final VolleyCallBack mycallback){
        StringRequest stringRequest=new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
mycallback.success(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mycallback.error(error);
            }
        });
        stringRequest.setTag("volley");
        MyApp.getVolley().add(stringRequest);
    }

  public interface VolleyCallBack{
        void success(String names);
        void error(VolleyError error);
    }
}
