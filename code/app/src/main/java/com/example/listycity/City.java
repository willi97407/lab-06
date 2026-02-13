package com.example.listycity;

import androidx.annotation.Nullable;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * This initialize a city
     * @param city
     * @param province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This returns the name of a city
     * @return
     * Return the name of the city
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This returns the province of a city
     * @return
     * Return the province of the city
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This override the compareTo of City
     * @param o
     * @return
     * Return 0 or 1
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * This override the equals of City
     * @param obj   the reference object with which to compare.
     * @return
     * Return ture or false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (!(obj instanceof City)) {
            return false;
        }
        City other = (City) obj;
        return this.city.equals(other.city);
    }
}
