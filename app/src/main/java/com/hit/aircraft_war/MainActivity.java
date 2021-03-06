package com.hit.aircraft_war;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /**难度标志
     * 0简单，1普通，2困难
     * */
    public static int difficultChoice;

    public static int WIDTH;
    public static int HEIGHT;
    public int m;

    public static boolean bgmFlag;

    //获取屏幕宽高
    public void getScreenHW(){
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        //窗口宽度与宽度
        WIDTH = dm.widthPixels;
        HEIGHT = dm.heightPixels;

    }

    private Switch s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getScreenHW();

        s = (Switch) findViewById(R.id.soundSwitch);

        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    //选中时 do some thing
                    bgmFlag=true;
                    Toast.makeText(MainActivity.this,"选择是"+isChecked, Toast.LENGTH_SHORT).show();
                } else {
                    //非选中时 do some thing
                    bgmFlag=false;
                    Toast.makeText(MainActivity.this,"选择是"+isChecked,Toast.LENGTH_SHORT).show();
                }

            }
        });

        findViewById(R.id.soundSwitch).setOnClickListener(v -> {

            bgmFlag =true;
        });

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