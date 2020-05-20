package de.neuefische.javaw2d3.model;

import javax.swing.*;
import java.util.Objects;

public class Cat {

    private int age;
    private String race;
    private boolean tame;

    //    constructor
    public Cat(int age, String race, boolean tame) {
        this.age = age;
        this.race = race;
        this.tame = tame;

//  getter & setter
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getrace() {
        return race;
    }

    public void setrace(String race) {
        this.race = race;
    }

    public boolean isTame() {
        return tame;
    }

    public void setTame(boolean tame) {
        this.tame = tame;
    }

    // to String methode
    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", race='" + race + '\'' +
                ", tame=" + tame +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                tame == cat.tame &&
                Objects.equals(race, cat.race);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, race, tame);
    }

//    neue Methode for-loop

    public void jump(int numberOfJumps) {
        for (int i = 0; i < numberOfJumps; i++) {
            System.out.println("I jump " + (i + 1) + "times!");

        }
        System.out.println("The end");

    }

//    neue Methode while-loop (Achtung... Gefahr auf unendlich-Schleifen!!!!)

    public void bite() {
        while (!tame) {
            System.out.println("I bite!");
        }
        System.out.println("Sorry");
    }


//    neue Methode if/else

    public String ageCondition(int age) {
        if (age <= 4) {
            return "I destroy your couch!";
        } else if (age == 5) {
            return "I am perfect!";
        } else {
            return "I am old and lazy!";
        }
    }
}



