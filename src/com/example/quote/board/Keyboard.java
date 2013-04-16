package com.example.quote.board;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

		public class Keyboard extends Activity{
 @SuppressLint({ "NewApi", "NewApi", "NewApi" })
@Override
 		protected void onCreate(Bundle savedInstanceState) {
	 // TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.keyboard);
		ActionBar action= getActionBar();
        action.hide();
        
        //Media Player Repeats
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.terminal_main_hacked);
        
     //Buttons   
     Button lowC = (Button)this.findViewById(R.id.lowC);
     
     
     //Defining Button Actions
     lowC.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp.start();
			}
		
		
     });
 }
		}
