package com.practice_1.Book;

public class Book {
    private int n_page;
    private String title;
    private String genre;

    public int getN_page() {
        return n_page;
    }

    public void setN_page(int n_page) {
        this.n_page = n_page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book(String title, String genre, int page){
        this.title = title;
        this.genre = genre;
        this.n_page = page;
    }
    public Book(String title, int page){
        this.title = title;
        this.genre = "Unknown";
        this.n_page = page;
    }

    @Override
    public String toString(){
        return this.title+", Genre "+this.genre + " , Pages: " + this.n_page;
    }
}
