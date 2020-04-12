package com.example.mawareethsolid.pojo;

import android.util.Log;

import com.example.mawareethsolid.pojo.Person;
import com.example.mawareethsolid.utils.ChildrenUtils;
import com.example.mawareethsolid.utils.Daughter;
import com.example.mawareethsolid.utils.Son;

import javax.inject.Inject;

public class Children extends Person {


    private String TAG = "Children";

    @Inject
    public Children() {
        Log.d(TAG, "Children: aly children constructor is called");
    }

    @Inject
    public void setRelation() {
        super.setRelation(Relations.CHILDREN);
    }

    @Inject
    public void setGroup() {
        if (getPeopleInGirlsCount() > 1) {
            if (getBoysCount() == 1) {
                super.setGroup(false);
            } else {
                super.setGroup(true);
            }
        } else {
            super.setGroup(false);
        }
    }

    public void setChildrenUtils(Children children, ChildrenUtils childrenUtils, int boysCount, int girlsCount) {
        Log.d(TAG, "setChildrenUtils: is called");
        setBoysCount(boysCount);
        setGirlsCount(girlsCount);
        childrenUtils.handleChildren(children);
    }

}