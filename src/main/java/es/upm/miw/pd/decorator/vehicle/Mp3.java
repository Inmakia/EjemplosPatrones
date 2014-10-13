package es.upm.miw.pd.decorator.vehicle;

public class Mp3 extends Decorador {
    
    private String descripcion;
    private int precio;

    public Mp3(Componente c) {
        super(c);
        this.descripcion = "MP3";
        this.precio = 62;
        
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
