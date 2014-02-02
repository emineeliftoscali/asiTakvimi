package com.example.androidasitakvimi;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.text.format.DateFormat;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends Activity implements DatePickerFragment.TheListener {
	TextView mgetBirthdateText;
	//DatePicker mgetBirthDate;
	Button mgetBirthDateButton;
	
	

	//java.text.DateFormat fmtDateAndTime = DateFormat.getDateTimeInstance();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//mgetBirthDate = (DatePicker) findViewById(R.id.datePicker1);
		mgetBirthdateText = (TextView) findViewById(R.id.textView1);
		mgetBirthDateButton = (Button) findViewById(R.id.buttonhesapla);
		mgetBirthDateButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DialogFragment picker = new DatePickerFragment();
                picker.show(getFragmentManager(), "datePicker");
                

			}
		});
		
	}
	@Override 
    public void returnDate(String date) {
        // TODO Auto-generated method stub
        mgetBirthdateText.setText(date);
    }
	
    
}

