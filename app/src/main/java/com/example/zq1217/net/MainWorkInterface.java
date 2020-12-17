package com.example.zq1217.net;

import com.example.zq1217.callback.IMainListenter;

public interface MainWorkInterface {
    public <T> void get(String url, IMainListenter callback);
}
