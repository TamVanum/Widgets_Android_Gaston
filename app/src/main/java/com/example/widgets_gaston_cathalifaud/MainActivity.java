package com.example.widgets_gaston_cathalifaud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ProgressBar barra;
    private CheckBox calificaciones;
    private CheckBox productos;
    private TextView texto;
    private TextView txtvalidacion;
    private int progreso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barra           = (ProgressBar)findViewById(R.id.pgb1);
        calificaciones  = (CheckBox)findViewById(R.id.chkCali);
        productos       = (CheckBox)findViewById(R.id.chkProd);
        texto           = (TextView)findViewById(R.id.lblHome);
        txtvalidacion   =(TextView) findViewById(R.id.lblValidateChk);
    }


    public void OpenMenu(View view){

        if (calificaciones.isChecked() && productos.isChecked()){
            txtvalidacion.setText("Seleccione solo una opcion");
        }
        else{
            if (productos.isChecked()){
                Intent i = new Intent(this, Producto_act.class);//construye el objeto
                txtvalidacion.setText(" ");
                startActivity(i);//inicia el objeto con el activity a cargar
            } else if (calificaciones.isChecked()){
                Intent i = new Intent(this, Calificaciones_act.class);//construye el objeto
                txtvalidacion.setText(" ");
                startActivity(i);//inicia el objeto con el activity a cargar
            }else{
                txtvalidacion.setText("Seleccione solo una opcion");
            }
        }


    }

    public void Charge(View view){
        final Timer t = new Timer();

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                progreso++;
                barra.setProgress(progreso);

                int pro = barra.getProgress();

                texto.setText("eL progreso: " + pro +"/100");
            }
        };

        t.schedule(tarea, 0, 100);
    }
}