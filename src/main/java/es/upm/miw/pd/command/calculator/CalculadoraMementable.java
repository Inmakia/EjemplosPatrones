package es.upm.miw.pd.command.calculator;

public class CalculadoraMementable extends Calculadora implements Mementable<MementoCalculadora> {
    private int id, total;
        
    public CalculadoraMementable(int id) {
        super();
        this.id = id;
    }

    @Override
    public MementoCalculadora createMemento() {
        return new MementoCalculadora(this.total);
    }

    @Override
    public void restoreMemento(MementoCalculadora memento) {
        this.setTotal(memento.getTotal());   
    }

    public int getId() {
        return this.id;
    }

}
