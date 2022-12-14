/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author dkazmierczak
 */
public class Flight {
    private Airplane airplane;
    private Place departure;
    private Place target;

    public Flight(Airplane airplane, Place departure, Place target) {
        this.airplane = airplane;
        this.departure = departure;
        this.target = target;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Place getDeparture() {
        return departure;
    }

    public Place getTarget() {
        return target;
    }
    
    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departure + "-" + this.target + ")";
    }
}
