/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class Literacy {
    private String country;
    private int year;
    private String sex;
    private String percentage;

    public Literacy(String country, int year, String sex, String percentage) {
        this.country = country;
        this.year = year;
        this.sex = sex;
        this.percentage = percentage;
    }

    
    
    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getSex() {
        return sex;
    }

    public String getPercentage() {
        return percentage;
    }
    
    @Override
    public String toString(){
        return this.country + " (" + this.year + "), " + this.sex + ", " + this.percentage;
    }
    
}
