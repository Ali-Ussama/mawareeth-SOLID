package com.example.mawareethsolid.di.module;

import android.content.Context;

import com.example.mawareethsolid.di.qualifiers.ActivityContext;
import com.example.mawareethsolid.di.scopes.ActivityScope;
import com.example.mawareethsolid.view.ui.problemActivity.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityContextModule {

    private MainActivity mainActivity;

    private Context context;

    public MainActivityContextModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        this.context = mainActivity;
    }

    @Provides
    @ActivityScope
    public MainActivity provideMainActivity() {
        return mainActivity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public Context provideContext() {
        return context;
    }


}
