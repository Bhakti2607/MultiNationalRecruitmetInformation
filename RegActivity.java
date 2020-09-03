package com.example.mri;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegActivity extends Activity {
	SQLiteDatabase db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reg);
		Button bt=(Button)findViewById(R.id.button1);
        Button b2=(Button)findViewById(R.id.button2);
		   final EditText et=(EditText)findViewById(R.id.editText1);
	        final EditText et1=(EditText)findViewById(R.id.editText2);
	        final EditText et2=(EditText)findViewById(R.id.editText3);
bt.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					String s=et.getText().toString();
					String s1=et1.getText().toString();
					String s2=et2.getText().toString();
					
				db=openOrCreateDatabase("Student", MODE_PRIVATE, null);
				db.execSQL("create table if not exists ee(name varchar,phno varchar,address varchar)");
				db.execSQL("insert into ee values('"+s+"','"+s1+"','"+s2+"')");
				Toast.makeText(getApplicationContext(), "inserted", 100).show();
				
				}
			});
b2.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent it=new Intent(RegActivity.this,LoginActivity.class);
		startActivity(it);
		
	}
});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_reg, menu);
		return true;
	}

}
