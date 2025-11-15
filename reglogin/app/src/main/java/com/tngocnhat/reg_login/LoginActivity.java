package com.tngocnhat.reg_login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText emailEdit;
    private EditText passwordEdit;
    private ImageButton arrowButton;
    private Button facebookButton;
    private Button googleButton;
    private TextView registerLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEdit = findViewById(R.id.email_edit);
        passwordEdit = findViewById(R.id.password_edit);
        arrowButton = findViewById(R.id.login_arrow_button);
        facebookButton = findViewById(R.id.facebook_button);
        googleButton = findViewById(R.id.google_button);
        registerLink = findViewById(R.id.signup_link);

        arrowButton.setOnClickListener(v -> {
            String email = emailEdit.getText().toString();
            String password = passwordEdit.getText().toString();

            // TODO: Add validation and authentication logic here
            Log.d("LoginActivity", "Email: " + email + ", Password: " + password);
        });

        facebookButton.setOnClickListener(v -> {
            // TODO: Implement Facebook login logic
            Log.d("LoginActivity", "Facebook login button clicked");
        });

        googleButton.setOnClickListener(v -> {
            // TODO: Implement Google login logic
            Log.d("LoginActivity", "Google login button clicked");
        });

        registerLink.setOnClickListener(v -> {
            // Mở màn hình đăng ký
            startActivity(new Intent(LoginActivity.this, SignupActivity.class));
        });
    }
}
