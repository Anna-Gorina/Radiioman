package ru.netology.domine;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public void next() {
        currentRadioStation++;
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
    }

//    public void prev() {
//        currentRadioStation--;
//        if (currentRadioStation < 0) {
//            currentRadioStation = 9;
//
//        }
//
//    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else currentRadioStation = 9; {

        }

    }


    public void increaseValue() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseValue() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation <= 9 && currentRadioStation >0) {
            this.currentRadioStation = currentRadioStation;
        }

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 10 && currentVolume > 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
