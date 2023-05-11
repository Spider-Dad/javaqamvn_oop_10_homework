package ru.netology.javaqa.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void testConstructorWithoutParameter() {
        Assertions.assertEquals(10, radio.getNumStations());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void testConstructorWithParameter() {
        Radio customRadio = new Radio(20);
        Assertions.assertEquals(20, customRadio.getNumStations());
        Assertions.assertEquals(0, customRadio.getCurrentStation());
        Assertions.assertEquals(0, customRadio.getVolume());
    }

    @Test
    public void testGetNumStations() {
        Assertions.assertEquals(10, radio.getNumStations());
    }

    @Test
    public void testGetCurrentStation() {
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStation_ValidStation() {
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStation_InvalidStation() {
        radio.setCurrentStation(15);
        Assertions.assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(-5);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testGetVolume() {
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void testSetCurrentVolume_ValidVolume() {
        radio.setCurrentVolume(50);
        Assertions.assertEquals(50, radio.getVolume());
    }

    @Test
    public void testSetCurrentVolume_InvalidVolume() {
        radio.setCurrentVolume(120);
        Assertions.assertEquals(0, radio.getVolume());
        radio.setCurrentVolume(-10);
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void testSetStation_ValidStation() {
        radio.setStation(7);
        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void testSetStation_InvalidStation() {
        radio.setStation(15);
        Assertions.assertEquals(0, radio.getCurrentStation());
        radio.setStation(-5);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testNextStation() {
        radio.setStation(8);
        radio.nextStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation() {
        radio.setStation(1);
        radio.prevStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseVolume() {
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getVolume());
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getVolume());
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void testDecreaseVolume() {
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getVolume());
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        Assertions.assertEquals(49, radio.getVolume());
        radio.decreaseVolume();
        Assertions.assertEquals(48, radio.getVolume());
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getVolume());
    }
}