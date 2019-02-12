package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double altitude;
    private double base;

    public Triangle(double altitude, double base) {
        this.altitude = altitude;
        this.base = base;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return 0.5 * altitude * base;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getBase() {
        return base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.altitude, altitude) != 0) return false;
        return Double.compare(triangle.base, base) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(altitude);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(base);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
