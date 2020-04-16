package com.example.grupo_bani_practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import static android.graphics.Color.parseColor;

public class Inf_Josue_Activity extends AppCompatActivity {
    private Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.window = getWindow();
        setContentView(R.layout.activity_inf__josue_);

        //clase SharedPreferences para obtener valor guardado
        SharedPreferences prefs = getSharedPreferences("datosjosue",   Context.MODE_PRIVATE);
        String color = prefs.getString("color", "default");

        //validar si la variable esta vacia
        if (color=="default")  {

            Toast.makeText(this, "Fondo Predeterminado", Toast.LENGTH_SHORT).show();

        } else  {

            cambiarcolor(color);
        }
    }


    public void  cambiarcolor(String color ){

        //Drawable background = fondo.getBackground( );
        window.setBackgroundDrawable(new ColorDrawable(parseColor(color)));

    }
    public void Volver(View view){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Actividad Principal", Toast.LENGTH_SHORT).show();
    }
}
