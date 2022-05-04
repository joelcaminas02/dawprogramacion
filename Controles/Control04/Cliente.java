package Control04;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Persona implements Serializable{

    public static ArrayList<Cliente> clientes = new ArrayList<>();
    private int idCliente;
    private String email;
    
    public Cliente (String email, String nif, String nombre, String apellidos){
        this.idCliente = getIndiceArrayLIst(email);
        setNif(nif);
        setNombre(nombre);
        setApellidos(apellidos);
        this.email = email;

        clientes.add(this);
    }
    public int getIndiceArrayLIst(String email){
        int contador = 0;
        int indice = 0;
        for(Cliente id:clientes){
            if(id.getEmail().equals(email)){
                indice = contador;
                break;
            }
            else{
                contador++;
                if(contador==clientes.size()){
                    return 9999999;
                }
            }
        } 
        return indice;
    }
    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Cliente:\n"+
                "idCLiente:\t"+idCliente+"\n"+
                "nif:\t"+this.nif+"\n"+
                "nombre:\t"+this.nombre+"\n"+
                "apellidos:\t"+this.apellidos+"\n"+
                "email:\t"+this.email;
    }

    public String fichero(){
        return idCliente+", "+nif+", "+nombre+", "+apellidos+", "+email;
    }
    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public static void setClientes(ArrayList<Cliente> clientes) {
        Cliente.clientes = clientes;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
