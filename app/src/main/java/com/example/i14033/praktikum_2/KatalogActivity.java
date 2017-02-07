package com.example.i14033.praktikum_2;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class KatalogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog);

        setTitle("Katalog Produk");

        TextView welcomeTextView = (TextView) findViewById(R.id.textViewWelcome);
        Bundle bundle = getIntent().getExtras();
        welcomeTextView.setText("Selamat datang: " + bundle.getString("username"));

        Button tampilKatalogButton = (Button) findViewById(R.id.buttonTampilKatalog);
        tampilKatalogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(KatalogActivity.this)
                        .setTitle("Katalog")
                        .setMessage("Tampilkan katalog")
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(KatalogActivity.this, "Katalog ditampilkan", Toast.LENGTH_SHORT).show();
                            }
                        }).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.katalog, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_settings: {
                Toast.makeText(KatalogActivity.this, "Menu Setting", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.action_1: {
                Toast.makeText(KatalogActivity.this, "Menu 1", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.action_2: {
                Toast.makeText(KatalogActivity.this, "Exit", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_MAIN)
                        .addCategory(Intent.CATEGORY_HOME)
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
                System.exit(0);
                return true;
            }
            default: {
                return super.onOptionsItemSelected(item);
            }
        }
    }
}
