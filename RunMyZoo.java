package com.krishna;

public class Zookeeper {
    public void addAnimal(Animal a){

    }
    public void addAnimal(Fishy f){

    }
}

class Animal {
    private static int idTagCurrent = 1000;
    private String animalType = " ";
    private double value =0.0;
    private int id;
    public Animal(String animalType, double value){
        this.animalType = animalType;
        this.value = value;
        this.id=idTagCurrent;
        idTagCurrent++;
    }
}

class Fishy extends Animal{
    public enum Environment {SALTWATER, FRESHWATER};
    private Environment waterType;
    public Fishy(String animalType, double value, Environment waterType)
    {
        super(animalType, value);
        this.waterType = waterType;
    }
}

public class RunMyZoo
{
    public static void main(String[] args)
    {
        System.out.println("Managing the Zoo with Zookeeper class");
        Zookeeper theZoo = new Zookeeper();
        Animal tiger = new Animal("tiger", 1500.00);
        theZoo.addAnimal(tiger);
        theZoo.addAnimal(new Fishy("shark", 2000.00, Fishy.Environment.SALTWATER));
        theZoo.addAnimal(new Animal("earthworm", 0.25));
        theZoo.addAnimal(new Fishy("guppy", 0.10, Fishy.Environment.FRESHWATER));
//        System.out.println("The animals in the zoo include");
//        System.out.println(theZoo.getAnimalInventory());
//        System.out.println("The most valuable animal in the zoo is " +
//                theZoo.findMostValuable().getAnimalType());
    }
}
