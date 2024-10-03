import java.util.ArrayList;
import java.util.List;

import object.Computer;
import object.Desktop;
import object.Laptop;
import vehicle.Car;
import vehicle.Truck;
import vehicle.Vehicle;


public class App {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setCpu("5GHz 8 core");
        computer.setModel("Asus 8000");
        computer.setRam(32);
        computer.setYearMade(2024);


        computer.startup();
        computer.displayspec();
        computer.shutdown();

        Computer computer2 = new Computer();
        computer2.startup();
        computer2.displayspec();
        computer2.shutdown();

        Laptop laptop01 = new Laptop();
        laptop01.setCpu("10Ghz 128 Core");
        laptop01.setModel("Asus 10799");
        laptop01.setRam(64);
        laptop01.setYearMade(2024);
        laptop01.setOperatingSystem("Windows 11");
        laptop01.setWeight(3);
        laptop01.setBattery("11.1V 3W");
        laptop01.setScreenSize("15.4 inch OLED");
        laptop01.startup();
        laptop01.displayspec();
        laptop01.shutdown();
        
        Desktop desktop01 = new Desktop("4GHz 8 core", "Asus", 16, 2024, "Windows 11", "14 inch", true);
        desktop01.startup();
        desktop01.displayspec();
        desktop01.shutdown();

        List<Computer> machines = new ArrayList<>();
        machines.add(desktop01);
        machines.add(computer);
        machines.add(computer2);
        machines.add(laptop01);

        // for statement to display machines
        for (int i = 0; i < machines.size(); i++) {
            System.out.println("Machine " + i + " : ");
            machines.get(i).displayspec();
            
        }

    
    List<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(new Vehicle("1 Series", "BMW", 2013));
    vehicles.add(new Car("100", "Audi", 1994, "Sedan", 5));
    vehicles.add(new Truck("Chavdar M65", "Chavdar", 2000, 6000.0));

    for (Vehicle v : vehicles) {
        whatIsMyType(v);
    }

    // javac --source-path . vehicle/*.java ./*.java -d target
    // java -cp target App .

    // package (in target folder)
    // jar -c -v -f sdf02l.jar -e App

    // run package (in targer folder)
    // jar -jar target/sdf02l.jar

    // run package (in project root folder)
    // jar -jar target/sdf02l.jar

    }
    
    // slide 14
    public static void whatIsMyType(Object obj) {
        if (obj instanceof Car) {
            System.out.println("This is a car");
        } else if (obj instanceof Truck) {
            System.out.println("This is a truck");
        } else {
            System.out.println("This is a vehicle");
        }

    }


}
