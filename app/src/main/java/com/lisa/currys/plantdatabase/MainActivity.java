package com.lisa.currys.plantdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView itemList;
    private DbHelper myDatabase;
    private SimpleCursorAdapter adapter;
    final String[] from = new String[] {PlantInfo._ID, PlantInfo.COL_NAME, PlantInfo.COL_SOW,
            PlantInfo.COL_SOIL, PlantInfo.COL_WATER, PlantInfo.COL_TEMP, PlantInfo.COL_LIGHT,
            PlantInfo.COL_HARVEST, PlantInfo.COL_EXTRA};
    final int[] to = new int[]{};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //access DB
        DbHelper mDbHelper = new DbHelper(this);

        //enter database and arraylist
        //
        //

        itemList = (ListView)findViewById(R.id.listView);


    }
}
