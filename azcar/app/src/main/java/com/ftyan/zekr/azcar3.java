package com.ftyan.zekr;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class azcar3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azcar3);

        final ImageButton aplay=findViewById(R.id.aplay);
        final ImageButton bplay=findViewById(R.id.bplay);
        final ImageButton cplay=findViewById(R.id.cplay);
        final ImageButton dplay=findViewById(R.id.dplay);
        final ImageButton eplay=findViewById(R.id.eplay);
        final ImageButton fplay=findViewById(R.id.fplay);
        final ImageButton gplay=findViewById(R.id.gplay);
        final ImageButton hplay=findViewById(R.id.hplay);
        final ImageButton iplay=findViewById(R.id.iplay);
        final ImageButton jplay=findViewById(R.id.jplay);
        final ImageButton kplay=findViewById(R.id.kplay);
        final ImageButton lplay=findViewById(R.id.lplay);
        final ImageButton mplay=findViewById(R.id.mplay);
        final ImageButton allplay=findViewById(R.id.allplay);


        final MediaPlayer mpa=MediaPlayer.create(this,R.raw.a);
        final MediaPlayer mpb=MediaPlayer.create(this,R.raw.b);
        final MediaPlayer mpc=MediaPlayer.create(this,R.raw.c);
        final MediaPlayer mpd=MediaPlayer.create(this,R.raw.d);
        final MediaPlayer mpe=MediaPlayer.create(this,R.raw.e);
        final MediaPlayer mpf=MediaPlayer.create(this,R.raw.f);
        final MediaPlayer mpg=MediaPlayer.create(this,R.raw.g);
        final MediaPlayer mph=MediaPlayer.create(this,R.raw.h);
        final MediaPlayer mpi=MediaPlayer.create(this,R.raw.i);
        final MediaPlayer mpj=MediaPlayer.create(this,R.raw.j);
        final MediaPlayer mpk=MediaPlayer.create(this,R.raw.k);
        final MediaPlayer mpl=MediaPlayer.create(this,R.raw.l);
        final MediaPlayer mpm=MediaPlayer.create(this,R.raw.m);
        final MediaPlayer mpall=MediaPlayer.create(this,R.raw.all);



        aplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mpa.isPlaying()){
                    mpa.start();
                    aplay.setImageResource(R.drawable.ic_pause);
                }else {
                    mpa.pause();

                }
            }
        });

        bplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mpb.isPlaying()){
                    mpb.start();
                    bplay.setImageResource(R.drawable.ic_pause);
                }else {
                    mpb.pause();


                }
            }
        });



        cplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mpc.isPlaying()){
                    mpc.start();
                    cplay.setImageResource(R.drawable.ic_pause);
                }else {
                    mpc.pause();

                }
            }
        });


        dplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mpd.isPlaying()){
                    mpd.start();
                    dplay.setImageResource(R.drawable.ic_pause);
                }else {
                    mpd.pause();


                }
            }
        });



        eplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mpe.isPlaying()){
                    mpe.start();
                    eplay.setImageResource(R.drawable.ic_pause);
                }else {
                    mpe.pause();

                }
            }
        });



        fplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mpf.isPlaying()){
                    mpf.start();
                    fplay.setImageResource(R.drawable.ic_pause);
                }else {
                    mpf.pause();


                }
            }
        });


        gplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mpg.isPlaying()){
                    mpg.start();
                    gplay.setImageResource(R.drawable.ic_pause);
                }else {
                    mpg.pause();


                }
            }
        });


        hplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mph.isPlaying()){
                    mph.start();
                    hplay.setImageResource(R.drawable.ic_pause);
                }else {
                    mph.pause();


                }
            }
        });



        iplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mpi.isPlaying()){
                    mpi.start();
                    iplay.setImageResource(R.drawable.ic_pause);
                }else {
                    mpi.pause();

                }
            }
        });


        jplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mpj.isPlaying()){
                    mpj.start();
                    jplay.setImageResource(R.drawable.ic_pause);
                }else {
                    mpj.pause();

                }
            }
        });


        kplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mpk.isPlaying()){
                    mpk.start();
                    kplay.setImageResource(R.drawable.ic_pause);
                }else {
                    mpk.pause();

                }
            }
        });


        lplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mpl.isPlaying()){
                    mpl.start();
                    lplay.setImageResource(R.drawable.ic_pause);
                }else {
                    mpl.pause();


                }
            }
        });


        mplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mpm.isPlaying()){
                    mpm.start();
                    mplay.setImageResource(R.drawable.ic_pause);
                }else {
                    mpm.pause();


                }
            }
        });


        allplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mpall.isPlaying()){
                    mpall.start();
                    allplay.setImageResource(R.drawable.ic_pause);
                }else {
                    mpall.pause();


                }
            }
        });
    }
}