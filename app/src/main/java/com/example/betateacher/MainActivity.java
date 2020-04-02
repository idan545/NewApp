package com.example.betateacher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    Intent t;
    CheckBox cbStayConnect;
    Boolean stayConnect, registered;
    String phone, code, mVerificationId, uid = "";
    EditText eTphone, eTcode;
    FirebaseUser user;
    ValueEventListener usersListener;


    Boolean mVerificationInProgress = false;
    public static FirebaseAuth refAuth = FirebaseAuth.getInstance();
    private static final String TAG = "Phone";
    PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        eTphone = (EditText) findViewById(R.id.eTcode);
        eTcode = (EditText) findViewById(R.id.eTcode);
        stayConnect = false;
        registered = false;
    }


    public void toregister(View view) {
        t = new Intent(MainActivity.this, LoginActivty.class);
        startActivity(t);
    }
}