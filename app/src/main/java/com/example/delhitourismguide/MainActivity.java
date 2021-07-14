package com.example.delhitourismguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView temple=(TextView)findViewById(R.id.temples);
        temple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Temples.class);
                startActivity(intent);
            }
        });
        TextView fort=(TextView)findViewById(R.id.forts);
        fort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Forts.class);
                startActivity(intent);
            }
        });
        TextView park=(TextView)findViewById(R.id.parks);
        park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Parks.class);
                startActivity(intent);
            }
        });
        TextView other=(TextView)findViewById(R.id.others);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Others.class);
                startActivity(intent);
            }
        });
    }
}
