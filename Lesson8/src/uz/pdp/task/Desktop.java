package uz.pdp.task;

public class Desktop implements Cloneable{
    private Display display;
    private Keyboard keyboard;
    private CPU cpu;
    private Mouse mouse;

    public Desktop() {
    }

    public Desktop(Display display, Keyboard keyboard, CPU cpu, Mouse mouse) {
        this.display = display;
        this.keyboard = keyboard;
        this.cpu = cpu;
        this.mouse = mouse;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Desktop desktop = new Desktop();
        desktop.display = this.display;
        desktop.keyboard = this.keyboard;
        desktop.cpu = this.cpu;
        desktop.mouse = this.mouse;
        return desktop;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "display=" + display +
                ", keyboard=" + keyboard +
                ", cpu=" + cpu +
                ", mouse=" + mouse +
                '}';
    }
}
