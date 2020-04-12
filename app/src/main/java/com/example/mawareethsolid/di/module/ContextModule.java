package com.example.mawareethsolid.di.module;

import android.content.Context;

import com.example.mawareethsolid.di.qualifiers.ApplicationContext;
import com.example.mawareethsolid.di.scopes.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationScope
    @ApplicationContext
    public Context provideContext(){
        return context;
    }


}
