package es.upm.miw.pd.observer.ejercicio.persona;

import upm.jbb.IO;

public class ObservadorPersona implements Observador {
    private Persona persona;

    public ObservadorPersona(Persona persona) {
        this.persona = persona;
        this.persona.aniadir(this);
    }

    @Override
    public void actualizar() {
        IO.out.setStatusBar("Persona A ha cambiado: " + this.persona.getEstado());
    }
}
