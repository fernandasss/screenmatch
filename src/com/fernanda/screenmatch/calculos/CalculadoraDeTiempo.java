package com.fernanda.screenmatch.calculos;

import com.fernanda.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }
    public void incluye(Titulo titulo) {
        tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
