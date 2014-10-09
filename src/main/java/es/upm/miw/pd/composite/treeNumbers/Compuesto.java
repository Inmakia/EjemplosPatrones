package es.upm.miw.pd.composite.treeNumbers;

import java.util.ArrayList;
import java.util.List;

import es.upm.miw.pd.composite.treeNumbers.solution.TreeNumbers;

public class Compuesto extends TreeNumbers {

    private String name;
    private List<TreeNumbers> tree;
    
    public Compuesto(String name) {
        this.name = name;
        this.tree = new ArrayList<TreeNumbers>();
    }

    @Override
    public void add(TreeNumbers node) {
        if (node != null) {
            this.tree.add(node);
        }
        
    }
    @Override
    public void remove(TreeNumbers node) {
        if (node != null) {
            this.tree.remove(node);
        }   
    }
    @Override
    public int numberOfNodes() {
        return this.tree.size();
    }
    @Override
    public int sum() {
        int total = 0;
        for (TreeNumbers nodo : this.tree) {
            total = total + nodo.sum();
        }
        return total;
    }
    @Override
    public int higher() {
        int higher = Integer.MIN_VALUE;
        for (TreeNumbers nodo : this.tree) {
            if (nodo.higher() > higher) {
                higher = nodo.higher();
            }
        }
        return higher;
    }
}
