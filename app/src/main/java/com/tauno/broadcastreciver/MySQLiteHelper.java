package com.tauno.broadcastreciver;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Tauno on 3.04.2016.
 */
public class MySQLiteHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Calculator";

    public static final String TABLE_OPERANDTYPE = "operandtype";
    public static final String TABLE_DAYSTATISTIC = "daystatistic";
    public static final String TABLE_OPERATION = "operation";

    //COMMON USE
    public static final String COLUMN_OPERANDID = "operand_id";
    public static final String COLUMN_ID = "id";


    //OPERANDTYPE table
    public static final String COLUMN_OPERAND = "operand";
    public static final String COLUMN_LIFETIMECOUNTER = "lifetimecounter";

    //OPERATION table
    public static final String COLUMN_NUM1 = "number1";
    public static final String COLUMN_NUM2 = "number2";
    public static final String COLUMN_RES = "result";
    public static final String COLUMN_TIMESTAMP = "timestamp";

    //DAYSTATISTIC table
    public static final String COLUMN_DAYSTAMP = "daystamp";
    public static final String COLUMN_DAYCOUNTER = "daycounter";

    private static final String CREATE_TABLE_OPERANDTYPE = "CREATE TABLE "
            + TABLE_OPERANDTYPE + "(" +
            COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            COLUMN_OPERAND + " TEXT," +
            COLUMN_LIFETIMECOUNTER + " INTEGER" + ")";

    private static final String CREATE_TABLE_OPERATION = "CREATE TABLE "
            + TABLE_OPERATION + "(" +
            COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            COLUMN_NUM1  + " REAL," +
            COLUMN_NUM2 + " REAL," +
            COLUMN_RES + " REAL," +
            COLUMN_TIMESTAMP + " INTEGER," +
            "FOREIGN KEY(" + COLUMN_OPERANDID + ") REFERENCES " + TABLE_OPERANDTYPE + "(" + COLUMN_ID + ")" + ")";

    private static final String CREATE_TABLE_DATSTATISTIC = "CREATE TABLE "
            + TABLE_OPERANDTYPE + "(" +
            COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            COLUMN_DAYSTAMP + " INTEGER," +
            COLUMN_DAYCOUNTER + " INTEGER," +
            "FOREIGN KEY(" + COLUMN_OPERANDID + ") REFERENCES " + TABLE_OPERANDTYPE + "(" + COLUMN_ID + ")" + ")";

    public MySQLiteHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_OPERANDTYPE);
        db.execSQL(CREATE_TABLE_OPERATION);
        db.execSQL(CREATE_TABLE_DATSTATISTIC);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(MySQLiteHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_OPERANDTYPE);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_OPERATION);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DAYSTATISTIC);
        onCreate(db);
    }

}
