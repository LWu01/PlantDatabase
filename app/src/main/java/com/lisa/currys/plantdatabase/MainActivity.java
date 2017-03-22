package com.lisa.currys.plantdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView itemList;
    DbHelper myDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enter database and arraylist
        //
        //

        itemList = (ListView)findViewById(R.id.listView);


    }
}
