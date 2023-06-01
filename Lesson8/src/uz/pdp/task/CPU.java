package uz.pdp.task;

public class CPU implements Cloneable{
    private String model;
    private double ghz;
    private int core;

    public CPU() {
    }

    public CPU(String model, double ghz, int core) {
        this.model = model;
        this.ghz = ghz;
        this.core = core;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        CPU cpu = new CPU();
        cpu.model = this.model;
        cpu.ghz = this.ghz;
        cpu.core = this.core;
        return cpu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getGhz() {
        return ghz;
    }

    public void setGhz(double ghz) {
        this.ghz = ghz;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }
}
