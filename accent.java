package com.example.mri;

import com.example.mri.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class accent extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.accent);
		Button bt= (Button)findViewById(R.id.button2);
		Button bt1= (Button)findViewById(R.id.button1);
		Button bt3= (Button)findViewById(R.id.button3);
		
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it=new Intent(accent.this,AccaboutusActivity.class);
				startActivity(it);
				
			}
		});
	bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				  Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
	                myWebLink.setData(Uri.parse("http://www.glassdoor.co.in/Reviews/Accenture-India-Reviews-EI_IE4138.0,9_IL.10,15_IN115.htm"));
	                    startActivity(myWebLink);
				
				
				
			}
		});
	bt3.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			 Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
             myWebLink.setData(Uri.parse("http://www.accenture.com"));
                 startActivity(myWebLink);
		
			
		}
	});
		

		
	}

	

}
