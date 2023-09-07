package com.marco;

import com.marco.model.Kingdom;

public class Main {
    public static void main(String[] args) {
        KingdomFactory kingdomFactory = Kingdom.FactoryMaker.makeFactory(Kingdom.FactoryMaker.KingdomType.ELF);
        Kingdom kingdom = new Kingdom();
        kingdom.setArmy(kingdomFactory.createArmy());
        kingdom.setCastle(kingdomFactory.createCastle());
        kingdom.setKing(kingdomFactory.createKing());
        System.out.println(kingdom);
    }
}