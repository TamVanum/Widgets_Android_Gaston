package com.example.widgets_gaston_cathalifaud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

import java.util.Scanner;

public class Calificaciones_act extends AppCompatActivity {

    private RatingBar calificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificaciones);

        calificacion = (RatingBar) findViewById(R.id.rtbCalificacion);


    }

    public void OpenHome(View view){
        Intent i = new Intent(this, MainActivity.class);//construye el objeto
        startActivity(i);//inicia el objeto con el activity a cargar
    }

    public void Calificar(View view){


        calificacion.setRating(3); //pinta estrellas
        //calificacion.setNumStars(6); //sirve para setear la cantidad de estrellas

        float rat = calificacion.getRating();
        Toast.makeText(this, "Calificacion: " +rat, Toast.LENGTH_SHORT).show();

        if (rat == 3.0){
            finish();
        }

    }


}