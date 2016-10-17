package com.emilio.android_tipcalc.fragments;

import com.emilio.android_tipcalc.models.TipRecord;

/**
 * Created by emilio on 10/10/16.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
