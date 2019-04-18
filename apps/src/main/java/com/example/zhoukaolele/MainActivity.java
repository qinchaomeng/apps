package com.example.zhoukaolele;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;


import com.example.zhoukaolele.adapter.HeAdapter;
import com.example.zhoukaolele.adapter.MyAdapter;
import com.example.zhoukaolele.bean.MyMlss;
import com.example.zhoukaolele.bean.MyPzsh;
import com.example.zhoukaolele.bean.MyRxxp;
import com.example.zhoukaolele.bean.News;
import com.example.zhoukaolele.bean.Product;


import com.example.zhoukaolele.showcontract.ContractInteface;
import com.example.zhoukaolele.showcontract.MyPresenter;
import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ContractInteface.IShowView {

    private RecyclerView recy_view,recy_view1,recy_view2;
private ContractInteface.IShowPresenter presenter;
    private MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化
        recy_view = findViewById(R.id.recy_view1);
         recy_view1 = findViewById(R.id.recy_view2);
        recy_view2= findViewById(R.id.recy_view3);
        presenter=new MyPresenter();
       presenter.attch(this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recy_view.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void getPreData(String data) {
Gson gson=new Gson();
        Product product = gson.fromJson(data, Product.class);
        List<News> commodityList = product.getResult().getRxxp().getCommodityList();
        List<News> commodityList1 = product.getResult().getPzsh().getCommodityList();
        myAdapter=new MyAdapter(commodityList,MainActivity.this);
        HeAdapter heAdapter=new HeAdapter(commodityList1,this);
        recy_view.setAdapter(myAdapter);
        recy_view1.setAdapter(heAdapter);


    }
}
