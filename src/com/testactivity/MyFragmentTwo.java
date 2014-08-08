package com.testactivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragmentTwo extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.i("!!!!!!!!!!!!!!!!MyFragment2", "onCreate is called!");

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("!!!!!!!!!!!!!!!!MyFragment2", "onCreateView is called!");
		return inflater.inflate(R.layout.fragment_two, container, false);

	}

	
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		Log.i("!!!!!!!!!!!!!!!!MyFragment2","onActivityCreated is called");
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("!!!!!!!!!!!!!!!!MyFragment2", "onStart is called!");
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("!!!!!!!!!!!!!!!!MyFragment2", "onResume is called!");
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("!!!!!!!!!!!!!!!!MyFragment2", "onPause is called!");
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("!!!!!!!!!!!!!!!!MyFragment2", "onStop is called!");
	}

	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		super.onDestroyView();
		Log.i("!!!!!!!!!!!!!!!!MyFragment2", "onDestroyView id called!");
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("!!!!!!!!!!!!!!!!MyFragment2", "onDestroy is called!");
	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
		Log.i("!!!!!!!!!!!!!!!!MyFragment2", "onDetach is called!");
	}

}
