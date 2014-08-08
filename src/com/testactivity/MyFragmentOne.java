package com.testactivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class MyFragmentOne extends Fragment  {
	MyFragmentTwo ftwo;
	
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		Log.d(this.getTag(), "onAttach");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	//	bOne=(Button) bOne.findViewById(R.id.buttonFragmentOneB);
		Log.i("!!!!!!!!!!!!!!!!MyFragment1", "onCreate is called!");
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("!!!!!!!!!!!!!!!!MyFragment1", "onCreateView is called!");
		return inflater.inflate(R.layout.fragment_one, container, false);

	}

	
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		Log.i("!!!!!!!!!!!!!!!!MyFragment1","onActivityCreated is called!");
		Button bOne=(Button)getActivity().findViewById(R.id.buttonFragmentOneB);
		bOne.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				FragmentTransaction fragmentTransaction = getFragmentManager()
						.beginTransaction();
				ftwo = new MyFragmentTwo();
				fragmentTransaction.replace(R.id.linearcon, ftwo);
				fragmentTransaction.addToBackStack(null);
				fragmentTransaction.commit();
			}
		});
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("!!!!!!!!!!!!!!!!MyFragment1", "onStart is called!");
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("!!!!!!!!!!!!!!!!MyFragment1", "onResume is called!");
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("!!!!!!!!!!!!!!!!MyFragment1", "onPause is called!");
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("!!!!!!!!!!!!!!!!MyFragment1", "onStop is called!");
	}

	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		super.onDestroyView();
		Log.i("!!!!!!!!!!!!!!!!MyFragment1", "onDestroyView id called!");
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("!!!!!!!!!!!!!!!!MyFragment1", "onDestroy is called!");
	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
		Log.i("!!!!!!!!!!!!!!!!MyFragment1", "onDetach is called!");
	}

}
