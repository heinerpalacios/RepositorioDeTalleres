/**
 * Se importa la libreria de Listas
 */
import java.util.ArrayList;


/**
 *Representa una Clase Fruta y algunos de sus Atributos y metodos.
 * @author HEINER PALACIOS ASPRILLA
 */
public class Fruit {
    
    private String idFruit;
    private float averageWeight;
    public ArrayList colors = new ArrayList();

     /**
     * Se Crea metodo para modificar o mostrar un valor del atributo colores
     * @return valor asignado como argumento
     */
    public ArrayList getColors() {
        return this.colors;
    }

    public void setColors(ArrayList colors) {
        this.colors = colors;
    }
    
    
}
