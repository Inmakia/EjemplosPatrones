package es.upm.miw.pd.command.calculator.solution;

import es.upm.miw.pd.command.calculator.Calculadora;

public abstract class ComandoG implements Comando{
    private Calculadora calc;
    private String name;
    
    public ComandoG(Calculadora calc, String name) {
        this.setCalc(calc);
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public abstract void execute();

    public Calculadora getCalc() {
        return this.calc;
    }

    public void setCalc(Calculadora calc) {
        this.calc = calc;
    }   
    

}
