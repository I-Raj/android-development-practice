package com.example.inchararaj.assignment3_second;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customlistAdapter extends ArrayAdapter<String> {
    private final Activity activity;
    private final String[] itemname;
    private final Integer[] image;

    public customlistAdapter(Activity activity, String[] itemname, Integer[] image)
    {
        super(activity,R.layout.characterlist,itemname);
        this.activity=activity;
        this.itemname=itemname;
        this.image=image;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater= activity.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.characterlist, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(image[position]);
        return rowView;

    };
}
