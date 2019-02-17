package com.company;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class BD {
    public final String url = "jdbc:postgresql://localhost:5432/postgres";
    public final String user = "postgres";
    public final String password = "Babushka85";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Successfully connected to the Database");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public boolean insertCarInfo(CarInfo carInfo) {
        String SQL = "insert into car_info (id,year_of_issue, model,price,color ) values (?,?,?,?,?);";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)
        ) {
            stmt.setInt(1, carInfo.id);
            stmt.setInt(2, carInfo.year_of_issue);
            stmt.setString(3, carInfo.model);
            stmt.setInt(4, carInfo.price);
            stmt.setString(5, carInfo.color);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public boolean insertCar(Car car) {
        String SQL = "insert into car (id, num) values (?,?);";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)
        ) {
            stmt.setInt(1, car.id);
            stmt.setInt(2, car.num);
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;

    }

//    public HashMap<Car, String> addCars() {
//        HashMap<Car, String> car = new HashMap<>();
//        String SQL = "select id,info from car";
//        int count = 0;
//        try (Connection conn = connect();
//             PreparedStatement stmt = conn.prepareStatement(SQL)
//        ) {
//            stmt.setInt(1, id);
//            ResultSet rs = stmt.executeQuery();
//
//
//            while (rs.hasNext()) {
//                rs.next();
//
//            car.put("id",rs.getString(1,car.)
//
//
//
//            }
//            catch()
//        }
 //   }
//

    public HashMap<Car,CarInfo> getAll() {
        HashMap<Car,CarInfo> carsHash=new HashMap<>();

        String SQL = "select c.*, c.id, i.id, i.year_of_issue, i.model, i.price, i.color\n" +
                "from \n" +
                "car c join car_info i on c.id= i.id;";
        try (Connection conn = connect()) {
            PreparedStatement stmt = conn.prepareStatement(SQL);
            ResultSet rs = stmt.executeQuery();
            Car cars = null;
            CarInfo carInfo = null;
            while(rs.next()){
                cars = new Car(rs.getInt("id"),
                        rs.getInt("num"));


                 carInfo  =new CarInfo(rs.getInt("id"),
                        rs.getInt("year_of_issue"),
                        rs.getString("model"),
                        rs.getInt("price"),
                        rs.getString("color"));
                carsHash.put(cars,carInfo);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
        return carsHash;
    }
}
