package com.projetopadrao.models;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class Android {
    private Context context;
    private boolean conectado;

    public Android(Context context){
        this.context = context;
    }

    public void verificarConexao(){
        ConnectivityManager connectivityManager
                = (ConnectivityManager) this.context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        this.conectado = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (this.conectado=true){
            Toast.makeText(this.context,"Vocé está conectado", Toast.LENGTH_SHORT).show();
        }
    }


    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
}
