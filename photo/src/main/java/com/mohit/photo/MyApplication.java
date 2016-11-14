package com.mohit.photo;

/*
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

*/
/**
 * Created by jbit13 on 7/11/16.
 *//*


public class MyApplication extends Application implements Application.ActivityLifecycleCallbacks {
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Log.i("Created","First Created");
    }

    @Override
    public void onActivityStarted(Activity activity) {
        Log.i("Start","First Start");
    }

    @Override
    public void onActivityResumed(Activity activity) {
        Log.i("Resume","First Resume");
    }

    @Override
    public void onActivityPaused(Activity activity) {
        Log.i("Pause","First Pause");
    }

    @Override
    public void onActivityStopped(Activity activity) {
        Log.i("stoppped","First Created");
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        Log.i("Destroyed","Destroy");
    }
}
*/

import android.app.Application;
import android.util.Log;

import java.util.Calendar;
import java.util.Date;

/**
 * Check if the application is in the foreground or background.
 * *
 * Register this callbacks for an application
 * Application application = (Application) context.getApplicationContext();
 * application.registerActivityLifecycleCallbacks(new BaseLifeCycleCallbacks());
 * *
 * Note: These callbacks can be registered at any level of the application lifecycle.
 * Previous methods to get the application lifecycle forced the lifecycle callbacks to be registered
 * at the start of the application in a dedicated Application class.
 */
public class MyApplication extends Application implements Foreground.Listener {
    Date startDate,endDate;

    private Foreground.Binding listenerBinding;

    @Override
    public void onCreate() {
        super.onCreate();
        listenerBinding = Foreground.get(this).addListener(this);
    }

    @Override
    public void onBecameForeground() {
        Log.e("Foreground","Foreground");
        Calendar calendar = Calendar.getInstance();

// Get start time (this needs to be a global variable).
        startDate = calendar.getTime();
    }

    @Override
    public void onBecameBackground() {
        Log.e("Background","Background");
        Calendar calendar = Calendar.getInstance();

// Get start time (this needs to be a global variable).
        endDate = calendar.getTime();
        long sumDate = endDate.getTime() - startDate.getTime();
        Log.e("time",String.valueOf(sumDate));
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        listenerBinding.unbind();
    }
}