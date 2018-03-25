package com.mirego.csmapapplication;

/**
 * Created by MjM5 on 24/03/2018.
 */

public class ListItemClass {

    private String name;
    private String componet;
    private double lat;
    private double longit;

    public ListItemClass(String name, String comp) {
        this.name = name;
        this.componet = comp;
        this.lat = lat;
        this.longit = longit;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComponet() {
        return componet;
    }

    public void setComponet(String comp) {
        this.componet = comp;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLongit() {
        return longit;
    }

    public void setComponet(Double comp) {
        this.longit = longit;
    }
}