package com.tauno.broadcastreciver;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLException;

/**
 * Created by Tauno on 3.04.2016.
 */
public class OperandTypeDataSource {
    private SQLiteOpenHelper dbHelper;
    private SQLiteDatabase database;
    private String[] allColumns = { MySQLiteHelper.COLUMN_ID,
            MySQLiteHelper.COLUMN_OPERAND, MySQLiteHelper.COLUMN_LIFETIMECOUNTER};

    public OperandTypeDataSource(Context context){
        dbHelper = new MySQLiteHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public int updateOperandCount(int operandId){
        ContentValues values = new ContentValues();
       return 0;
    }




/*
    public OperandType createOperandType(char operand){
        ContentValues values = new ContentValues();
        values.put(MySQLiteHelper.COLUMN_OPERAND, String.valueOf(operand));
        values.put(MySQLiteHelper.COLUMN_LIFETIMECOUNTER, 1);
        long insertId = database.insert(MySQLiteHelper.TABLE_OPERANDTYPE, null, values);

    }



*/



}

