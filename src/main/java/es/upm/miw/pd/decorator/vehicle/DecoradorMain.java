package es.upm.miw.pd.decorator.vehicle;

public final class DecoradorMain {
    private DecoradorMain() {
    }

    public static void main(String[] args) {
        Componente c = new Coche(50217, "Ford Focus");
        Componente da = new Gps(c);
        System.out.println(c.descripcionFinal());
        System.out.println(c.precioFinal());
        System.out.println(new Gps(c).descripcionFinal());
        System.out.println(new Mp3(da).descripcionFinal());
        System.out.println(new Gps(c).precioFinal());
        System.out.println(new Mp3(da).precioFinal());
     
    }
}
