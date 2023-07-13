package com.example.amovcuartatarea;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.URI;

public class MainActivity4 extends AppCompatActivity {

    Button btn_link;
    Button btn_link2;
    Button btn_link3;
    String url = "https://www.crisol.com.pe/el-libro-de-la-ingenieria-9789463595568";
    String url2 = "https://www.buscalibre.pe/libro-administracion-de-recursos-humanos-el-capital-humano-de-las-organizaciones-9-edicion/9786071505606/p/4280817";

    String url3 = "https://www.reverte.com/libro/eua-24-la-casa-en-la-arquitectura-moderna_89135/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btn_link= findViewById(R.id.btn_link);
        btn_link2= findViewById(R.id.btn_link2);
        btn_link3= findViewById(R.id.btn_link3);


        btn_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW,link);
                startActivity(i);

                //Log.d("click", "ok");
            }
        });

        btn_link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link2 = Uri.parse(url2);
                Intent j = new Intent(Intent.ACTION_VIEW,link2);
                startActivity(j);

                //Log.d("click", "ok");
            }
        });

        btn_link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link3 = Uri.parse(url3);
                Intent z = new Intent(Intent.ACTION_VIEW,link3);
                startActivity(z);

                //Log.d("click", "ok");
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