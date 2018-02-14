package com.example.android.futbolcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int yellowCardTeamA = 0;
    int redCardTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayGoalForTeamA(scoreTeamA);
        displayYellowCardsForTeamA(yellowCardTeamA);
        displayRedCardsForTeamA(redCardTeamA);
    }


    /**
     * reset all the scores for Team A.
     */
    public void resetAllScores(View v) {
        scoreTeamA = 0;
        yellowCardTeamA = 0;
        redCardTeamA = 0;

        displayGoalForTeamA(scoreTeamA);
        displayYellowCardsForTeamA(yellowCardTeamA);
        displayRedCardsForTeamA(redCardTeamA);
    }

    /**
     * Minus one on the given red card for Team A.
     */
    public void minusRedCardForTeamA(View v) {
        if (redCardTeamA <= 0){
            redCardTeamA = 0;
        } else {
            redCardTeamA = redCardTeamA - 1;
        }
        displayRedCardsForTeamA(redCardTeamA);
    }

    /**
     * Plus one on the given red card for Team A.
     */
    public void oneRedCardForTeamA(View v) {
        redCardTeamA = redCardTeamA + 1;
        displayRedCardsForTeamA(redCardTeamA);
    }

    /**
     * Displays the given red cards for Team A.
     */
    public void displayRedCardsForTeamA(int score) {
        TextView redCardsView = (TextView) findViewById(R.id.red_cards_team_a);
        redCardsView.setText(String.valueOf(redCardTeamA));
    }

    /**
     * Minus one on the given yellow card for Team A.
     */
    public void minusYellowCardForTeamA(View v) {
        if (yellowCardTeamA <= 0){
            yellowCardTeamA = 0;
        } else {
            yellowCardTeamA = yellowCardTeamA - 1;
        }
        displayYellowCardsForTeamA(yellowCardTeamA);
    }

    /**
     * Plus one on the given yellow card for Team A.
     */
    public void oneYellowCardForTeamA(View v) {
        yellowCardTeamA = yellowCardTeamA + 1;
        displayYellowCardsForTeamA(yellowCardTeamA);
    }

    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayYellowCardsForTeamA(int score) {
        TextView yellowCardsView = (TextView) findViewById(R.id.yellow_cards_team_a);
        yellowCardsView.setText(String.valueOf(yellowCardTeamA));
    }

    /**
     * Minus one on the given score for Team A.
     */
    public void minusOneGoalForTeamA(View v) {
        if (scoreTeamA <= 0){
            scoreTeamA = 0;
        } else {
            scoreTeamA = scoreTeamA - 1;
            displayGoalForTeamA(scoreTeamA);
        }
    }

    /**
     * Plus one on the given score for Team A.
     */
    public void oneGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayGoalForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goals_team_a);
        scoreView.setText(String.valueOf(scoreTeamA));
    }
}
