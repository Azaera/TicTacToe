package com.example.bjorn.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Board extends AppCompatActivity implements View.OnClickListener {

    private Button one, two, three, four, five, six, seven, eight, nine;

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
                one.setText("X");
                break;
            case R.id.two :
                two.setText("X");
                break;
            case R.id.three :
                three.setText("O");
                break;
            case R.id.four :
                four.setText("X");
                break;
            case R.id.five :
                five.setText("O");
                break;
            case R.id.six :
                six.setText("X");
                break;
            case R.id.seven :
                seven.setText("O");
                break;
            case R.id.eight :
                eight.setText("X");
                break;
            case R.id.nine :
                nine.setText("O");
                break;

        }
    }
}