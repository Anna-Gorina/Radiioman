package ru.netology.domine;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Radio {

    private int currentRadioStation;
    private int currentVolume;
    private int amountRadioStation = 10;


    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }

    public void next() {
        if (currentRadioStation < amountRadioStation - 1) {
            currentRadioStation = currentRadioStation + 1;
        } else currentRadioStation = 0;


    }


    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else currentRadioStation = amountRadioStation - 1;


    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    }


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < amountRadioStation && currentRadioStation > 0) {
            this.currentRadioStation = currentRadioStation;
        }

    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 100 && currentVolume > 0) {
            this.currentVolume = currentVolume;
        }
    }
}
