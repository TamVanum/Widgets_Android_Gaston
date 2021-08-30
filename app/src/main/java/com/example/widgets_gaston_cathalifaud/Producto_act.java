package com.example.widgets_gaston_cathalifaud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Producto_act extends AppCompatActivity {

    private RadioButton kilo1, kilo2;
    private TextView textoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);

        kilo1 = (RadioButton) findViewById(R.id.rdbCalc1);
        kilo2 = (RadioButton) findViewById(R.id.rdbCalc2);
        textoc = (TextView) findViewById(R.id.lblCalc);

    }

    public void OpenHome(View view){
        Intent i = new Intent(this, MainActivity.class);//construye el objeto
        startActivity(i);//inicia el objeto con el activity a cargar
    }

    public void Calcular(View view){

        if (kilo1.isChecked()){
            int result = 1000 * 1;
            textoc.setText("Calculo 1 kilo: "+ result);
        }

        if (kilo2.isChecked()){
            int result = 1000 * 2;
            textoc.setText("Calculo 2 kilos: "+result);
        }

    }
}