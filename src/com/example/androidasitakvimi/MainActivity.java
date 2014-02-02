package com.example.androidasitakvimi;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView mgetBirthdateText;
	DatePicker mgetBirthDate;
	Button mgetBirthDateButton;
	final Calendar c = Calendar.getInstance();
	int year = c.get(Calendar.YEAR);
	int month = c.get(Calendar.MONTH);
	int day = c.get(Calendar.DAY_OF_MONTH);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mgetBirthDate = (DatePicker) findViewById(R.id.datePicker1);
		mgetBirthdateText = (TextView) findViewById(R.id.textView1);
		
		
		mgetBirthDateButton = (Button) findViewById(R.id.buttonhesapla);
		mgetBirthDateButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDateText(year, month, day);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
    
    public void showDatePickerDialog(View v) {
    	
    	    DialogFragment newFragment = new DatePickerFragment();
    	    newFragment.show(getFragmentManager(), "datePicker");
    	
    }
    public void showDateText(int year,int month,int day){
    	
    	mgetBirthdateText.setText(String.valueOf(year)+String.valueOf(month)+String.valueOf(day));
    }
}

