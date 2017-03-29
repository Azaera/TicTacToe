package com.example.bjorn.tictactoe;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Board extends AppCompatActivity implements View.OnClickListener{
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private TextView playerOne;
    private TextView playerTwo;
    final Context context = this;
    private int player = 1;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

  //      playerOne = ( TextView ) findViewById(R.id.firstPlayer);
  //      playerTwo = ( TextView ) findViewById(R.id.secondPlayer);



        one = ( Button ) findViewById(R.id.one);
        two = ( Button ) findViewById(R.id.two);
        three = ( Button ) findViewById(R.id.three);
        four = ( Button ) findViewById(R.id.four);
        five = ( Button ) findViewById(R.id.five);
        six = ( Button ) findViewById(R.id.six);
        seven = ( Button ) findViewById(R.id.seven);
        eight = ( Button ) findViewById(R.id.eight);
        nine = ( Button ) findViewById(R.id.nine);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);

        playersTurn();
    }

    public Board() {

    }
/*
    public String players(int i) {
        if ( i == 1) {
            name = "";
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("PLAYERS");
            builder.setMessage("Enter first players name");
            final EditText input2 = new EditText(this);
            builder.setView(input2);

            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    String name1 = input2.getText().toString();
                    name = name1;
                }
            });
            player++;
            builder.create().show();
        } else {
            AlertDialog.Builder builders = new AlertDialog.Builder(this);
            builders.setTitle("PLAYERS");
            builders.setMessage("Enter second players name");
            final EditText input = new EditText(this);
            builders.setView(input);

            builders.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    String name2 = input.getText().toString();
                    name = name2;
                }
            });
            player++;
            builders.create().show();
        }
        return name;
    }
*/
    private void playersTurn() {
        //true for player 1, false for player 2;
        if (player == 1){
            Toast.makeText(context, " Player 1's turn.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, " Player 2's turn.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v){
        boolean check = false;

        switch (v.getId()) {

            case R.id.one:
                check = isEmpty(one);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    if (player == 1) {
                        one.setText("X");
                        player = 2;
                        playersTurn();
                    } else {
                        one.setText("O");
                        player = 1;
                        playersTurn();
                    }
                }
                break;

            case R.id.two:
                check = isEmpty(two);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    if (player == 1) {
                        two.setText("X");
                        player = 2;
                        playersTurn();
                    } else {
                        two.setText("O");
                        player = 1;
                        playersTurn();
                    }
                }
                break;

            case R.id.three:
                check = isEmpty(three);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    if (player == 1) {
                        three.setText("X");
                        player = 2;
                        playersTurn();
                    } else {
                        three.setText("O");
                        player = 1;
                        playersTurn();
                    }
                }
                break;

            case R.id.four:
                check = isEmpty(four);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    if (player == 1) {
                        four.setText("X");
                        player = 2;
                        playersTurn();
                    } else {
                        four.setText("O");
                        player = 1;
                        playersTurn();
                    }
                }
                break;

            case R.id.five:
                check = isEmpty(five);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    if (player == 1) {
                        five.setText("X");
                        player = 2;
                        playersTurn();
                    } else {
                        five.setText("O");
                        player = 1;
                        playersTurn();
                    }
                }
                break;

            case R.id.six:
                check = isEmpty(six);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    if (player == 1) {
                        six.setText("X");
                        player = 2;
                        playersTurn();
                    } else {
                        six.setText("O");
                        player = 1;
                        playersTurn();
                    }
                }
                break;

            case R.id.seven:
                check = isEmpty(seven);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    if (player == 1) {
                        seven.setText("X");
                        player = 2;
                        playersTurn();
                    } else {
                        seven.setText("O");
                        player = 1;
                        playersTurn();
                    }
                }
                break;

            case R.id.eight:
                check = isEmpty(eight);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    if (player == 1) {
                        eight.setText("X");
                        player = 2;
                        playersTurn();
                    } else {
                        eight.setText("O");
                        player = 1;
                        playersTurn();
                    }
                }
                break;

            case R.id.nine:
                check = isEmpty(nine);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    if (player == 1) {
                        nine.setText("X");
                        player = 2;
                        playersTurn();
                    } else {
                        nine.setText("O");
                        player = 1;
                        playersTurn();
                    }
                }
                break;
        }
    }

    private boolean isEmpty(Button b) {
        if (b.getText().toString().trim().length() > 0) {
            return false;
        }
        return true;
    }

    private void winner() {

    }
}
