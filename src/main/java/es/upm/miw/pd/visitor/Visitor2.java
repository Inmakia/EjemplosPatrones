package es.upm.miw.pd.visitor;

public class Visitor2 extends Visitor {
    
    private final int NUMELEMENTS = 2;
    private int[] elements = new int[NUMELEMENTS];
    

    @Override
    public void visitElementA(ElementA e) {
        this.elements[0]++; 
        
    }

    @Override
    public void visitElementB(ElementB e) {
        this.elements[1]++;
        
    }

    public Object getAs() {
        return this.elements[0];
    }

    public Object getBs() {
        return this.elements[1];
    }

}
