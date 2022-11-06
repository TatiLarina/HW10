package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldGetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeLvl() {
        Radio radio = new Radio();

        radio.currentVolumeLvl = 5;
        int expected = 5;
        int actual = radio.getCurrentVolumeLvl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pressNext0_9() {
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
    public void pressPrev0_9() {
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
}
