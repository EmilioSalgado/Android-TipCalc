package com.emilio.android_tipcalc;

import android.app.Application;

/**
 * Created by JuanCrg90 on 9/26/16.
 */

public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://github.com/EmilioSalgado";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
