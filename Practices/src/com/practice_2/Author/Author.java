package com.practice_2.Author;

public class Author {
    private String name;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString(){
        return "Name: " + this.name + "\nEmail: " + this.email + "\nGender: " + this.gender;
    }
}
