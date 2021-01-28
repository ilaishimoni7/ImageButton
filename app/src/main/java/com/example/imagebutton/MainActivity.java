package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageButton IB;
    ImageView IV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IB =  (ImageButton) findViewById(R.id.IB);
        IV = (ImageView) findViewById(R.id.IV);

    }

    public void chooserand(View view) {
        int x = (int)(Math.random()*3)+1;
        if (x==1) {
            IB.setImageResource(R.drawable.one);
            IV.setImageResource(R.drawable.mouse1);
        }
        if (x == 2) {
            IB.setImageResource(R.drawable.two);
            IV.setImageResource(R.drawable.mouse2);
        }
        if (x == 3) {
            IB.setImageResource(R.drawable.three);
            IV.setImageResource(R.drawable.mouse3);
        }




    }
}


