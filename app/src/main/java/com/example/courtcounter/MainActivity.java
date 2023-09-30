package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreForA=0,scoreForB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score){
        TextView scoreA=(TextView) findViewById(R.id.scoreA);
        scoreA.setText(String.valueOf(score));
    }
    public void add3A(View v){
        scoreForA=scoreForA+3;
        displayForTeamA(scoreForA);
    }
    public void add2A(View v){
        scoreForA=scoreForA+2;
        displayForTeamA(scoreForA);
    }
    public void add1A(View v){
        scoreForA=scoreForA+1;
        displayForTeamA(scoreForA);
    }
    public void displayForTeamB(int score){
        TextView scoreB=(TextView) findViewById(R.id.scoreB);
        scoreB.setText(String.valueOf(score));
    }
    public void add3B(View v){
        scoreForB=scoreForB+3;
        displayForTeamB(scoreForB);
    }
    public void add2B(View v){
        scoreForB=scoreForB+2;
        displayForTeamB(scoreForB);
    }
    public void add1B(View v){
        scoreForB=scoreForB+1;
        displayForTeamB(scoreForB);
    }
    public void reset(View v){
        scoreForA=0;
        scoreForB=0;
        displayForTeamA(scoreForA);
        displayForTeamB(scoreForB);
    }
}