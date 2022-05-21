package com.hit.aircraft_war;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hit.aircraft_war.RankPack.RankAdapter;
import com.hit.aircraft_war.RankPack.RankMember;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RankActivity extends AppCompatActivity {

    public static int newSCore;

    private RecyclerView recyclerView;
    private RankAdapter rankAdapter;

    private List<RankMember> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);

        Date currentDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = dateFormat.format(currentDate);

        initData();
        recyclerView = findViewById(R.id.rank_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        rankAdapter = new RankAdapter(dataList);
        recyclerView.setAdapter(rankAdapter);


    }

    private void initData() {
        dataList = new ArrayList<>();
        dataList.add(new RankMember(1,"Lisa",1000,"2020.5.21"));
        dataList.add(new RankMember(2,"Lisa",800,"2020.5.21"));
        dataList.add(new RankMember(3,"Lisa",600,"2020.5.21"));
        dataList.add(new RankMember(4,"Lisa",400,"2020.5.21"));
        dataList.add(new RankMember(5,"Lisa",200,"2020.5.21"));
        dataList.add(new RankMember(6,"Lisa",0,"2020.5.21"));
    }

}