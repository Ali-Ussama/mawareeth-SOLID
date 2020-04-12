package com.example.mawareethsolid.di.module;

import com.example.mawareethsolid.utils.ChildrenUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    public MainModule() {
    }

    @Provides
    ChildrenUtils providesChildrenUtils() {
        return new ChildrenUtils();
    }
}
