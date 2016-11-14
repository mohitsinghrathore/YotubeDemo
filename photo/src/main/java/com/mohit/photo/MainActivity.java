package com.mohit.photo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public  class MainActivity extends AppCompatActivity  {
    Date startDate,endDate;
  /*   MainActivity()
    {
        Calendar calendar = Calendar.getInstance();
// Get start time (this needs to be a global variable).
       startDate  = calendar.getTime();
    }*/

    public static void My(String key, String Value, Context context) {
        Toast.makeText(context, "key :"+ key + " Value" + Value, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Thread background = new Thread();
        //background.start();

        //We must use this function in order to change the text view text
        runOnUiThread(new Runnable() {

            @Override
            public void run() {
              //  TextView tv = (TextView) findViewById(R.id.main_timer_text);
             //   tv.setText(String.valueOf(time));
              //  time += 1;
              //  Log.i("ma",""+time);
            }

        });

                Toast.makeText(MainActivity.this,"Demo start in activity",Toast.LENGTH_SHORT).show();

        Log.i("my","App");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    Toast.makeText(this,"Done",Toast.LENGTH_SHORT).show();
        Log.i("on destroy","Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Stop in activity", Toast.LENGTH_SHORT).show();
        Log.i("on destroy","Destroy");
        Calendar calendar = Calendar.getInstance();

// Get start time (this needs to be a global variable).
         endDate = calendar.getTime();
        long sumDate = endDate.getTime() - startDate.getTime();
        Log.i("time",String.valueOf(sumDate));
    }

}
