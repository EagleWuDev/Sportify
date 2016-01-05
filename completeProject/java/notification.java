package com.eagle.sportify;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

/**
 * Created by ewu1 on 11/12/2015.
 */
public class Notification extends Activity {

    TextView title;
    Button send;
    Bundle bundle;
    CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_info);

        title = (TextView) findViewById(R.id.title3);
        send = (Button) findViewById(R.id.Buttonsend);
        calendarView = (CalendarView)findViewById(R.id.calendar);

        bundle = getIntent().getExtras();

        if (bundle != null){
            title.setText(bundle.getString("title3"));
        }

    }
}
