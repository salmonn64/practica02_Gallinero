
import java.util.Iterator;

/**
 * Implementa un iterador para poder iterar sobre un arreglo de Platillos.
 */
public class IteradorMenuGeneral implements Iterator<Platillo> {
    Platillo[] array;
    /** Posicion actual del iterador en el arreglo. */
    int posicion = 0;

    /**
     * Constructor que establece el arreglo sobre el cual se itera.
     * 
     * @param array Arreglo a recorrer por el iterador.
     */
    public IteradorMenuGeneral(Platillo[] array) {
        this.array = array;
    }
    /**
     * Metodo que nos dice si hay un elemento siguiente.
     */
    @Override
    public boolean hasNext() {
        return posicion < array.length && array[posicion] != null;
    }
    /**
     * Metodo que mueve el iterador al siguiente elemento.
     */
    @Override
    public Platillo next() {
        Platillo objeto = array[posicion];
        posicion = posicion + 1;
        return objeto;
    }
}
