package com.example.servicedemoactivity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class ServiceDemoActivity extends Activity {
	private static final String TAG = "ServiceDemoActivity";
	
	Button bindBtn;
	Button startBtn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        bindBtn = (Button)findViewById(R.id.bindBtn);
        startBtn = (Button)findViewById(R.id.startBtn);
        
        bindBtn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
			Log.e(TAG, "bindBtn");
				bindService(new Intent(ServiceDemo.ACTION), conn, BIND_AUTO_CREATE);
			}
		});
        
        startBtn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
			Log.e(TAG, "startBtn");
				startService(new Intent(ServiceDemo.ACTION));
			}
		});
    }
    
    ServiceConnection conn = new ServiceConnection() {
    	public void onServiceConnected(ComponentName name, IBinder service) {
			Log.e(TAG, "onServiceConnected");
		}
		public void onServiceDisconnected(ComponentName name) {
			Log.e(TAG, "onServiceDisconnected");
		}
	};
	@Override
	protected void onDestroy() {
		Log.e(TAG, "onDestroy unbindService");
		unbindService(conn);
		super.onDestroy();
	};
}