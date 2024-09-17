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

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        TextView btn = findViewById(R.id.textViewSignUp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        EditText inputUsernameLogin = findViewById(R.id.inputUsernameLogin);
        EditText inputPasswordLogin = findViewById(R.id.inputPasswordLogin);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = inputUsernameLogin.getText().toString();
                String password = inputPasswordLogin.getText().toString();

                // Hiển thị thông tin thông qua Toast
                Toast.makeText(LoginActivity.this, "Username: " + username + "\nPassword: " + password, Toast.LENGTH_LONG).show();
            }
        });
    }
}