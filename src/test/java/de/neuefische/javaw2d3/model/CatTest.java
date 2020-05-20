package de.neuefische.javaw2d3.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    @Test
    public void compareTwoCatObjectsShouldReturnTrue(){

//        given
        Cat horst = new Cat(5, "tiger", false);
        Cat killer = new Cat(5, "tiger", false);

//        WHEN
        boolean result = horst.equals(killer);

//        then
        assertEquals(horst, killer);
    }

}