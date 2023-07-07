package com.example.amovcuartatarea;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;

    Button  button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle datos = new Bundle();
                datos.putString("Datos", et1.getText().toString());
                datos.putInt("Datos1", Integer.parseInt(et2.getText().toString()));

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(datos);
                startActivity(intent);
            }
        });

        Toolbar tarea4 = findViewById(R.id.myToolbar);
        setSupportActionBar(tarea4);
        getSupportActionBar().setTitle("");

    }



}