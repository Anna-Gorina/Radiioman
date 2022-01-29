package ru.netology.domine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldBeLastNumberOfCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldBeNextNumberOfCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.next();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldBeNextNumberOverRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        radio.next();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldBeNextNumberUnderRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.next();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldBeNullOnRadioStation() {
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
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldBeOverMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        radio.prev();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldBeIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(45);
        radio.increaseVolume();
        assertEquals(46, radio.getCurrentVolume());
    }

    @Test
    public void shouldBeDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(33);
        radio.decreaseVolume();
        assertEquals(32, radio.getCurrentVolume());
    }

    @Test
    public void shouldBeMaxValueOfVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldBeMinValueOfVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldBeIncreaseMoreMaxValueOfVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(105);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldBeDecreaseOverMinValueOfVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-2);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void nextRadioStationWithoutParameters() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void nextRadioStationWithParameters() {
        Radio radio = new Radio(6);
        radio.setCurrentRadioStation(5);
        radio.next();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationWithoutParameters() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prev();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void amountPrev1RadioStationWithParameters() {
        Radio radio = new Radio(4);
        radio.setCurrentRadioStation(0);
        radio.prev();
        assertEquals(3, radio.getCurrentRadioStation());
    }
}