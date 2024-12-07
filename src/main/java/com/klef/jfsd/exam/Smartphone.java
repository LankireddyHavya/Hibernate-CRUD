package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
@Table(name = "smartphone")
public class Smartphone extends Device {

    @Column(name = "operating_system")
    private String operatingSystem;

    @Column(name = "camera_resolution")
    private double cameraResolution;

    // Getters and Setters
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
}
