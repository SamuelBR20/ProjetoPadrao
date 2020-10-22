package com.projetopadrao.retrofit;

import com.projetopadrao.models.Usuario;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface UserService {

    @POST("account/register/")
    Call<Usuario> registrar(@Body Usuario usuario);


    @POST("account/login/")
    Call<Usuario> logar(@Body Usuario usuario);

    @GET("account/user/")
    Call<Usuario> verificarUsuarioLogado(@Header("Authorization") String key);

}
