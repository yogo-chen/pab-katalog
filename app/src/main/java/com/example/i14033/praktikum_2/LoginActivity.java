package com.example.i14033.praktikum_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setTitle("Halaman Login");

        usernameEditText = (EditText) findViewById(R.id.editTextUsername);
        loginButton = (Button) findViewById(R.id.buttonLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Login berhasil", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, KatalogActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("username", usernameEditText.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
