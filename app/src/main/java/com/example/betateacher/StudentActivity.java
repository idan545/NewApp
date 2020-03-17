package com.example.betateacher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class StudentActivity extends AppCompatActivity {
    Intent t;
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
    /*public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String s = item.getTitle().toString();
        t = new Intent(this, StudentActivity.class);
        if (s.equals("History")) {
            t = new Intent(this, history.class);
            startActivity(t);
        }
        if (s.equals("Profile")) {
            t = new Intent(this, profileCustomer.class);
            startActivity(t);
        }
        if (s.equals("Credits")) {
            t = new Intent(this, CreditsActivity.class);
            startActivity(t);
        }
        return super.onOptionsItemSelected(item);
    }
*/
    public void order(View view) {

        t=new Intent(StudentActivity.this , OrdersActivity.class);
        startActivity(t);

    }

}