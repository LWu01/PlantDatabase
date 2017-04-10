package com.lisa.currys.plantdatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.os.FileObserver.CREATE;
import static com.lisa.currys.plantdatabase.PlantInfo.COL_EXTRA;
import static com.lisa.currys.plantdatabase.PlantInfo.COL_HARVEST;
import static com.lisa.currys.plantdatabase.PlantInfo.COL_LIGHT;
import static com.lisa.currys.plantdatabase.PlantInfo.COL_NAME;
import static com.lisa.currys.plantdatabase.PlantInfo.COL_SOIL;
import static com.lisa.currys.plantdatabase.PlantInfo.COL_SOW;
import static com.lisa.currys.plantdatabase.PlantInfo.COL_TEMP;
import static com.lisa.currys.plantdatabase.PlantInfo.COL_WATER;
import static com.lisa.currys.plantdatabase.PlantInfo.TABLE_NAME;
import static com.lisa.currys.plantdatabase.PlantInfo._ID;

/**
 * Created by CURRYS on 21/03/2017.
 */

public class DbHelper extends SQLiteOpenHelper {
    //schema for DB - creates and maintains tables and columns
    //if change schema, must increment DB version by 1

    public static final String DATABASE_NAME = "MyPlants.db";
    public static final int DATABASE_VERSION = 1;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    private static final
    String CREATE_TABLE = "create table " + TABLE_NAME +
            "(" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COL_NAME + " TEXT, " + COL_SOW + " TEXT, " + COL_SOIL + " TEXT, "
            + COL_WATER + " TEXT, " + COL_TEMP + " TEXT, " + COL_LIGHT + " TEXT, "
            + COL_HARVEST + " TEXT, " + COL_EXTRA + " TEXT);";

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}

