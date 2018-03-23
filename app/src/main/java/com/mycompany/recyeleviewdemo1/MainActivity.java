package com.mycompany.recyeleviewdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<MultiItemEntity> res;
    List<Levelzero> lv0 = new ArrayList<>();
    RecyclerView mrecycleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrecycleView = findViewById(R.id.rv);
        addData();
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        mrecycleView.setAdapter(new Adapter(res));
        mrecycleView.setLayoutManager(manager);
    }

    private void addData() {
        res = new ArrayList<>();
        lv0.clear();
        lv0.add(new Levelzero("我的好友"));
        lv0.add(new Levelzero("家人"));
        for(int i = 0;i<5;i++){
            Levelone lv1 = new Levelone("好友名称",R.drawable.doghead);
            lv0.get(0).addSubItem(lv1);
        }
        for(int i = 0;i<5;i++){
            Levelone lv1 = new Levelone("家人名称",R.drawable.doghead);
            lv0.get(1).addSubItem(lv1);
        }
        for (int j = 0; j < lv0.size(); j++) {
            res.add(lv0.get(j));
        }
        return ;
    }
}
