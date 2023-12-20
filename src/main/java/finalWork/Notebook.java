package finalWork;

public class Notebook {
    private String model;
    private int ram;
    private int hdd;
    private String cpu;
    private int cpuRating;
    private String os;
    private String color;

    public Notebook(String model, int ram, int hdd, String cpu, int cpuRating, String os, String color){
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.cpuRating = cpuRating;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return model + " CPU: "+cpu+" "+cpuRating+" Mhz, RAM:"+ram+" GB, HDD: "+hdd+" GB, OS:"+os+", color:"+color;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public int getCpuRating() {
        return cpuRating;
    }
}
