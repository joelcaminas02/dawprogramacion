import java.util.ArrayList;

public class Media implements ParserXML {
    private int idMedia=0;
    private String nombre;
    private String contenido;
    private Usuario usuario;
    private static int autoID;
    private MediaType tipoMedia;

    private static ArrayList<Media> mediaList = new ArrayList<>();

    public Media(String nombre, String contenido,MediaType tipoMedia, Usuario usuario){
        this.idMedia=autoID++;
        this.nombre=nombre;
        this.contenido=contenido;
        this.tipoMedia=tipoMedia;
        this.usuario=usuario;
        mediaList.add(this);
    }

    public int getIdMedia() {
        return idMedia;
    }

    public void setIdMedia(int idMedia) {
        this.idMedia = idMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public MediaType getTipo() {
        return tipoMedia;
    }

    public void setTipo(MediaType tipoMedia) {
        this.tipoMedia = tipoMedia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public static void eliminarMedia(String nombreMedia){
        for(Media m1:mediaList){
            if(m1.getNombre().equals(nombreMedia)){
                m1 = null;
                mediaList.remove(m1);
                break;
            }
        }
    }

    public static boolean removeOneByName(String nombreMedia){
        
        boolean resultado=false;
        for(Media m1:mediaList){
            if(m1.getNombre().equals(nombreMedia)){
                m1 = null;
                mediaList.remove(m1);
                resultado=true;
                break;
            }
        }

        return resultado;
    }

    public static void eliminarMediaTipo(MediaType tipo){
        for(Media m1:mediaList){
            if(m1.getTipo()==tipo){
                m1 = null;
                mediaList.remove(m1);
                break;
            }
        }
    }

    public static void borrarMediaDominios(String dominioBorrar){
        for(int i = 0; i<Usuario.usuarios.size();i++){
            if(Usuario.usuarios.get(i).getEmail().endsWith(dominioBorrar)){
                for(int j=0;j<mediaList.size();j++){
                    if(mediaList.get(j).getUsuario().equals(Usuario.usuarios.get(i))){
                        mediaList.remove(j);
                    }
                }
                Usuario.borrarUsuario(i);
                i--;
                
            }
        }
    }
    public static void imprirmArrayList(){
        System.out.println();

        System.out.println("------------------------------");

        System.out.println();
        for(Media media:mediaList){
            System.out.println(media);
        }
    }

    @Override
    public String toString() {
        return "Media [contenido=" + contenido + ", idMedia=" + idMedia + ", nombre=" + nombre + ", tipoMedia="
                + tipoMedia + ", usuario=" + usuario + "]";
    }
    public String generateXML(){
        return "<media>\n"+
               "<contenido>"+this.contenido+"</contenido>\n"+
               "<idMedia>"+this.idMedia+"</idMedia>\n"+
               "<nombre>"+this.nombre+"</nombre>\n"+
               "<tipoMedia>"+this.tipoMedia+"</tipoMedia>\n"+
               "<usuario>"+this.usuario+"</usuario>"+
               "</media>";

    }
}
