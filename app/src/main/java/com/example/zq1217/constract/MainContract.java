package com.example.zq1217.constract;

import com.example.zq1217.base.BaseView;
import com.example.zq1217.bean.MainBean;
import com.example.zq1217.callback.IMainListenter;

public class MainContract {
    public interface MainView extends BaseView {
        void onScuess(MainBean mainBean);
        void onFeil(String str);
    }
    public interface MainModel{
        <T> void MainModel(String url, IMainListenter<T> callBack);
    }
    public interface MainPresenter extends BaseView{
        void getdata();
    }
}
