package com.dhruvupadhyaya.coronavirustracker.models;

public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCases;
    private int previousCases;
    private int increasedCases;

    public int getIncreasedCases() {
        return increasedCases;
    }

    public void setIncreasedCases(int increasedCases) {
        this.increasedCases = increasedCases;
    }

    public int getPreviousCases() {
        return previousCases;
    }

    public void setPreviousCases(int previousCases) {
        this.previousCases = previousCases;
    }

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

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                ", previousCases=" + previousCases +
                '}';
    }
}
