package com.example.amovcuartatarea;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView tvResultado;
    TextView resultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvResultado =findViewById(R.id.tvResultado);
        resultado2 = findViewById(R.id.resultado2);

        Bundle recibirDatos = getIntent().getExtras();
        String info = recibirDatos.getString("Datos");
        int info1 = recibirDatos.getInt("Datos1");

        tvResultado.setText(info);
        resultado2.setText(String.valueOf(info1));

        Toolbar tarea4 = findViewById(R.id.myToolbar);
        setSupportActionBar(tarea4);
        getSupportActionBar().setTitle("");

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.opcion1){
            Toast.makeText(getApplicationContext(), "Icono 1", Toast.LENGTH_SHORT).show();
        }

        if (id == R.id.opcion3){
            Toast.makeText(getApplicationContext(), "Icono 3", Toast.LENGTH_SHORT).show();
        }

        if (id == R.id.opcion2){
            finish();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}