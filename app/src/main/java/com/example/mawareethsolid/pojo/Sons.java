package com.example.mawareethsolid.pojo;

import android.util.Log;

import javax.inject.Inject;

public class Sons extends Children {

    private static final String TAG = "Sons";

    int boysCount;
    @Inject
    public Sons() {
        Log.d(TAG, "aly Sons: constructor");
    }

    @Inject
    public void setRelation() {
        setRelation(Relations.PERSON_SON);
    }

    @Override
    public void setBoysCount(int boysCount) {
        this.boysCount = boysCount;
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
