package es.upm.miw.pd.observer.ejercicio.persona;

import upm.jbb.IO;

public class ObservadorPersonaB implements Observador {
    private Persona persona;

    public ObservadorPersonaB(Persona persona) {
        this.persona = persona;
        this.persona.aniadir(this);
    }

    @Override
    public void actualizar() {
        IO.out.setStatusBar("Persona B ha cambiado: " + this.persona.getEstado());
    }
}
