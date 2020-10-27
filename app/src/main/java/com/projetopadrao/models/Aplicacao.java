package com.projetopadrao.models;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.projetopadrao.activities.AppActivity;
import com.projetopadrao.activities.LoginActivity;
import com.projetopadrao.activities.RegisterActivity;
import com.projetopadrao.activities.usuario.ListarUsuariosActivity;
import com.projetopadrao.activities.usuario.UsuarioDetalheActivity;


public class Aplicacao {

    private Context context;
    private Class<?> activityDestino;

    public Aplicacao(Context context, Class<?> activityDestino) {
        this.context = context;
        this.activityDestino = activityDestino;
    }

    public Aplicacao(Context context) {
        this.context = context;
    }

    public static void irParaListarUsuariosActivity(Context context) {
        Intent intent = new Intent(context, ListarUsuariosActivity.class);
        context.startActivity(intent);
    }
    public static void irParaListarLoginActivity(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }
    public static void irParaAppActivity(Context context) {
        Intent intent = new Intent(context, AppActivity.class);
        context.startActivity(intent);
    }
    public static void irParaRegisterActivity(Context context) {
        Intent intent = new Intent(context, RegisterActivity.class);
        context.startActivity(intent);
    }
    public static void irParaLoginActivity(Context context) {
        Intent intent = new Intent(context, RegisterActivity.class);
        context.startActivity(intent);
    }
    public static void irParaUsuarioDetalheActivity(Context context, Long id) {
        Intent intent = new Intent(context, UsuarioDetalheActivity.class);
        Bundle b = new Bundle();
        b.putLong("id", id);
        intent.putExtras(b);
        context.startActivity(intent);
    }

}
