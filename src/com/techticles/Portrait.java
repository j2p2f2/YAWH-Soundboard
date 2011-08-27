package com.techticles;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Portrait 
{
	private Drawable portrait;
	private String[] text;
	private CustomMediaPlayer[] mediaPlayer;
	private Dialog portraitDialog;
	private Context context;
	
	public Portrait(Context context, int portrait, int text, int sound)
	{		
		this.context = context;
		this.portrait = context.getResources().getDrawable(portrait);
		this.text = new String[1];
		this.mediaPlayer = new CustomMediaPlayer[1];
		
		this.text[0] = context.getResources().getString(text);
		this.mediaPlayer[0] = new CustomMediaPlayer(context, sound);
		
		createDialogBox();
	}
	
	public Portrait(Context context, int portrait, int[] text, int[] sound)
	{		
		this.context = context;
		this.portrait = context.getResources().getDrawable(portrait);
		
		this.text = new String[text.length];
		for(int i = 0; i < text.length; i++)
		{
			this.text[i] = context.getResources().getString(text[i]);
		}
		
		this.mediaPlayer = new CustomMediaPlayer[sound.length];
		for(int i = 0; i < sound.length; i++)
		{
			this.mediaPlayer[i] = new CustomMediaPlayer(context, sound[i]);
		}
		
		createDialogBox();
	}
	
	public Drawable getDrawable()
	{
		return this.portrait;
	}
	
	public String getText()
	{
		return this.text[0];
	}
	
	public String[] getTextArray()
	{
		return this.text;
	}
	
	public void OnClick()
	{
		portraitDialog.show();
	};
	
	private void createDialogBox()
	{
		portraitDialog = new Dialog(context);
		portraitDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		portraitDialog.setOnDismissListener(portraitDialogOnDismissListener);
			
		LayoutInflater viewInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = viewInflater.inflate(R.layout.portrait_dialog, null);
				
		ImageView portrait_ImageView = (ImageView) view.findViewById(R.id.portrait_dialog_ImageView_Portrait);		
		TextView portrait_TextView = (TextView) view.findViewById(R.id.portrait_dialog_TextView_Text);
		Button portrait_Button_Play = (Button) view.findViewById(R.id.portrait_dialog_Button_Play);
		Button portrait_Button_Cancel = (Button) view.findViewById(R.id.portrait_dialog_Button_Cancel);
		
		TextView option1 = (TextView) view.findViewById(R.id.portrait_dialog_TextView_Options_1);
		TextView option2 = (TextView) view.findViewById(R.id.portrait_dialog_TextView_Options_2);
		TextView option3 = (TextView) view.findViewById(R.id.portrait_dialog_TextView_Options_3);
		TextView option4 = (TextView) view.findViewById(R.id.portrait_dialog_TextView_Options_4);
		TextView option5 = (TextView) view.findViewById(R.id.portrait_dialog_TextView_Options_5);
		
		TextView[] options = {option1, option2, option3, option4, option5};
		
		if(portrait_ImageView != null)
		{
			portrait_ImageView.setImageDrawable(portrait);
		}
		
		if(portrait_TextView != null)
		{
			portrait_TextView.setText(text[0]);
		}
		
		for(int i = 0; i < options.length; i++)
		{
			if((i+1) < text.length)
			{
				options[i].setVisibility(TextView.VISIBLE);
				options[i].setText("Play: " + text[i+1]);
				options[i].setOnClickListener(optionsOnClickListener);
			}
		}
		
		if(portrait_Button_Play != null)
		{
			portrait_Button_Play.setOnClickListener(portrait_Button_Play_OnClickListener);
		}
		
		if(portrait_Button_Cancel != null)
		{
			portrait_Button_Cancel.setOnClickListener(portrait_Button_Cancel_OnClickListener);
		}
		
		portraitDialog.setContentView(view);
	}
	
	private OnDismissListener portraitDialogOnDismissListener = new OnDismissListener()
	{
		@Override
		public void onDismiss(DialogInterface arg0) 
		{
			for(int i = 0; i < mediaPlayer.length; i++)
			{
				mediaPlayer[0].stopSound();
			}
		}		
	};
	
	private OnClickListener optionsOnClickListener = new OnClickListener()
	{
		@Override
		public void onClick(View v) 
		{
			TextView view = (TextView) v;
			switch(view.getId())
			{
				case R.id.portrait_dialog_TextView_Options_1:
					mediaPlayer[1].playSound();
					break;
				case R.id.portrait_dialog_TextView_Options_2:
					mediaPlayer[2].playSound();
					break;
				case R.id.portrait_dialog_TextView_Options_3:
					mediaPlayer[3].playSound();
					break;
				case R.id.portrait_dialog_TextView_Options_4:
					mediaPlayer[4].playSound();
					break;
				case R.id.portrait_dialog_TextView_Options_5:
					mediaPlayer[5].playSound();
					break;
				default:
					break;
			}
		}
	};
	
	private OnClickListener portrait_Button_Play_OnClickListener = new OnClickListener()
	{
		@Override
		public void onClick(View v) 
		{
			mediaPlayer[0].playSound();
		}
	};
	
	private OnClickListener portrait_Button_Cancel_OnClickListener = new OnClickListener()
	{
		@Override
		public void onClick(View v) 
		{
			portraitDialog.dismiss();
		}
	};
}
