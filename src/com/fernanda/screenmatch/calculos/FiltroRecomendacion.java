package com.fernanda.screenmatch.calculos;

public class FiltroRecomendacion {


    public void filtra (Clasificable clasificacion){
        if (clasificacion.getClasificacion() >=4){
            System.out.println("Muy bien evaluada.");
        }else if (clasificacion.getClasificacion() >= 2){
            System.out.println("Popular");
        } else {
            System.out.println("Velo más tarde.");
        }




    }
}
