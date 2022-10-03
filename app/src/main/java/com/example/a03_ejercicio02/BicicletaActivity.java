package com.example.a03_ejercicio02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class BicicletaActivity extends AppCompatActivity {

    private EditText txtMarca;
    private EditText txtpulgadas;
    private Button btnCancelar;
    private Button btnAnadir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicicleta);
    }
}