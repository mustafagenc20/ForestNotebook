package entities.plant_entities;

public class Weed extends Plant {
    private double area;

    public Weed(String name){
        super(name);
    }
    public Weed(String name, double area){
        super(name, area);
    }
    public double getArea(){
        return this.area;
    }
    public void setArea(double area){
        this.area = area;
    }
    @Override
    public String toString() {
        return "Weed{" +
                "name='" + getName() + '\'' +
                '}';
    }

}
