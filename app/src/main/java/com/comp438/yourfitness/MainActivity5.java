package com.comp438.yourfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    private int seconds = 0 ;
    private boolean running = false ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        CheckSaveInstance(savedInstanceState);
        runTimer();

        LinearLayout currentLayout =
                (LinearLayout) findViewById(R.id.main_layout);
        currentLayout.setBackgroundColor(Color.BLACK);
    }

    public void ResetimerClick(View view) {
        running = false ;
        seconds = 0 ;
    }

    public void StopTimerClick(View view) {
        running = false;
    }

    public void StartTimerClick(View view) {
        running = true ;
    }

    private void CheckSaveInstance(Bundle savedInstanceState) {
        if(savedInstanceState!=null){

            seconds = savedInstanceState.getInt("sec");
            running = savedInstanceState.getBoolean("run");
        }
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("sec",seconds);
        outState.putBoolean("run",running);
    }

    private void runTimer(){
        final TextView txtTime = findViewById(R.id.txtTime);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600) / 60;
                int secs = seconds%60;
                String time = hours +" : " + minutes + " : " + secs;
                txtTime.setText(time);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this, 1000);

            }
        });
    }
}