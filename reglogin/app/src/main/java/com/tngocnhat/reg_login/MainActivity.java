package com.tngocnhat.reg_login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tự động chuyển đến Login sau 2 giây
        new Handler().postDelayed(() -> {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        }, 2000);

        // Hoặc thêm button để chuyển thủ công
        Button startButton = findViewById(R.id.start_button);
        startButton.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        });
    }
}