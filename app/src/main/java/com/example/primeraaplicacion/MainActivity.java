package com.example.primeraaplicacion;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    int contador = 0;
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
        contador = 0;
        mostrarResultado();
    }
    public void mostrarResultado(){
        TextView resultadoTexto = (TextView)findViewById(R.id.contadorTexto);
        resultadoTexto.setText(String.valueOf(contador));
    }
}