package com.example.quote.board;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.view.Menu;

public class Info extends Activity {
	
	@SuppressLint({ "NewApi", "NewApi", "NewApi" })
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        ActionBar action= getActionBar();
        action.hide();
        
        
        
        
    }
   
}
