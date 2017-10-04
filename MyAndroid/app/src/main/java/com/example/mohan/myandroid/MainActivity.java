package com.example.mohan.myandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClicked(View view){

        TextView textview = (TextView) findViewById(R.id.MyTextView);

        boolean checked = ((CheckBox) view ).isChecked();

        switch (view.getId()){

            case R.id.tea:
                if(checked)
                    textview.setText("Tea");
                break;
            case R.id.milk:
                if(checked)
                    textview.setText("Milk");
                break;
            case R.id.coffee:
                if(checked)
                    textview.setText("Coffee");
                break;
            case R.id.fruits:
                if(checked)
                    textview.setText("Fruits");
            break;
            case R.id.juice:
                if(checked)
                    textview.setText("Juice");
                break;
            case R.id.other:
                if(checked)
                    textview.setText("Finish");
        }
    }
}

