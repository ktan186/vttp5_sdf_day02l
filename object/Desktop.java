package object;

public class Desktop extends Computer {

    private String operatingSystem;
    private String screenSize;
    private boolean waterCooling;


    public Desktop(String cpu, String model, Integer ram, Integer yearMade) {
        super(cpu, model, ram, yearMade);
    }

    public Desktop(String cpu, String model, Integer ram, Integer yearMade, String operatingSystem, String screenSize,
            boolean waterCooling) {
        super(cpu, model, ram, yearMade);
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
        this.waterCooling = waterCooling;
    }


    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public String getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    public boolean getWaterCooling() {
        return waterCooling;
    }
    public void setWaterCooling(boolean waterCooling) {
        this.waterCooling = waterCooling;
    }

    @Override
    public void displayspec() {
        System.out.println("This desktop specifications:");
        System.out.println(this.getModel());
        System.out.println(this.getCpu());
        System.out.println(this.getRam());
        System.out.println(this.getYearMade());
        System.out.println(this.getOperatingSystem());
        System.out.println(this.getScreenSize());
        System.out.println(this.getWaterCooling());
    }


}
