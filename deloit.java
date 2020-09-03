package com.example.mri;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class deloit extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.deloit);

		Button bt1 = (Button) findViewById(R.id.button2);
		Button bt2 = (Button) findViewById(R.id.button1);
		Button bt3 = (Button) findViewById(R.id.button3);

		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it = new Intent(deloit.this, DeloitaboutusActivity.class);
				startActivity(it);

			}
		});
		bt2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("http://www.glassdoor.co.in/Reviews/Deloitte-Reviews-E2763.htm/"));
				startActivity(myWebLink);

			}
		});
		bt3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebLink = new Intent(
						android.content.Intent.ACTION_VIEW);
				myWebLink.setData(Uri
						.parse("http://www2.deloitte.com/in/en.html/"));
				startActivity(myWebLink);

			}
		});

	}

}
