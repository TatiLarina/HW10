package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolumeLvl;
    private int numberStations = 10;
    private int maxStation = numberStations - 1;
    private int minStation = 0;
    private int maxVolumeLvl = 100;
    private int minVolumeLvl = 0;

    public Radio(int numberStations) {
        this.numberStations = numberStations;
        this.maxStation = numberStations - 1;
    }

    public Radio() {
    }


    //Переключение станций//
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if ((newCurrentStation > maxStation) | (newCurrentStation < minStation)) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getNumberStations() {
        return numberStations;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxVolumeLvl() {
        return maxVolumeLvl;
    }

    public int getMinVolumeLvl() {
        return minVolumeLvl;
    }

    public void pressNext() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void pressPrev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }


    //Переключение звука//

    public int getCurrentVolumeLvl() {
        return currentVolumeLvl;
    }

    public void setCurrentVolumeLvl(int newCurrentVolumeLvl) {
        if ((newCurrentVolumeLvl > maxVolumeLvl) | (newCurrentVolumeLvl < minVolumeLvl)) {
            return;
        }
        currentVolumeLvl = newCurrentVolumeLvl;
    }

    public void increaseVolume() {
        if (currentVolumeLvl < maxVolumeLvl) {
            currentVolumeLvl++;
        }
    }

    public void decreaseVolume() {
        if (currentVolumeLvl > minVolumeLvl) {
            currentVolumeLvl--;
        }
    }

}
