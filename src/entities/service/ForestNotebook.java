package entities.service;

import entities.animal_entities.Animal;
import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.Plant;


import java.util.*;
import java.util.stream.Collectors;


public class ForestNotebook {
    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount=0;
    private int animalCount=0;
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    public ForestNotebook(){


    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        plantCount=plants.size();
        return plantCount;
    }

    public int getAnimalCount() {
        animalCount= animals.size();
        return animalCount;
    }

    public void addAnimal(Animal animal){
        this.animals.add(animal);

    }

    public void addPlant(Plant plant){
        this.plants.add(plant);

    }

    public void printNotebook(){
        animals.forEach(System.out::println);
        plants.forEach(System.out::println);

    }

    public void sortAnimalsByName(){
        //animals.stream().sorted(Comparator.comparing(Animal :: getName)).collect(Collectors.toList());
        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                String oName1= o1.getName();
                String oName2= o2.getName();
                return oName1.compareTo(oName2);
            }
        });
    }

    public void sortPlantsByName(){
       // plants.stream().sorted(Comparator.comparing(Plant :: getName)).collect(Collectors.toList());
        Collections.sort(plants, new Comparator<Plant>() {
            @Override
            public int compare(Plant o1, Plant o2) {
                String oName1= o1.getName();
                String oName2= o2.getName();

                return o1.getName().compareTo(o2.getName());
            }
        });
    }

}
