package com.lisa.currys.plantdatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;




/**
 * Created by CURRYS on 22/03/2017.
 */

public class DbManager {

    private DbHelper dbHelper;
    private Context context;
    private SQLiteDatabase liteDatabase;

    public DbManager(Context c){
        context = c;
    }

    public DbManager open()throws SQLException{
        dbHelper = new DbHelper(context);
        liteDatabase = dbHelper.getWritableDatabase();
        return this;
    }

    public void close(){
        dbHelper.close();
    }

    public void insert(PlantInfo plantInfo){
        ContentValues contentValues = new ContentValues();
        contentValues.put(PlantInfo.COL_NAME, plantInfo.title);
        contentValues.put(PlantInfo.COL_SOW, plantInfo.sow);
        contentValues.put(PlantInfo.COL_SOIL, plantInfo.soil);
        contentValues.put(PlantInfo.COL_WATER, plantInfo.water);
        contentValues.put(PlantInfo.COL_TEMP, plantInfo.temp);
        contentValues.put(PlantInfo.COL_LIGHT, plantInfo.light);
        contentValues.put(PlantInfo.COL_HARVEST, plantInfo.harvest);
        contentValues.put(PlantInfo.COL_EXTRA, plantInfo.extra);

        liteDatabase.insert(PlantInfo.TABLE_NAME, null, contentValues);
    }

    public Cursor fetch(){
        String[] columns = new String[]{ PlantInfo._ID, PlantInfo.COL_NAME, PlantInfo.COL_SOW,
                PlantInfo.COL_SOIL, PlantInfo.COL_WATER, PlantInfo.COL_TEMP, PlantInfo.COL_LIGHT,
                PlantInfo.COL_HARVEST, PlantInfo.COL_EXTRA};
        Cursor cursor = liteDatabase.query(PlantInfo.TABLE_NAME, columns, null, null, null, null, null);
            if (cursor != null){
                cursor.moveToFirst();
            }
            return cursor;
    }

    public void delete(long entry_id){
        liteDatabase.delete(PlantInfo.TABLE_NAME, PlantInfo._ID + "=" + entry_id, null);
    }

    public int update(long entry_id, PlantInfo plantInfo){
        ContentValues contentValues = new ContentValues();
        contentValues.put(PlantInfo.COL_NAME, plantInfo.title);
        contentValues.put(PlantInfo.COL_SOW, plantInfo.sow);
        contentValues.put(PlantInfo.COL_SOIL, plantInfo.soil);
        contentValues.put(PlantInfo.COL_WATER, plantInfo.water);
        contentValues.put(PlantInfo.COL_TEMP, plantInfo.temp);
        contentValues.put(PlantInfo.COL_LIGHT, plantInfo.light);
        contentValues.put(PlantInfo.COL_HARVEST, plantInfo.harvest);
        contentValues.put(PlantInfo.COL_EXTRA, plantInfo.extra);

        int i = liteDatabase.update(PlantInfo.TABLE_NAME, contentValues, PlantInfo._ID + " = " + entry_id, null) ;
        return i;

    }

}
