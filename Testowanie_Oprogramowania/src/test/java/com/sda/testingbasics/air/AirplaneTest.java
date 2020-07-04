package com.sda.testingbasics.air;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirplaneTest {
    Airplane airplane = new Airplane();
    @BeforeEach
    void setUp() {
        airplane = new Airplane();
    }

    @Test
    void thatInitialyAirPlaneHasHightZero(){
        airplane = new Airplane();
        assertEquals(0, airplane.getHeight());

    }
    @Test
    void asentHappyPath(){
        airplane = new Airplane();
        assertEquals(10, airplane.getHeight());
        airplane.ascent(11);
        assertEquals(23, airplane.getHeight());


    }
    @Test
    void negativeDelta(){
        airplane =new Airplane();
        airplane.ascent(10);
        airplane.ascent(-3);
        assertEquals(10, airplane.getHeight());
    }
    @Test
    void NEgativeDeltaIsOmittedWhenDescent(){
        airplane.descent(10);
        airplane.descent(-30);
        assertEquals(0, airplane.getHeight());
    }
}