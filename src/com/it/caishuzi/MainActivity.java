package com.it.caishuzi;

import java.util.Random;

import android.R.integer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private int bbb;

	public void startGame(View view) {
		//1.�ҵ�����ؼ�
		EditText num1ET = (EditText) findViewById(R.id.left);
		EditText num2ET = (EditText) findViewById(R.id.right);
		//2.��ȡ�ؼ��е�����ֵ
		int num1 = Integer.parseInt(num1ET.getText().toString());
		int num2 = Integer.parseInt(num2ET.getText().toString());
		//3.��ֹ�������ĵ�һ�����ִ��ڵڶ������֣�����Ĵ���
	     if(num1>=num2){
	    	 Toast.makeText(this, "�ڶ������ֱ�����ڵ�һ������", 1).show(); 
	     }
	     else{
		 bbb = new Random().nextInt(num2 - num1) + num1;
		System.out.println(bbb);
		}

	}

	public void submit(View view) {
		EditText resET = (EditText) findViewById(R.id.res);
		int res = Integer.parseInt(resET.getText().toString());
		if (res == bbb) {
			Toast.makeText(this, "��ϲ��¶���", 1).show();
		} else if (res > bbb) {
			Toast.makeText(this, "��µ�̫����", 1).show();
		} else {
			Toast.makeText(this, "��µ�̫С��", 1).show();
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
