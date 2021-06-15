package entities.animal_entities;

import entities.plant_entities.Plant;

import java.util.Set;

public class Herbivore extends Animal {
    Set<Plant> plantDiet;

    public Herbivore(String name){
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length){
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return this.plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plantDiet){

    }

    public void printDiet(){

    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "name=" + getName() +
                '}';
    }
}
