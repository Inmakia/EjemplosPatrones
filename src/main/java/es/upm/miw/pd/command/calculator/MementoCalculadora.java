package es.upm.miw.pd.command.calculator;

public class MementoCalculadora {
    private int total;

    public MementoCalculadora(int total) {
        this.total = total;
    }

    public int getTotal() {
        return this.total;
    }

}