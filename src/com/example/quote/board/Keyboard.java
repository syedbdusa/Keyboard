package com.example.quote.board;

import java.util.HashMap;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Keyboard extends Activity{
	@SuppressLint({ "NewApi", "NewApi", "NewApi" })

	SoundPool soundPool;
	HashMap<Integer, Integer> soundPoolMap;
	int soundID = 1;



	//Matthew Van Horn 
	@SuppressLint({ "NewApi", "NewApi", "NewApi", "UseSparseArrays" })
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.keyboard);
		ActionBar action = getActionBar();
		action.hide();

		//SoundPool variable repeats
		final SoundPool CS = new SoundPool(4, AudioManager.STREAM_MUSIC, 100);
		final SoundPool CSharpS = new SoundPool(4, AudioManager.STREAM_MUSIC, 100);


		soundPoolMap = new HashMap<Integer, Integer>();


		//Sound map repeats
		soundPoolMap.put(soundID, CS.load(this, R.raw.terminal_main_hacked, 1));
		soundPoolMap.put(soundID, CSharpS.load(this, R.raw.hello, 1));



		//Buttons   
		ImageButton C = (ImageButton)this.findViewById(R.id.C);
		ImageButton Csharp = (ImageButton)this.findViewById(R.id.Csharp);



		//Defining Button Actions
		C.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				AudioManager audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
				float curVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
				float maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
				float leftVolume = curVolume/maxVolume;
				float rightVolume = curVolume/maxVolume;
				int priority = 1;
				int no_loop = 0;
				float normal_playback_rate = 1f;
				CS.play(soundID, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
			}


		});

		Csharp.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				AudioManager audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
				float curVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
				float maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
				float leftVolume = curVolume/maxVolume;
				float rightVolume = curVolume/maxVolume;
				int priority = 1;
				int no_loop = 0;
				float normal_playback_rate = 1f;
				CSharpS.play(soundID, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
			}


		});
	}





}

