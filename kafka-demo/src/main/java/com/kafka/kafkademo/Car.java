package com.kafka.kafkademo;

public class Car {

    private String carName;

    private String companyName;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Car(String carName, String companyName) {
        this.carName = carName;
        this.companyName = companyName;
    }

    public Car() {
    }
}
