package entities.forestbook_app;

import entities.animal_entities.Animal;
import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.*;
import entities.service.ForestNotebook;
import java.util.List;

public class ForestBookApp {
    public static void main(String[] args) {
        ForestNotebook forestNotebook = new ForestNotebook();
        Bush bush = new Bush("Apple", 3.23);
        forestNotebook.addPlant(bush);
        Weed weed = new Weed("DereOtu",1.21);
        forestNotebook.addPlant(weed);
        Flower flower = new Flower("Gul", 2.34);
        forestNotebook.addPlant(flower);
        Tree tree1 = new Tree("Cam", 1.43);
        forestNotebook.addPlant(tree1);
        Tree tree2 = new Tree("Mese", 3.55);
        forestNotebook.addPlant(tree2);

        Carnivore carnivore1 = new Carnivore("Kopek");
        forestNotebook.addAnimal(carnivore1);
        Carnivore carnivore2 = new Carnivore("Aslan");
        forestNotebook.addAnimal(carnivore2);
        Carnivore carnivore3 = new Carnivore("Kedi");
        forestNotebook.addAnimal(carnivore3);
        Omnivore omnivore1 = new Omnivore("Inek");
        forestNotebook.addAnimal(omnivore1);
        Omnivore omnivore2 = new Omnivore("Keci");
        forestNotebook.addAnimal(omnivore2);
        Omnivore omnivore3 = new Omnivore("Koc");
        forestNotebook.addAnimal(omnivore3);
        Herbivore herbivore1 = new Herbivore("Ayi");
        forestNotebook.addAnimal(herbivore1);
        Herbivore herbivore2 = new Herbivore("Penguen");
        forestNotebook.addAnimal(herbivore2);
        Herbivore herbivore3 = new Herbivore("Tavuk");
        forestNotebook.addAnimal(herbivore3);

        // added to List<Plant>
        forestNotebook.setCarnivores(List.of(carnivore1, carnivore2, carnivore3));
        forestNotebook.setOmnivores(List.of(omnivore1, omnivore2, omnivore3));
        forestNotebook.setHerbivores(List.of(herbivore1, herbivore2, herbivore3));

        herbivore1.addPlantToDiet(bush);
        herbivore2.addPlantToDiet(weed);
        herbivore3.addPlantToDiet(flower);
        omnivore1.addPlantToDiet(tree1);
        omnivore2.addPlantToDiet(tree2);
        omnivore3.addPlantToDiet(tree2);

//        List<Animal> animals = List.of(carnivore1,carnivore2,carnivore3,omnivore1,omnivore2,omnivore3,herbivore1,herbivore2,herbivore3);
//        List<Plant> plants = List.of(bush,weed,flower,tree1,tree2);


        System.out.println("====== Print list size ======");
        System.out.println(forestNotebook.getAnimalCount());
        System.out.println(forestNotebook.getPlantCount());

        System.out.println("====== Print unsorted list ======");
        forestNotebook.printNotebook();

        System.out.println("====== Print sorted list ======");
        forestNotebook.sortAnimalsByName();
        forestNotebook.sortPlantsByName();
        forestNotebook.printNotebook();

        System.out.println("====== Print list of Carnivores, Omnivores and Herbivores ======");
        System.out.println(forestNotebook.getCarnivores());
        System.out.println(forestNotebook.getOmnivores());
        System.out.println(forestNotebook.getHerbivores());

        System.out.println("====== Print list according to height ======");

    }
}
