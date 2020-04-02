package com.example.betateacher;


import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

public class OrdersActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    Button btn1, btn2, btn3, btn4;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.lobtn);
        btn3 = findViewById(R.id.datebtn);
        btn4 = findViewById(R.id.orderbtn);
        et1 = findViewById(R.id.et1);
    }
}

