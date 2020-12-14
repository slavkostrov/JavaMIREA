package com.practice_16.task_4;

import com.practice_16.task_2.Dish;
import com.practice_16.task_2.Item;

public class RestaurantOrder implements Order{
    private int size;
    private Item[] dishes;
    private int current;

    public RestaurantOrder(int size){
        this.size=size;
        this.dishes = new Dish[size];
        this.current = 0;
    }

    public boolean add(Item item){
        if (this.current < this.size){
            dishes[this.current] = item;
            this.current += 1;
            return true;
        }
        return false;
    }
    public boolean remove(String itemName){
        boolean flag = false;
        for (int i = 0; i < this.current; i++){
            if (dishes[i].getName() == itemName){
                flag = true;
                this.current -= 1;
            }
            if (flag) {
                Item temp = dishes[i];
                dishes[i] = dishes[i + 1];
                dishes[i + 1] = temp;
            }
        }
        return true;
    };
    public double costTotal(){
        double total = 0;
        for (int i = 0; i < this.current; i++)
            total += dishes[i].getPrice();
        return total;
    };

    public String[] itemNames(){
        String[] names = new String[this.current + 1];
        for (int i = 0; i < this.current; i++)
            names[i] = dishes[i].getName();
        return names;
    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        return new Item[0];
    }

    @Override
    public int itemQuantity() {
        return 0;
    }

    @Override
    public int itemQuantity(String itemName) {
        return 0;
    };

    public Item[] getItems(){
        Item[] items = new Item[this.current + 1];
        for (int i = 0; i < this.current; i++)
            items[i] = dishes[i];
        return items;
    };
    public int removeAll(String itemName){
        for (int j = 0; j < this.current; j++){
        boolean flag = false;
        for (int i = 0; i < this.current; i++){
            if (dishes[i].getName() == itemName){
                flag = true;
                this.current -= 1;
            }
            if (flag) {
                Item temp = dishes[i];
                dishes[i] = dishes[i + 1];
                dishes[i + 1] = temp;
            }
        }
        }
        return 0;
    };
}
