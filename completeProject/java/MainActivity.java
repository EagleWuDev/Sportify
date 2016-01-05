package com.eagle.sportify;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
//replaced actual names with fake ones
public class MainActivity extends Activity {

    private ListView listView;
    private CustomListViewAdapter customListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listViewSchools);

        ArrayList <HashMap<String, String>> List = new ArrayList<>();

        final String[] title = {
                "Lacrosse",
                "Soccer",
                "Soccer",
                "Baseball",
                "Football",
                "Tennis",
                "Tennis"};

        String[] description = {
                "Girls : Schedule Spring 2015",
                "Boys : Schedule Spring 2015" ,
                "Girls : Schedule Spring 2015",
                "Boys : Schedule Spring 2015",
                "Boys : Schedule 2015",
                "Girls : Schedule Spring 2015",
                "Boys : Schedule Spring 2015"};

        final String[] largedescription = {
                "Games \n Home: Monday - 3/2 - 7pm \n Bentley: Monday - 3/9 - 7pm \n Home: Monday - 3/16 - 7pm \n" +
                " Home: Monday - 3/16 - 7pm \n\nTeam Roster \n 72: Sydney Badger- Feshman \n" +
                " 73: Casey Miller - Sophomore \n 20: Erin Farrell- Feshman \n 30: Lily Dan- Feshman \n 70: Zoe hu- Feshman \n 75: Ian Shepard - Sophomore \n 22: Lisa Zhang- Feshman \n 54: Anahita Iyer- Feshman \n 56: Danielle Patrick- Feshman \n 52: laura Enma- Feshman \n " +
                        "\n\n Contact\n FaceBook: www.facebook.com/groups/babsoncollege2019/",
                "Games \n" +
                        " Home: Monday - 3/2 - 7pm \n" +
                        " Bentley: Monday - 3/9 - 7pm \n" +
                        " Home: Monday - 3/16 - 7pm \n" +
                        "\n" +
                        "\n" +
                        "Team Roster \n" +
                        " 72: Sydney Badger- Feshman \n" +
                        " 73: Casey Miller - Sophomore \n" +
                        " 20: Erin Farrell- Feshman \n" +
                        " 30: Lily Dan- Feshman \n" +
                        " 70: Zoe hu- Feshman \n" +
                        " 75: Ian Shepard - Sophomore \n" +
                        " 22: Lisa Zhang- Feshman \n" +
                        " 54: Anahita Iyer- Feshman" +
                        "\n" +
                        "\n" +
                        " Contact\n" +
                        " FaceBook: www.facebook.com/groups/babsoncollege2019/",
                "Test",
                "Test",
                "Test",
                "Test",
                "Test"};


        for (int i = 0; i < 7; i++){
            HashMap<String, String> data = new HashMap<>();
        data.put("title", title[i]);
        data.put("description", description[i]);
        data.put("large description", largedescription[i]);
        List.add(data);}

        customListViewAdapter = new CustomListViewAdapter(getApplicationContext(), List);
        listView.setAdapter(customListViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, description.class);
                String title2 = (title[position]);
                String description = (largedescription[position]);
                i.putExtra("value", title2);
                i.putExtra("value2", description);
                startActivity(i);
        }

    });


    }

}
