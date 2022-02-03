/**
 * Se importa la libreria de fecha y tiempo
 */
import java.util.Date;


/**
 **Representa una Clase Libro y alguno de sus Atributos y metodos.
 * @author HEINER PALACIOS ASPRILLA
 */
public class Book {
    
    private String serial;
    private String title;
    public Date yearPublished;
    protected String editorial;
    private int price;

    /**
     * Se Crea metodo para modificar o mostrar un valor del atributo titulo
     * @return valor asignado como argumento
     */
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
