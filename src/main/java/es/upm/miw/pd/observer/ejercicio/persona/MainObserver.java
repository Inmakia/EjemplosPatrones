package es.upm.miw.pd.observer.ejercicio.persona;

import upm.jbb.IO;

public final class MainObserver {
    private MainObserver() {
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Peter Pan", 11, 654986133);
        new ObservadorPersona(persona);
        IO.in.addModel(persona);
    }
}
