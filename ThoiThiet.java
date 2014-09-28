package com.thoitiet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class ThoiThiet extends ActionBarActivity implements OnClickListener {

	private ImageView imgicon;
	private EditText txtkey;
	private Button btntim;
	private TextView txt1;
	private TextView txt2;
	private TextView txt3;
	private TextView txt4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thoi_thiet);
		initialize();
	}
	
	private void initialize()
	{
		imgicon=(ImageView) findViewById(R.id.imgicon);
		txtkey=(EditText)findViewById(R.id.txtkey);
		btntim=(Button)findViewById(R.id.btntim);
		txt1=(TextView) findViewById(R.id.txt1);
		txt2=(TextView) findViewById(R.id.txt2);
		txt3=(TextView) findViewById(R.id.txt3);
		
		btntim.setOnClickListener(this);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.thoi_thiet, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId())
		{
			case R.id.gioithieu:
				Intent gt=new Intent("com.thoitiet.gioithieu");
				startActivity(gt);
				break;
			case R.id.caidat:
				Intent cd=new Intent("com.thoitiet.caidat");
				startActivity(cd);
				break;	
		}
		return false;
	}
	@Override
	public void onClick(View v) {
		switch(v.getId())
		{
			case R.id.btntim:
				break;
		}
	}
	
}
