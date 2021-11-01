package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance {
    private int memoryRom, systemMemory, displayInches;
    private String OS;
    private double batteryCapacity, cpu;

    public Laptop(int id, double batteryCapacity, int memoryRom, int systemMemory, int displayInches, String OS, double cpu) {
        super(id);
        this.batteryCapacity = batteryCapacity;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.displayInches = displayInches;
        this.OS = OS;
        this.cpu = cpu;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return OS;
    }

    public void setOs(String os) {
        OS = OS;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return memoryRom == laptop.memoryRom && systemMemory == laptop.systemMemory && displayInches == laptop.displayInches && Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 && Double.compare(laptop.cpu, cpu) == 0 && OS.equals(laptop.OS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memoryRom, systemMemory, displayInches, OS, batteryCapacity, cpu);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", displayInches=" + displayInches +
                ", OS=" + OS +
                ", batteryCapacity=" + batteryCapacity +
                ", cpu=" + cpu +
                '}';
    }

    @Override
    public String applianceType() {
        String type = "Laptop";
        return type;
    }
}
