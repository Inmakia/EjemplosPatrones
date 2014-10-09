package es.upm.miw.pd.state.connection;


public class EstadoPreparado extends State {
    
    @Override
    public void parar(Conexion conexion) {
        conexion.setEstado(Estado.PARADO);
    }

    @Override
    public void iniciar(Conexion conexion) {    
    }

    @Override
    public void abrir(Conexion conexion) {   
    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setEstado(Estado.CERRADO);
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");     
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        conexion.getLink().enviar(msg);
        conexion.setEstado(Estado.ESPERANDO);
        
    }



}
