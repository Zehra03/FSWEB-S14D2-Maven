package org.example.model;

public class Wardrope {
    private int width;
    private int height;
    private double weight;
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public Wardrope(int width, int height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
     public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }
}
