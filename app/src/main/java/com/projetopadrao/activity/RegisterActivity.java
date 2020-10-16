package com.projetopadrao.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.projetopadrao.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        Log.d("ciclo_de_vida", "onCreate - a atividade iniciou");


        TextView registro_textView_ja_possui_conta;

        registro_textView_ja_possui_conta = (TextView) findViewById(R.id.registro_textView_ja_possui_conta);

        registro_textView_ja_possui_conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                Toast.makeText(RegisterActivity.this,"Tela de Login", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
