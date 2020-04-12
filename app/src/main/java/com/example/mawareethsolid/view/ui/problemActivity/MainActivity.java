package com.example.mawareethsolid.view.ui.problemActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.mawareethsolid.App;
import com.example.mawareethsolid.R;
import com.example.mawareethsolid.di.component.ApplicationComponent;
import com.example.mawareethsolid.di.component.DaggerApplicationComponent;
import com.example.mawareethsolid.di.component.DaggerMainComponent;
import com.example.mawareethsolid.di.component.MainComponent;
import com.example.mawareethsolid.di.module.MainActivityContextModule;
import com.example.mawareethsolid.pojo.Children;
import com.example.mawareethsolid.pojo.Person;
import com.example.mawareethsolid.pojo.Sons;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    @Inject
    MainPresenter presenter;

    MainComponent component;

    ApplicationComponent appComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Log.d(TAG, "onCreate: aly create app component");
            appComponent = App.get(this).getApplicationComponent();

            Log.d(TAG, "onCreate: aly create main activity component");
            component = DaggerMainComponent.builder().applicationComponent(appComponent).mainActivityContextModule(new MainActivityContextModule(this)).build();
            Log.d(TAG, "onCreate: aly injecting activity");
            component.injectActivity(this);

            presenter.handleChildren(1, 1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
