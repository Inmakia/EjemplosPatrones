package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculator.Calculadora;

public class ComandoImprimir extends ComandoG {

    private static final String NAME = "IMPRIMIR";

    public ComandoImprimir(Calculadora calc) {
        super(calc, NAME);
    }

    @Override
    public void execute() {
        IO.out.println(this.getCalc().getTotal());

    }

}
