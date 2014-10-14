package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculator.Calculadora;

public class ComandoRestar extends ComandoG {

    private static final String NAME = "RESTAR";

    public ComandoRestar(Calculadora calc) {
        super(calc, NAME);
    }

    @Override
    public void execute() {
        int valor = IO.in.readInt();
        this.getCalc().restar(valor);
    }

}
