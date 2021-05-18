package BRTProject.service.impl;

import BRTProject.model.Station;
import BRTProject.persistence.SimulatorBRTDao;
import BRTProject.service.SimulatorBRT;
import org.json.JSONObject;

import java.util.HashMap;

public class SimulatorBRTImpl implements SimulatorBRT {

    private SimulatorBRTDao persistence= new SimulatorBRTDao();

    public SimulatorBRTImpl() {
    }

    @Override
    public JSONObject getStationById(String id) {
        Station station=persistence.getStationById(id);
        String temp = "{idName:"+station.getIdName()+",maxCapacity:"+station.getMaxCapacity()+",peopleInside:"+station.getPeopleInside()+",zone:"+station.getZone()+"}";
        return new JSONObject(temp);
    }

    @Override
    public int activeBuses() {
        return persistence.activeBuses();
    }

    @Override
    public int inactiveBuses() {
        return persistence.inactiveBuses();
    }

    @Override
    public int busesOnStation(String idStation) {
        return persistence.busesOnStation(idStation);
    }

    @Override
    public JSONObject getStationsByZone(String zone) {
        HashMap<String,Long> stations =persistence.getStationsByZone(zone);
        JSONObject temp= new JSONObject();
        temp.put("Stations",stations);
        return temp;
    }

    @Override
    public JSONObject getAverageByZone() {
        HashMap<String,Long> zones =persistence.getAverageByZone();
        JSONObject temp= new JSONObject();
        temp.put("Zone",zones);
        return temp;
    }
}
