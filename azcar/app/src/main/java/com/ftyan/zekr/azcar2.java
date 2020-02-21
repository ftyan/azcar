package com.ftyan.zekr;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class azcar2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azcar2);

        final ImageButton play1=findViewById(R.id.r_play1);
        final ImageButton play2=findViewById(R.id.r_play2);


        final MediaPlayer mp1=MediaPlayer.create(this,R.raw.raq1);
        final MediaPlayer mp2=MediaPlayer.create(this,R.raw.raq2);


        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mp1.isPlaying()){
                    mp1.start();
                    play1.setImageResource(R.drawable.ic_pause);
                }else {
                    mp1.pause();


                }
            }
        });

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mp2.isPlaying()){
                    mp2.start();
                    play2.setImageResource(R.drawable.ic_pause);
                }else {
                    mp2.pause();

                }
            }
        });

    }

}