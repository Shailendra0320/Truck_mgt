package org.example;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;


public class App
{

//    public static String Load_Driver="com.mysql.cj.jdbc.Driver";
//    public static String URL="jdbc:mysql://localhost:3306/truckmgt";
//    public static String PASSWORD="989@shailuvish";
//    public static String USERNAME="root";


    public static void main( String[] args )
    {
        TruckService truckService=new TruckService();

Truck tata=new Truck("TATA", "2019",1000,"rajesh" );
Truck volvo=new Truck("VOLVO","2019",1000,"Manku");
Truck Eicher =new Truck("EICHER","2019",1000,"Akash");

        System.out.println("adding data .....");
truckService.addTruck(tata);
truckService.addTruck(volvo);
truckService.addTruck(Eicher);

        System.out.println("Fetching data by id :......"+1);
Truck truck=truckService.getTruckById(1);
        System.out.println("truck data : "+ truck);

        System.out.println("Update Data ......");
        truck.setDriverName("Ramesh");
        truckService.updateTruck(truck);
        System.out.println("Updated truck data : "+truckService.getTruckById(1));

        System.out.println("fetching all data ......");
        List<Truck> allTrucks = truckService.getAllTrucks();
        System.out.println("All truck in DB : ");
        for(Truck truck1 :allTrucks){
            System.out.println(truck1);
        }
        System.out.println("Deleting data by id...."+2);
        truckService.deleteTruck(2);
        System.out.println("data deleted by id : "+2);
        System.out.println("get all data ....");
        allTrucks =truckService.getAllTrucks();
        System.out.println("all trucks after all operation :");
        System.out.println(allTrucks);


    }
}
