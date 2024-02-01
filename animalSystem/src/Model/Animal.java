package Model;

public abstract class Animal {
    String name;
    String dateOfBirth;
    double weight;
    String breed;

    private static int totalAnimals = 0;

    abstract void sleep();

    abstract void eat();

    abstract void voice();

    abstract String getName();

    public Animal() {
        totalAnimals++;
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }
}
