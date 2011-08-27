package com.techticles.YAWHSoundboard;

import java.util.ArrayList;

import com.techticles.YAWHSoundboard.R;

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
    	
    	int[] harry12text = {R.string.harry12, R.string.harry12_1, R.string.harry12_2};
    	int[] harry12sound = {R.raw.harry12, R.raw.harry12_1, R.raw.harry12_2};
    	conversation.add(new Portrait(this, R.drawable.harry12, harry12text, harry12sound));
    	
    	int[] hagrid13text = {R.string.hagrid13, R.string.hagrid13_1};
    	int[] hagrid13sound = {R.raw.hagrid13, R.raw.hagrid13_1};
    	conversation.add(new Portrait(this, R.drawable.hagrid13, hagrid13text, hagrid13sound));
    	
    	int[] harry13text = {R.string.harry13, R.string.harry13_1, R.string.harry13_2};
    	int[] harry13sound = {R.raw.harry13, R.raw.harry13_1, R.raw.harry13_2};
    	conversation.add(new Portrait(this, R.drawable.harry13, harry13text, harry13sound));
    	
    	int[] hagrid14text = {R.string.hagrid14, R.string.hagrid14_1, R.string.hagrid14_2, R.string.hagrid14_3};
    	int[] hagrid14sound = {R.raw.hagrid14, R.raw.hagrid14_1, R.raw.hagrid14_2, R.raw.hagrid14_3};
    	conversation.add(new Portrait(this, R.drawable.hagrid14, hagrid14text, hagrid14sound));
    	
    	int[] harry14text = {R.string.harry14, R.string.harry14_1, R.string.harry14_2, R.string.harry14_3, R.string.harry14_4, R.string.harry14_5};
    	int[] harry14sound = {R.raw.harry14, R.raw.harry14_1, R.raw.harry14_2, R.raw.harry14_3, R.raw.harry14_4, R.raw.harry14_5};
    	conversation.add(new Portrait(this, R.drawable.harry14, harry14text, harry14sound));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid15, R.string.hagrid15, R.raw.hagrid15));
    	
    	int[] harry15text = {R.string.harry15, R.string.harry15_1};
    	int[] harry15sound = {R.raw.harry15, R.raw.harry15_1};
    	conversation.add(new Portrait(this, R.drawable.harry15, harry15text, harry15sound));
    	
    	int[] hagrid16text = {R.string.hagrid16, R.string.hagrid16_1, R.string.hagrid16_2, R.string.hagrid16_3, R.string.hagrid16_4};
    	int[] hagrid16sound = {R.raw.hagrid16, R.raw.hagrid16_1, R.raw.hagrid16_2, R.raw.hagrid16_3, R.raw.hagrid16_4};
    	conversation.add(new Portrait(this, R.drawable.hagrid16, hagrid16text, hagrid16sound));
    	conversation.add(new Portrait(this, R.drawable.harry16, R.string.harry16, R.raw.harry16));
    	
    	int[] hagrid17text = {R.string.hagrid17, R.string.hagrid17_1, R.string.hagrid17_2};
    	int[] hagrid17sound = {R.raw.hagrid17, R.raw.hagrid17_1, R.raw.hagrid17_2};
    	conversation.add(new Portrait(this, R.drawable.hagrid17, hagrid17text, hagrid17sound));
    	conversation.add(new Portrait(this, R.drawable.harry17, R.string.harry17, R.raw.harry17));
    	
    	int[] hagrid18text = {R.string.hagrid18, R.string.hagrid18_1};
    	int[] hagrid18sound = {R.raw.hagrid18, R.raw.hagrid18_1};
    	conversation.add(new Portrait(this, R.drawable.hagrid18, hagrid18text, hagrid18sound));
    	
    	int[] harry18text = {R.string.harry18, R.string.harry18_1, R.string.harry18_2};
    	int[] harry18sound = {R.raw.harry18, R.raw.harry18_1, R.raw.harry18_2};
    	conversation.add(new Portrait(this, R.drawable.harry18, harry18text, harry18sound));
    	
    	int[] hagrid19text = {R.string.hagrid19, R.string.hagrid19_1, R.string.hagrid19_2, R.string.hagrid19_3, R.string.hagrid19_4, R.string.hagrid19_5};
    	int[] hagrid19sound = {R.raw.hagrid19, R.raw.hagrid19_1, R.raw.hagrid19_2, R.raw.hagrid19_3, R.raw.hagrid19_4, R.raw.hagrid19_5};
    	conversation.add(new Portrait(this, R.drawable.hagrid19, hagrid19text, hagrid19sound));
    	conversation.add(new Portrait(this, R.drawable.harry19, R.string.harry19, R.raw.harry19));
    	
    	int[] hagrid20text = {R.string.hagrid20, R.string.hagrid20_1, R.string.hagrid20_2, R.string.hagrid20_3};
    	int[] hagrid20sound = {R.raw.hagrid20, R.raw.hagrid20_1, R.raw.hagrid20_2, R.raw.hagrid20_3};
    	conversation.add(new Portrait(this, R.drawable.hagrid20, hagrid20text, hagrid20sound));
    	conversation.add(new Portrait(this, R.drawable.harry20, R.string.harry20, R.raw.harry20));
    	
    	int[] hagrid21text = {R.string.hagrid21, R.string.hagrid21_1, R.string.hagrid21_2, R.string.hagrid21_3};
    	int[] hagrid21sound = {R.raw.hagrid21, R.raw.hagrid21_1, R.raw.hagrid21_2, R.raw.hagrid21_3};
    	conversation.add(new Portrait(this, R.drawable.hagrid21, hagrid21text, hagrid21sound));
    	conversation.add(new Portrait(this, R.drawable.harry21, R.string.harry21, R.raw.harry21));
    	
    	int[] hagrid22text = {R.string.hagrid22, R.string.hagrid22_1, R.string.hagrid22_2};
    	int[] hagrid22sound = {R.raw.hagrid22, R.raw.hagrid22_1, R.raw.hagrid22_2};
    	conversation.add(new Portrait(this, R.drawable.hagrid22, hagrid22text, hagrid22sound));
    	conversation.add(new Portrait(this, R.drawable.harry22, R.string.harry22, R.raw.harry22));
    	
    	conversation.add(new Portrait(this, R.drawable.hagrid23, R.string.hagrid23, R.raw.hagrid23));
    	
    	int[] harry23text = {R.string.harry23, R.string.harry23_1, R.string.harry23_2, R.string.harry23_3};
    	int[] harry23sound = {R.raw.harry23, R.raw.harry23_1, R.raw.harry23_2, R.raw.harry23_3};
    	conversation.add(new Portrait(this, R.drawable.harry23, harry23text, harry23sound));
    	
    	int[] hagrid24text = {R.string.hagrid24, R.string.hagrid24_1, R.string.hagrid24_2, R.string.hagrid24_3};
    	int[] hagrid24sound = {R.raw.hagrid24, R.raw.hagrid24_1, R.raw.hagrid24_2, R.raw.hagrid24_3};
    	conversation.add(new Portrait(this, R.drawable.hagrid24, hagrid24text, hagrid24sound));
    	
    	int[] harry24text = {R.string.harry24, R.string.harry24_1, R.string.harry24_2, R.string.harry24_3};
    	int[] harry24sound = {R.raw.harry24, R.raw.harry24_1, R.raw.harry24_2, R.raw.harry24_3};
    	conversation.add(new Portrait(this, R.drawable.harry24, harry24text, harry24sound));
    	
    	int[] hagrid25text = {R.string.hagrid25, R.string.hagrid25_1, R.string.hagrid25_2, R.string.hagrid25_3, R.string.hagrid25_4};
    	int[] hagrid25sound = {R.raw.hagrid25, R.raw.hagrid25_1, R.raw.hagrid25_2, R.raw.hagrid25_3, R.raw.hagrid25_4};
    	conversation.add(new Portrait(this, R.drawable.hagrid25, hagrid25text, hagrid25sound));
    }
}