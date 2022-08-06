/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory history = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        super.addToWarehouse(initialBalance);
        this.history.add(initialBalance);
    }
    
    public String history(){
        return this.history.toString();
    }
    
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount){
        double retur = super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        return retur;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName() + "\n"
                + "History: " + this.history() + "\n"
                        + "Largest amount of product: " + this.history.maxValue() + "\n"
                                + "Smallest amount of product: " + this.history.minValue() + "\n"
                                        + "Average: " + this.history.average());
    }
}
