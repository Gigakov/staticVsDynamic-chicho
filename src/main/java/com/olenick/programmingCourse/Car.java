package com.olenick.programmingCourse;

public class Car extends Vehicle {
    protected static Double getWidth() { return 3.0; }
    protected static Double getHeight() { return 1.5; }
    protected static Double getLength() { return 4.5; }
    protected static String getTypeAsString() { return "car"; }

    public static Dimensions getDimensions() {
        return new Dimensions(getWidth(), getHeight(), getLength());
    }

    protected final String name;

    public Car(String name) {
        this.name = name;
    }

    protected String getName() { return name; }
}
