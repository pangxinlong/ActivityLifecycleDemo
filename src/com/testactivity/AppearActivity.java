package com.testactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AppearActivity extends Activity{

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_appear);
	}

	public static void invoteToAppearActivity(Activity context) {
		Intent intent = new Intent();
		intent.setClass(context, AppearActivity.class);
		context.startActivity(intent);
	}
	
	public void cancelB(View v){
		finish();
	}
}
