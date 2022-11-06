package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    //Тесты переключения станций//
    @Test
    public void shouldGetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pressNext0_8() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        int expected = 0;
        int actual;
        for (int i = 1; i < 9; i++) {
            radio.pressNext();
            expected++;
            actual = radio.currentStation;

            Assertions.assertEquals(expected, actual);

        }
    }

    @Test
    public void pressNextIf9() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.pressNext();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pressPrev1_9() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int expected = 9;
        int actual;
        for (int i = 1; i < 9; i++) {
            radio.pressPrev();
            expected--;
            actual = radio.currentStation;

            Assertions.assertEquals(expected, actual);
        }
    }

    @Test
    public void pressPrevIf0() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.pressPrev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation5() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationLess0() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMore9() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Тесты звука//

    @Test
    public void shouldGetVolumeLvl() {
        Radio radio = new Radio();

        radio.currentVolumeLvl = 5;
        int expected = 5;
        int actual = radio.getCurrentVolumeLvl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume0_9() {
        Radio radio = new Radio();

        int expected = 0;
        int actual;
        for (int i = 1; i < 10; i++) {
            radio.increaseVolume();
            expected++;
            actual = radio.currentVolumeLvl;

            Assertions.assertEquals(expected, actual);
        }
    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();

        radio.currentVolumeLvl = 10;
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.currentVolumeLvl;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1_10() {
        Radio radio = new Radio();

        radio.currentVolumeLvl = 10;
        int expected = 10;
        int actual;
        for (int i = 1; i < 10; i++) {
            radio.decreaseVolume();
            expected--;
            actual = radio.currentVolumeLvl;

            Assertions.assertEquals(expected, actual);
        }
    }

    @Test
    public void decreaseVolumeMin() {
        Radio radio = new Radio();

        radio.currentVolumeLvl = 0;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolumeLvl;

        Assertions.assertEquals(expected, actual);

    }
}
