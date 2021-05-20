package BRTProject;

import java.util.List;
import java.util.Random;
import BRTProject.model.Bus;
import BRTProject.persistence.SimulatorBRTDao;

/**
 * Sensor
 */
public class Sensor {

    private final float inWeight;
    private final List<Bus> buses;
    private final SimulatorBRTDao simulatorBRTDao = new SimulatorBRTDao();

    public Sensor(float inWeight) {
        this.inWeight = inWeight;
        buses = simulatorBRTDao.getAllBuses();
    }

    public void simulateBus() {
        Random r = new Random();
        while (true) {
            double inOrOut = 0 + r.nextDouble() * (1 - 0);
            Bus randomBus = buses.get(r.nextInt(buses.size()));
            String id = randomBus.getIdBus();
            System.out.println(id);
            int pasajeros = randomBus.getPassengers();
            pasajeros += inOrOut <= inWeight ? 1 : -1;
            randomBus.setPassengers(pasajeros);
            simulatorBRTDao.changeBusOccupation(id, pasajeros);
        }
    }

    public static void main(String[] args) {
        Sensor sensor = new Sensor(0.5f);
        sensor.simulateBus();
    }

}
