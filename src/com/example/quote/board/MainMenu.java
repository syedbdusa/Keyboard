package com.example.quote.board;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainMenu extends Activity {

    @SuppressLint({ "NewApi", "NewApi", "NewApi" })
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        ActionBar action= getActionBar();
        action.hide();
        
        Button startPlaying = (Button) findViewById(R.id.startPlaying);
        Button specialKeyboard = (Button) findViewById(R.id.specialKeyboards);
        Button info = (Button) findViewById(R.id.info);
        
        startPlaying.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(getApplicationContext(),Keyboard.class);
		        startActivity(intent);
			}
		});
        
        
    }
}
