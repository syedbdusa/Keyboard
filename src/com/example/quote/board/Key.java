package com.example.quote.board;

import java.util.HashMap;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.widget.ImageButton;

@SuppressLint("UseSparseArrays")
public class Key extends Activity{

	String name;
	SoundPool soundPool;
	HashMap<Integer, Integer> soundPoolMap = new HashMap<Integer, Integer>();
	static int soundID = 1;
	final SoundPool pool = new SoundPool(4, AudioManager.STREAM_MUSIC, 100);
	
	//Image
	int id;

	//SoundFile
	int resID;

	ImageButton button;
	Context currentClass;

	//Random Values
	AudioManager audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
	float curVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
	float maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
	float leftVolume = curVolume/maxVolume;
	float rightVolume = curVolume/maxVolume;
	int priority = 1;
	int no_loop = 0;
	float normal_playback_rate = 1f;



	public Key(String name, int id, int resID, Context currentClass){
		this.name = name;
		this.resID = resID;
		this.id = id;
		this.currentClass = currentClass;

		button = (ImageButton)this.findViewById(id);
	}
}
