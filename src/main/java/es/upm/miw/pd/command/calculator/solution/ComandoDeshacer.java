package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculator.Calculadora;
import es.upm.miw.pd.command.calculator.GestorMementos;
import es.upm.miw.pd.command.calculator.MementoCalculadora;

public class ComandoDeshacer extends ComandoG {
    private static final String NAME = "DESHACER";
    private GestorMementos<MementoCalculadora> gestor;
    private static final String MEMID = "MEMENTO N.";
    private int memId = 0;
    
    public ComandoDeshacer(Calculadora calc, GestorMementos<MementoCalculadora> gestor) {
        super(calc, NAME);
        this.gestor = gestor;
    }

    @Override
    public void execute() {
        this..restoreMemento(this.gm.getMemento((String) IO.in.select(gm.keys(), "Restaurar")));
        String res = new String(MEMID + memId++);
        this.gestor.getMemento(key)
    }

}
