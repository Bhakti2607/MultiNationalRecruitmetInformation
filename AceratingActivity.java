package com.example.mri;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class AceratingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_PROGRESS);
		setContentView(R.layout.activity_acerating);
		WebView wv=(WebView)findViewById(R.id.webView1);
		

		 wv.getSettings().setJavaScriptEnabled(true);


		
		String w=getIntent().getStringExtra("wr");
		Toast.makeText(getApplicationContext(), w, Toast.LENGTH_SHORT).show();
		
		wv.setWebChromeClient(new WebChromeClient());
		wv.setWebViewClient(new WebViewClient());
		
		//Uri uri=Uri.parse("www.thefreedictionary.com/dict.aspx?word="+w);
		wv.loadUrl("http://www.glassdoor.co.in/Reviews/Accenture-Reviews-E4138.html="+w);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_acerating, menu);
		return true;
	}

}
