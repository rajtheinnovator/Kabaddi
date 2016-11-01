package com.example.android.kabaddi;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;  //Initialize team A score
    int scoreTeamB = 0;  //Initialize team B score

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void raidingA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void superTackleA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void superRaid2A(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void superRaid3A(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void bonusA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void defendA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void foulA(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void technicalA(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int one) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(one));
    }

    //TAEM B METHODS


    public void raidingB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void superTackleB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void superRaid2B(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void superRaid3B(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void bonusB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void defendB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void foulB(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void technicalB(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamB(int one) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(one));
    }

    public void reset(View v) {
        String atReset = "";
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamB(0);
        displayForTeamA(0);
        TextView resultText = (TextView) findViewById(R.id.result);
        resultText.setText(String.valueOf(atReset));
        resetResultViewSize();
    }

    public void endGame(View V) {
        String result = "";
        if (scoreTeamA > scoreTeamB) {
            result = "A Won";
        } else if (scoreTeamA == scoreTeamB) {
            result = "Match Draw";
        } else {
            result = "B Won";

        }
        displayResult(result);
    }

    public void displayResult(String s) {
        TextView scoreView = (TextView) findViewById(R.id.result);
        TextView endGameParams = (TextView) findViewById(R.id.endGame);
        scoreView.getLayoutParams().height = endGameParams.getLayoutParams().height;
        scoreView.getLayoutParams().width = endGameParams.getLayoutParams().width;
        scoreView.setText(String.valueOf(s));
        scoreView.setTextColor(Color.BLACK);
        scoreView.setTextSize(16);
        scoreView.setBackgroundColor(Color.MAGENTA);
    }

    public void resetResultViewSize() {
        int height = 0;
        int width = 0;//your textview height
        TextView scoreView = (TextView) findViewById(R.id.result);
        scoreView.getLayoutParams().height = height;
        scoreView.getLayoutParams().width = width;
    }
}

