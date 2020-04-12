package com.example.mawareethsolid.di.component;

import android.content.Context;

import com.example.mawareethsolid.di.module.MainActivityContextModule;
import com.example.mawareethsolid.di.qualifiers.ActivityContext;
import com.example.mawareethsolid.di.scopes.ActivityScope;
import com.example.mawareethsolid.pojo.Children;
import com.example.mawareethsolid.pojo.Sons;
import com.example.mawareethsolid.utils.ChildrenUtils;
import com.example.mawareethsolid.view.ui.problemActivity.MainActivity;
import com.example.mawareethsolid.di.module.MainModule;
import com.example.mawareethsolid.view.ui.problemActivity.MainPresenter;

import dagger.Component;

@ActivityScope
@Component(modules = MainActivityContextModule.class, dependencies = ApplicationComponent.class)
public interface MainComponent {

    @ActivityContext
    Context getContext();

    void injectActivity(MainActivity mainActivity);

    Children getChildren();

    Sons getSons();

    MainPresenter getMainPresenter();

    ChildrenUtils getChildrenUtils();

}
