package com.example.zq1217.presenter;

import com.example.zq1217.base.BasePresenter;
import com.example.zq1217.bean.MainBean;
import com.example.zq1217.callback.IMainListenter;
import com.example.zq1217.constract.MainContract;
import com.example.zq1217.model.MainModel;

public class MainPresenter extends BasePresenter<MainContract.MainView> implements MainContract.MainPresenter {
    private MainContract.MainModel mainModel;

    public MainPresenter() {
        this.mainModel = new MainModel();
    }

    @Override
    public void getdata() {
        mainModel.MainModel("%E7%A6%8F%E5%88%A9/20/19", new IMainListenter<MainBean>() {
            @Override
            public void onScuess(MainBean mainBean) {
                iView.onScuess(mainBean);
            }

            @Override
            public void onFeil(String msg) {

            }
        });

    }
}