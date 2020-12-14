package com.practice_16.task_5;

import com.practice_16.task_2.Order;

public class OrdersManager {
        Order[] orders;
        private int size;
        private int current;
        public OrdersManager(int size){
            this.orders = new Order[size];
            this.size = size;
            this.current = 0;
        }
        Order[] getOrders(){
            return this.orders;
        };
        double ordersCostSummary(){
            double sum = 0;
            for (int i = 0; i < this.current; i++)
                sum += orders[i].costTotal();
            return sum;
        };
}
