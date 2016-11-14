package com.mohit.yotubedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.common.api.GoogleApiClient;



public class MainActivity extends AppCompatActivity  {
int time=1;
    TextView my ;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my = (TextView)findViewById(R.id.mys);

        // Calling Application class (see application tag in AndroidManifest.xml)
        final MyMain2 globalVariable = (MyMain2) getApplicationContext();
        globalVariable.onCreate();
        my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });
        //We must use this function in order to change the text view text
      /*  runOnUiThread(new Runnable() {

            @Override
            public void run() {
                //TextView tv = (TextView) findViewById(R.id.main_timer_text);
                my.setText(String.valueOf(time));
                time += 1;
            }

        });*/
       com.mohit.photo.MainActivity.My("mohit", "Rathore", MainActivity.this);
    }

}
