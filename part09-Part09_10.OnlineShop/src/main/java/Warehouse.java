
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.prices.put(product,price);
        this.stock.put(product,stock);
    }
    
    public int price(String product){
        if(this.prices.containsKey(product)){
            return this.prices.get(product);
        }
        return -99;
    }
    
    public int stock(String product){
        if(this.stock.containsKey(product)){
            return this.stock.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
        if(this.stock.containsKey(product)){
            if(this.stock.get(product)>0){
                int stock = this.stock.get(product);
                this.stock.replace(product, stock - 1);
                return true;
            }
        }else{
            return false;
        }
        return false;
    }
    
    public Set<String> products(){
        return this.prices.keySet();
    }
}
