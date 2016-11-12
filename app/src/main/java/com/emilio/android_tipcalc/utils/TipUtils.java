package com.emilio.android_tipcalc.utils;

import com.emilio.android_tipcalc.entity.TipRecord;

import java.text.SimpleDateFormat;

/**
 * Created by emilio on 11/11/16.
 */
public class TipUtils {
    public static double getTip(TipRecord tipRecord){
        return tipRecord.getBill() * (tipRecord.getTipPercentage()/100d);
    }

    public static String getDateFormated(TipRecord tipRecord){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd, yyyy HH:mm");
        return simpleDateFormat.format(tipRecord.getTimestamp());
    }
}
