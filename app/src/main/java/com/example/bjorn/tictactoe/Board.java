package com.example.bjorn.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

    public Board() {

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
                    one.setText("X");
                }
                break;

            case R.id.two:
                check = isEmpty(two);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    one.setText("X");
                }
                break;

            case R.id.three:
                check = isEmpty(three);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    one.setText("X");
                }
                break;

            case R.id.four:
                check = isEmpty(four);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    one.setText("X");
                }
                break;

            case R.id.five:
                check = isEmpty(five);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    one.setText("X");
                }
                break;

            case R.id.six:
                check = isEmpty(six);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    one.setText("X");
                }
                break;

            case R.id.seven:
                check = isEmpty(seven);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    one.setText("X");
                }
                break;

            case R.id.eight:
                check = isEmpty(eight);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    one.setText("X");
                }
                break;

            case R.id.nine:
                check = isEmpty(nine);
                if ( check != true) {
                    Toast.makeText(this, "Button unavailable", Toast.LENGTH_LONG).show();
                } else {
                    one.setText("X");
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
}
