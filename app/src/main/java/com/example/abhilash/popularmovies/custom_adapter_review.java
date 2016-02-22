package com.example.abhilash.popularmovies;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class custom_adapter_review  extends ArrayAdapter<review> {

   private ArrayList<review> re = new ArrayList<review>();

    public custom_adapter_review(Context context, ArrayList<review> re) {
        super(context, R.layout.list_layout_review, re);
        this.re = re;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View customView = myInflater.inflate(R.layout.list_layout_review, null);

        review rv = re.get(position);

        TextView author_text = (TextView) customView.findViewById(R.id.author_text);
        TextView content_text = (TextView) customView.findViewById(R.id.content_text);

        author_text.setText(rv.getAuthor() + ":");
        content_text.setText(rv.getContent());

        return customView;
    }
}