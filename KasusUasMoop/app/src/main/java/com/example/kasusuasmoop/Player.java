package com.example.kasusuasmoop;

import java.util.Vector;

import Castle.Castle;
import army.Army;
import hero.Hero;

public class Player {
    protected Castle castle;
    private String name;

    public Castle getCastle() {
        return castle;
    }

    public void setCastle(Castle castle) {
        this.castle = castle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
