package com.hit.aircraft_war;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /**难度标志
     * 0简单，1普通，2困难
     * */
    public static int difficultChoice;

    public static int WIDTH;
    public static int HEIGHT;

    //获取屏幕宽高
    public void getScreenHW(){
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        //窗口宽度与宽度
        WIDTH = dm.widthPixels;
        HEIGHT = dm.heightPixels;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getScreenHW();

        findViewById(R.id.main_easyButton).setOnClickListener(v -> {
            difficultChoice = 0;
            Intent intent = new Intent(this, GameActivity.class);
            startActivity(intent);
            finish();
        });

        findViewById(R.id.main_mediumButton).setOnClickListener(v -> {
            difficultChoice = 1;
            Intent intent = new Intent(this, GameActivity.class);
            startActivity(intent);
            finish();
        });

        findViewById(R.id.main_hardButton).setOnClickListener(v -> {
            difficultChoice = 2;
            Intent intent = new Intent(this, GameActivity.class);
            startActivity(intent);
            finish();
        });
    }
}