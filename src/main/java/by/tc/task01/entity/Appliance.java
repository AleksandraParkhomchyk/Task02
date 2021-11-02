package by.tc.task01.entity;

public abstract class Appliance {
    private Integer id;


    public Appliance(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
