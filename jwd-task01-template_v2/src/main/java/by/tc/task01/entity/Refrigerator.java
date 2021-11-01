package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance{
	private int powerConsumption, weight, freezerCapacity, height, width;
    private double overallCapacity;

    public Refrigerator(int id, int powerConsumption, int weight, int freezerCapacity, int height, int width, double overallCapacity) {
        super(id);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.height = height;
        this.width = width;
        this.overallCapacity = overallCapacity;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return powerConsumption == that.powerConsumption && weight == that.weight && freezerCapacity == that.freezerCapacity && height == that.height && width == that.width && Double.compare(that.overallCapacity, overallCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, height, width, overallCapacity);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", height=" + height +
                ", width=" + width +
                ", overallCapacity=" + overallCapacity +
                '}';
    }
    @Override
    public String applianceType() {
        String type = "Refrigerator";
        return type;
    }
}
