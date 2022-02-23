public class Media {
    private int idMedia=0;
    private String nombre;
    private String contenido;
    private String tipo;
    private Usuario usuario;

    public Media(String nombre, String contenido,String tipo, Usuario usuario){
        this.idMedia++;
        this.nombre=nombre;
        this.contenido=contenido;
        if(tipo.equalsIgnoreCase("video")||tipo.equalsIgnoreCase("audio")){
            this.tipo=tipo;
        }
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
