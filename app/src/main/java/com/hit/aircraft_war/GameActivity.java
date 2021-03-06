package com.hit.aircraft_war;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

import com.hit.aircraft_war.application.GameView;
import com.hit.aircraft_war.application.ImageManager;
import com.hit.aircraft_war.application.difficulty.EasyView;
import com.hit.aircraft_war.application.difficulty.HardView;
import com.hit.aircraft_war.application.difficulty.MediumView;

public class GameActivity extends AppCompatActivity {

    private GameView gameView;
    public static Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        handler = new MyHandler();

        //生成gameView

        if (MainActivity.difficultChoice == 0){
            gameView = new EasyView(this);
        }else if (MainActivity.difficultChoice == 1){
            gameView = new MediumView(this);
        }else {
            gameView = new HardView(this);
        }

        setContentView(gameView);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            this.finish();
        }
        return true;
    }

    class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg){
            if (msg.what == 0) {
                RankActivity.newSCore = (int) msg.obj;
                Intent intent = new Intent(GameActivity.this, RankActivity.class);
                startActivity(intent);
                finish();
            }
        }
    }
}