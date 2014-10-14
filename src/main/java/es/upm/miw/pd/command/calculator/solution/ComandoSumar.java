package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculator.Calculadora;

public class ComandoSumar extends ComandoG {

    private static final String NAME = "SUMAR";

    public ComandoSumar(Calculadora calc) {
        super(calc, NAME);
    }

    @Override
    public void execute() {
        int valor = IO.in.readInt();
        this.getCalc().sumar(valor);

    }

}
