package com.example.betateacher;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import static com.example.betateacher.FBref.refStudents;
import static com.example.betateacher.FBref.refTeachers;


public class LoginActivty extends AppCompatActivity{
    // implements AdapterView.OnItemSelectedListener {
    Switch s;
    EditText eTname, eTphone, eTcode, eTcl,eTexp,eTab;
    String name, phone, SClass, uid, Experience, About, TypeCar, text;
    Spinner spinner;
    boolean tea;
    FirebaseAuth mAuth;
    Student student;
    Teacher teacher;
    PhoneAuthCredential c;
    private String mVerificationId;
    Boolean mVerificationInProgress = false;

    private static final String TAG = "Phone";
    PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();
        eTphone = findViewById(R.id.eTphone);
        eTcode = findViewById(R.id.eTcode);
        eTab = findViewById(R.id.eTab);
        eTname = findViewById(R.id.eTname);
        eTexp = findViewById(R.id.eTexp);
        eTcl = findViewById(R.id.eTcl);
        s = findViewById(R.id.switch1);
        spinner = findViewById(R.id.spinner1);
  //      ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numbers, android.R.layout.simple_spinner_item);
    //    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
   //     spinner.setAdapter(adapter);
  //      spinner.setOnItemSelectedListener(this);

    }


/*    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TypeCar = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }
*/
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void SpinnerSwitch(View v) {
        if (s.isChecked()) {
            tea = true;
            Toast.makeText(LoginActivty.this, "Hello Student", Toast.LENGTH_LONG).show();
        }
        if (tea) {
            spinner.setVisibility(View.VISIBLE);
            eTexp.setVisibility(View.INVISIBLE);
            eTab.setVisibility(View.INVISIBLE);
        }
    }

    public void logorreg(View view) {
        if(!tea) {
            name = eTname.getText().toString();
            SClass = eTcl.getText().toString();
            phone = eTphone.getText().toString();
            final ProgressDialog pd = ProgressDialog.show(this, "Register", "Registering...", true);
            if (name.isEmpty()) eTname.setError("you must enter a name");
            if (phone.isEmpty()) eTphone.setError("you must enter a phone number");
            if (SClass.isEmpty())eTcl.setError("you must enter your class:");
            upload();

        }
        else {
            name = eTname.getText().toString();
            Experience = eTexp.getText().toString();
            About = eTab.getText().toString();
            SClass = eTcl.getText().toString();
            phone = eTphone.getText().toString();
            if (name.isEmpty()) eTname.setError("you must enter a name");
            if (About.isEmpty()) eTab.setError("you must enter something about yourself");
            if (Experience.isEmpty()) eTexp.setError("you must enter your experience in school subjects!");
            if (phone.isEmpty()) eTphone.setError("you must enter a phone number");
            if (SClass.isEmpty())eTcl.setError("you must enter your class!");

            final ProgressDialog pd = ProgressDialog.show(this, "Register", "Registering...", true);
            upload();
        }


    }
    public  void  upload(){
        if (tea) {
            student=new Student(name, SClass, phone, uid);
            refStudents.child("Students").child(phone).setValue(student);
            ProgressDialog pd = ProgressDialog.show(this, "Register", "Registering...", true);
            Toast.makeText(LoginActivty.this, "Successful registration", Toast.LENGTH_LONG).show();
            Intent si = new Intent(LoginActivty.this, CreditsActivity.class);
            startActivity(si);
        }
        else {
            teacher=new Teacher(name, phone, Experience, About,uid);
            refTeachers.child("Teachers").child(phone).setValue(teacher);
            ProgressDialog pd = ProgressDialog.show(this, "Register", "Registering...", true);
            Toast.makeText(LoginActivty.this, "Successful registration", Toast.LENGTH_LONG).show();
            Intent si = new Intent(LoginActivty.this, CreditsActivity.class);
            startActivity(si);
        }
    }

}