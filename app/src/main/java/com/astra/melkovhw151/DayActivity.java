package com.astra.melkovhw151;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class DayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        initViews();
    }

    private void initViews() {
        Calendar calendar = Calendar.getInstance();

        TextView txtDay = findViewById(R.id.txtDay);
        txtDay.setText(calendar.getTime().toString());
    }
}
