package com.fernanda.screenmatch.principal;

import com.fernanda.screenmatch.calculos.CalculadoraDeTiempo;
import com.fernanda.screenmatch.calculos.FiltroRecomendacion;
import com.fernanda.screenmatch.modelos.Episodio;
import com.fernanda.screenmatch.modelos.Pelicula;
import com.fernanda.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua (5);
        miPelicula.evalua (5);
        System.out.println("Cantidad de evaluaciones: " + miPelicula.getTotalEvaluaciones());
        System.out.println("Nota promedio: " + miPelicula.mediaEvaluaciones());

        Pelicula otraPelicula = new Pelicula("Avatar" , 2023);

        Serie casaDragon = new Serie("La casa del dragón", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println("Duración en minutos: " + casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        System.out.println("Tiempo total para ver: " + calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);


        Episodio episodio = new Episodio();
        episodio.setNumero();
        episodio.setNombre ("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(20);

        filtroRecomendacion.filtra (episodio);


    }
}
