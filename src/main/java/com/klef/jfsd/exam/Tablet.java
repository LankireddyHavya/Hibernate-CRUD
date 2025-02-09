package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
@Table(name = "tablet")
public class Tablet extends Device {

    @Column(name = "screen_size")
    private double screenSize;

    @Column(name = "battery_life")
    private double batteryLife;

    // Getters and Setters
    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }
}
