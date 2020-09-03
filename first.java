package com.example.mri;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class first extends Activity{
ArrayList<String> al =new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
		final TextView tv=(TextView)findViewById(R.id.textView1);
		final GridView gv=(GridView)findViewById(R.id.gridView1);
		al.add("ACCENTURE");
		al.add("COGNIZANT");
		al.add("DELOITTE");
		al.add("HCL");
		al.add("IBM");
	   
		al.add("MPHASIS");
		al.add("ORACLE");
		al.add("IGATE PATNI");
		al.add("TECH MAHINDRA");
		al.add("TCS");
		al.add("UST GLOBAL");
		al.add("WIPRO");
		
		gv.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, al));
		gv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				String s1=gv.getItemAtPosition(arg2).toString();
				if(s1.equalsIgnoreCase("tcs"))
				{
					Intent it=new Intent(first.this,second.class);
					startActivity(it);
				}
				else if(s1.equalsIgnoreCase("accenture"))
				{
					Intent it1=new Intent(first.this,accent.class);
					startActivity(it1);
				}
				if(s1.equalsIgnoreCase("cognizant"))
				{
					Intent it2=new Intent(first.this,cogni.class);
					startActivity(it2);
				}
				if(s1.equalsIgnoreCase("deloitte"))
				{
					Intent it3=new Intent(first.this,deloit.class);
					startActivity(it3);
				}
				if(s1.equalsIgnoreCase("hcl"))
				{
					Intent it4=new Intent(first.this,hcl.class);
					startActivity(it4);
				}
				
				if(s1.equalsIgnoreCase("ibm"))
				{
					Intent it6=new Intent(first.this,ibm.class);
				    startActivity(it6);
				}
				if(s1.equalsIgnoreCase("micro"))
				{
					Intent it7=new Intent(first.this,micro.class);
					startActivity(it7);
				}
				if(s1.equalsIgnoreCase("mphasis"))
				{
					Intent it8=new Intent(first.this,mphasis.class);
					startActivity(it8);
				}
				if(s1.equalsIgnoreCase("oracle"))
				{
					Intent it9=new Intent(first.this,oracle.class);
					startActivity(it9);
				}
				if(s1.equalsIgnoreCase("Igate patni"))
				{
					Intent it10=new Intent(first.this,patni.class);
					startActivity(it10);
				}
				if(s1.equalsIgnoreCase("tech mahindra"))
				{
					Intent it11=new Intent(first.this,mahindra.class);
					startActivity(it11);
				}
				if(s1.equalsIgnoreCase("ust global"))
				{
					Intent it12=new Intent(first.this,ust.class);
					startActivity(it12);
				}
				if(s1.equalsIgnoreCase("wipro"))
				{
					Intent it13=new Intent(first.this,wipro.class);
					startActivity(it13);
				}
				
			}
		});
	
}
		};
	
			
			
							
		
	
		
	