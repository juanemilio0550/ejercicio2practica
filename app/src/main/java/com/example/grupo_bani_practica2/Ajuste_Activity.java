package com.example.grupo_bani_practica2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.parseColor;


public class Ajuste_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajuste_);

    }

    // Inicio Metodos de conlores informacion actividad Digno
    public void  enviarColorBlue(View view ){


        SharedPreferences prefs = getSharedPreferences("datos",   Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("color", "#42a5f5");
        editor.commit();

        Toast.makeText(this, "Cambio Aplicado", Toast.LENGTH_SHORT).show();

    }

    public void  enviarColorGreen(View view ){

        SharedPreferences prefs = getSharedPreferences("datos",   Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("color", "#ede7f6");
        editor.commit();
        Toast.makeText(this, "Cambio Aplicado", Toast.LENGTH_SHORT).show();
    }

    public void  enviarColorYellow(View view ){

        SharedPreferences prefs = getSharedPreferences("datos",   Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("color", "#ffeb3b");
        editor.commit();
        Toast.makeText(this, "Cambio Aplicado", Toast.LENGTH_SHORT).show();
    }

    public void  VerCambioDigno(View view ){

        Intent intent = new Intent(this,Inf_Digno_Activity.class);
        startActivity(intent);

    }
    // Fin Metodos de conlores informacion actividad Digno

    // Inicio Metodos de conlores informacion actividad Juan
    public void  enviarColorIndigo(View view ){

        SharedPreferences prefs = getSharedPreferences("datosjuan",   Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("color", "#3d5afe");
        editor.commit();

        Toast.makeText(this, "Cambio Aplicado", Toast.LENGTH_SHORT).show();

    }

    public void  enviarColorBrown(View view ){

        SharedPreferences prefs = getSharedPreferences("datosjuan",   Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("color", "#bcaaa4");
        editor.commit();
        Toast.makeText(this, "Cambio Aplicado", Toast.LENGTH_SHORT).show();
    }

    public void  enviarColorVerdeOscuro(View view ){

        SharedPreferences prefs = getSharedPreferences("datosjuan",   Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("color", "#8ebc52");
        editor.commit();
        Toast.makeText(this, "Cambio Aplicado", Toast.LENGTH_SHORT).show();
    }

    public void  VerCambioJuan(View view ){

        Intent intent = new Intent(this,Inf_Juan_Activity.class);
        startActivity(intent);

    }
    // Fin Metodos de conlores informacion actividad juan

    // Inicio Metodos de conlores informacion actividad Josue
    public void  enviarColorRed(View view ){

        SharedPreferences prefs = getSharedPreferences("datosjosue",   Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("color", "#E01313");
        editor.commit();

        Toast.makeText(this, "Cambio Aplicado", Toast.LENGTH_SHORT).show();

    }

    public void  enviarColorverdeClaro(View view ){

        SharedPreferences prefs = getSharedPreferences("datosjosue",   Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("color", "#64DD17");
        editor.commit();
        Toast.makeText(this, "Cambio Aplicado", Toast.LENGTH_SHORT).show();
    }

    public void  enviarColorMarron(View view ){

        SharedPreferences prefs = getSharedPreferences("datosjosue",   Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("color", "#894d27");
        editor.commit();
        Toast.makeText(this, "Cambio Aplicado", Toast.LENGTH_SHORT).show();
    }

    public void  VerCambioJosue(View view ){

        Intent intent = new Intent(this,Inf_Josue_Activity.class);
        startActivity(intent);

    }
    // Fin Metodos de conlores informacion actividad josue

}
