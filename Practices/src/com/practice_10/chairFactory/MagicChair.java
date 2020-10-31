package com.practice_10.chairFactory;

import javax.swing.*;

public class MagicChair implements Chair{
    private String magic_string;
    MagicChair(){
        this.magic_string = "magic magic magic";
    }

    public void doMagic(){
        System.out.println(this.magic_string);
    }

    public void setMagicString(String magic_string){
        this.magic_string = magic_string;
    }

    @Override
    public int getPrice() {
        return 777;
    }
}
