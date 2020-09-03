package com.example.mri;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	SQLiteDatabase db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		Button b1 = (Button) findViewById(R.id.button1);
		Button b2 = (Button) findViewById(R.id.button2);
		final EditText et = (EditText) findViewById(R.id.editText1);
		final EditText e2 = (EditText) findViewById(R.id.editText2);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String name = et.getText().toString();
				String phno = e2.getText().toString();
				db=openOrCreateDatabase("Student", MODE_PRIVATE, null);
				Cursor c=db.rawQuery("select * from ee where name='"+name+"' and phno='"+phno+"'", null);
				System.out.println(name);
				int a=c.getCount();
				if(a>0){
					Intent i = new Intent(LoginActivity.this,first.class);
					startActivity(i);
				}else{
				
					Toast.makeText(getApplicationContext(), "Invalid Credentials", 100).show();
				}
				
				

							}
						});
b2.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent(LoginActivity.this,RegActivity.class);
		startActivity(i);
		
	}
});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_login, menu);
		return true;
	}

}
