package com.example.assignment1;

public class Phone {

    private String mob;

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return String.format("Phone [mob = %s]", mob);
    }
}
