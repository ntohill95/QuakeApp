package com.example.android.quakereport;

/**
 * Created by Niamh on 09/07/2017.
 */

public class Quake {
    private double mMag;
    private String mPlace;

    private long mTimeInMilliseconds;

    public Quake(double mag, String place, long time) {
        mMag = mag;
        mPlace = place;
        mTimeInMilliseconds = time;
    }

    public double getMag() {
        return mMag;
    }

    public String getPlace() {
        return mPlace;
    }

    public long getTime() {
        return mTimeInMilliseconds;
    }


}
