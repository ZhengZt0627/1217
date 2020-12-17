package com.example.zq1217.callback;

public interface IMainListenter<T> {
    public void onScuess(T t);
    public void onFeil(String msg);
}
