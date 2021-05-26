package com.websarva.wings.andoroid.shindantest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    String[] result = {
            "学級崩壊タイプ",
            "学級崩壊気味タイプ",
            "つまらない先生タイプ",
            "つまらない先生タイプ",
            "なんとか先生タイプ",
            "なんとか先生タイプ",
            "ふつう先生タイプ",
            "よき先生タイプ",
            "すばらしい先生タイプ"
    };

    String[] reTest = {
            "違う仕事をすすめます",
            "少し厳しいです",
            "辛いかもしれません",
            "辛いかもしれません",
            "頑張り次第です",
            "頑張り次第です",
            "先生いいと思います",
            "適性が高いです",
            "天職だと思います"
    };

    int[] reImg = {
            R.drawable.p0,
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        int score = getIntent().getIntExtra("score",0);

        if(score < -7){
            score = 0;
        }else{
            score = (score + 6)/2;
        }

        ((TextView)findViewById(R.id.tvResult)).setText(result[score]);
        ((TextView)findViewById(R.id.tvReText)).setText(reTest[score]);
        ((ImageView)findViewById(R.id.ivReImg)).setImageResource(reImg[score]);
    }
}