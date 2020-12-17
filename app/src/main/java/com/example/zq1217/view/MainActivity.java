package com.example.zq1217.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.zq1217.R;
import com.example.zq1217.adapter.MainAdapter;
import com.example.zq1217.base.BaseActivity;
import com.example.zq1217.base.BasePresenter;
import com.example.zq1217.bean.MainBean;
import com.example.zq1217.constract.MainContract;
import com.example.zq1217.presenter.MainPresenter;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.MainView {

    private RecyclerView rlv;
    private ArrayList<MainBean.ResultsDTO> list;
    private MainAdapter adapter;

    @Override
    protected void initView() {
        rlv = findViewById(R.id.rlv);
        rlv.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        adapter = new MainAdapter(list, this);
        rlv.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        presenter.getdata();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainPresenter getPresenter() {
        return new MainPresenter();
    }

    @Override
    public void onScuess(MainBean mainBean) {
        list.addAll(mainBean.getResults());
        Log.e("TAG", "onScuess: " + mainBean.toString());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onFeil(String str) {

    }
}