package com.projetopadrao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);



        Log.d("ciclo_de_vida", "onCreate - a atividade iniciou");




    }

    @Override
    protected void onStart(){
        Log.d("ciclo_de_vida", "onStart - o codigo da atividade começou a ser feito");
        super.onStart();

    }

    @Override
    protected void  onResume(){
        Log.d("ciclo_de_vida", "onResume - Estado de interação com tela");
        super.onResume();
    }

    @Override
    protected void onPause(){
        Log.d("ciclo_de_vida", "onPause - iniciou o término da activity");
        super.onPause();
    }

    @Override
    protected void onStop(){
        Log.d("ciclo_de_vida", "onStop - A atividade não está mais visivel ao usuario");
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        Log.d("ciclo_de_vida", "onDestroy - A Activity foi completamente destruida");
        super.onDestroy();
    }
}

