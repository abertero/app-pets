package com.pets.enums;

public enum LengthScale {
    CENTIMETERS("cm", 1.0), FOOTS("ft", 0.0328084);

    private String display;
    private double proportionToCm;

    LengthScale(String display, double proportionToCm) {
        this.display = display;
        this.proportionToCm = proportionToCm;
    }

    public String getDisplay() {
        return display;
    }

    public double getProportionToCm() {
        return proportionToCm;
    }
}
