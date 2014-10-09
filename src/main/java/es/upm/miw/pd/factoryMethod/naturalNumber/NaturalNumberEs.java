package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {
    
    public NaturalNumberEs(int value) {
        super(value);
    }

    private int value;

    private static final String[] textValue = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};
    
    public String getTextValue(String[] textValue) {
        super(this.textValue);


}
