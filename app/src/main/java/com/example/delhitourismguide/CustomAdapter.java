package com.example.delhitourismguide;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Word> {
    int id;

    public CustomAdapter(Activity context, ArrayList<Word> k,int resouceId){
        super(context,0,k);
        id=resouceId;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView=convertView;
        if(listView==null){
            listView=LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        }
        Word currentWord=getItem(position);
        View text=listView.findViewById(R.id.linear);
        int colord= ContextCompat.getColor(getContext(),id);
        text.setBackgroundColor(colord);
        ImageView image1=(ImageView) listView.findViewById(R.id.image);
        assert currentWord != null;
        image1.setImageResource(currentWord.getImage());
        TextView text1=(TextView)listView.findViewById(R.id.name);
        text1.setText(currentWord.getWord());
        return listView;


    }
}
