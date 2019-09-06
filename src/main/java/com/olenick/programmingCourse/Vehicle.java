package com.olenick.programmingCourse;

public abstract class Vehicle {
    protected static Double getWidth() { return null; };
    protected static Double getHeight() { return null; };
    protected static Double getLength() { return null; };
    protected static String getTypeAsString() { return "vehicle"; }

    public static Dimensions getDimensions() {
        return new Dimensions(getWidth(), getHeight(), getLength());
    }

    protected abstract String getName();

    public String toString() {
        return "" + getTypeAsString() + " '" + getName() + "'";
    }
}
