package es.upm.miw.pd.command.calculator.solution;

import es.upm.miw.pd.command.calculator.Calculadora;

public class ComandoIniciar extends ComandoG {

    private static final String NAME = "INICIAR";

    public ComandoIniciar(Calculadora calc) {
        super(calc, NAME);
    }

    @Override
    public void execute() {
        this.getCalc().iniciar();

    }
}
