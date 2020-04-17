package com.sabrina.virustracker.models;

public class LocationStats {
    private String state;
    private String country;
    private String confirmedCases;

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

    public String getConfirmedCases() {
        return confirmedCases;
    }

    public void setConfirmedCases(String confirmedCases) {
        this.confirmedCases = confirmedCases;
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
