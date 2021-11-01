package by.tc.task01.entity;

public abstract class Appliance {
	private int id;


    public Appliance(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract String applianceType();
}
