package com.kagelabs.lazymoney;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;

import com.google.android.gms.location.LocationResult;


public class LocationReceiver extends BroadcastReceiver{
    private String TAG = "Loc";
    @Override
    public void onReceive(Context context, Intent intent) {
        if (LocationResult.hasResult(intent)) {
            Location location = LocationResult.extractResult(intent).getLastLocation();
            Log.d(TAG, location.toString());
        }
    }
}
