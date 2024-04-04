package org.example;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void getFullNameShouldReturnFirstNameAndLastName() {
        Person person = new Person("Amraoui","Omar chihab",18);
        assertEquals(person.getFullName(),"Amraoui Omar chihab");
    }

    @org.junit.jupiter.api.Test
    void isAdultShouldReturnTrueIfAgeIsGreaterThanOrEqual18FalseIfAgeIsLessThan18() {
        Person person = new Person("Amraoui","Omar chihab",18);
        assertEquals(person.isAdult(),true);

    }
}