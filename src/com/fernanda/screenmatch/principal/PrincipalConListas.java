package com.fernanda.screenmatch.principal;

import com.fernanda.screenmatch.modelos.Pelicula;
import com.fernanda.screenmatch.modelos.Serie;
import com.fernanda.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class PrincipalConListas {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(10);

        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.evalua(9);

        Serie serie = new Serie("La casa del dragón", 2022);

        Pelicula p1 = miPelicula;


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(serie);

        for(Titulo item : lista) {
            System.out.println("Nombre: " + item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println("Clasificacion: " +pelicula.getClasificacion());
            }
        }
        Collections.sort(lista);
        System.out.println("Lista ordenada por nombre: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);

    }
}
