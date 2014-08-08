package com.testactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;

public class MyFragmentActivity extends FragmentActivity {

	private MyFragmentOne myfragment1;
	MyFragmentTwo ftwo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.i("FragmentActivity!!!!!!!!!!!", "onCreate called.");
		this.setContentView(R.layout.activity_myfragmentactivity);
		
		FragmentTransaction fragmentTransaction = getSupportFragmentManager()
				.beginTransaction();
		myfragment1 = new MyFragmentOne();
		fragmentTransaction.add(R.id.linearcon, myfragment1).commit();

	}

	@Override
	public void onAttachFragment(Fragment fragment) {
		// TODO Auto-generated method stub
		super.onAttachFragment(fragment);
		Log.i("FragmentActivity!!!!!!!!!!!", "onAttach called.");
	}

	@Override
	public View onCreateView(String name, Context context, AttributeSet attrs) {
		// TODO Auto-generated method stub
		return super.onCreateView(name, context, attrs);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("FragmentActivity!!!!!!!!!!!", "onStart called.");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("FragmentActivity!!!!!!!!!!!", "onResume called.");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("FragmentActivity!!!!!!!!!!!", "onPause called.");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("FragmentActivity!!!!!!!!!!!", "onStop called.");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("FragmentActivity!!!!!!!!!!!", "onDestroy called.");
	}

	public static void invoteToMyFragmentActivity(Activity context) {
		Intent intent = new Intent();
		intent.setClass(context, MyFragmentActivity.class);
		context.startActivity(intent);
	}

}
