package com.fernanda.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNombre() +", "+ this.getFechaDeLanzamiento();

    }
}
