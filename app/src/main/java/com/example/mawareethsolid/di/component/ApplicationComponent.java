package com.example.mawareethsolid.di.component;

import android.content.Context;

import com.example.mawareethsolid.App;
import com.example.mawareethsolid.di.module.ApplicationModule;
import com.example.mawareethsolid.di.module.ContextModule;
import com.example.mawareethsolid.di.qualifiers.ApplicationContext;
import com.example.mawareethsolid.di.scopes.ApplicationScope;

import dagger.Component;

@ApplicationScope
@Component (modules = {ContextModule.class})
public interface ApplicationComponent {

    @ApplicationContext
    Context getContext();

    public void injectApplication(App app);

}
