package com.astra.melkovhw151;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        Button btnSynchronize = findViewById(R.id.btn_synchronize);
        btnSynchronize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SYNC);
                Calendar calendar = Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR);

                //вставьте обработку условий по времени
                if (hour > 6 && hour < 14) {
                    intent.setData(Uri.parse("http://morning"));
                } else if (hour == 14) {
                    intent.setData(Uri.parse("http://day"));
                } else {
                    intent.setData(Uri.parse("http://evening"));
                }

                startActivity(intent);
            }
        });
    }
}