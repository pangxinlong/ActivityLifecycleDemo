package com.testactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MyActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.i("!!!!!!!!MyActivity!!!!!!!!!!!", "onCreate called."); 
		this.setContentView(R.layout.activity_myactivity);
	}
	
	 //Activity创建或者从后台重新回到前台时被调用  
	  protected void onStart() {  
	        super.onStart();  
	        Log.i("!!!!!!!!MyActivity!!!!!!!!!!!!!!", "onStart called.");  
	    }  
	  
	  //Activity从后台重新回到前台时被调用  
	    @Override  
	    protected void onRestart() {  
	        super.onRestart();  
	        Log.i("!!!!!!!!MyActivity!!!!!!!!!!", "onRestart called.");  
	    }  
	      
	    //Activity创建或者从被覆盖、后台重新回到前台时被调用  
	    @Override  
	    protected void onResume() {  
	        super.onResume();  
	        Log.i("!!!!!!!!MyActivity!!!!!!!!!!", "onResume called.");  
	    }  
	      
	    //Activity窗口获得或失去焦点时被调用,在onResume之后或onPause之后  
	    @Override 
	    public void onWindowFocusChanged(boolean hasFocus) { 
	        super.onWindowFocusChanged(hasFocus); 
	        Log.i("!!!!!myActivity!!!!!!!!!!!!", "onWindowFocusChanged called."); 
	    }  
	      
	    //Activity被覆盖到下面或者锁屏时被调用  
	    @Override  
	    protected void onPause() {  
	        super.onPause();  
	        Log.i("!!!!!!!!MyActivity!!!!!!!!!", "onPause called.");  
	        //有可能在执行完onPause或onStop后,系统资源紧张将Activity杀死,所以有必要在此保存持久数据  
	    }  
	    
	      
	    //退出当前Activity或者跳转到新Activity时被调用  
	    @Override  
	    protected void onStop() {  
	        super.onStop();  
	        Log.i("!!!!!!!!MyActivity!!!!!!!!!!!!!!!!", "onStop called.");     
	    }  
	      
	    //退出当前Activity时被调用,调用之后Activity就结束了  
	    @Override  
	    protected void onDestroy() {  
	        super.onDestroy();  
	        Log.i("!!!!!!!!MyActivity!!!!!!!!!!!!!!!", "onDestory called.");  
	    }  
	    
	    
	    /*
	     * Activity被系统杀死时被调用. 
	     * 例如:屏幕方向改变时,Activity被销毁再重建;当前Activity处于后台,系统资源紧张将其杀死. 
	     * 另外,当跳转到其他Activity或者按Home键回到主屏时该方法也会被调用,系统是为了保存当前View组件的状态. 
	     * 在onPause之前被调用. 
	     */  
	    protected void onSaveInstanceState(Bundle outState) {  
	        outState.putInt("param", 1);  
	        Log.i("!!!!!!!!MyActivity!!!!!!!!!!!!!!!!", "onSaveInstanceState called. put param: " + 1);  
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
	        Log.i("!!!!!!!!MyActivity!!!!!!!!!", "onRestoreInstanceState called. get param: " + 1);  
	        super.onRestoreInstanceState(savedInstanceState);  
	    }
	
	    
	    public static void invoteToMyActivity(Activity context) {
			Intent intent = new Intent();
			intent.setClass(context, MyActivity.class);
			context.startActivity(intent);
		}
	    
	    public void backC(View v){
			Log.v( "Haha , this is a DEBUG of MyAndroid. ", "the backC pressed"); 
			Intent intent = new Intent();
			intent.setClass(this, MainActivity.class);
			this.startActivity(intent);
		}
}
