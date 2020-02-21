package com.ftyan.zekr;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class azcar1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azcar1);


        final ImageButton play1= findViewById(R.id.play1);
        final  ImageButton play2= findViewById(R.id.play2);
        final  ImageButton play3= findViewById(R.id.play3);
        final  ImageButton play4= findViewById(R.id.play4);
        final  ImageButton play5= findViewById(R.id.play5);



        final MediaPlayer mp1 = MediaPlayer.create(this,R.raw.mor);
        final MediaPlayer mp2 = MediaPlayer.create(this,R.raw.morn);
        final MediaPlayer mp3 = MediaPlayer.create(this,R.raw.morn0);
        final MediaPlayer mp4 = MediaPlayer.create(this,R.raw.sleep);
        final MediaPlayer mp5 = MediaPlayer.create(this,R.raw.pray);


        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mp1.isPlaying()){
                    mp1.start();
                    play1.setImageResource(R.drawable.ic_pause);

                }else{
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

                }else{
                    mp2.pause();


                }
            }
        });

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mp3.isPlaying()){
                    mp3.start();
                    play3.setImageResource(R.drawable.ic_pause);

                }else{
                    mp3.pause();

                }
            }
        });

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mp4.isPlaying()){
                    mp4.start();


                }else{
                    mp4.pause();


                }
            }
        });

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mp5.isPlaying()){
                    mp5.start();
                    play5.setImageResource(R.drawable.ic_pause);

                }else{
                    mp5.pause();


                }
            }
        });



    }

}