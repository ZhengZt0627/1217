package com.example.zq1217.model;

import com.example.zq1217.callback.IMainListenter;
import com.example.zq1217.constract.MainContract;
import com.example.zq1217.net.RetrofitUtil;

public class MainModel implements MainContract.MainModel {
    @Override
    public <T> void MainModel(String url, IMainListenter<T> callBack) {
        RetrofitUtil.getInstance().get(url,callBack);
    }
}
