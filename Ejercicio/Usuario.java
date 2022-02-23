import java.util.ArrayList;

public class Usuario {
    
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    private int idUsuario;
    private String email;
    private String password;
    private static int idGenerator=0;

    public Usuario(String email, String password){
        this.idUsuario=idGenerator++;
        this.password=password;
        if(this.comprobarEmail(email)){
            this.email=email;
            usuarios.add(this);
        }else{
            this.email= "Correo duplicado: "+email;
        }
        
        
    }

    public int getIndiceArrayLIst(int idUsuario){
        int contador = 0;
        int indice = 0;
        for(Usuario id:usuarios){
            if(id.getIdUsuario() == idUsuario){
                indice = contador;
                break;
            }
            else{
                contador++;
            }
        } 
        return indice;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }
    public int getIdUsuario(){
        return this.idUsuario;
    }

    @Override
    public String toString() {
        return "Usuario [email=" + email + ", idUsuario=" + idUsuario + ", password=" + password + "]";
    }
    
    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(ArrayList<Usuario> usuarios) {
        Usuario.usuarios = usuarios;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private boolean comprobarEmail(String email){
        boolean resultado =true;
        for(Usuario usuario:usuarios){
            if(usuario.getEmail().equals(email)){
                resultado = false;
                break;
            }
        }
        return resultado;
    }
}