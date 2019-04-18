package com.example.zhoukaolele.showcontract;

import com.android.volley.VolleyError;
import com.example.zhoukaolele.util.VolleyHttp;

/**
 * Time:2019/4/18
 * Author:秦超蒙
 * Description:
 */
public class MyModel implements ContractInteface.IShowModel {
    public static final String url="http://172.17.8.100/small/commodity/v1/commodityList";
    @Override
    public void toShow( final ModelCallBack callBack) {
        VolleyHttp.getInstance().VolleyGet(url, new VolleyHttp.VolleyCallBack() {
            @Override
            public void success(String names) {
                callBack.onSuccess(names);
            }

            @Override
            public void error(VolleyError error) {
callBack.onFail();
            }
        });
    }
}
