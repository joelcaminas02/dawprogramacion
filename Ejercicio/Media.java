public class Media {
    private int idMedia=0;
    private String nombre;
    private String contenido;
    private Usuario usuario;
    private static int autoID;
    private MediaType tipoMedia;

    public Media(String nombre, String contenido,MediaType tipoMedia, Usuario usuario){
        this.idMedia=autoID++;
        this.nombre=nombre;
        this.contenido=contenido;
        this.tipoMedia=tipoMedia;
        this.usuario=usuario;
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

    
}
