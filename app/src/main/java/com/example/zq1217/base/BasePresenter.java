package com.example.zq1217.base;

public class BasePresenter<V extends BaseView> {
    public V iView;
    public void attachView(V v){
        iView = v;
    }
}
