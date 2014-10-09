package es.upm.miw.pd.factoryMethod.naturalNumber;

public abstract class NaturalNumberCreator {
    
    public NaturalNumber createNumber(int value) {
        return new NaturalNumberEs(value);
    }
}
