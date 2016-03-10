package com.example.servicedemoactivity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class ServiceDemo extends Service {
	private static final String TAG = "ServiceDemo";
	public static final String ACTION = "com.example.servicedemoactivity.ServiceDemo";
	

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		Log.e(TAG, " onBind ");
		return null;
	}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.e(TAG, " onCreate ");
		super.onCreate();
	}
	
	@Override
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		Log.e(TAG, " 1onStart ");
		super.onStart(intent, startId);
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		Log.e(TAG, " onStartCommand ");
		return super.onStartCommand(intent, flags, startId);
	}

}
