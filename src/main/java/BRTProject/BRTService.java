package BRTProject;

import BRTProject.service.impl.SimulatorBRTImpl;
import static spark.Spark.*;

public class BRTService {
    public static void main( String[] args ){
        staticFiles.location("/static");
        port(getPort());

        SimulatorBRTImpl simulatorBRT= new SimulatorBRTImpl();

        get("/Station", (req,res) -> {
            return simulatorBRT.getStationById(req.queryParams("station"));
        });
        get("/activeBuses", (req,res) -> {
            return simulatorBRT.activeBuses();
        });

        get("/inactiveBuses", (req,res) -> {
            return simulatorBRT.inactiveBuses();
        });

        get("/busesOnStation", (req,res) -> {
            return simulatorBRT.busesOnStation(req.queryParams("station"));
        });

        get("/stationsByZone", (req,res) -> {
            return simulatorBRT.getStationsByZone(req.queryParams("zone"));
        });

        get("/averageByZone", (req,res) -> {
            return simulatorBRT.getAverageByZone();
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 35000;
    }
}
