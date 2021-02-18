package javaforbeginners.LessonSuperExample;

public class Laptop extends Computer{
    private int batteryCapacity;

    public Laptop(String manufacturer, int productionYear, int batteryCapacity) {
        super(manufacturer, productionYear);
        this.batteryCapacity = batteryCapacity;
    }
}
