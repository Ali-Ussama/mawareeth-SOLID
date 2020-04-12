package com.example.mawareethsolid.pojo;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class Fraction implements Parcelable {

    private static final String TAG = "Fraction";

    private int numerator; // البسط
    private int denominator; // المقام

    /*------------------------------------------------ النسب -------------------------------------*/

    public static final Fraction one = new Fraction(24, 24); // واحد صحيح

    public static final Fraction half = new Fraction(12, 24); // النصف

    public static final Fraction quarter = new Fraction(6, 24); // الربع

    public static final Fraction one_Third = new Fraction(8, 24); // الثلث

    public static final Fraction two_Thirds = new Fraction(16, 24); // الثلثين

    public static final Fraction one_Sixth = new Fraction(4, 24); // السدس

    public static final Fraction fifth_Sixth = new Fraction(20, 24); // خمسة أسداس

    public static final Fraction one_eighth = new Fraction(3, 24); // ثمن

    public static final Fraction fourteenth_TwentyFourth = new Fraction(14, 24); // 14/24

    public static final Fraction seventh_TwentyFourth = new Fraction(7, 24); // 7/24

    public static final Fraction one_Twelve = new Fraction(2, 24); // 1/12


    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    protected Fraction(Parcel in) {
        numerator = in.readInt();
        denominator = in.readInt();
    }

    public static final Creator<Fraction> CREATOR = new Creator<Fraction>() {
        @Override
        public Fraction createFromParcel(Parcel in) {
            return new Fraction(in);
        }

        @Override
        public Fraction[] newArray(int size) {
            return new Fraction[size];
        }
    };

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public static Fraction getOne() {
        return new Fraction(24, 24); // واحد صحيح;
    }

    public static Fraction getHalf() {
        return new Fraction(12, 24); // النصف;
    }

    public static Fraction getQuarter() {
        return new Fraction(6, 24); // الربع;
    }

    public static Fraction getOne_Third() {
        return new Fraction(8, 24); // الثلث;
    }

    public static Fraction getTwo_Thirds() {
        return new Fraction(16, 24); // الثلثين;
    }

    public static Fraction getOne_Sixth() {
        return new Fraction(4, 24); // السدس;
    }

    public static Fraction getFifth_Sixth() {
        return new Fraction(20, 24); // خمسة أسداس;
    }

    public static Fraction getOne_eighth() {
        return new Fraction(3, 24); // ثمن;
    }

    public static Fraction getFourteenth_TwentyFourth() {
        return new Fraction(14, 24); // 14/24;
    }

    public static Fraction getSeventh_TwentyFourth() {
        return new Fraction(7, 24); // 7/24;
    }

    public static Fraction getOne_Twelve() {
        return new Fraction(2, 24); // 1/12;
    }

    public static Fraction divideFraction(Fraction f1, Fraction f2) {

        Log.i(TAG, "divideFraction(): f1 = " + f1.getNumerator() + "/" + f1.getDenominator());
        Log.i(TAG, "divideFraction(): f2 = " + f2.getNumerator() + "/" + f2.getDenominator());

        Fraction mFraction = new Fraction(0, 0);
        mFraction.setNumerator(f1.getNumerator() / f2.getDenominator());
        mFraction.setDenominator(f1.getDenominator());

        Log.i(TAG, "divideFraction(): mFraction = " + mFraction.getNumerator() + "/" + mFraction.getDenominator());

        return mFraction;
    }

    public static Fraction multiplyFraction(Fraction f1, Fraction f2) {
        f1.setNumerator(f1.getNumerator() * f2.getNumerator());
        f1.setDenominator(f1.getDenominator() * f2.getDenominator());

        return f1;
    }

    public static void subtractFractions(Fraction f1, Fraction f2) {
        Log.i(TAG, "addFractions(): f1 = " + f1.getNumerator() + "/" + f1.getDenominator());
        Log.i(TAG, "addFractions(): f2 = " + f2.getNumerator() + "/" + f2.getDenominator());

        f1.setNumerator((f1.getNumerator() * -1) + f2.getNumerator());
    }

    public static void addFractions(Fraction f1, Fraction f2) {
        Log.i(TAG, "addFractions(): f1 = " + f1.getNumerator() + "/" + f1.getDenominator());
        Log.i(TAG, "addFractions(): f2 = " + f2.getNumerator() + "/" + f2.getDenominator());

        f1.setNumerator(f1.getNumerator() + f2.getNumerator());
    }

    public static Fraction finalCalculationDivideFraction(Fraction f1, Fraction f2) {
        Log.i(TAG, "finalCalculationDivideFraction(): f1 = " + f1.getNumerator() + "/" + f1.getDenominator());
        Log.i(TAG, "finalCalculationDivideFraction(): f2 = " + f2.getNumerator() + "/" + f2.getDenominator());

        f1.setDenominator(f2.getNumerator());
        return f1;
    }

    @Override
    public int describeContents() {
        return Parcelable.CONTENTS_FILE_DESCRIPTOR;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(numerator);
        parcel.writeInt(denominator);
    }

    public static boolean isEqual(Fraction f1, Fraction f2) {

        return (f1.getNumerator() == f2.getNumerator() && f1.getDenominator() == f2.getDenominator());

    }
}
