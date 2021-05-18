package BRTProject.persistence;

import BRTProject.model.Station;

import java.sql.*;
import java.util.HashMap;

public class SimulatorBRTDao {

    private Connection c;

    public SimulatorBRTDao() {
        try {
            this.c =  DriverManager.getConnection("jdbc:postgresql://ec2-54-87-112-29.compute-1.amazonaws.com:5432/d26fa8bmkceaih",
                            "rgxolvhkbhimzo", "178e0d48501c42f0c93cb6f388089f3d6066a28f2abd58e3263e9477d7760935");
            c.setAutoCommit(false);
        } catch (SQLException throwables) {
            System.out.println("No connection");
        }
    }

    public Station getStationById(String id){
        Station station = null;
        try {
            String sql = "SELECT * FROM ESTACION WHERE IDNOMBRE ='"+ id +"'";
            Statement stm = c.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String idName = rs.getString("idnombre");
                int maxCapacity = rs.getInt("capacidadmaxima");
                int peopleInside = rs.getInt("personasesperado");
                String zone = rs.getString("zona");
                station = new Station(idName, maxCapacity, peopleInside, zone);
            }
            return station;
        } catch (SQLException throwables) {
            System.out.println("Fallo sql");
            return null;
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
                long peopleInside = rs.getLong("personasesperado");
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
