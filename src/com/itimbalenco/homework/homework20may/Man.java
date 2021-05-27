package com.itimbalenco.homework.homework20may;

import java.util.Objects;

public class Man {
    private String name;
    private int age;
    private float height;
    private float weight;

    public Man(String name, int age, float height, float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Man)) return false;
        Man man = (Man) o;
        return getAge() == man.getAge() && Float.compare(man.getHeight(), getHeight()) == 0 && Float.compare(man.getWeight(), getWeight()) == 0 && Objects.equals(getName(), man.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHeight(), getWeight());
    }
}
