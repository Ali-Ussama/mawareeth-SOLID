package com.example.mawareethsolid.view.ui.problemActivity;

import android.util.Log;

import com.example.mawareethsolid.di.component.MainComponent;
import com.example.mawareethsolid.pojo.Children;
import com.example.mawareethsolid.utils.ChildrenUtils;

import javax.inject.Inject;

public class MainPresenter {

    private static final String TAG = "MainPresenter";

    @Inject
    Children children;

    @Inject
    ChildrenUtils childrenUtils;

    MainComponent mainComponent;

    @Inject
    public MainPresenter() {
        Log.d(TAG, "MainPresenter: aly constructor is called");
    }

    void handleChildren(int boysCount,int girlsCount) {
        Log.d(TAG, "aly handleChildren: is called");
        children.setChildrenUtils(children, childrenUtils, boysCount, girlsCount);
        Log.d(TAG, "aly handleChildren: " + children.getBoysCount());
        Log.d(TAG, "aly handleChildren: " + children.getSharePercent().getNumerator() + "/" + children.getSharePercent().getDenominator());
    }

}
