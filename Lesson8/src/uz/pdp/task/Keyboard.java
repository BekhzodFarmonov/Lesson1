package uz.pdp.task;

public class Keyboard implements Cloneable{
    private String model;
    private int numberOfKeys;
    private boolean wired;

    public Keyboard() {
    }

    public Keyboard(String model, int numberOfKeys, boolean wired) {
        this.model = model;
        this.numberOfKeys = numberOfKeys;
        this.wired = wired;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Keyboard keyboard = new Keyboard();
        keyboard.model = this.model;
        keyboard.numberOfKeys = this.numberOfKeys;
        keyboard.wired = this.wired;
        return keyboard;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public boolean isWired() {
        return wired;
    }

    public void setWired(boolean wired) {
        this.wired = wired;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "model='" + model + '\'' +
                ", numberOfKeys=" + numberOfKeys +
                ", wired=" + wired +
                '}';
    }
}
