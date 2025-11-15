package com.tngocnhat.reg_login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    private EditText nameEdit;
    private EditText emailEdit;
    private EditText passwordEdit;
    private ImageButton arrowButton;
    private TextView recoveryLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        nameEdit = findViewById(R.id.name_edit);
        emailEdit = findViewById(R.id.email_edit);
        passwordEdit = findViewById(R.id.password_edit);
        arrowButton = findViewById(R.id.signup_arrow_button);
        recoveryLink = findViewById(R.id.recovery_link);

        arrowButton.setOnClickListener(v -> {
            String name = nameEdit.getText().toString();
            String email = emailEdit.getText().toString();
            String password = passwordEdit.getText().toString();

            // TODO: Add real validation and registration logic here
            Log.d("SignupActivity", "Name: " + name + ", Email: " + email + ", Password: " + password);
        });

        recoveryLink.setOnClickListener(v -> {
            // TODO: Implement password recovery logic here or navigate recovery screen
            Log.d("SignupActivity", "Recovery link clicked");
        });
    }
}
