package es.upm.miw.pd.state.connection;

public class Conexion {
    private Estado estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = Estado.CERRADO;
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estado;
    }

    protected void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void abrir() {
        estado.getEstado().abrir(this);
    }

    public void cerrar() {
        estado.getEstado().cerrar(this);
    }

    public void parar() {
        estado.getEstado().parar(this);
    }

    public void iniciar() {
        estado.getEstado().iniciar(this);
    }

    public void enviar(String msg) {
        estado.getEstado().enviar(this, msg);
    }

    public void recibir(int respuesta) {
        estado.getEstado().recibir(this, respuesta);

    }
}
