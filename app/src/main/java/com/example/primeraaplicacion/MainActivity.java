package com.example.primeraaplicacion;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    public int contador = 0;
    TextView textoAMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoAMostrar = findViewById(R.id.contadorTexto);

        contador = 0;
    }

    @SuppressLint("SetTextI18n")
    public void incrementarContador(View vista) {
        contador++;

        textoAMostrar.setText("" + contador);

    }

    @SuppressLint("SetTextI18n")
    public void decrementarContador(View vista) {
        CheckBox validar = findViewById(R.id.validar);
        contador--;
        if (validar.isChecked()) {
            contador = 0;
        }
        textoAMostrar.setText("" + contador);
    }

    public void resetearContador(View vista) {
        EditText resetearNumero = findViewById(R.id.textoReseteo);
        contador = Integer.parseInt(resetearNumero.getText().toString());
        resetearNumero.setText("");
        textoAMostrar.setText("" + contador);
        InputMethodManager miTeclado = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        miTeclado.hideSoftInputFromWindow(resetearNumero.getWindowToken(),0);
    }



}