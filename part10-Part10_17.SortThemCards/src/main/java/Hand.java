
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class Hand implements Comparable<Hand>{
    private List<Card> cards = new ArrayList<>();
    
    public void add(Card card){
        cards.add(card);
    }
    public void print(){
        this.cards.stream().forEach(card -> System.out.println(card));
    }
    public void sort(){
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);
        Collections.sort(cards, comparator);
    }

    @Override
    public int compareTo(Hand o) {
        int sumThis = this.cards.stream().map(x -> x.getValue()).reduce(0, Integer::sum);
        int sum = o.cards.stream().map(x -> x.getValue()).reduce(0, Integer::sum);
        if(sumThis == sum){
            return 0;
        }else if(sumThis > sum){
            return 1;
            
        }else{
            return - 1;
        }
    }
    
    public void sortBySuit(){
        this.cards.sort(new SortBySuit());
    }
}
