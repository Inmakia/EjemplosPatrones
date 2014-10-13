package es.upm.miw.pd.decorator.vehicle;

public class Coche extends Componente {
    
    private int precio;
    private String modelo;
    
    public Coche(int precio, String modelo) {
        this.precio = precio;
        this.modelo = modelo;
    }

    @Override
    public String descripcionFinal() {     
        return this.modelo;
    }
    
    @Override
    public int precioFinal() {
        return this.precio;
    }

}
