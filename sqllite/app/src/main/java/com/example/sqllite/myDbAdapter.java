package com.example.sqllite;

import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;

public class myDbAdapter  { // class 1

    myDbHelper myhelper;//static class ka object create kiya

    myDbAdapter(Context context){ // class 1 ka constructor hai
        myhelper=new myDbHelper(context);
    }

    public long insertData(String t1, String t2) {

        SQLiteDatabase dbb=myhelper.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(myDbHelper.NAME,t1);
        contentValues.put(myDbHelper.MyPASSWORD,t2);
        long id=dbb.insert(myDbHelper.TABLE_NAME,null,contentValues);
        return id;// if else me yahi check kar raha hai
    }

    public long updatedata(String oldName, String newnamee){

        SQLiteDatabase dbb=myhelper.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(myDbHelper.NAME,newnamee);
        String[] whereArgs= {oldName};
        int count =dbb.update(myDbHelper.TABLE_NAME,contentValues, myDbHelper.NAME+" = ?",whereArgs );
        return count;// if else me yahi check kar raha hai
    }

    public String getData() {
        SQLiteDatabase db = myhelper.getWritableDatabase();
        String[] columns = {myDbHelper.UID,myDbHelper.NAME,myDbHelper.MyPASSWORD};
        Cursor cursor =db.query(myDbHelper.TABLE_NAME,columns,null,null,null,null,null);
        StringBuffer buffer= new StringBuffer();
        while (cursor.moveToNext())
        {
            int cid =cursor.getInt(cursor.getColumnIndex(myDbHelper.UID));
            String name =cursor.getString(cursor.getColumnIndex(myDbHelper.NAME));
            String  password =cursor.getString(cursor.getColumnIndex(myDbHelper.MyPASSWORD));
            buffer.append(cid+ "   " + name + "   " + password +" \n");
        }
        return buffer.toString();


    }

    public  int delete(String uname)
    {
        SQLiteDatabase db = myhelper.getWritableDatabase();
        String[] whereArgs ={uname};

        int count =db.delete(myDbHelper.TABLE_NAME ,myDbHelper.NAME+" = ?",whereArgs);
        return  count;
    }


    static class myDbHelper extends SQLiteOpenHelper// 2 static class
    {
        private static final String DATABASE_NAME = "myDatabase";    // Database Name
        private static final String TABLE_NAME = "myTable";   // Table Name
        private static final int DATABASE_Version = 2;  // Database Version
        private static final String UID="_id";     // Column I (Primary Key)
        private static final String NAME = "Name";    //Column II
        private static final String MyPASSWORD= "Password";    // Column III

        private static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+
                " ("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+NAME+" VARCHAR(255) ,"+ MyPASSWORD+" VARCHAR(225));";
        private static final String DROP_TABLE ="DROP TABLE IF EXISTS "+TABLE_NAME;
        private Context context;

        public myDbHelper( Context context) {
            super(context, DATABASE_NAME, null, DATABASE_Version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREATE_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL(DROP_TABLE);
            onCreate(db);
        }
    }

}
