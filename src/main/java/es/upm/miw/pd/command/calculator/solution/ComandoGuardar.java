package es.upm.miw.pd.command.calculator.solution;

import es.upm.miw.pd.command.calculator.Calculadora;
import es.upm.miw.pd.command.calculator.GestorMementos;
import es.upm.miw.pd.command.calculator.MementoCalculadora;

public class ComandoGuardar extends ComandoG {
    private static final String NAME = "GUARDAR";
    private GestorMementos<MementoCalculadora> gestor;
    private static final String MEMID = "MEMENTO N.";
    private int memId = 0;

    public ComandoGuardar(Calculadora calc, GestorMementos<MementoCalculadora> gestor) {
        super(calc, NAME);
        this.gestor = gestor;
    }

    @Override
    public void execute() {
        this.gestor.addMemento(MEMID + Integer.toString(memId++) , new MementoCalculadora(this.getCalc().getTotal()));

    }

}
