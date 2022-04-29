package Control04;

import java.util.ArrayList;

public class Cliente extends Persona{

    public static ArrayList<Cliente> clientes = new ArrayList<>();
    private int idCliente;
    private String email;
    
    public Cliente (String email, String nif, String nombre, String apellidos){
        this.idCliente = getIndiceArrayLIst(email);
        setNif(nif);
        setNombre(nombre);
        setApellidos(apellidos);
        this.email = email;
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
    private String getEmail() {
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
}
