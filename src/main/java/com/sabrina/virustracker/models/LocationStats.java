package com.sabrina.virustracker.models;

public class LocationStats implements Comparable<LocationStats> {
    private String state;
    private String country;
    private int confirmedCases;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getConfirmedCases() {
        return confirmedCases;
    }

    public void setConfirmedCases(int confirmedCases) {
        this.confirmedCases = confirmedCases;
    }

    @Override
    public int compareTo(LocationStats location) {
        return this.confirmedCases - location.confirmedCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", confirmedCases=" + confirmedCases +
                '}';
    }
}
