package com.projetopadrao.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.projetopadrao.R;
import com.projetopadrao.models.Usuario;

public class RegisterActivity extends AppCompatActivity {
    private EditText registro_editText_nome_completo;
    private EditText registro_editText_email;
    private EditText registro_editText_senha;
    private EditText registro_editText_repita_a_senha;
    private Button registro_button_registrar;
    private TextView registro_textView_ja_possui_conta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        Log.d("ciclo_de_vida", "onCreate - a atividade iniciou");


        reconhecendoComponentes();
        inicializandoComponentes();


    }

    private void reconhecendoComponentes() {
        registro_textView_ja_possui_conta = (TextView) findViewById(R.id.registro_textView_ja_possui_conta);
        registro_button_registrar = (Button) findViewById(R.id.registro_button_registrar);
        registro_editText_email = (EditText) findViewById(R.id.registro_editText_email);
        registro_editText_nome_completo = (EditText) findViewById(R.id.registro_editText_nome_completo);



    }

    private void inicializandoComponentes() {

        registro_textView_ja_possui_conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });



        registro_button_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = registro_editText_email.getText().toString();
                String senha = registro_editText_senha.getText().toString();


                Usuario usuarioLogado = new Usuario(email,senha);
                usuarioLogado.save();
            }
        });



    }
}
