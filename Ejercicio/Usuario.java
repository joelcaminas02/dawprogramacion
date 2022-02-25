import java.util.ArrayList;

public class Usuario {
    
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    private int idUsuario;
    private String email;
    private String password;

    public Usuario(String email, String password){
        this.password=password;
        if(this.comprobarEmail(email)){
            this.email=email;
            usuarios.add(this);
        }else{
            this.email= "Correo duplicado: "+email;
        }
        this.idUsuario=getIndiceArrayLIst(email);
        
    }

    public int getIndiceArrayLIst(String email){
        int contador = 0;
        int indice = 0;
        for(Usuario id:usuarios){
            if(id.getEmail().equals(email)){
                indice = contador;
                break;
            }
            else{
                contador++;
                if(contador==usuarios.size()){
                    return 9999999;
                }
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

    private void idBorrado(){
        this.idUsuario=this.idUsuario-1;
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
    public static void imprirmArrayList(){
        System.out.println();

        System.out.println("------------------------------");

        System.out.println();
        for(Usuario u1:usuarios){
            System.out.println(u1);
        }
    }

    public static void borrarUsuario(int id){
        usuarios.remove(id);
        for(Usuario u1:usuarios){
            u1.idBorrado();
        }
    }

    public static void borrarDominios(String dominioBorrar){
        for(int i = 0; i<usuarios.size();i++){
            if(usuarios.get(i).getEmail().contains(dominioBorrar)){
                borrarUsuario(i);
                i--;
            }
        }
    }
}