package com.testactivity;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	Button b;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("MainActivity!!!!!!!!!!!", "onCreate called."); 
		setContentView(R.layout.activity_main);
		
		b=(Button) findViewById(R.id.next);
		b.setOnClickListener(this);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id=v.getId();
		switch(id){
		case R.id.next:{
			NextActivty.invoteToNext(this);
			finish();
			}
		}
	}
	
	 //Activity创建或者从后台重新回到前台时被调用  
	  protected void onStart() {  
	        super.onStart();  
	        Log.i("MainActivity!!!!!!!!!!!!!!", "onStart called.");  
	    }  
	  
	  //Activity从后台重新回到前台时被调用  
	    @Override  
	    protected void onRestart() {  
	        super.onRestart();  
	        Log.i("MainActivity!!!!!!!!!!", "onRestart called.");  
	    }  
	      
	    //Activity创建或者从被覆盖、后台重新回到前台时被调用  
	    @Override  
	    protected void onResume() {  
	        super.onResume();  
	        Log.i("MainActivity!!!!!!!!!!", "onResume called.");  
	    }  
	      
	    //Activity窗口获得或失去焦点时被调用,在onResume之后或onPause之后  
	    /*@Override 
	    public void onWindowFocusChanged(boolean hasFocus) { 
	        super.onWindowFocusChanged(hasFocus); 
	        Log.i(TAG, "onWindowFocusChanged called."); 
	    }*/  
	      
	    //Activity被覆盖到下面或者锁屏时被调用  
	    @Override  
	    protected void onPause() {  
	        super.onPause();  
	        Log.i("MainActivity!!!!!!!!!", "onPause called.");  
	        //有可能在执行完onPause或onStop后,系统资源紧张将Activity杀死,所以有必要在此保存持久数据  
	    }  
	    
	      
	    //退出当前Activity或者跳转到新Activity时被调用  
	    @Override  
	    protected void onStop() {  
	        super.onStop();  
	        Log.i("MainActivity!!!!!!!!!!!!!!!!", "onStop called.");     
	    }  
	      
	    //退出当前Activity时被调用,调用之后Activity就结束了  
	    @Override  
	    protected void onDestroy() {  
	        super.onDestroy();  
	        Log.i("MainActivity!!!!!!!!!!!!!!!", "onDestory called.");  
	    }  
	    
	    
	    /*
	     * Activity被系统杀死时被调用. 
	     * 例如:屏幕方向改变时,Activity被销毁再重建;当前Activity处于后台,系统资源紧张将其杀死. 
	     * 另外,当跳转到其他Activity或者按Home键回到主屏时该方法也会被调用,系统是为了保存当前View组件的状态. 
	     * 在onPause之前被调用. 
	     */  
	    protected void onSaveInstanceState(Bundle outState) {  
	        outState.putInt("param", 1);  
	        Log.i("MainActivity!!!!!!!!!!!!!!!!", "onSaveInstanceState called. put param: " + 1);  
	        super.onSaveInstanceState(outState);  
	    }  
	      
	    /*
	     * Activity被系统杀死后再重建时被调用. 
	     * 例如:屏幕方向改变时,Activity被销毁再重建;当前Activity处于后台,系统资源紧张将其杀死,用户又启动该Activity. 
	     * 这两种情况下onRestoreInstanceState都会被调用,在onStart之后. 
	     */  
	    @Override  
	    protected void onRestoreInstanceState(Bundle savedInstanceState) {  
	      int   param = savedInstanceState.getInt("1");  
	        Log.i("MainActivity!!!!!!!!!", "onRestoreInstanceState called. get param: " + 1);  
	        super.onRestoreInstanceState(savedInstanceState);  
	    }  
	
	public static void invoteToMain(Activity context) {
		Intent intent = new Intent();
		intent.setClass(context, MainActivity.class);
		context.startActivity(intent);
		
	}
}
