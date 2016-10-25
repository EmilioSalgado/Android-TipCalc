package com.emilio.android_tipcalc.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.emilio.android_tipcalc.R;
import butterknife.ButterKnife;
import butterknife.Bind;

/**
 * Created by emilio on 25/10/16.
 */
public class TipInfoActivity extends AppCompatActivity{
    @Bind(R.id.txtTotal)
    TextView txtTotal;
    @Bind(R.id.txtTip)
    TextView txtTip;
    @Bind(R.id.txtTimeStamp)
    TextView txtTimeStamp;

    public final static String TIP_KEY  = "tip";
    public final static String DATE_KEY = "timestamp";
    public final static String TOTAL_KEY = "total";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_info);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String strTotal = String.format(getString(R.string.tipdetail_message_bill),
                intent.getDoubleExtra(TOTAL_KEY, 0d));

        String strTip = String.format(getString(R.string.global_message_tip),
                intent.getDoubleExtra(TIP_KEY, 0d));

        String strDate = getString(R.string.global_mesage_date).concat(intent.getStringExtra(DATE_KEY));

        txtTotal.setText(strTotal);
        txtTip.setText(strTip);
        txtTimeStamp.setText(strDate);
    }
}
