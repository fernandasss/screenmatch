public class Pelicula {

    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalEvaluaciones;

    int getTotalEvaluaciones (){
        return (totalEvaluaciones);
    }

    void muestraFichaTecnica (){
        System.out.println("Mi película es " + nombre);
        System.out.println("Fue lanzada en " + fechaDeLanzamiento);
        System.out.println("Tiene una duración de " + duracionEnMinutos);
    }

    void evalua (double nota){
        sumaDeLasEvaluaciones += nota;
        totalEvaluaciones ++;
    }

    double mediaEvaluaciones (){
        return sumaDeLasEvaluaciones / totalEvaluaciones;
    }
}

