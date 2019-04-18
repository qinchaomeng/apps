package com.example.zhoukaolele.showcontract;

/**
 * Time:2019/4/18
 * Author:秦超蒙
 * Description:
 */
public class MyPresenter implements ContractInteface.IShowPresenter {

    MyModel myModel;
    ContractInteface.IShowView iShowView;

    @Override
    public void getModel() {

    }

    @Override
    public void attch(ContractInteface.IShowView view) {
myModel=new MyModel();
this.iShowView=view;

myModel.toShow(new ContractInteface.IShowModel.ModelCallBack() {
    @Override
    public void onSuccess(String name) {
        iShowView.getPreData(name);
    }

    @Override
    public void onFail() {

    }
});
    }

    @Override
    public void detch() {
if (iShowView!=null){
    iShowView=null;
}
if (myModel!=null){
    myModel=null;
}
System.gc();
    }
}
