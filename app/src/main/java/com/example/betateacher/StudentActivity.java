package com.example.betateacher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentActivity extends AppCompatActivity {
    Intent t;
    Button btn1, btn2, btn3;
    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String s = item.getTitle().toString();
        t = new Intent(this, StudentActivity.class);
        if (s.equals("History")) {
            t = new Intent(this, HistoryActivity.class);
            startActivity(t);
        }
        if (s.equals("My Profile")) {
            t = new Intent(this, StudentActivity.class);
            startActivity(t);
        }
        if (s.equals("Credits")) {
            t = new Intent(this, CreditsActivity.class);
            startActivity(t);
        }
        return super.onOptionsItemSelected(item);
    }

    public void order(View view) {
        t=new Intent(StudentActivity.this , OrdersActivity.class);
        startActivity(t);

    }



}