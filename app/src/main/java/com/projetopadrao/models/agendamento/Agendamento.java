package com.projetopadrao.models.agendamento;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Agendamento {
    private String data;


    public String getData() {
        DateFormat format = new SimpleDateFormat("DD/MM/YY");

        return data;
    }

    public void setData(Date data) {
        DateFormat dateFormat = new SimpleDateFormat("DD/MM/YY");
        this.data = dateFormat.format(data) ;
    }
}
