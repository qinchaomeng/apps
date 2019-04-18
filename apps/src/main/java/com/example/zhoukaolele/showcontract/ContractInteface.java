package com.example.zhoukaolele.showcontract;

/**
 * Time:2019/4/18
 * Author:秦超蒙
 * Description:
 */
public interface ContractInteface {
    //view
    public interface IShowView{
        void getPreData(String data);
    }
    //model
    public interface IShowModel{
        void toShow(ModelCallBack callBack);

        interface ModelCallBack{
            void onSuccess(String name);
            void onFail();
        }
    }
    //presenter
    public interface IShowPresenter{
        void getModel();
       void attch(IShowView view);
       void detch();
    }

}
