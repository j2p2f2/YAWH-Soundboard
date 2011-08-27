package com.techticles.YAWHSoundboard;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

public class CustomMediaPlayer 
{
	MediaPlayer mediaPlayer;
	Context context;
	
	public CustomMediaPlayer(Context context, int sound)
	{
		this.mediaPlayer = MediaPlayer.create(context, sound);
		this.context = context;
	}
	
	public void playSound()
	{
		try
		{
			mediaPlayer.start();
		}
		catch(IllegalStateException ise)
		{
			//Log.v("SoundPlayer", "SoundPlayer: playSound: IllegalStateException: " + ise.toString());
		}
		catch(Exception e)
		{
			//Log.v("SoundPlayer", "SoundPlayer: playSound: Exception: " + e.toString());
		}
	}
	
	public void stopSound()
	{
		try
		{
			mediaPlayer.stop();
		}
		catch(IllegalStateException ise)
		{
			//Log.v("SoundPlayer", "SoundPlayer: playSound: IllegalStateException: " + ise.toString());
		}
		catch(Exception e)
		{
			//Log.v("SoundPlayer", "SoundPlayer: playSound: Exception: " + e.toString());
		}
	}
}
