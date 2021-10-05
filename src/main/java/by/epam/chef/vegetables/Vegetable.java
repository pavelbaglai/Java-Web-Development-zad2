package by.epam.chef.vegetables;

public abstract class Vegetable {
    private String name;
    private double weight;
    private int calories;

    public Vegetable(String name, double weight, int calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", calories=" + calories +
                '}';
    }
}
