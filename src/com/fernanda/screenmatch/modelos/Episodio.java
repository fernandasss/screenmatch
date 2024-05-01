package com.fernanda.screenmatch.modelos;

import com.fernanda.screenmatch.calculos.Clasificable;

public class Episodio implements Clasificable {
    private int numero;
    private String nombre;
    private Serie serie;
    int totalVisualizaciones;

    public int getNumero() {
        return numero;
    }

    public void setNumero() {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    @Override
    public int getClasificacion() {
        if (totalVisualizaciones > 100){
            return 4;
        }else{
            return 2;
}}}
