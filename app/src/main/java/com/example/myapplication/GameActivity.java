package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
private TicTacToeBoard board;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        board = findViewById(R.id.ticTacToeBoard2);
        Button playAgain = findViewById(R.id.playAgainBtn);
        ImageView playersImg = findViewById(R.id.image10);
        ImageView image1 = findViewById(R.id.image1);
        ImageView image2= findViewById(R.id.image2);
        ImageView image3 = findViewById(R.id.image3);
        ImageView image4 = findViewById(R.id.image4);
        ImageView image5 = findViewById(R.id.image5);
        ImageView image6 = findViewById(R.id.image6);
        ImageView image7 = findViewById(R.id.image7);
        ImageView image8 = findViewById(R.id.image8);
        ImageView image9 = findViewById(R.id.image9);
        image2.setImageResource(0);
        image3.setImageResource(0);
        image4.setImageResource(0);
        image5.setImageResource(0);
        image6.setImageResource(0);
        image7.setImageResource(0);
        image8.setImageResource(0);
        image9.setImageResource(0);
        playersImg.setImageResource(R.drawable.xplay);
        board.setGame(playAgain,playersImg,image1,image2,image3,image4,image5,image6,image7,image8,image9);
        playAgain.setEnabled(false);
        //playAgain.setVisibility(View.GONE);
    }
    public void playAgainButton(View view)
    {
        board.ClearGame();
        board.invalidate();
    }
}