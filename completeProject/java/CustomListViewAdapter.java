package com.eagle.sportify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ewu1 on 11/12/2015.
 */
public class CustomListViewAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<HashMap<String, String>> teams;
    private static LayoutInflater inflater = null;

    public CustomListViewAdapter(Context context, ArrayList<HashMap<String, String>> data){
        mContext = context;
        teams = data;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }



    @Override
    public int getCount() {
        return teams.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if(convertView == null){
            view = inflater.inflate(R.layout.list_row, null);

            TextView title = (TextView) view.findViewById(R.id.title);
            TextView description = (TextView) view.findViewById(R.id.description);


            HashMap<String, String> mRestuarant = new HashMap<>();
            mRestuarant = teams.get(position);

            title.setText(mRestuarant.get("title"));
            description.setText(mRestuarant.get("description"));



        }

        return view;
    }}
