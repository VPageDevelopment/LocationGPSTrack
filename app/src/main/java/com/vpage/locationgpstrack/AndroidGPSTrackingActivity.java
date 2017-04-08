package com.vpage.locationgpstrack;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class AndroidGPSTrackingActivity extends Activity {

	Button btnShowLocation;

	// GPSTracker class
	GPSTracker gps;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		btnShowLocation = (Button) findViewById(R.id.btnShowLocation);

		// show location button click event
		btnShowLocation.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {

				gps = new GPSTracker(AndroidGPSTrackingActivity.this);

			}
		});
	}
}