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
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView tvResultado;
    TextView resultado2;

    Button btn1;

    Button  btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvResultado =findViewById(R.id.tvResultado);
        resultado2 = findViewById(R.id.resultado2);
        btn1 =(Button)findViewById(R.id.bt1);
        btn2 =(Button)findViewById(R.id.bt2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn1= new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(btn1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn2= new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(btn2);
            }
        });


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


        if (id == R.id.opcion3){
            Intent i = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(i);
            return true;
        }

        if (id == R.id.opcion2){
            finish();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}