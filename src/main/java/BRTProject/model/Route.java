package BRTProject.model;

public class Route {
    private String idRoute;
    private String idStation;
    private String origin;
    private String destiny;

    public Route() {
    }

    public Route(String idRoute, String idStation, String origin, String destiny) {
        this.idRoute = idRoute;
        this.idStation = idStation;
        this.origin = origin;
        this.destiny = destiny;
    }

    public String getIdRoute() {
        return idRoute;
    }

    public void setIdRoute(String idRoute) {
        this.idRoute = idRoute;
    }

    public String getIdStation() {
        return idStation;
    }

    public void setIdStation(String idStation) {
        this.idStation = idStation;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }
}
