/**
 * Se importa la libreria de fecha y tiempo
 */
import java.util.Date;


/**
 * Representa una Clase Perosna y algunos de sus Atributos y metodos.
 * @author HEINER PALACIOS ASPRILLA
 */
public class Person {
    
    private String idPerson;
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth; 
    public float height;

    /**
     * Se Crean los metodo para modificar o mostrar valores de los atributos apellidos
     * @return valor asignado como argumento
     */
    public String getLastName1() {
        return this.lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return this.lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    
    
}
