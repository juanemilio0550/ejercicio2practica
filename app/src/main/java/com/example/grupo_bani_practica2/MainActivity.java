package com.example.grupo_bani_practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void  infDigno(View view){
        Intent intent = new Intent(this,Inf_Digno_Activity.class);
        startActivity(intent);
        Toast.makeText(this, "Informacion de Digno", Toast.LENGTH_LONG).show();
    }


    public void  infJuan(View view){
        Intent intent = new Intent(this,Inf_Juan_Activity.class);
        startActivity(intent);
        Toast.makeText(this, "Informacion de Juan", Toast.LENGTH_LONG).show();
    }
    public void  infJosue(View view){
        Intent intent = new Intent(this,Inf_Josue_Activity.class);
        startActivity(intent);
        Toast.makeText(this, "Informacion de Josue", Toast.LENGTH_LONG).show();
    }


    public void ajuste(View view){
        Intent intent =new Intent(this,Ajuste_Activity.class);
        startActivity(intent);
    }
}
