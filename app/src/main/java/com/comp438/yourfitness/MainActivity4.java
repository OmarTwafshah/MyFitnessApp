package com.comp438.yourfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        listview = findViewById(R.id.listView);

        List<String> list = new ArrayList<>();
        list.add("Arms");
        list.add("The Chest");
        list.add("Back Muscles");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                if(position == 0){
                    Intent intent= new Intent(MainActivity4.this,MainActivity6.class);
                    startActivity(intent);
                }else if(position == 1 ){
                    Intent intent= new Intent(MainActivity4.this,MainActivity7.class);
                    startActivity(intent);
                }else if(position == 2 ){
                    Intent intent= new Intent(MainActivity4.this,MainActivity8.class);
                    startActivity(intent);
                }

            }
        });

    }
}