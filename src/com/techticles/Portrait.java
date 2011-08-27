package com.techticles;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Portrait 
{
	private Drawable portrait;
	private String text;
	CustomMediaPlayer mediaPlayer;
	Dialog portraitDialog;
	Context context;
	
	public Portrait(Context context, int portrait, int text, int sound)
	{		
		this.context = context;
		this.portrait = context.getResources().getDrawable(portrait);
		this.text = context.getResources().getString(text);
		this.mediaPlayer = new CustomMediaPlayer(context, sound);
	}
	
	public Drawable getDrawable()
	{
		return this.portrait;
	}
	
	public String getText()
	{
		return this.text;
	}
	
	public void OnClick()
	{
		//mediaPlayer.playSound();
		portraitDialog = new Dialog(context);
		portraitDialog.setContentView(R.layout.portrait_dialog);
		
		LayoutInflater viewInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = viewInflater.inflate(R.layout.portrait_dialog, null);
		
		ImageView portrait_ImageView = (ImageView) view.findViewById(R.id.portrait_dialog_ImageView);		
		TextView portrait_TextView = (TextView) view.findViewById(R.id.portrait_dialog_TextView);
		
		if(portrait_ImageView != null)
		{
			portrait_ImageView.setImageDrawable(portrait);
		}
		
		if(portrait_TextView != null)
		{
			portrait_TextView.setText(text);
		}
		portraitDialog.show();
	};
}
