package com.example.assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public String phonesToString() {
        ArrayList<String> phones = new ArrayList<>();
        for (Phone p : ph) {
            phones.add(p.toString());
        }
        return String.join(", ", phones);

    }

    @Override
    public String toString() {
        return String.format("Student [id = %s, name = %s, phones = {%s}, address = %s]", id, name, phonesToString(), add.toString());
    }

}
