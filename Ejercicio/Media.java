import java.util.ArrayList;

public class Media {
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

    public static void eliminarMediaTipo(MediaType tipo){
        for(Media m1:mediaList){
            if(m1.getTipo()==tipo){
                m1 = null;
                mediaList.remove(m1);
            }
        }
    }

    public static void borrarMediaDominios(String dominioBorrar){
        for(int i = 0; i<Usuario.usuarios.size();i++){
            if(Usuario.usuarios.get(i).getEmail().contains(dominioBorrar)){
            for(Media media:mediaList){
                if(media.getUsuario().equals(Usuario.usuarios.get(i))){
                    mediaList.remove(media);
                }
            }
                Usuario.borrarUsuario(i);
                i--;
                
            }
        }
    }
}
