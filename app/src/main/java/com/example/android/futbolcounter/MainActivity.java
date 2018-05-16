package com.example.android.futbolcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int yellowCardTeamA = 0;
    int redCardTeamA = 0;
    int scoreTeamB = 0;
    int yellowCardTeamB = 0;
    int redCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showNamesTeams();

    }

    /**
     * reset all the scores for Team A.
     */
    public void resetAllScores(View v) {
        scoreTeamA = 0;
        yellowCardTeamA = 0;
        redCardTeamA = 0;
        scoreTeamB = 0;
        yellowCardTeamB = 0;
        redCardTeamB = 0;

        displayGoalForTeamA(scoreTeamA);
        displayYellowCardsForTeamA(yellowCardTeamA);
        displayRedCardsForTeamA(redCardTeamA);
        displayGoalForTeamB(scoreTeamB);
        displayYellowCardsForTeamB(yellowCardTeamB);
        displayRedCardsForTeamB(redCardTeamB);


        showNamesTeams();
        TextView placeholderTeamA = (TextView) findViewById(R.id.edit_text_team_a_name);
        TextView placeholderTeamB = (TextView) findViewById(R.id.edit_text_team_b_name);
        placeholderTeamA.setText("");
        placeholderTeamB.setText("");
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
        if (redCardTeamA >= 11){
            redCardTeamA = 11;
        } else{
            redCardTeamA = redCardTeamA + 1;
        }
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

    /**
     * Minus one on the given red card for Team B.
     */
    public void minusRedCardForTeamB(View v) {
        if (redCardTeamB <= 0){
            redCardTeamB = 0;
        } else {
            redCardTeamB = redCardTeamB - 1;
        }
        displayRedCardsForTeamB(redCardTeamB);
    }

    /**
     * Plus one on the given red card for Team B.
     */
    public void oneRedCardForTeamB(View v) {
        if (redCardTeamB >= 11){
            redCardTeamB = 11;
        } else{
            redCardTeamB = redCardTeamB + 1;
        }
        displayRedCardsForTeamB(redCardTeamB);
    }

    /**
     * Displays the given red cards for Team B.
     */
    public void displayRedCardsForTeamB(int score) {
        TextView redCardsView = (TextView) findViewById(R.id.red_cards_team_b);
        redCardsView.setText(String.valueOf(redCardTeamB));
    }

    /**
     * Minus one on the given yellow card for Team B.
     */
    public void minusYellowCardForTeamB(View v) {
        if (yellowCardTeamB <= 0){
            yellowCardTeamB = 0;
        } else {
            yellowCardTeamB = yellowCardTeamB - 1;
        }
        displayYellowCardsForTeamB(yellowCardTeamB);
    }

    /**
     * Plus one on the given yellow card for Team B.
     */
    public void oneYellowCardForTeamB(View v) {
        yellowCardTeamB = yellowCardTeamB + 1;
        displayYellowCardsForTeamB(yellowCardTeamB);
    }

    /**
     * Displays the given yellow cards for Team B.
     */
    public void displayYellowCardsForTeamB(int score) {
        TextView yellowCardsView = (TextView) findViewById(R.id.yellow_cards_team_b);
        yellowCardsView.setText(String.valueOf(yellowCardTeamB));
    }

    /**
     * Minus one on the given score for Team B.
     */
    public void minusOneGoalForTeamB(View v) {
        if (scoreTeamB <= 0){
            scoreTeamB = 0;
        } else {
            scoreTeamB = scoreTeamB - 1;
        }
        displayGoalForTeamB(scoreTeamB);
    }

    /**
     * Plus one on the given score for Team B.
     */
    public void oneGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayGoalForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayGoalForTeamB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.goals_team_b);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void btnClickSetNames (View v) {
        TextView displayTeamAName = (TextView) findViewById(R.id.team_a_name);
        TextView displayTeamBName = (TextView) findViewById(R.id.team_b_name);
        EditText editTeamAName = (EditText) findViewById(R.id.edit_text_team_a_name);
        EditText editTeamBName = (EditText) findViewById(R.id.edit_text_team_b_name);
        displayTeamAName.setText(editTeamAName.getText().toString());
        displayTeamBName.setText(editTeamBName.getText().toString());
        displayTeamAName.setTextSize(26);
        displayTeamBName.setTextSize(26);

        showMainActivity();

    }

    public void showNamesTeams(){
        View groupsLayout = findViewById(R.id.groups_stage);
        View mainActivity = findViewById(R.id.main_game_activity);
        View setNamesTeams = findViewById(R.id.set_names_team);
        View resetbtn = findViewById(R.id.button);

        groupsLayout.setVisibility(View.VISIBLE);
        setNamesTeams.setVisibility(View.VISIBLE);
        mainActivity.setVisibility(View.GONE);
        resetbtn.setVisibility(View.GONE);

    }

    public void showMainActivity(){
        View groupsLayout = findViewById(R.id.groups_stage);
        View mainActivity = findViewById(R.id.main_game_activity);
        View setNamesTeams = findViewById(R.id.set_names_team);
        View resetbtn = findViewById(R.id.button);

        setNamesTeams.setVisibility(View.GONE);
        groupsLayout.setVisibility(View.VISIBLE);
        mainActivity.setVisibility(View.VISIBLE);
        resetbtn.setVisibility(View.VISIBLE);
    }


}
