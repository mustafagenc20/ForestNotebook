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
    private int plantCount;
    private int animalCount;
    private List<Animal> animals;
    private List<Plant> plants;

    public ForestNotebook(){
        plants = new ArrayList<>();
        animals = new ArrayList<>();
        omnivores = new ArrayList<>();
        carnivores = new ArrayList<>();
        herbivores = new ArrayList<>();
    }

    public List<Carnivore> getCarnivores() {
        return carnivores.stream().distinct().collect(Collectors.toList());
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores.stream().distinct().collect(Collectors.toList());
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores.stream().distinct().collect(Collectors.toList());
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
        // check for duplicates
        this.animals.forEach(a -> {
            if(a.getName().equals(animal.getName())) {
                return;
            }
        });

        // if no duplicates, add to main animals list
        this.animals.add(animal);

        // determine what kind of animal it is and add to the proper list
        if (animal instanceof Carnivore) {
            this.carnivores.add(((Carnivore) animal));
        }
        else if (animal instanceof Herbivore) {
            this.herbivores.add(((Herbivore) animal));
        }
        else if (animal instanceof Omnivore) {
            this.omnivores.add(((Omnivore) animal));
        }

    };

    public void addPlant(Plant plant){
        // check for duplicates
        this.animals.forEach(a -> {
            if(a.getName().equals(plant.getName())) {
                return;
            }
        });

        // if no duplicates, add to main animals list
        this.plants.add(plant);

    }

    public void printNotebook(){
        animals.forEach(System.out::println);
        plants.forEach(System.out::println);

        /*
        System.out.println("=========== 2. solution =======");

        this.animals.forEach(animal -> {
            System.out.println(animal.toString());
        });
            this.plants.forEach(plant -> {
                System.out.println(plant.toString());
        });
        */

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
