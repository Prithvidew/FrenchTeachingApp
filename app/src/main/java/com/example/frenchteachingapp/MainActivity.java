package com.example.frenchteachingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnblack, btnred, btngreen, btnpurple, btnyellow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnblack = findViewById(R.id.btnblack);
        btngreen = findViewById(R.id.btngreen);
        btnpurple =  findViewById(R.id.btnpurple);
        btnred = findViewById(R.id.btnred);
        btnyellow = findViewById(R.id.btnyellow);


        btnred.setOnClickListener(this);
        btnblack.setOnClickListener(this);
        btnyellow.setOnClickListener(this);
        btnpurple.setOnClickListener(this);
        btngreen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//find the button by ID and play the correct  sound

        int ClickedBtnId = view.getId();

        if (ClickedBtnId == R.id.btnred){
            PlaySounds(R.raw.red);
        }else if (ClickedBtnId == R.id.btnpurple){
            PlaySounds(R.raw.purple);
        }else if (ClickedBtnId == R.id.btngreen){
            PlaySounds(R.raw.green);
        }else if (ClickedBtnId == R.id.btnyellow){
            PlaySounds(R.raw.yellow);
        }else if (ClickedBtnId == R.id.btnblack){
            PlaySounds(R.raw.black);
        }


    }
    public void PlaySounds(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,
               id
        );
        mediaPlayer.start();

    }
}
