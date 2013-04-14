package com.example.quote.board;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

		public class Keyboard extends Activity{
 @Override
 		protected void onCreate(Bundle savedInstanceState) {
	 // TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.keyboard);
		ActionBar action= getActionBar();
        action.hide();
		
		
}
}
