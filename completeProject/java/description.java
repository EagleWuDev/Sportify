package com.eagle.sportify;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ewu1 on 11/12/2015.
 */
public class description extends Activity {

    Button notification;
    TextView textView;
    TextView title;
    String name;
    String yes;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        title = (TextView)findViewById(R.id.title2);
        textView = (TextView) findViewById(R.id.longDescription);

        bundle = getIntent().getExtras();
        if (bundle != null){
            name = bundle.getString("value");
            yes = bundle.getString("value2");
        }

        title.setText(name);
        textView.setText(yes);


        notification = (Button) findViewById(R.id.buttonnote);

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(description.this, Notification.class);
                intent.putExtra("title3", name);
                startActivity(intent);
            }
        });


    }
}
