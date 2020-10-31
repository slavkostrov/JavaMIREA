package com.practice_10.chairFactory;

public class Client {
    private Chair chair;
    private boolean sit;
    Client(){
        chair = null;
    }
    Client (Chair chair){
        this.chair = chair;
    }

    public void sit(){
        this.sit = true;
    }

    public void setChair (Chair chair){
        this.chair = chair;
    }
}
