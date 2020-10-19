package com.practice_8;

import java.util.ArrayList;
import java.util.Collection;

public class WaitListTest {
    public static void main(String[] args) {
        System.out.println("Creating wait list: 41, 42, 53, 412");
        WaitList<Integer> t = new WaitList<Integer>();
        t.add(41);
        t.add(42);
        t.add(53);
        t.add(412);
        System.out.println("Contains 41: " + t.contains(41));
        ArrayList<Integer> c = new ArrayList<>();
        c.add(41);
        c.add(42);
        c.add(5);
        c.add(412);
        System.out.println("Contains all (41, 42, 5, 412): " + t.containsAll(c));
        System.out.println("\nCreating wait list from collection");
        WaitList<Integer> t_2 = new WaitList<Integer>(c);
        System.out.println("Contains this collection: " + t_2.containsAll(c));
        System.out.println("\nCreating bounded wait list with capacity = 1\nAdding 3 elements");
        BoundedWaitList<Integer> t_3 = new BoundedWaitList<>(1);
        t_3.add(13);
        t_3.add(134);
        t_3.add(14);
        System.out.println(t_3);
        System.out.println("Get capacity method: " + t_3.getCapacity());
        UnfairWaitList<Integer> t_4 = new UnfairWaitList<>();
        System.out.println("\nCreating empty unfair wait list");
        t_4.add(1);
        t_4.add(2);
        t_4.add(3);
        System.out.println("Elements:");
        t_4.print_elements();
        System.out.println("Move to back method");
        t_4.moveToBack(3);
        System.out.println("Elements:");
        t_4.print_elements();
        System.out.println("Delete and add 1");
        t_4.remove(1);
        t_4.add(1);
        System.out.println("Elements:");
        t_4.print_elements();
        System.out.println("Not added");
    }
}
