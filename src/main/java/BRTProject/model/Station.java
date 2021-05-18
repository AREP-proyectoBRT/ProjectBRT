package BRTProject.model;

public class Station{
    private String idName;
    private int maxCapacity;
    private int peopleInside;
    private String zone;

    public Station() {
    }

    public Station(String idName, int maxCapacity, int peopleInside, String zone) {
        this.idName = idName;
        this.maxCapacity = maxCapacity;
        this.peopleInside = peopleInside;
        this.zone = zone;
    }


    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getPeopleInside() {
        return peopleInside;
    }

    public void setPeopleInside(int peopleInside) {
        this.peopleInside = peopleInside;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }
}
