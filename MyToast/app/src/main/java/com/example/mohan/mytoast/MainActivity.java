package com.example.mohan.mytoast;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

   public void showtoast(View view){
       CharSequence text = "this is mohan singh";
        int duration = Toast.LENGTH_LONG;

       Toast toast = Toast.makeText(this,text,duration);
       toast.show();
       }
}
