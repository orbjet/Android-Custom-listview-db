package com.sw.customlistview;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Alen on 16.6.2015.
 */
public class DBHelper extends SQLiteOpenHelper {

    //Create basic info for the database
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "MyTodo.db";

    //Create the structure of the database
    public static final String TABLE_NAME = "todo";
    public static final String COLUMN_ID ="_id";
    public static final String COLUMN_DATE = "date";
    public static final String COLUMN_NOTE = "note";

    //Sql queries for database initialisation and deletion
    private final static String TYPE = " TEXT ";
    private final static String SQL_CREATE = "CREATE TABLE "+TABLE_NAME + " (" +
            COLUMN_ID + " INTEGER PRIMARY KEY, "+ COLUMN_DATE + TYPE + ", " + COLUMN_NOTE + TYPE +");";

    private final static String SQL_DELETE = "DROP TABLE IF EXISTS " + TABLE_NAME;



    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE);
        Log.e("DATABASE: ", "CREATED");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            db.execSQL(SQL_DELETE);
            onCreate(db);

    }

}
