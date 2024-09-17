package com.example.a2312__ngo_van_duong__constraint_layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        TextView btn = findViewById(R.id.alreadyHaveAccount);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });

        EditText inputUsernameRegister = findViewById(R.id.inputUsernameRegister);
        EditText inputPasswordRegister = findViewById(R.id.inputPasswordRegister);
        Button btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = inputUsernameRegister.getText().toString();
                String password = inputPasswordRegister.getText().toString();

                // Hiển thị thông tin thông qua Toast
                Toast.makeText(RegisterActivity.this, "Username: " + username + "\nPassword: " + password, Toast.LENGTH_LONG).show();
            }
        });
    }
}