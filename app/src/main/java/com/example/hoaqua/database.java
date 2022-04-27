package com.example.hoaqua;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper {
    public static final String DATABASE = "data";
    public static final String TABLE = "tbHoaQua";
    public static final String ID = "id";
    public static final String Ten = "name";
    public static final String Mota = "mota";
    SQLiteDatabase db;

    public database(@Nullable Context context) {
        super(context, DATABASE, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = " CREATE TABLE " + TABLE + "("
                + ID +" INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + Ten +" TEXT ,"
                + Mota +"TEXT )";
        sqLiteDatabase.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


    public void AddTT(HoaQua temp) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        //values.put(ID,temp.getId());
        values.put(Ten,temp.getName());
        values.put(Mota,temp.getMota());
        db.insert(TABLE,null,values);
    }
}
