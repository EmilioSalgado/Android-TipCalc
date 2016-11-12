package com.emilio.android_tipcalc.entity;

import com.emilio.android_tipcalc.db.TipsDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by emilio on 16/10/16.
 */

@Table(database = TipsDatabase.class)
public class TipRecord {
    @PrimaryKey(autoincrement = true)
    private int id;

    @Column
    private double bill;

    @Column
    private int tipPercentage;

    @Column
    private Date timestamp;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBill(){
        return bill;
    }

    public void setBill(double bill){
        this.bill = bill;
    }

    public int getTipPercentage(){
        return tipPercentage;
    }

    public void setTipPercentage(int tipPercentage){
        this.tipPercentage = tipPercentage;
    }

    public Date getTimestamp(){
        return timestamp;
    }

    public void setTimestamp(Date timestamp){
        this.timestamp = timestamp;
    }

}
