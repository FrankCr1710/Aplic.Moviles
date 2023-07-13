package com.example.amovcuartatarea;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    Button btn_alianza;
    Button btn_cano;
    Button btn_usta;
    String url6 = "https://www.alianzaeditorial.es/";
    String url7 = "https://www.canopina.com/";
    String url8 = "https://ediciones.usta.edu.co/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        btn_alianza = findViewById(R.id.btn_alianza);
        btn_cano = findViewById(R.id.btn_cano);
        btn_usta = findViewById(R.id.btn_usta);


        btn_alianza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link6 = Uri.parse(url6);
                Intent a = new Intent(Intent.ACTION_VIEW,link6);
                startActivity(a);
            }
        });

        btn_cano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link7 = Uri.parse(url7);
                Intent b =  new Intent(Intent.ACTION_VIEW, link7);
                startActivity(b);
            }
        });

        btn_usta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link8 = Uri.parse(url8);
                Intent c =  new Intent(Intent.ACTION_VIEW, link8);
                startActivity(c);
            }
        });

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