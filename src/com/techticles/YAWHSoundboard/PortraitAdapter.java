package com.techticles.YAWHSoundboard;

import java.util.ArrayList;

import com.techticles.YAWHSoundboard.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PortraitAdapter extends ArrayAdapter<Portrait>
{
	private ArrayList<Portrait> conversation;
	private Context context;
	
	public PortraitAdapter(Context context, int textViewResourceId, ArrayList<Portrait> conversation)
	{
		super(context, textViewResourceId, conversation);
		this.conversation = conversation;
		this.context = context;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		View view = convertView;
		Portrait portrait = conversation.get(position);
				
		if(view == null)
		{
			LayoutInflater viewInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = viewInflater.inflate(R.layout.portrait_listitem, null);
		}
		
		if(portrait != null)
		{
			ImageView portrait_ImageView = (ImageView) view.findViewById(R.id.portrait_ImageView);		
			TextView portrait_TextView = (TextView) view.findViewById(R.id.portrait_TextView);
			
			if(portrait_ImageView != null)
			{
				portrait_ImageView.setImageDrawable(portrait.getDrawable());
			}
			
			if(portrait_TextView != null)
			{
				String descriptionText = portrait.getText();
				if(portrait.getText().length() > 40)
				{
					String cutString = descriptionText.substring(0,25);
					String fixedString = cutString.substring(0, cutString.lastIndexOf(' '));
					fixedString = fixedString + " ...";
					portrait_TextView.setText(fixedString);
				}
				else
				{
					portrait_TextView.setText(descriptionText);
				}
			}
		}
		
		return view;
	}	
}
