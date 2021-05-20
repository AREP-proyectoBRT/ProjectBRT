package BRTProject.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import BRTProject.model.Bus;
import BRTProject.model.Station;

public class SimulatorBRTDao {

    private Connection c;

    public SimulatorBRTDao() {
        try {
            this.c =  DriverManager.getConnection("jdbc:postgresql://ec2-54-87-112-29.compute-1.amazonaws.com:5432/d26fa8bmkceaih",
                            "rgxolvhkbhimzo", "178e0d48501c42f0c93cb6f388089f3d6066a28f2abd58e3263e9477d7760935");
            c.setAutoCommit(true);
        } catch (SQLException throwables) {
            System.out.println("No connection");
        }
    }

    public Station getStationById(String id){
        Station station = null;
        try {
            String sql = "SELECT * FROM ESTACION WHERE IDNOMBRE ='"+id+"'";
            Statement stm = c.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String idName = rs.getString("idnombre");
                int maxCapacity = rs.getInt("capacidadmaxima");
                int peopleInside = rs.getInt("personasesperando");
                String zone = rs.getString("zona");
                station = new Station(idName, maxCapacity, peopleInside, zone);
            }
            return station;
        } catch (SQLException throwables) {
            System.out.println("Fallo sql");
            return null;
        }
    }

    public List<Bus> getAllBuses() {
        List<Bus> buses = new ArrayList<>();
        try {
            String sql = "SELECT * FROM bus WHERE ACTIVO = TRUE";
            Statement stm = c.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String idBus = rs.getString("idbus");
                String ruta = rs.getString("ruta");
                String estacionActual = rs.getString("estacionactual");
                Boolean activo = rs.getBoolean("activo");
                int numPasajeros = rs.getInt("numeropasajerosactual");
                int capacidad = rs.getInt("capacidadmax");
                buses.add(new Bus(idBus, ruta, estacionActual, activo, numPasajeros, capacidad));
            }
            return buses;
        } catch (SQLException throwables) {
            System.out.println("Fallo sql");
            throwables.printStackTrace();
            return null;
        }
    }

    public void changeBusOccupation(String id, int newOccupation) {
        try {
            System.out.println(newOccupation);
            String sql = "UPDATE bus SET numeropasajerosactual = '" + newOccupation + "' WHERE idbus = '" + id + "'";
            Statement stm = c.createStatement();
            System.out.println(stm.executeUpdate(sql));
        } catch (SQLException throwables) {
            System.out.println("Fallo sql");
            throwables.printStackTrace();
        }
    }

    public int activeBuses(){
        int buses = 0;
        try {
            String sql = "SELECT * FROM BUS WHERE ACTIVO = TRUE";

            Statement stm = c.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()){
                buses += 1;
            }
        } catch (SQLException throwables) {
            System.out.println("Fallo sql");
        }
        return buses;
    }

    public int inactiveBuses(){
        int buses = 0;
        try {
            String sql = "SELECT * FROM BUS WHERE ACTIVO = FALSE ";

            Statement stm = c.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()){
                buses += 1;
            }
        } catch (SQLException throwables) {
        }
        return buses;
    }

    public int busesOnStation(String idStation){
        int buses = 0;
        try {
            String sql = "SELECT * FROM BUS WHERE estacionactual ='"+idStation+"'";

            Statement stm = c.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()){
                buses += 1;
            }
        } catch (SQLException throwables) {
            System.out.println("Fallo sql");
        }
        return buses;
    }

    public HashMap<String,Long> getStationsByZone(String zone){

        HashMap<String,Long> stationsAndAverage = new HashMap<>();
        try {
            String sql = "SELECT * FROM ESTACION WHERE ZONA ='"+zone+"'";
            Statement stm = c.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()){
                String idName = rs.getString("idnombre");
                long maxCapacity = rs.getLong("capacidadmaxima");
                long peopleInside = rs.getLong("personasesperando");
                long average = (peopleInside*100)/maxCapacity;
                stationsAndAverage.put(idName,average);
            }

            return stationsAndAverage;
        } catch (SQLException throwables) {
            System.out.println("Fallo sql");
            return null;
        }

    }

    public HashMap<String,Long> getAverageByZone(){
        HashMap<String,Long> stationsAndAverage = new HashMap<>();
        try {
            String sql = "SELECT * FROM ZONA";
            Statement stm = c.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()){
                String idName = rs.getString("idnombredeltrayecto");
                Long average = averageByStation(idName);
                stationsAndAverage.put(idName,average);
            }

        } catch (SQLException throwables) {
            System.out.println("Fallo sql");
        }
        return stationsAndAverage;
    }

    private long averageByStation(String zone){
        HashMap<String,Long> stations = getStationsByZone(zone);
        int sum = 0;
        int total= 0;
        for (String station:stations.keySet()) {
            sum+= stations.get(station);
            total+=1;
        }
        return sum/total;
    }


}
