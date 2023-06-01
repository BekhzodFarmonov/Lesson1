package uz.pdp.task;

public class Display implements Cloneable{
    private String model;
    private double length;
    private double width;
    private int color;
    public Display() {
    }

    public Display(String model, double length, double width, int color) {
        this.model = model;
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Display display = new Display();
        display.model = this.model;
        display.length = this.length;
        display.width = this.width;
        display.color = this.color;
        return display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Display{" +
                "model='" + model + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", color=" + color +
                '}';
    }
}
