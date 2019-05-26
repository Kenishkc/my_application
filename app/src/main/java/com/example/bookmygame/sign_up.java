package com.example.bookmygame;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class sign_up extends AppCompatActivity {
    private TextInputLayout fname, usname, pw, cpw,phone ;


    private Button reg;
    private TextView login;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        setup();
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (validate()) ;

                String username = fname.getEditText().toString().trim();
                String password = pw.getEditText().toString().trim();

                auth.createUserWithEmailAndPassword(username,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(sign_up.this, "regestation is sucessfull", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(sign_up.this, "regestation is failed", Toast.LENGTH_SHORT).show();
                        }

                    }
                });

            }
        });
    }


    public void setup() {
        fname = (TextInputLayout) findViewById(R.id.fname);
        usname = (TextInputLayout) findViewById(R.id.usname);
        pw = (TextInputLayout) findViewById(R.id.pw);
        cpw = (TextInputLayout) findViewById(R.id.cpw);
        phone=(TextInputLayout)findViewById(R.id.phoneno);
        reg = (Button) findViewById(R.id.Regester);


              login=(TextView)findViewById(R.id.Login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sign_up.this,login_form.class));
            }
        });
    }

    private boolean validate() {
        boolean result = false;
        String nam = fname.getEditText().toString();
        String usnam = usname.getEditText().toString();
        String pass = pw.getEditText().toString();
        String cpass = cpw.getEditText().toString();
        String phoneno= phone.getEditText().toString();





        if (nam.isEmpty() || usnam.isEmpty() || pass.isEmpty() || cpass.isEmpty() || phoneno.isEmpty()) {

            Toast.makeText(this, "Please enter the detail", Toast.LENGTH_SHORT).show();

        } else {

            result = true;
        }
        return result;

    }

}

