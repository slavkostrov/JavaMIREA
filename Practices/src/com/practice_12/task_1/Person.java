package com.practice_12.task_1;

public class Person {
    private String surname;
    private String name;
    private String mid_name;


    Person(String input){
        String[] splited = input.split(" ");

        this.surname = splited[0];
        try {
            this.name = splited[1];
        }
        catch (Exception ex){
            this.name = null;
        }

        try {
            this.mid_name = splited[2];
        }
        catch (Exception ex){
            this.mid_name = null;
        }
    }

    public String getFullName(){
        if (this.name != null && this.mid_name != null) {
            return new
                    StringBuilder().append(this.surname).append(" ").append(this.name.charAt(0)).append(". ").append(this.mid_name.charAt(0)).append(".").toString();
        }
        else
            return this.surname;
    }

}
