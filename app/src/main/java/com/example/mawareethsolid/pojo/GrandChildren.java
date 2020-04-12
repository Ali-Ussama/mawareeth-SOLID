package com.example.mawareethsolid.pojo;

import android.util.Log;

import javax.inject.Inject;

public class GrandChildren extends Sons {

    private static final String TAG = "Sons";
    private int boysCount;
    private int girlsCount;

    @Inject
    public GrandChildren() {
        Log.d(TAG, "aly Sons: constructor");
    }

    @Inject
    public void setRelation() {
        setRelation(Relations.PERSON_SON_CHILDREN);
    }

    @Override
    public void setBoysCount(int boysCount) {
        this.boysCount = boysCount;
    }

    @Override
    public void setGirlsCount(int girlsCount) {
        this.girlsCount = girlsCount;
    }

    public void handleSons(Fraction childrenSharePercent, int childrenInDaughters, int problemOrigin) {
        int boysCount = getBoysCount();
        Fraction eachPersonSharePercent = new Fraction(((childrenSharePercent.getNumerator() / childrenInDaughters) * 2), childrenSharePercent.getDenominator());
        Fraction boysSharePercent = new Fraction((eachPersonSharePercent.getNumerator() * boysCount), eachPersonSharePercent.getDenominator());

        super.setSharePercent(boysSharePercent);
        super.setEachPersonSharePercent(boysSharePercent);

        super.setNumberOfShares(boysSharePercent.getNumerator());
        super.setNumberOfShares(eachPersonSharePercent.getNumerator());

        super.setProblemOrigin(problemOrigin);

        Log.d(TAG, "handleBoys: done");
    }

    @Inject
    public void setAlive() {
        super.setAlive(true);
    }
}
