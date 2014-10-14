package es.upm.miw.pd.command.calculator;

public interface Mementable<T> {
    T createMemento();

    void restoreMemento(T memento);

}