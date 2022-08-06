
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class ShoppingCart {
    private Map<Integer, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price){
        boolean bool = false;
        int index = -1;
        for(int i = 0; i < this.cart.size(); i++){
            if(this.cart.get(i).getProduct().equals(product)){
                index = i;
                bool = true;
            }
        }
        if(bool){
            this.cart.get(index).increaseQuantity();
        }else{
            this.cart.put(this.cart.size(), new Item(product, 1, price));
        }
    
    }
    public int price(){
        int price = 0;
        for(Item it:this.cart.values()){
            price = it.price() + price;
        }
        return price;
    }
    
    public void print(){
        for(Item it:this.cart.values()){
            System.out.println(it);
        }
    }
}
