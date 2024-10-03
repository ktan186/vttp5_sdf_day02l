package object;

public class Computer{
    private String cpu;
    private String memory;
    private Integer ram;

    public Computer() {

    }

    public Computer(String cpu, String memory, String ram) {
        this.cpu = cpu;
        this.memory = memory;
        this.ram = ram;
    }

    public String getcpu() {
        return cpu;
    }

    public void setcpu(String cpu) {
        this.cpu = cpu;
    }

    public String getmemory() {
        return memory;
    }

    public void setmemory(String memory) {
        this.memory = memory;
    }

    public Integer getram() {
        return ram;
    }

    public void setram(Integer ram) {
        this.ram = ram;
    }


    public void start() {
        System.out.println("Computer powered up");
    }

    public void shutdown() {
        System.out.println("Shutting down Computer");
    }

    public void displayspec() {
        System.out.println("This computer specifications:");
        System.out.println(this.cpu);
        System.out.println(this.memory);
        System.out.println(this.ram);
    }

}