package com.example.delhitourismguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Forts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forts);
        final ArrayList<Word> array=new ArrayList<>();
        array.add(new Word("Qila Rai Pithora",R.mipmap.app_pithora,""));
        array.add(new Word("Lal Kot, Mehrauli",R.mipmap.app_lal,""));
        array.add(new Word("Tughlaqabad Fort",R.mipmap.app_tughlaq,""));
        array.add(new Word("Firozabad Fort",R.mipmap.app_firoz,""));
        array.add(new Word("Red Fort",R.mipmap.app_red,""));
        array.add(new Word("Salimgarh Fort",R.mipmap.app_salim,""));
        array.add(new Word("Purana Quila",R.mipmap.app_purana,""));


        CustomAdapter k=new CustomAdapter(this,array,R.color.category_forts);
        ListView list=(ListView)findViewById(R.id.rootview);
        list.setAdapter(k);


    }
}
