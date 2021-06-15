package entities.animal_entities;

import entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal {
    private Set<Plant> plantDiet;
    private double maxFoodSize;

    public Omnivore(String name){
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length){
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        plantDiet = new HashSet<>();
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        plantDiet = new HashSet<>();
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantToDiet(Plant plant){
        plantDiet = new HashSet<>();
        this.plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "Omnivore{" +
                "plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize + ", " + getName() + ", " + getWeight() + ", " + getHeight() + ", "  + getLength() +
                '}';
    }
}
