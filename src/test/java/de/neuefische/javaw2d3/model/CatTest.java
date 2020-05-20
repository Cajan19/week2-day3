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


    @Test
    public void FourYearOldCatShouldReturnDestroyCouch() {
//        given
        Cat testcat = new Cat(4, "tiger", true);

//        when
        String result = testcat.ageCondition(testcat.getAge());

//        then
        assertEquals("I destroy your couch!", result);
    }

    @Test
    public void FiveYearOldCatShouldReturnPerfect() {
//        given
        Cat testcat = new Cat(5, "tiger", true);

//        when
        String result = testcat.ageCondition(testcat.getAge());

//        then
        assertEquals("I am perfect!", result);
    }

    @Test
    public void SixYearOldCatShouldReturnOldAndLazy() {
//        given
        Cat testcat = new Cat(6, "tiger", true);

//        when
        String result = testcat.ageCondition(testcat.getAge());

//        then
        assertEquals("I am old and lazy!", result);
    }
}