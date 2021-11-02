package by.tc.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance{
    private int powerConsumption, numberOfSpeakers, cordLength;
    private String frequencyRange;

    public Speakers(int id, int powerConsumption, int numberOfSpeakers, int cordLength, String frequencyRange) {
        super(id);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.cordLength = cordLength;
        this.frequencyRange = frequencyRange;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return powerConsumption == speakers.powerConsumption && numberOfSpeakers == speakers.numberOfSpeakers && cordLength == speakers.cordLength && Objects.equals(frequencyRange, speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, cordLength, frequencyRange);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", cordLength=" + cordLength +
                ", frequencyRange='" + frequencyRange + '\'' +
                '}';
    }

}
