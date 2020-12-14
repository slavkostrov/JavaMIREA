package com.practice_16.task_2;

public class Dish implements Item{
    private final double price;
    private final String name;
    private final String description;

    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
        this.price = 0;
    }

    public Dish(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
