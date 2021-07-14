package com.example.delhitourismguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Temples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temples);
        final ArrayList<Word> array=new ArrayList<>();
        array.add(new Word("Lotus Temple",R.mipmap.app_lotus,"geo:28.5535,77.2588","https://www.fabhotels.com/blog/lotus-temple-delhi/"));
        array.add(new Word("Akshardham Temple",R.mipmap.app_akshardham,"geo:28.6127, 77.2773","https://akshardham.com/"));
        array.add(new Word("Hanuman Mandir, Jhandewalan",R.mipmap.app_hanuman,"geo:28.6450, 77.1981","https://www.templepurohit.com/hindu-temple/hanuman-mandir-jhandewalan/"));
         array.add(new Word("Jhandewalan Mandir",R.mipmap.app_jhandewalan,"geo:28.6491, 77.2042","https://www.bhaktibharat.com/mandir/jhandewalan"));
         array.add(new Word("Chhatarpur Mandir",R.mipmap.app_chatapur,"geo:28.5030, 77.1809"));
         array.add(new Word("Kalkaji Temple",R.mipmap.app_kalkaji,"geo:28.5498, 77.2607"));
         array.add(new Word("Jama Masjid",R.mipmap.app_jama,"geo:28.6507, 77.2334"));
         array.add(new Word("Sacred Heart Cathedral",R.mipmap.app_church,"geo:28.6286, 77.2068"));
    CustomAdapter adapter=new CustomAdapter(this,array,R.color.category_temples);
    final ListView listView=(ListView)findViewById(R.id.rootview);
    listView.setAdapter(adapter);
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Word words=array.get(position);
            Intent intent=new Intent(getApplicationContext(),Activity2.class);
            intent.putExtra("coming",words.getImage());
            intent.putExtra("comingExtra",words.getWord());
            intent.putExtra("comingExtra1",words.getLocation());
            intent.putExtra("comingExtra2",words.getUrl());
            startActivity(intent);

        }
    });

    }

}
