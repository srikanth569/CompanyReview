package com.srikanth.companyreview;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class ReviewApplication extends Application {

    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
