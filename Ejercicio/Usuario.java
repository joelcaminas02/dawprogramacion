import java.util.ArrayList;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class Usuario implements ParserXML{
    
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

    public String getIdUsuarioString(){
        String idUsuario=Integer.toString(this.idUsuario);
        return idUsuario;
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

    public String generateXML(){
        return "<usuario\n>"+
                "<id>"+this.idUsuario+"</id>\n"+
                "<email>"+this.email+"</email>\n"+
                "<contraseña>"+this.password+"</contraseña>\n"+
               "</usuario>";
    }

    public void crearXML(){
        try {
            // Creo una instancia de DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // Creo un documentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Creo un DOMImplementation
            DOMImplementation implementation = builder.getDOMImplementation();
 
            // Creo un documento con un elemento raiz
            Document documento = implementation.createDocument(null, "CutreCloud", null);
            documento.setXmlVersion("1.0");
 
            // Creo los elementos
            Element usuarios = documento.createElement("usuarios");
            Element usuario = documento.createElement("usuario");

            // Id
            Element id = documento.createElement("id");
            Text textId = documento.createTextNode(this.getIdUsuarioString());
            id.appendChild(textId);
            usuario.appendChild(id);
        
            // Email
            Element email = documento.createElement("email");
            Text textEmail = documento.createTextNode(this.getEmail());
            email.appendChild(textEmail);
            usuario.appendChild(email);
 
            // Passwd
            Element passwd = documento.createElement("passwd");
            Text textPasswd = documento.createTextNode(this.getPassword());
            passwd.appendChild(textPasswd);
            usuario.appendChild(passwd);
 
            // Añado al elemento coches el elemento coche
            usuarios.appendChild(usuario);
 
            // Añado al root el elemento coches
            documento.getDocumentElement().appendChild(usuarios);
 
            // Asocio el source con el Document
            Source source = new DOMSource(documento);
            // Creo el Result, indicado que fichero se va a crear
            Result result = new StreamResult(new File("Ejercicio/usuarios/"+getIdUsuarioString()+".xml"));
 
            // Creo un transformer, se crea el fichero XML
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
 
        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}