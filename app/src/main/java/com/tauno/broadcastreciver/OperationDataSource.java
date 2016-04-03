package com.tauno.broadcastreciver;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tauno on 3.04.2016.
 */
public class OperationDataSource {
    private SQLiteDatabase database;
    private MySQLiteHelper dbHelper;
    private String[] allColumns = { MySQLiteHelper.COLUMN_ID,
            MySQLiteHelper.COLUMN_NUM1, MySQLiteHelper.COLUMN_NUM2,
            MySQLiteHelper.COLUMN_RES, MySQLiteHelper.COLUMN_TIMESTAMP, MySQLiteHelper.COLUMN_OPERANDID};

    public OperationDataSource(Context context) {
        dbHelper = new MySQLiteHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public long createOperation(float a, float b, float res, float timestamp, int operandId) {

        ContentValues values = new ContentValues();
        values.put(MySQLiteHelper.COLUMN_NUM1, a);
        values.put(MySQLiteHelper.COLUMN_NUM2, b);
        values.put(MySQLiteHelper.COLUMN_RES, res);
        values.put(MySQLiteHelper.COLUMN_TIMESTAMP, timestamp);
        values.put(MySQLiteHelper.COLUMN_NUM1, operandId);

        return database.insert(MySQLiteHelper.TABLE_OPERATION, null, values);
    }

    public void deleteOperation(Operation op) {
        long id = op.getId();
        System.out.println("Comment deleted with id: " + id);
        database.delete(MySQLiteHelper.TABLE_OPERATION, MySQLiteHelper.COLUMN_ID
                + " = " + id, null);
    }

  /*  public List<Operation> getAllOperations() {
        List<Operation> operations = new ArrayList<Operation>();

        Cursor cursor = database.query(MySQLiteHelper.TABLE_OPERATION,
                allColumns, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Comment comment = cursorToComment(cursor);
            operations.add(comment);
            cursor.moveToNext();
        }
        // make sure to close the cursor
        cursor.close();
        return operations;
    }
*/


}
