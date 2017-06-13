package com.riftinnovation.pindrop;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.riftinnovation.pindrop.data.Pin;

import java.sql.SQLException;

/**
 * Created by anton on 6/13/2017.
 */

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "pins.db";
    private static final int DATABASE_VERSION = 1;

    private Dao<Pin, Integer> pinDao;

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try{
            TableUtils.createTable(connectionSource,Pin.class);
        }catch (SQLException e){
            Log.e(DatabaseHelper.class.getName(),"unable to create database",e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {
        try{
            TableUtils.dropTable(connectionSource,Pin.class,true);
            onCreate(sqLiteDatabase,connectionSource);

        }catch (SQLException e){
            Log.e(DatabaseHelper.class.getName(),"unable to update database",e);
        }
    }

    public Dao<Pin,Integer> getPinDao() throws SQLException{
        if (pinDao==null){
            pinDao = getDao(Pin.class);
        }
        return pinDao;
    }
}
