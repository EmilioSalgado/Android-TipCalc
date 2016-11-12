package com.emilio.android_tipcalc.fragments;

import com.emilio.android_tipcalc.entity.TipRecord;

/**
 * Created by emilio on 10/10/16.
 */
public interface TipHistoryListFragmentListener {
    void initList();
    void addToList(TipRecord record);
    void clearList();
}
