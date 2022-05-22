package com.example.foodreviewproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Organic {

    String organic_name, organic_price, organic_material, organic_method, organic_location;
    int imageId;
    double   locateX, locateY;

    public Organic(String organic_name, String organic_price, String organic_material, String organic_method, String organic_location, int imageId,double locateX,double locateY) {
        this.organic_name = organic_name;
        this.organic_price = organic_price;
        this.organic_material = organic_material;
        this.imageId = imageId;
        this.organic_method = organic_method;
        this.organic_location = organic_location;
        this.locateX = locateX;
        this.locateY = locateY;
    }

    public static class DBHelper extends SQLiteOpenHelper {

        public static final String DBNAME="Signup.db";

        public DBHelper(Context context) {
            super(context,DBNAME, null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase MyDB) {
            MyDB.execSQL("create Table users(username TEXT primary key, password TEXT, phone TEXT , name TEXT )");
        }

        @Override
        public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
            MyDB.execSQL("drop Table if exists users");
        }
        public Boolean insertData(String username, String password, String phone, String name ){
            SQLiteDatabase MyDB= this.getWritableDatabase();
            ContentValues contentValues=new ContentValues();
            contentValues.put("username", username);
            contentValues.put("password", password);
            contentValues.put("phone",phone);
            contentValues.put("name",name);

            long result= MyDB.insert("users",null,contentValues);
            if(result==-1) return false;
            else
                return true;
        }
        public Boolean checkusername(String username){
            SQLiteDatabase MyDB=this.getWritableDatabase();
            Cursor cursor = MyDB.rawQuery("Select * from users where username = ? ",new String[]{username} );
            if(cursor.getCount()>0)
                return true;
            else
                return false;
        }
        public Boolean checkusernamepassword(String username,String password){
            SQLiteDatabase MyDB=this.getWritableDatabase();
            Cursor cursor= MyDB.rawQuery("Select * from users where username = ? and password = ?",new String[]{username,password});
            if (cursor.getCount()>0)
                return true;
            else
                return false;
        }
        public Cursor getData(String name)
        {
            SQLiteDatabase DB=this.getWritableDatabase();
            Cursor cursor=DB.rawQuery("Select name,password,phone from users where username=?",new String[]{name});
            return cursor;
        }
        {

        }
    }
}
