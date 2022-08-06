/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author dkazmierczak
 */
public class AverageSensor implements Sensor {
    
    private Collection<Sensor> sensors = new ArrayList<>();
    private List<Integer> readings = new ArrayList<>();
    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        return sensors.stream().allMatch(sensor -> sensor.isOn());
    }

    @Override
    public void setOn() {
        sensors.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        sensors.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if(sensors.size()>0){
            int dupa = (int) sensors.stream().mapToDouble(Sensor::read).average().getAsDouble();
            readings.add(dupa);
            return dupa;
        }else{
            throw new IllegalStateException();
        }
        
    }
    
    public List<Integer> readings(){
        return readings;
    }
}
