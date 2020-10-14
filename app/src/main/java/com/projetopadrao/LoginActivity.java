package com.projetopadrao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    TextView login_textView_nao_possui_conta;
    Button login_button_login;
    EditText login_editText_login;
    EditText login_editText_senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Log.d("ciclo_de_vida", "onCreate - a atividade iniciou");

        login_editText_login = (EditText) findViewById(R.id.login_editText_login);
        login_editText_senha = (EditText) findViewById(R.id.login_editText_senha);
        login_button_login = (Button) findViewById(R.id.login_editText_login_button_logar);
        login_textView_nao_possui_conta = (TextView) findViewById(R.id.login_textView_nao_possui_conta);

        login_textView_nao_possui_conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                Toast.makeText(LoginActivity.this,"Tela de Registro", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        login_button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = login_editText_login.getText().toString();
                String senha = login_editText_senha.getText().toString();

                Log.d("autenticação", "\nUSUARIO: "+ usuario + "\nSenha:"+ senha);


            }
        });


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

