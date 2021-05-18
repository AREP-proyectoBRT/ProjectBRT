package BRTProject.service;

import BRTProject.model.Station;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;

public interface SimulatorBRT {

    JSONObject getStationById(String id);
    int activeBuses();
    int inactiveBuses();
    int busesOnStation(String idStation);
    JSONObject getStationsByZone(String zone);
    JSONObject getAverageByZone();
}
