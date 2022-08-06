
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class BySuitInValueOrder implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        if(o1.getSuit() == o2.getSuit()){
            if(o1.getValue() == o2.getValue()){
                return 0;
            }else if(o1.getValue() > o2.getValue()){
                return 1;
            }else{
                return -1;
            }
   
        }else if(o1.getSuit().ordinal() > o2.getSuit().ordinal()){
            return 1;
        }else{
            return -1;
        }
    }
    
}
