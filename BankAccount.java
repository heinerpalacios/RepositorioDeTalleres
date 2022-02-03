
/**
 *Representa una Clase Cuenta de Banco y algunos de sus Atributos y metodos.
 * @author HEINER PALACIOS ASPRILLA
 */
public class BankAccount {
    
    private int accountNunber;
    protected boolean activated;

    /**
     * Se Crea metodo para modificar o mostrar un valor del atributo activado
     * @return valor asignado como argumento
     */
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
    
    
}
