package com.projetopadrao.api.retrofit;

import android.content.Context;
import android.content.Context;

import com.projetopadrao.api.servicos.EventoService;
import com.projetopadrao.api.servicos.UserService;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.projetopadrao.statics.ConstantesGlobais.ENDERECO_API;

public class RetrofitConfig {

    private Retrofit retrofit;

    public RetrofitConfig(Context context) {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.level(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .addInterceptor(new ConnectivityInterceptor(context))
                .build();

        this.retrofit = new Retrofit.Builder()
                .baseUrl(ENDERECO_API)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }



    public UserService setUserService() {
        return this.retrofit.create(UserService.class);
    }

    public EventoService setEventoService() {
        return this.retrofit.create(EventoService.class);
    }

}