package com.cmcc.homepage;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;


/** 
  @Name: HomePage.java 
  @Author: jinhaize 
  @Date: 2013-12-11 
  @Description: 一个图标，点击，链接跳转到指定网站，跳转的同时关闭此activity
*/ 
public class HomePage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Uri uri = Uri.parse("http://10086.cn/m/");  
		Intent it = new Intent(Intent.ACTION_VIEW, uri);  
		startActivity(it);
		finish();
	}


}
