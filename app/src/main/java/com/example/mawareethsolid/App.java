package com.example.mawareethsolid;

import android.app.Activity;
import android.app.Application;
import android.util.Log;

import com.example.mawareethsolid.di.component.ApplicationComponent;
import com.example.mawareethsolid.di.component.DaggerApplicationComponent;
import com.example.mawareethsolid.di.module.ContextModule;

public class App extends Application {

    private static final String TAG = "App";
    ApplicationComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: aly building app component");
        appComponent = DaggerApplicationComponent.builder().contextModule(new ContextModule(this)).build();
        Log.d(TAG, "onCreate: aly injecting Application");
        appComponent.injectApplication(this);

    }

    public static App get(Activity activity){
        return (App) activity.getApplication();
    }

    public ApplicationComponent getApplicationComponent() {
        return appComponent;
    }
}
