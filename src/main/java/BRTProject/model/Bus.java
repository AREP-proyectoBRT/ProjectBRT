package BRTProject.model;

public class Bus {
    private String idBus;
    private String route;
    private String actualStation;
    private Boolean active;
    private int passengers;
    private int maxCapacity;

    public Bus() {
    }

    public Bus(String idBus, String route, String actualStation, Boolean active, int passengers, int maxCapacity) {
        this.idBus = idBus;
        this.route = route;
        this.actualStation = actualStation;
        this.active = active;
        this.passengers = passengers;
        this.maxCapacity = maxCapacity;
    }

    public String getIdBus() {
        return idBus;
    }

    public void setIdBus(String idBus) {
        this.idBus = idBus;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getActualStation() {
        return actualStation;
    }

    public void setActualStation(String actualStation) {
        this.actualStation = actualStation;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
