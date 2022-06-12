package com.example.unairhebat;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;

public class level2 extends Activity{
	Intent i;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level2_activity);
	}
	
	public void aksi (View ygDiklik){
		switch (ygDiklik.getId()){
		case R.id.bKembali:
			i=new Intent(level2.this, setelahlogin.class);
			i.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
			startActivity(i);
			this.finish();
			break;
		}
	}
}