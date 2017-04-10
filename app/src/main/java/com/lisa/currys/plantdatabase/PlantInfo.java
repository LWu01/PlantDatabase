package com.lisa.currys.plantdatabase;

/**
 * Created by CURRYS on 22/03/2017.
 */

public class PlantInfo {
//Contract class for DB

    public static final String TABLE_NAME = "items";

    public static final String _ID = "_id";
    public static final String COL_NAME = "name";
    public static final String COL_SOW = "sow_date";
    public static final String COL_SOIL = "soil_pref";
    public static final String COL_WATER = "water_pref";
    public static final String COL_TEMP = "temp_pref";
    public static final String COL_LIGHT = "light_pref";
    public static final String COL_HARVEST = "harvest_date";
    public static final String COL_EXTRA = "extra_info";

    public int _id;
    public String title;
    public String sow;
    public String soil;
    public String water;
    public String temp;
    public String light;
    public String harvest;
    public String extra;



}
