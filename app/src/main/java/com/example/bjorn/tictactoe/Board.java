package com.example.bjorn.tictactoe;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Board extends AppCompatActivity implements View.OnClickListener {

    private Button one, two, three, four, five, six, seven, eight, nine;
    private int empty = 9;
    private boolean currentPlayer = true, winner = false;
    private final Context context = this;
    private AlertDialog.Builder alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        one = ( Button ) findViewById(R.id.one);
        two = ( Button ) findViewById(R.id.two);
        three = ( Button ) findViewById(R.id.three);
        four = ( Button ) findViewById(R.id.four);
        five = ( Button ) findViewById(R.id.five);
        six = ( Button ) findViewById(R.id.six);
        seven = ( Button ) findViewById(R.id.seven);
        eight = ( Button ) findViewById(R.id.eight);
        nine = ( Button ) findViewById(R.id.nine);

        initiate();
    }

    public void initiate() {
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);

    }

    private void resetGame() {
        one.setText("");
        two.setText("");
        three.setText("");
        four.setText("");
        five.setText("");
        six.setText("");
        seven.setText("");
        eight.setText("");
        nine.setText("");
        currentPlayer = true;
        winner = false;
    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.one :
                if ( one.getText().toString().trim().length() > 0){
                    Toast.makeText(this, "Button not available!", Toast.LENGTH_SHORT).show();
                }else {
                    if (currentPlayer == true) {
                        one.setText("X");
                        nextPlayer();
                        empty--;
                    } else {
                        one.setText("O");
                        nextPlayer();
                        empty--;
                    }
                }
                break;
            case R.id.two :
                if ( two.getText().toString().trim().length() > 0){
                    Toast.makeText(this, "Button not available!", Toast.LENGTH_SHORT).show();
                }else {
                    if (currentPlayer == true) {
                        two.setText("X");
                        nextPlayer();
                        empty--;
                    } else {
                        two.setText("O");
                        nextPlayer();
                        empty--;
                    }
                }
                break;
            case R.id.three :
                if ( three.getText().toString().trim().length() > 0){
                    Toast.makeText(this, "Button not available!", Toast.LENGTH_SHORT).show();
                }else {
                    if (currentPlayer == true) {
                        three.setText("X");
                        nextPlayer();
                        empty--;
                    } else {
                        three.setText("O");
                        nextPlayer();
                        empty--;
                    }
                }
                break;
            case R.id.four :
                if ( four.getText().toString().trim().length() > 0){
                    Toast.makeText(this, "Button not available!", Toast.LENGTH_SHORT).show();
                }else {
                    if (currentPlayer == true) {
                        four.setText("X");
                        nextPlayer();
                        empty--;
                    } else {
                        four.setText("O");
                        nextPlayer();
                        empty--;
                    }
                }
                break;
            case R.id.five :
                if ( five.getText().toString().trim().length() > 0){
                    Toast.makeText(this, "Button not available!", Toast.LENGTH_SHORT).show();
                }else {
                    if (currentPlayer == true) {
                        five.setText("X");
                        nextPlayer();
                        empty--;
                    } else {
                        five.setText("O");
                        nextPlayer();
                        empty--;
                    }
                }
                break;
            case R.id.six :
                if ( six.getText().toString().trim().length() > 0){
                    Toast.makeText(this, "Button not available!", Toast.LENGTH_SHORT).show();
                }else {
                    if (currentPlayer == true) {
                        six.setText("X");
                        nextPlayer();
                        empty--;
                    } else {
                        six.setText("O");
                        nextPlayer();
                        empty--;
                    }
                }
                break;
            case R.id.seven :
                if ( seven.getText().toString().trim().length() > 0){
                    Toast.makeText(this, "Button not available!", Toast.LENGTH_SHORT).show();
                }else {
                    if (currentPlayer == true) {
                        seven.setText("X");
                        nextPlayer();
                        empty--;
                    } else {
                        seven.setText("O");
                        nextPlayer ();
                        empty--;
                    }
                }
                break;
            case R.id.eight :
                if ( eight.getText().toString().trim().length() > 0){
                    Toast.makeText(this, "Button not available!", Toast.LENGTH_SHORT).show();
                }else {
                    if (currentPlayer == true) {
                        eight.setText("X");
                        nextPlayer();
                        empty--;
                    } else {
                        eight.setText("O");
                        nextPlayer();
                        empty--;
                    }
                }
                break;
            case R.id.nine :
                if ( nine.getText().toString().trim().length() > 0){
                    Toast.makeText(this, "Button not available!", Toast.LENGTH_SHORT).show();
                }else {
                    if (currentPlayer == true) {
                        nine.setText("X");
                        nextPlayer();
                        empty--;
                    } else {
                        nine.setText("O");
                        nextPlayer();
                        empty--;
                    }
                }
                break;
        }
        isWinning();
        finishGame();
    }

    private void finishGame() {
        if (winner == true) {
            alert = new AlertDialog.Builder(context);
            alert.setTitle("Game Finished");
            alert.setMessage("Want to play another game?")
            .setCancelable(false)
            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    resetGame();
                }
            })

            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            }).create();
            alert.show();
        }

    }

    private void isWinning() {
        if (one.getText().toString().equals("X") && two.getText().toString().equals("X") && three.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        } else if (one.getText().toString().equals("O") && two.getText().toString().equals("O") && three.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        }
        if (one.getText().toString().equals("X") && four.getText().toString().equals("X") && seven.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        } else if (one.getText().toString().equals("O") && four.getText().toString().equals("O") && seven.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        }
        if (two.getText().toString().equals("X") && five.getText().toString().equals("X") && eight.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        } else if (two.getText().toString().equals("O") && five.getText().toString().equals("O") && eight.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        }
        if (three.getText().toString().equals("X") && six.getText().toString().equals("X") && nine.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        } else if (three.getText().toString().equals("O") && six.getText().toString().equals("O") && nine.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        }
        if (four.getText().toString().equals("X") && five.getText().toString().equals("X") && six.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        } else if (four.getText().toString().equals("O") && five.getText().toString().equals("O") && six.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        }
        if (seven.getText().toString().equals("X") && eight.getText().toString().equals("X") && nine.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        } else if (seven.getText().toString().equals("O") && eight.getText().toString().equals("O") && nine.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        }
        if (one.getText().toString().equals("X") && five.getText().toString().equals("X") && nine.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        } else if (one.getText().toString().equals("O") && five.getText().toString().equals("O") && nine.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        }
        if (seven.getText().toString().equals("X") && five.getText().toString().equals("X") && three.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        } else if (seven.getText().toString().equals("O") && five.getText().toString().equals("O") && three.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
            winner = true;
        }
        if ( empty == 0){
            Toast.makeText(this, "It's a draw!", Toast.LENGTH_SHORT).show();
            winner=true;
        }
    }

    private boolean nextPlayer() {
        if ( currentPlayer == true) {
            currentPlayer = false;
        } else {
            currentPlayer = true;
        }
        return currentPlayer;
    }
}