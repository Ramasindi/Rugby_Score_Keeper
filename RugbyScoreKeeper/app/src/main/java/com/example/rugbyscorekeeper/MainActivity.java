package com.example.rugbyscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    int scoreTeamA = 0;
    public void displayForTeamA(int score) {
        TextView scoreView =  findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    //This method is for adding five points for penalty try
    public void penaltyTryA(View v){
        scoreTeamA += 5;
        displayForTeamA(scoreTeamA);
    }
    //This method is for adding three points for penalty goal
    public void penaltyGoalA(View v){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    //This method is for adding five points for a try score
    public void tryScoreA(View v){
        scoreTeamA += 5;
        displayForTeamA(scoreTeamA);
    }
    //This method is for adding two points for conversion score
    public void conversionA(View v){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     *Displays the given score for Team B
     */
    int scoreTeamB = 0;
    public void displayForTeamB(int score) {
        TextView scoreView =  findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    //This method is for adding five points for penalty try
    public void penaltyTryB(View v){
        scoreTeamB += 5;
        displayForTeamB(scoreTeamB);
    }
    //This method is for adding three points for penalty goal
    public void penaltyGoalB(View v){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    //This method is for adding five points for a try
    public void tryScoreB(View v){
        scoreTeamB += 5;
        displayForTeamB(scoreTeamB);
    }
    //This method is for adding two points for a conversion score
    public void conversionB(View v){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    // Method for resetting the score
    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
