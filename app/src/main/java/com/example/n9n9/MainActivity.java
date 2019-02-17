package com.example.n9n9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnschedule;
    Button btnstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnschedule = (Button) findViewById(R.id.btnschedule);
        btnschedule.setOnClickListener(this);
        btnstart = (Button) findViewById(R.id.btnstart);
        btnstart.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnschedule:
                // кнопка ОК
                Intent intent = new Intent(MainActivity.this, ScheduleListActivity.class);
                startActivity(intent);
                break;
            case R.id.btnstart:
                // кнопка Cancel
                Intent intent2 = new Intent(MainActivity.this, StartActivity.class);
                startActivity(intent2);
                break;


        }
    }
}
