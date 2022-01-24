package ru.netology.domine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

//    @Test
//    public void shouldBeLastNumberOfCurrentRadioStation() {
//        Radio radio = new Radio();
//        radio.setCurrentRadioStation(9);
//        radio.next();
//        assertEquals(0, radio.getCurrentRadioStation());
//    }
//
//    @Test
//    public void shouldBeNextNumberOfCurrentRadioStation() {
//        Radio radio = new Radio();
//        radio.setCurrentRadioStation(5);
//        radio.next();
//        assertEquals(6, radio.getCurrentRadioStation());
//    }
//
//    @Test
//    public void shouldBeNextNumberOverRadioStation() {
//        Radio radio = new Radio();
//        radio.setCurrentRadioStation(11);
//        radio.next();
//        assertEquals(1, radio.getCurrentRadioStation());
//    }
//
//    @Test
//    public void shouldBeNextNullRadioStation() {
//        Radio radio = new Radio();
//        radio.setCurrentRadioStation(0);
//        radio.next();
//        assertEquals(1, radio.getCurrentRadioStation());
//    }

    @Test
    public void shouldBeNullOnCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prev();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldBePrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.prev();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldBeUnderMinRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-4);
        radio.prev();
        assertEquals(-1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldBeOverMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        radio.prev();
        assertEquals(-1, radio.getCurrentRadioStation());
    }

//    @Test
//    public void shouldBeIncreaseCurrentVolume() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(5);
//        radio.increaseValue();
//        assertEquals(6, radio.getCurrentVolume());
//    }
//
//    @Test
//    public void shouldBeDecreaseCurrentVolume() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(3);
//        radio.decreaseValue();
//        assertEquals(2, radio.getCurrentVolume());
//    }
//
//    @Test
//    public void shouldBeMaxValueOfVolume() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(10);
//        radio.increaseValue();
//        assertEquals(10, radio.getCurrentVolume());
//    }
//
//    @Test
//    public void shouldBeMinValueOfVolume() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(0);
//        radio.decreaseValue();
//        assertEquals(0, radio.getCurrentVolume());
//    }
//
//    @Test
//    public void shouldBeIncreaseMoreMaxValueOfVolume() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(15);
//        radio.increaseValue();
//        assertEquals(15, radio.getCurrentVolume());
//    }
//
//    @Test
//    public void shouldBeDecreaseOverMinValueOfVolume() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(-2);
//        radio.decreaseValue();
//        assertEquals(-2, radio.getCurrentVolume());
//    }
}