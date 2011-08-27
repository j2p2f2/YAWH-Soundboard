package com.techticles;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class YAWHSoundboardActivity extends Activity 
{
	PortraitAdapter portraitAdapter;
	ArrayList<Portrait> conversation;
	GridView main_GridView;
		
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);       
        
        conversation = new ArrayList<Portrait>();
        constructConversation();
        
        portraitAdapter = new PortraitAdapter(this, R.layout.portrait_listitem, conversation);
        
        main_GridView = (GridView) findViewById(R.id.main_GridView);       
        main_GridView.setAdapter(portraitAdapter);
        main_GridView.setOnItemClickListener(main_GridViewOnItemClickListener);
    }
    
    private OnItemClickListener main_GridViewOnItemClickListener = new OnItemClickListener()
    {

		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) 
		{
			Portrait currentPortrait = (Portrait)arg0.getItemAtPosition(arg2);
			currentPortrait.OnClick();
		}    	
    };
    
    private void constructConversation()
    {
    	conversation.add(new Portrait(this, R.drawable.hagrid1, R.string.hagrid1, R.raw.hagrid1));
    	conversation.add(new Portrait(this, R.drawable.harry1, R.string.harry1, R.raw.harry1));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid2, R.string.hagrid2, R.raw.hagrid2));
    	conversation.add(new Portrait(this, R.drawable.harry2, R.string.harry2, R.raw.harry2));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid3, R.string.hagrid3, R.raw.hagrid3));
    	conversation.add(new Portrait(this, R.drawable.harry3, R.string.harry3, R.raw.harry3));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid4, R.string.hagrid4, R.raw.hagrid4));
    	conversation.add(new Portrait(this, R.drawable.harry4, R.string.harry4, R.raw.harry4));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid5, R.string.hagrid5, R.raw.hagrid5));
    	conversation.add(new Portrait(this, R.drawable.harry5, R.string.harry5, R.raw.harry5));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid6, R.string.hagrid6, R.raw.hagrid6));
    	conversation.add(new Portrait(this, R.drawable.harry6, R.string.harry6, R.raw.harry6));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid7, R.string.hagrid7, R.raw.hagrid7));
    	conversation.add(new Portrait(this, R.drawable.harry7, R.string.harry7, R.raw.harry7));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid8, R.string.hagrid8, R.raw.hagrid8));
    	conversation.add(new Portrait(this, R.drawable.harry8, R.string.harry8, R.raw.harry8));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid9, R.string.hagrid9, R.raw.hagrid9));
    	conversation.add(new Portrait(this, R.drawable.harry9, R.string.harry9, R.raw.harry9));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid10, R.string.hagrid10, R.raw.hagrid10));
    	conversation.add(new Portrait(this, R.drawable.harry10, R.string.harry10, R.raw.harry10));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid11, R.string.hagrid11, R.raw.hagrid11));
    	conversation.add(new Portrait(this, R.drawable.harry11, R.string.harry11, R.raw.harry11));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid12, R.string.hagrid12, R.raw.hagrid12));
    	conversation.add(new Portrait(this, R.drawable.harry12, R.string.harry12, R.raw.harry12));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid13, R.string.hagrid13, R.raw.hagrid13));
    	conversation.add(new Portrait(this, R.drawable.harry13, R.string.harry13, R.raw.harry13));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid14, R.string.hagrid14, R.raw.hagrid14));
    	conversation.add(new Portrait(this, R.drawable.harry14, R.string.harry14, R.raw.harry14));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid15, R.string.hagrid15, R.raw.hagrid15));
    	conversation.add(new Portrait(this, R.drawable.harry15, R.string.harry15, R.raw.harry15));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid16, R.string.hagrid16, R.raw.hagrid16));
    	conversation.add(new Portrait(this, R.drawable.harry16, R.string.harry16, R.raw.harry16));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid17, R.string.hagrid17, R.raw.hagrid17));
    	conversation.add(new Portrait(this, R.drawable.harry17, R.string.harry17, R.raw.harry17));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid18, R.string.hagrid18, R.raw.hagrid18));
    	conversation.add(new Portrait(this, R.drawable.harry18, R.string.harry18, R.raw.harry18));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid19, R.string.hagrid19, R.raw.hagrid19));
    	conversation.add(new Portrait(this, R.drawable.harry19, R.string.harry19, R.raw.harry19));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid20, R.string.hagrid20, R.raw.hagrid20));
    	conversation.add(new Portrait(this, R.drawable.harry20, R.string.harry20, R.raw.harry20));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid21, R.string.hagrid21, R.raw.hagrid21));
    	conversation.add(new Portrait(this, R.drawable.harry21, R.string.harry21, R.raw.harry21));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid22, R.string.hagrid22, R.raw.hagrid22));
    	conversation.add(new Portrait(this, R.drawable.harry22, R.string.harry22, R.raw.harry22));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid23, R.string.hagrid23, R.raw.hagrid23));
    	conversation.add(new Portrait(this, R.drawable.harry23, R.string.harry23, R.raw.harry23));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid24, R.string.hagrid24, R.raw.hagrid24));
    	conversation.add(new Portrait(this, R.drawable.harry24, R.string.harry24, R.raw.harry24));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid25, R.string.hagrid25, R.raw.hagrid25));
    }
}