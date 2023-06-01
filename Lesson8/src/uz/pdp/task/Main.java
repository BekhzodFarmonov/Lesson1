package uz.pdp.task;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Desktop desktop = new Desktop();
        Desktop desktopClone = (Desktop) desktop.clone();
        desktop.setMouse(new Mouse());
        System.out.println("desktop = " + desktop);
        System.out.println("desktopClone = " + desktopClone);
    }
}
