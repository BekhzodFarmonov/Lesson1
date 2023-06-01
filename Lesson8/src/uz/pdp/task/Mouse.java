package uz.pdp.task;

public class Mouse implements Cloneable{
    private String model;
    private boolean wired;

    public Mouse() {
    }

    public Mouse(String model, boolean wired) {
        this.model = model;
        this.wired = wired;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Mouse mouse = new Mouse();
        mouse.model = this.model;
        mouse.wired = this.wired;
        return mouse;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isWired() {
        return wired;
    }

    public void setWired(boolean wired) {
        this.wired = wired;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "model='" + model + '\'' +
                ", wired=" + wired +
                '}';
    }
}
