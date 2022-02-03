/**
 * Se importa la libreria de Listas
 */
import java.util.ArrayList;


/**
 * Representa una Clase Vehiculo y algunos de sus Atributos y metodos.
 * @author HEINER PALACIOS ASPRILLA
 */
public class Vehicle {
    
    private String series;
    private String brand;
    public int  price;
    protected ArrayList colors = new ArrayList();
    private String vehicleRegistration;

    /**
     * Se Crea metodo para modificar o mostrar un valor del atributo serie
     * @return valor asignado como argumento
     */
    public String getSeries() {
        return this.series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
    
    
}
