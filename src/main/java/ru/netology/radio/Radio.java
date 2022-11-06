package ru.netology.radio;

public class Radio {
    int currentStation;
    int currentVolumeLvl;

    //Переключение станций//
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if ((newCurrentStation > 9) | (newCurrentStation < 0)) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void pressNext() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void pressPrev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }


    //Переключение звука//

    public int getCurrentVolumeLvl() {
        return currentVolumeLvl;
    }

    public void increaseVolume() {
        if (currentVolumeLvl < 10) {
            currentVolumeLvl++;
        }
    }

    public void decreaseVolume() {
        if (currentVolumeLvl > 0) {
            currentVolumeLvl--;
        }
    }

}
