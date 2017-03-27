package com.example.android.takehomeassignment08_lindsayb;


public class Country {

    private String city;
    private int population;
    private boolean goBack;

    public Country(String city, int population, boolean goBack) {
        this.city = city;
        this.population = population;
        this.goBack = goBack;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation (int population) {
        this.population = population;
    }

    public boolean isGoBack() {
        return goBack;
    }

    public void setGoBack(boolean goBack) {
        this.goBack = goBack;
    }

    @Override
    public String toString() {
        return "Info on My Favorite Country: " + "\n" +
                "city: " + city + '\n' +
                "population: " + population + '\n' +
                "Would I go back: " + goBack;
    }


}