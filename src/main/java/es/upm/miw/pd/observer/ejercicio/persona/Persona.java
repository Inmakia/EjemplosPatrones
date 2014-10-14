package es.upm.miw.pd.observer.ejercicio.persona;

public class Persona extends Observable {
    
    private String nombre;
    private int edad;
    private int movil;
    
    public Persona(String nombre, int edad, int movil) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.movil = movil;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.notificar();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        this.notificar();
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
        this.notificar();
    }
    
    public String getEstado() {
        return this.getNombre() + ", " + this.getEdad() + " años, tlf: " + this.getMovil();
    }

}
