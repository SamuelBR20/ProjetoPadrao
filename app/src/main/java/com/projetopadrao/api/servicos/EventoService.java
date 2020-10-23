package com.projetopadrao.api.servicos;

import com.projetopadrao.models.eventos.Evento;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface EventoService {

    @POST("eventos/")
    Call<Evento> salvarEvento(@Body Evento evento,@Header("Authorization") String key);

}