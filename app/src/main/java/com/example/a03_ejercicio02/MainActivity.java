package com.example.a03_ejercicio02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtBicicleta;
    private TextView txtMoto;
    private TextView txtCoche;
    private Button btnBicicleta;
    private Button btnMoto;
    private Button btnCoche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVista();


    }

    private void inicializarVista() {

        txtBicicleta = findViewById(R.id.txtBicicletasMain);
        txtMoto = findViewById(R.id.txtMotoMain);
        txtCoche = findViewById(R.id.txtCocheMain);
        btnBicicleta = findViewById(R.id.btnBicicletasMain);
        btnCoche = findViewById(R.id.btnCocheMain);
        btnMoto = findViewById(R.id.btnMotoMain);
    }
}