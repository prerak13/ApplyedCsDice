package com.example.prerak.applyedcsdice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView displayImage;
    TextView playerScore;
    TextView computerScore;
    Boolean HumanTurn;
    int playerScoreint=0;
    int computerScoreint=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        displayImage=(ImageView)findViewById(R.id.display_image);
        playerScore=(TextView)findViewById(R.id.player_score);
        computerScore=(TextView)findViewById(R.id.computer_score);
        HumanTurn=true;
    }
    public void RollFunc(View v)
    {
        if(HumanTurn)
        {
            Random ran=new Random();
            int x=ran.nextInt(6)+1;
            setDiceImage(x);
            playerScoreint+=x;
            playerScore.setText(Integer.toString(playerScoreint));
        }

    }

    public void HoldFunc(View v)
    {
        HumanTurn=false;
        computerPlay();
    }

    public void ResetFunc(View v)
    {

    }
public void computerPlay()
{
    int tempComputerScore=0;
    while(tempComputerScore<20)
    {
        Random ran=new Random();
        int x=ran.nextInt(6)+1;
        tempComputerScore+=x;
        computerScoreint+=x;
        setDiceImage(x);
        computerScore.setText(Integer.toString(tempComputerScore));

        System.out.println("X=="+x);
        System.out.println("tempComputerScore="+tempComputerScore);

    }
    tempComputerScore=0;
    HumanTurn=true;

}
    public void setDiceImage(int no)
    {
        System.out.println("SET DICE IMAGE=="+no);
        switch (no)
        {
            case 1:
            displayImage.setImageResource(R.drawable.dice1);
                break;

            case 2:
                displayImage.setImageResource(R.drawable.dice2);
                break;
            case 3:
                displayImage.setImageResource(R.drawable.dice3);
                break;
            case 4:
                displayImage.setImageResource(R.drawable.dice4);
                break;
            case 5:
                displayImage.setImageResource(R.drawable.dice5);
                break;
            case 6:
                displayImage.setImageResource(R.drawable.dice6);
                break;
        }

    }

}
