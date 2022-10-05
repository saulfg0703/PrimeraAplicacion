package com.example.primeraaplicacion;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
        RadioButton positivo = findViewById(R.id.Positivos);
        positivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!positivo.isSelected()) {
                    positivo.setChecked(true);
                    positivo.setSelected(true);
                } else {
                    positivo.setChecked(false);
                    positivo.setSelected(false);
                }
            }
        });

        if(positivo.isChecked()){

            contador++;
        }
        textoAMostrar.setText("" + contador);

    }

    @SuppressLint("SetTextI18n")
    public void decrementarContador(View vista) {
        RadioButton negativo = findViewById(R.id.Negativos);
        negativo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!negativo.isSelected()) {
                    negativo.setChecked(true);
                    negativo.setSelected(true);
                } else {
                    negativo.setChecked(false);
                    negativo.setSelected(false);
                }
            }
        });

        if (negativo.isChecked()) {

            contador--;
        }
        textoAMostrar.setText("" + contador);
    }

    public void resetearContador(View vista) {

        EditText resetearNumero = findViewById(R.id.textoReseteo);
        if (resetearNumero.getText().length() == 0) {
            resetearNumero.setText("0");
        } else {
            contador = Integer.parseInt(resetearNumero.getText().toString());
            resetearNumero.setText("");
            textoAMostrar.setText("" + contador);

            InputMethodManager miTeclado = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            miTeclado.hideSoftInputFromWindow(resetearNumero.getWindowToken(), 0);
        }
    }




}