package ru.netology.radio;

public class Radio {
    int currentStation;
    int currentVolumeLvl;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolumeLvl() {
        return currentVolumeLvl;
    }

    public int pressNext() {
        if (currentStation == 9) {
            currentStation = 0;
        }
        else {
            currentStation ++;
        }
        return currentStation;
    }

    public int pressPrev() {
        if (currentStation == 0) {
            currentStation = 9;
        }
        else {
            currentStation --;
        }
        return currentStation;
    }

    public int setCurrentStation(int newCurrentStation) {
        if ((newCurrentStation > 9) | (newCurrentStation < 0)) {
            return currentStation;
        }
        return currentStation = newCurrentStation;
    }

}
