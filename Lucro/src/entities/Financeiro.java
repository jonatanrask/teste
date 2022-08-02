package entities;

import java.util.Date;

public class Financeiro {
    private Double entrada;
    private String name;
    private Date data;

    public Financeiro(Double entrada, String name, Date data) {
        this.entrada = entrada;
        this.name = name;
        this.data = data;
    }

    public Double getEntrada() {
        return entrada;
    }

    public void setEntrada(Double entrada) {
        this.entrada = entrada;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
