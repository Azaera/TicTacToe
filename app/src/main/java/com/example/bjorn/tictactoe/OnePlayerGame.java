package com.example.bjorn.tictactoe;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Bjorn on 4/6/2017.
 */



public class OnePlayerGame extends AppCompatActivity implements View.OnClickListener {

    private Button one, two, three, four, five, six, seven, eight, nine;
    private TextView winCountF, winCountS, drawC, playerOne, player1Wins;
    private int empty = 9, aiMove;
    private int playerOneWins = 0, playerTwoWins = 0, draws = 0;
    private boolean currentPlayer = true, winner = false;
    private final Context context = this;
    private AlertDialog.Builder alert, player;
    private String tmp, player1 = "Player 1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneplayergame);

        one = ( Button ) findViewById(R.id.one);
        two = ( Button ) findViewById(R.id.two);
        three = ( Button ) findViewById(R.id.three);
        four = ( Button ) findViewById(R.id.four);
        five = ( Button ) findViewById(R.id.five);
        six = ( Button ) findViewById(R.id.six);
        seven = ( Button ) findViewById(R.id.seven);
        eight = ( Button ) findViewById(R.id.eight);
        nine = ( Button ) findViewById(R.id.nine);

        winCountF = ( TextView ) findViewById(R.id.winCount1);
        winCountS = ( TextView ) findViewById(R.id.winCount2);
        drawC = ( TextView ) findViewById(R.id.drawCount);

        playerOne = ( TextView ) findViewById(R.id.firstPlayer);
        player1Wins = ( TextView ) findViewById(R.id.firstPlayerWins);

        initiate();
    }

    public void initiate() {
        playerNames();
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        player1Wins.setText("");
        winCountF.setText("0");
        winCountS.setText("0");
        drawC.setText("0");
    }

    private void playerNames() {
        player = new AlertDialog.Builder(context);
        player.setTitle("Who's Playing");

        final EditText input = new EditText(this);
        {
            player.setMessage("Player one's name?")
                    .setView(input)
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                tmp = input.getText().toString();
                                player1 = tmp;
                                playerOne.setText(player1);
                                player1Wins.setText(player1 + "'s wins:");
                            }
                        }).create();
                player.show();
            }

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
        empty = 9;
        winCountF.setText("" + playerOneWins);
        winCountS.setText(""+ playerTwoWins);
        drawC.setText(""+ draws);

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
                        computerMove();
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
                        computerMove();
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
                        computerMove();
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
                        computerMove();
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
                        computerMove();
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
                        computerMove();
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
                        computerMove();
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
                        computerMove();
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
                        computerMove();
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
            if ( currentPlayer == true ) {
            } else if ( currentPlayer == false ) {
            }
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
            Toast.makeText(this, player1 + " wins", Toast.LENGTH_SHORT).show();
            playerOneWins++;
            winner = true;
        } else if (one.getText().toString().equals("O") && two.getText().toString().equals("O") && three.getText().toString().equals("O")) {
            Toast.makeText(this, "Computer wins", Toast.LENGTH_SHORT).show();

            playerTwoWins++;
            winner = true;
        }
        if (one.getText().toString().equals("X") && four.getText().toString().equals("X") && seven.getText().toString().equals("X")) {
            Toast.makeText(this, player1 + " wins", Toast.LENGTH_SHORT).show();
            playerOneWins++;
            winner = true;
        } else if (one.getText().toString().equals("O") && four.getText().toString().equals("O") && seven.getText().toString().equals("O")) {
            Toast.makeText(this, "Computer wins", Toast.LENGTH_SHORT).show();
            playerTwoWins++;
            winner = true;
        }
        if (two.getText().toString().equals("X") && five.getText().toString().equals("X") && eight.getText().toString().equals("X")) {
            Toast.makeText(this, player1 + " wins", Toast.LENGTH_SHORT).show();
            playerOneWins++;
            winner = true;
        } else if (two.getText().toString().equals("O") && five.getText().toString().equals("O") && eight.getText().toString().equals("O")) {
            Toast.makeText(this, "Computer wins", Toast.LENGTH_SHORT).show();
            playerTwoWins++;
            winner = true;
        }
        if (three.getText().toString().equals("X") && six.getText().toString().equals("X") && nine.getText().toString().equals("X")) {
            Toast.makeText(this, player1 + " wins", Toast.LENGTH_SHORT).show();
            playerOneWins++;
            winner = true;
        } else if (three.getText().toString().equals("O") && six.getText().toString().equals("O") && nine.getText().toString().equals("O")) {
            Toast.makeText(this, "Computer wins", Toast.LENGTH_SHORT).show();
            playerTwoWins++;
            winner = true;
        }
        if (four.getText().toString().equals("X") && five.getText().toString().equals("X") && six.getText().toString().equals("X")) {
            Toast.makeText(this, player1 + " wins", Toast.LENGTH_SHORT).show();
            playerOneWins++;
            winner = true;
        } else if (four.getText().toString().equals("O") && five.getText().toString().equals("O") && six.getText().toString().equals("O")) {
            Toast.makeText(this, "Computer wins", Toast.LENGTH_SHORT).show();
            playerTwoWins++;
            winner = true;
        }
        if (seven.getText().toString().equals("X") && eight.getText().toString().equals("X") && nine.getText().toString().equals("X")) {
            Toast.makeText(this, player1 + " wins", Toast.LENGTH_SHORT).show();
            playerOneWins++;
            winner = true;
        } else if (seven.getText().toString().equals("O") && eight.getText().toString().equals("O") && nine.getText().toString().equals("O")) {
            Toast.makeText(this, "Computer wins", Toast.LENGTH_SHORT).show();
            playerTwoWins++;
            winner = true;
        }
        if (one.getText().toString().equals("X") && five.getText().toString().equals("X") && nine.getText().toString().equals("X")) {
            Toast.makeText(this, player1 + " wins", Toast.LENGTH_SHORT).show();
            playerOneWins++;
            winner = true;
        } else if (one.getText().toString().equals("O") && five.getText().toString().equals("O") && nine.getText().toString().equals("O")) {
            Toast.makeText(this, "Computer wins", Toast.LENGTH_SHORT).show();
            playerTwoWins++;
            winner = true;
        }
        if (seven.getText().toString().equals("X") && five.getText().toString().equals("X") && three.getText().toString().equals("X")) {
            Toast.makeText(this, player1 + " wins", Toast.LENGTH_SHORT).show();
            playerOneWins++;
            winner = true;
        } else if (seven.getText().toString().equals("O") && five.getText().toString().equals("O") && three.getText().toString().equals("O")) {
            Toast.makeText(this, "Computer wins", Toast.LENGTH_SHORT).show();
            playerTwoWins++;
            winner = true;
        }
        if ( empty == 0){
            Toast.makeText(this, "It's a draw!", Toast.LENGTH_SHORT).show();
            draws++;
            winner=true;
        }
    }

    private boolean nextPlayer() {
        if ( currentPlayer == true) {
            currentPlayer = false;
            computerMove();
        } else {
            currentPlayer = true;
        }
        return currentPlayer;
    }

    private void computerMove() {
        System.out.println("Computer move method");
        System.out.println("Five: " + five.getText());
        if ( five.getText() == "") {
            System.out.println("Five: " + five.getText());
            five.setText("O");
            nextPlayer();
            empty--;
        }
    }
}
