package com.lco.paino;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
   private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
   private SoundPool soundPool;
   int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14;
   LinearLayout li;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b2=findViewById(R.id.bw2);
        b3=findViewById(R.id.bw3);
        b1=findViewById(R.id.btn);
        b4=findViewById(R.id.bw4);
        b5=findViewById(R.id.bw5);
        b6=findViewById(R.id.bw6);
        b7=findViewById(R.id.bw7);
        b8=findViewById(R.id.bw8);
        b9=findViewById(R.id.bw9);
        b10=findViewById(R.id.bw10);
        b11=findViewById(R.id.bw11);
        b12=findViewById(R.id.bw12);
        b13=findViewById(R.id.bw13);
        b14=findViewById(R.id.bw14);

        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
            AudioAttributes audioAttributes=new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool=new SoundPool.Builder()
                    .setMaxStreams(11)
                    .setAudioAttributes(audioAttributes).build();
        }
        else{
            soundPool=new SoundPool(11, AudioManager.STREAM_MUSIC,0);
        }

        s1=soundPool.load(this,R.raw.one,1);
        s2=soundPool.load(this,R.raw.two,1);
        s3=soundPool.load(this,R.raw.three,1);
        s4=soundPool.load(this,R.raw.four,1);
        s5=soundPool.load(this,R.raw.five,1);
        s6=soundPool.load(this,R.raw.six,1);
        s7=soundPool.load(this,R.raw.seven,1);
        s8=soundPool.load(this,R.raw.eight,1);
        s9=soundPool.load(this,R.raw.nine,1);
        s10=soundPool.load(this,R.raw.ten,1);
        s11=soundPool.load(this,R.raw.elven,1);
        s12=soundPool.load(this,R.raw.one,1);
        s13=soundPool.load(this,R.raw.two,1);
        s14=soundPool.load(this,R.raw.three,1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s1,1,1,0,0,1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s2,1,1,0,0,1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s3,1,1,0,0,1);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s4,1,1,0,0,1);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s5,1,1,0,0,1);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s6,1,1,0,0,1);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s7,1,1,0,0,1);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s8,1,1,0,0,1);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s9,1,1,0,0,1);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s10,1,1,0,0,1);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s11,1,1,0,0,1);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s12,1,1,0,0,1);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s13,1,1,0,0,1);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(s14,1,1,0,0,1);
            }
        });


    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        soundPool.release();
        soundPool=null;
    }

}
