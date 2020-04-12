package com.example.mawareethsolid.utils;

import android.util.Log;

import com.example.mawareethsolid.pojo.Children;
import com.example.mawareethsolid.pojo.Fraction;

import javax.inject.Inject;

public class ChildrenUtils {

    private static final String TAG = "ChildrenUtils";
    private Fraction twoDaughterFraction, daughterFraction, boyFraction, moreThanThreeDaughtersFraction;

    @Inject
    public ChildrenUtils() {
        Log.d(TAG, "ChildrenUtils: aly ChildrenUtils constructor is called");
        twoDaughterFraction = Fraction.getFourteenth_TwentyFourth();
        daughterFraction = Fraction.getHalf();
        boyFraction = Fraction.getOne();
        moreThanThreeDaughtersFraction = Fraction.getTwo_Thirds();
    }


    public void handleChildren(Children children) {//TODO setProof & setExplanation
        Log.d(TAG, "handleChildren: aly is called");
        if (children.getPeopleInGirlsCount() >= 3) {
            Log.d(TAG, "handleChildren: moreThanThreeDaughters");
            setPersonShares(children, moreThanThreeDaughtersFraction, "", "");
        } else if (children.getPeopleInGirlsCount() == 2) {
            if (children.getGirlsCount() == 2) {
                Log.d(TAG, "handleChildren: two daughters");
                setPersonShares(children, twoDaughterFraction, "", "");
            } else if (children.getBoysCount() == 1) {
                Log.d(TAG, "handleChildren: one boy");
                setPersonShares(children, boyFraction, "", "");
            }
        } else {
            Log.d(TAG, "handleChildren: one girls");
            setPersonShares(children, daughterFraction, "", "");
        }
    }

    private void setPersonShares(Children children, Fraction fraction, String proof, String explanation) {
        Log.d(TAG, "aly setPersonShares: is called");
        children.setSharePercent(fraction);
        children.setProof(proof);
        children.setExplanation(explanation);
    }
}
