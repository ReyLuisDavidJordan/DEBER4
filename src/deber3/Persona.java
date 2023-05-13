
package deber3;

/**
 *
 * @author Miguel
 */
public class Persona {
    private String PrimerNombre;
    private String Segundo_Nombre;
    private String Apellido;

    public Persona(String PrimerNombre, String Segundo_Nombre, String Apellido) {
        this.PrimerNombre = PrimerNombre;
        this.Segundo_Nombre = Segundo_Nombre;
        this.Apellido = Apellido;
    }

    /**
     * @return the PrimerNombre
     */
    public String getPrimerNombre() {
        return PrimerNombre;
    }

    /**
     * @param PrimerNombre the PrimerNombre to set
     */
    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    /**
     * @return the Segundo_Nombre
     */
    public String getSegundo_Nombre() {
        return Segundo_Nombre;
    }

    /**
     * @param Segundo_Nombre the Segundo_Nombre to set
     */
    public void setSegundo_Nombre(String Segundo_Nombre) {
        this.Segundo_Nombre = Segundo_Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "PrimerNombre=" + PrimerNombre + ", Segundo_Nombre=" + Segundo_Nombre + ", Apellido=" + Apellido + '}';
    }
    
    
    
}
