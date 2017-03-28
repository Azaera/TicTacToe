package com.example.bjorn.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Board extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        Button one = ( Button ) findViewById(R.id.one);
        Button two = ( Button ) findViewById(R.id.two);
        Button three = ( Button ) findViewById(R.id.three);
        Button four = ( Button ) findViewById(R.id.four);
        Button five = ( Button ) findViewById(R.id.five);
        Button six = ( Button ) findViewById(R.id.six);
        Button seven = ( Button ) findViewById(R.id.seven);
        Button eight = ( Button ) findViewById(R.id.eight);
        Button nine = ( Button ) findViewById(R.id.nine);

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
        switch (v.getId()) {

            case R.id.one:
                Toast.makeText(this, "Button 1", Toast.LENGTH_LONG).show();

                break;

            case R.id.two:
                Toast.makeText(this, "Button 2", Toast.LENGTH_LONG).show();

                break;
            case R.id.three:
                Toast.makeText(this, "Button 3", Toast.LENGTH_LONG).show();
                break;

            case R.id.four:
                Toast.makeText(this, "Button 4", Toast.LENGTH_LONG).show();
                break;

            case R.id.five:
                Toast.makeText(this, "Button 5", Toast.LENGTH_LONG).show();
                break;

            case R.id.six:
                Toast.makeText(this, "Button 6", Toast.LENGTH_LONG).show();
                break;

            case R.id.seven:
                Toast.makeText(this, "Button 7", Toast.LENGTH_LONG).show();
                break;

            case R.id.eight:
                Toast.makeText(this, "Button 8", Toast.LENGTH_LONG).show();
                break;

            case R.id.nine:
                Toast.makeText(this, "Button 9", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
