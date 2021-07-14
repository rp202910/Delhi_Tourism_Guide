package com.example.delhitourismguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        final Intent intent=getIntent();
        int str=intent.getIntExtra("coming",-1);
        ImageView textView=(ImageView) findViewById(R.id.image);
        textView.setImageResource(str);
        TextView text=(TextView)findViewById(R.id.text1);
        String str1=intent.getStringExtra("comingExtra");
        text.setText(str1);
        Button but =(Button) findViewById(R.id.button1);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("hello","jai hoooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                Intent intent1 = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse(intent.getStringExtra("comingExtra1")));
                startActivity(intent1);


            }
        });

       TextView btn1 =(TextView) findViewById(R.id.hint3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String str=intent.getStringExtra("comingExtra2");
                Log.i("hello","Roshan Pandey 1906138");
                Intent intent1 = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse(intent.getStringExtra("comingExtra2")));


                startActivity(intent1);


            }
        });

    }



}
