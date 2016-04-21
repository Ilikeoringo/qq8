package com.it.qq8;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	public void fun(View view) {
		EditText nameET = (EditText) findViewById(R.id.name_et);
		EditText passET = (EditText) findViewById(R.id.pass_et);
		String name = nameET.getText().toString();
		String pass = passET.getText().toString();
		if (name.equals("bin") && pass.equals("123")) {
			Toast.makeText(this, "³É¹¦", Toast.LENGTH_LONG).show();
			Intent intent=new Intent(this,MainActivity.class);
			startActivity(intent);
		} else {
			Toast.makeText(this, "Ê§°Ü", Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		setTitle("QQ");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
