
/**
 * Representa una Clase Nevera y algunos de sus Atributos y metodos.
 * @author HEINER PALACIOS ASPRILLA
 */
public class Refrigerator {
    
    private String serial;
    private String brand;
    private int price;
    protected String numberDoors;
    public float size;

    /**
     * Se Crea metodo para modificar o mostrar un valor del atributo marca
     * @return valor asignado como argumento
     */
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

  
}
