package es.upm.miw.pd.state.connection;

public enum Estado {
    CERRADO(new EstadoCerrado()), PARADO(new EstadoParado()), PREPARADO(new EstadoPreparado()), ESPERANDO(
            new EstadoEsperando());

    private State estado;

    Estado(State estado) {
        this.estado = estado;
    }
    
    public State getEstado() {
        return this.estado;
    }
}
