package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*Team A variables*/
    int goalsTeamA = 0;
    int penaltiesTeamA = 0;
    int yellowCardsTeamA = 0;
    int redCardsTeamA = 0;

    /*Team B variables*/
    int goalsTeamB = 0;
    int penaltiesTeamB = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //*****Team A*****//


    //*********Methods Adding values to Display**********//

    /*This adds one to the number of goals for team A*/
    public void addOneGoalForTeamA(View view){
        goalsTeamA = goalsTeamA + 1;
        displayGoalsForTeamA(goalsTeamA);
    }
    /*This adds one to the number of penalties for team A*/
    public void addOnePenaltyForTeamA(View view){
        penaltiesTeamA = penaltiesTeamA + 1;
        displayPenaltiesForTeamA(penaltiesTeamA);
    }

    public void addOneYellowCardForTeamA(View view){
        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayYellowCardsForTeamA(yellowCardsTeamA);
    }
    public void addOneRedCardForTeamA(View view){
        redCardsTeamA = redCardsTeamA + 1;
        displayRedCardsForTeamA(redCardsTeamA);
    }

    //*********View Value Display methods**********//

    /*This sets the number of goals for team A*/
    public void displayGoalsForTeamA(int goal){
        TextView addOneGoal = (TextView) findViewById(R.id.team_a_goal);
        addOneGoal.setText("" + goal);
    }
    /*This sets the number of penalties for team A*/
    public void displayPenaltiesForTeamA(int penalty){
        TextView addOnePenalty = (TextView) findViewById(R.id.team_a_penalty);
        addOnePenalty.setText("" + penalty);
    }
    /*This sets the number of yellow cards for team A*/
    public void displayYellowCardsForTeamA(int yellow){
        TextView addOneYellow = (TextView) findViewById(R.id.team_a_yellow);
        addOneYellow.setText("" + yellow);
    }
    /*This sets the number of red cards for team A*/
    public void displayRedCardsForTeamA(int red){
        TextView addOneRed = (TextView) findViewById(R.id.team_a_red);
        addOneRed.setText("" + red);
    }


    //*****Team B*****//


    //*********Methods Adding values to Display**********//

    /*This adds one to the number of goals for team B*/
    public void addOneGoalForTeamB(View view){
        goalsTeamB = goalsTeamB + 1;
        displayGoalsForTeamB(goalsTeamB);
    }
    /*This adds one to the number of penalties for team A*/
    public void addOnePenaltyForTeamB(View view){
        penaltiesTeamB = penaltiesTeamB + 1;
        displayPenaltiesForTeamB(penaltiesTeamB);
    }
    public void addOneYellowCardForTeamB(View view){
        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayYellowCardsForTeamB(yellowCardsTeamB);
    }
    public void addOneRedCardForTeamB(View view){
        redCardsTeamB = redCardsTeamB + 1;
        displayRedCardsForTeamB(redCardsTeamB);
    }

    //*********View Value Display methods**********//

    /*This sets the number of goals for team A*/
    public void displayGoalsForTeamB(int goal){
        TextView addOneGoal = (TextView) findViewById(R.id.team_b_goal);
        addOneGoal.setText("" + goal);
    }
    /*This sets the number of penalties for team A*/
    public void displayPenaltiesForTeamB(int penalty){
        TextView addOnePenalty = (TextView) findViewById(R.id.team_b_penalty);
        addOnePenalty.setText("" + penalty);
    }
    /*This sets the number of yellow cards for team A*/
    public void displayYellowCardsForTeamB(int yellow){
        TextView addOneYellow = (TextView) findViewById(R.id.team_b_yellow);
        addOneYellow.setText("" + yellow);
    }
    /*This sets the number of red cards for team A*/
    public void displayRedCardsForTeamB(int red){
        TextView addOneRed = (TextView) findViewById(R.id.team_b_red);
        addOneRed.setText("" + red);
    }


    /*Resetting all views*/
    public void resetAll(View view){
        /*Resetting values for Team A*/
        goalsTeamA = 0;
        displayGoalsForTeamA(goalsTeamA);
        penaltiesTeamA = 0;
        displayPenaltiesForTeamA(penaltiesTeamA);
        yellowCardsTeamA = 0;
        displayYellowCardsForTeamA(yellowCardsTeamA);
        redCardsTeamA = 0;
        displayRedCardsForTeamA(redCardsTeamA);

        /*Resetting values for Team B*/
        goalsTeamB = 0;
        displayGoalsForTeamB(goalsTeamB);
        penaltiesTeamB = 0;
        displayPenaltiesForTeamB(penaltiesTeamB);
        yellowCardsTeamB = 0;
        displayYellowCardsForTeamB(yellowCardsTeamB);
        redCardsTeamB = 0;
        displayRedCardsForTeamB(redCardsTeamB);
    }
}
