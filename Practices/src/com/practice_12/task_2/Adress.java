package com.practice_12.task_2;

import java.util.StringTokenizer;

public class Adress {
    //Страна[d] Регион[d] Город[d]
    //Улица[d] Дом[d] Корпус[d] Квартира;
    private String country, region, city, street, house, corpus, flat;

    Adress(String input, String separator){
        String[] split = input.split(separator);
        assert split.length == 7;
        this.country = split[0].trim();
        this.region = split[1].trim();
        this.city = split[2].trim();
        this.street = split[3].trim();
        this.house = split[4].trim();
        this.corpus = split[5].trim();
        this.flat = split[6].trim();
    }

    Adress(String input, String separators, boolean any){
        StringTokenizer tokenizer = new StringTokenizer(input, separators);
        assert tokenizer.countTokens() == 7;

        this.country = tokenizer.nextToken().trim();
        this.region = tokenizer.nextToken().trim();
        this.city = tokenizer.nextToken().trim();
        this.street = tokenizer.nextToken().trim();
        this.house = tokenizer.nextToken().trim();
        this.corpus = tokenizer.nextToken().trim();
        this.flat = tokenizer.nextToken().trim();

    }

    @Override
    public String toString() {
        return "Country: " + this.country
                +"\nRegion: " + this.region
                +"\nCity: " + this.city
                +"\nStreet: " + this.street
                +"\nHouse: " + this.house
                +"\nCorpus: " + this.corpus
                +"\nFlat: " + this.flat;
    }
}
