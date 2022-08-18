package ingredient;

import java.util.UUID;

public class Ingredient {
    private String id;
    private String name;
    private int weight;
    private float price;

    public Ingredient(String id, String name, int weight, float price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}