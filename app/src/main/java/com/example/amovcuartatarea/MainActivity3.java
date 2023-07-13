package com.example.amovcuartatarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    EditText edt_titulo;
    TextView tv_mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        edt_titulo = findViewById(R.id.edt_titulo);

        tv_mostrar = findViewById(R.id.tv_mostrar);
        tv_mostrar.setText("");
    }

    public void Agregar(View view) {
        String nombre = edt_titulo.getText().toString();
        String muestra = "El libro del";
        String resultado = muestra+" "+nombre+" fue reservado, gracias!";
        tv_mostrar.append(resultado);
    }


}