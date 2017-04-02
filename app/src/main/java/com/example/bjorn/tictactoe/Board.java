package com.example.bjorn.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Board extends AppCompatActivity implements View.OnClickListener {

    private Button one, two, three, four, five, six, seven, eight, nine;
    private boolean currentPlayer = true;

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

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.one :
                if ( one.getText().toString().trim().length() > 0){
                    Toast.makeText(this, "Button not available!", Toast.LENGTH_SHORT).show();
                }else {
                    if (currentPlayer == true) {
                        one.setText("X");
                        nextPlayer();
                    } else {
                        one.setText("O");
                        nextPlayer();
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
                    } else {
                        two.setText("O");
                        nextPlayer();
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
                    } else {
                        three.setText("O");
                        nextPlayer();
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
                    } else {
                        four.setText("O");
                        nextPlayer();
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
                    } else {
                        five.setText("O");
                        nextPlayer();
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
                    } else {
                        six.setText("O");
                        nextPlayer();
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
                    } else {
                        seven.setText("O");
                        nextPlayer ();
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
                    } else {
                        eight.setText("O");
                        nextPlayer();
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
                    } else {
                        nine.setText("O");
                        nextPlayer();
                    }
                }
                break;

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