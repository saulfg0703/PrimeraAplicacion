package com.example.primeraaplicacion;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    int contador = 0;
    TextView textoAMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void incrementarContador(View vista){
        contador ++;
        mostrarResultado();

    }

    public void decrementarContador(View vista){
        contador --;
        mostrarResultado();
    }
    public void resetearContador(View vista){
        EditText resetearNumero =(EditText) findViewById(R.id.textoReseteo);
        contador = Integer.parseInt(resetearNumero.getText().toString());
        resetearNumero.setText("");
        mostrarResultado();

    }
    public void mostrarResultado(){
        TextView texto = (TextView)findViewById(R.id.contadorTexto);
        texto.setText(String.valueOf(contador));
    }
    public void conteoNegativos(View vista){
        CheckBox validar = (CheckBox) findViewById(R.id.validar);
        if(contador<0){
            contador = 0;
        }

    }

}