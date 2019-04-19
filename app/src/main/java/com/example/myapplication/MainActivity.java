package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jcodecraeer.xrecyclerview.XRecyclerView;

public class MainActivity extends AppCompatActivity {

    private XRecyclerView mXre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //孙家圆上传范德萨发生

    }

    private void initView() {
        mXre = (XRecyclerView) findViewById(R.id.xre);
    }
}
