package com.example.service_1;

import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class Service extends android.app.Service {
    String TAG = "Service";


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG,"OnBind Service");
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG,"Service has Started");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Service has been Stop");
    }


}
