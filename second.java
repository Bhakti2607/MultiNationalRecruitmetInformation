package com.example.mri;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class second extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		TextView tv=(TextView)findViewById(R.id.textView1);
		Button bt1= (Button)findViewById(R.id.button2);
		Button bt2= (Button)findViewById(R.id.button1);
		Button bt3= (Button)findViewById(R.id.button3);
		
		
bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it=new Intent(second.this,TcsaboutusActivity.class);
				startActivity(it);
				
				
			}
		});
bt2.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		 Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
         myWebLink.setData(Uri.parse("http://www.glassdoor.co.in/Reviews/Tata-Consultancy-Services-Reviews-E13461.htm"));
             startActivity(myWebLink);
	
		
	}
});
bt3.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	 Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
     myWebLink.setData(Uri.parse("http://www.tcs.com/Pages/default.aspx"));
         startActivity(myWebLink);
	
	
}
});
		
	}
	

}
