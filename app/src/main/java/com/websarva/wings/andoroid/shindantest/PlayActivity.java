package com.websarva.wings.andoroid.shindantest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class PlayActivity extends AppCompatActivity {

    String[] question = {
            "わたしは元気がある",
            "少し太り気味である",
            "せっかちである",
            "口喧嘩は強いほう",
            "子供が好き",
            "１人でいる方が好き",
            "いじられやすい",
            "よく気がつく",
            "あまりおこれない",
            "役者になりきれる"
    };

    int[] yes = {1,-1,1,1,1,-1,-1,1,-1,1};

    int count = 1;
    int r = 0;
    int score =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        //r = new Random().nextInt(question.length);//
        ((TextView)findViewById(R.id.tvQuestion)).setText(question[r]);
    }

    public void onYes (View view){
        count++;
        score += yes[r];
        r++;
        if(count < 11){
            ((TextView)findViewById(R.id.tvCount)).setText("第"+ count + "問");
            //出題//
            //r = new Random().nextInt(question.length);//
            ((TextView)findViewById(R.id.tvQuestion)).setText(question[r]);

        } else {
            Intent intent = new Intent(this,ResultActivity.class);
            intent.putExtra("score",score);
            startActivity(intent);
            finish();
        }
    }

    public void onNo (View view){
        count++;
        score -= yes[r];
        r++;
        if(count < 11){
            ((TextView)findViewById(R.id.tvCount)).setText("第"+ count + "問");
            //出題//
            //r = new Random().nextInt(question.length);//
            ((TextView)findViewById(R.id.tvQuestion)).setText(question[r]);

        } else {
            Intent intent = new Intent(this,ResultActivity.class);
            intent.putExtra("score",score);
            startActivity(intent);
            finish();
        }
    }
}