package com.practice_16.task_4;

import com.practice_16.task_2.Item;

public interface Order {
        boolean add(Item item);
        boolean remove(String itemName);
        int removeAll(String itemName);
        Item[] getItems();
        double costTotal();
        String[] itemNames();
        Item[] sortedItemsByCostDesc();
        int itemQuantity();
        int itemQuantity(String itemName);
}
