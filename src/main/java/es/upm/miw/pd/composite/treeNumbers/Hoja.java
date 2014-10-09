package es.upm.miw.pd.composite.treeNumbers;

public class Hoja extends TreeNumbers {
    
    private int number;
    
    public Hoja(Integer number) {
        this.number = number;
    }

    @Override
    public void add(TreeNumbers node) {
        throw new UnsupportedOperationException();     
    }

    @Override
    public void remove(TreeNumbers node) {   
    }

    @Override
    public int numberOfNodes() {
        return 1;
    }

    @Override
    public int sum() {
        return this.number;
    }

    @Override
    public int higher() {
        return this.number;
    }

}
