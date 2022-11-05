package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldGetStation() {
        Radio radio = new Radio();

        radio.currentStation = 5;
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
}
