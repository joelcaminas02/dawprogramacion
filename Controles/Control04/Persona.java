import java.io.Serializable;

public class Persona implements Serializable{
    
    protected String nif;
    public String getNif() {
        return nif;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    protected String nombre;
    protected String apellidos;

    void setNif(String nifPersona){nif = nifPersona;}
    void setNombre(String nombrePersona){nombre = nombrePersona;}
    void setApellidos(String apellidosPersona){apellidos = apellidosPersona;}
}
