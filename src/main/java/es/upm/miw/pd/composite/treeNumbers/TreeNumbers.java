package es.upm.miw.pd.composite.treeNumbers;

public abstract class TreeNumbers {

    private String name;

    public abstract void add(TreeNumbers nodo);
    public abstract void remove(TreeNumbers nodo);
    public abstract int numberOfNodes();
    public abstract int sum();
    public abstract int higher();

    @Override
    public String toString() {
        return "NumberTree[" + name + "]";
    }
}
