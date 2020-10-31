package com.practice_10.chairFactory;

public interface AbstractChairFactory {

    FunctionalChair createFunctionalChair();
    VictorianChair createVictorianChair();
    MagicChair createMagicChair();

}
