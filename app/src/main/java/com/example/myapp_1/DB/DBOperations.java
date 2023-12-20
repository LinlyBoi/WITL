package com.example.myapp_1.DB;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DBOperations {

    private DBHelper dbHelper;

    public DBOperations(Context context) {
        dbHelper = new DBHelper(context);
    }

    // Insert user data into the users table
    public long insertUser(String UserName,  String phone,String email, String password) {
        try {
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("UserName", UserName);
            values.put("phone", phone);
            values.put("U_email", email);
            values.put("U_password", password);

            long newRowId = db.insert("users", null, values);

            return newRowId;
        }
        catch (Exception e){
            return 0;
        }

    }
    public boolean checkLoginCredentials(String UserName, String password) {
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] columns = {"U_ID"};
        String selection = "UserName=? AND U_password=?";
        String[] selectionArgs = {UserName, password};

        Cursor cursor = db.query("users", columns, selection, selectionArgs, null, null, null);

        boolean isCredentialsValid = cursor.moveToFirst();
        cursor.close();

        return isCredentialsValid;
    }

    // Add other methods as needed
}

    // Retrieve all users from the users table
//    public Cursor getAllUsers() {
//        SQLiteDatabase db = dbHelper.getReadableDatabase();
//
//        String[] columns = {"U_ID", "first_name", "last_name", "U_email", "phone", "U_password"};
//        return db.query("users", columns, null, null, null, null, null);
//    }

    // Delete a user from the users table based on their email
//    public int deleteUser(String email) {
//        SQLiteDatabase db = dbHelper.getWritableDatabase();
//
//        String selection = "U_email=?";
//        String[] selectionArgs = {email};
//
//        int deletedRows = db.delete("users", selection, selectionArgs);
//        db.close();
//
//        return deletedRows;
//    }


