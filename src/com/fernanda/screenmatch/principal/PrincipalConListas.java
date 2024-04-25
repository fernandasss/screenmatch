import com.fernanda.screenmatch.
import com.fernanda.screenmatch.modelos.Pelicula;


public class PrincipalConListas {

    public static void main(String[] args) {

        Pelicula favorita = new Pelicula(“El señor de los anillos”, 2001);
        favorita.evalua(10);

        Pelicula otra = new Pelicula(“John Wick”, 2014);
        otra.evalua(9);

        Serie serie = new Serie(“La Casa de Papel”, 2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorita);
        lista.add(otra);
        lista.add(serie);

        for(Titulo item : lista) {
            System.out.println(“Nombre: “ +item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(“Clasificacion: “ +pelicula.getClasificacion());
            }
        }

    }
}
