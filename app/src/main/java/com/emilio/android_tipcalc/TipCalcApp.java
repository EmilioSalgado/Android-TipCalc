package com.emilio.android_tipcalc;

import android.app.Application;

public class TipCalcApp extends Application {
    private final static String ABOUT_URL= "https://github.com/EmilioSalgado";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
