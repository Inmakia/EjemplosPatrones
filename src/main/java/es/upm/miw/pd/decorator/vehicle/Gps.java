package es.upm.miw.pd.decorator.vehicle;

public class Gps extends Decorador {
    
    private String descripcion;
    private int precio;

    public Gps(Componente c) {
        super(c);
        this.descripcion = "GPS";
        this.precio = 354;
        
    }

    @Override
    public String descripcionFinal() {
        return this.getC().descripcionFinal() + " + " + this.descripcion;
    }

    @Override
    public int precioFinal() {
        return this.getC().precioFinal() + this.precio;
    }

}
