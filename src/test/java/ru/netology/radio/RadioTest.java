package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    // Тесты создания новой станции //
    @Test
    public void newRadioDefault() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getNumberStations());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(100, radio.getMaxVolumeLvl());
        Assertions.assertEquals(0, radio.getMinVolumeLvl());
    }

    @Test
    public void newRadio() {
        Radio radio = new Radio(100);

        Assertions.assertEquals(100, radio.getNumberStations());
        Assertions.assertEquals(99, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(100, radio.getMaxVolumeLvl());
        Assertions.assertEquals(0, radio.getMinVolumeLvl());
    }


    //Тесты переключения станций//
    @Test
    public void shouldGetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void pressNext0_100() {
        Radio radio = new Radio(100);

        radio.setCurrentStation(0);
        int expected = 0;

        for (int i = 1; i < 100; i++) {
            radio.pressNext();
            expected++;

            Assertions.assertEquals(expected, radio.getCurrentStation());

        }
    }

    @Test
    public void pressNextIfMax() {
        Radio radio = new Radio(100);

        radio.setCurrentStation(99);
        radio.pressNext();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void pressPrev1_9() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int expected = 9;

        for (int i = 1; i < 9; i++) {
            radio.pressPrev();
            expected--;

            Assertions.assertEquals(expected, radio.getCurrentStation());
        }
    }

    @Test
    public void pressPrevIf0() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.pressPrev();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation5() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationLess0() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationMore9() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    //Тесты звука//

    @Test
    public void shouldGetVolumeLvl() {
        Radio radio = new Radio();

        radio.setCurrentVolumeLvl(5);

        Assertions.assertEquals(5, radio.getCurrentVolumeLvl());
    }


    @Test
    public void shouldSetVolumeLvlMore100() {
        Radio radio = new Radio();

        radio.setCurrentVolumeLvl(110);

        Assertions.assertEquals(0, radio.getCurrentVolumeLvl());
    }

    @Test
    public void shouldSetVolumeLvlLess0() {
        Radio radio = new Radio();

        radio.setCurrentVolumeLvl(-1);

        Assertions.assertEquals(0, radio.getCurrentVolumeLvl());
    }

    @Test
    public void increaseVolume0_100() {
        Radio radio = new Radio();

        int expected = 0;

        for (int i = 1; i < 100; i++) {
            radio.increaseVolume();
            expected++;

            Assertions.assertEquals(expected, radio.getCurrentVolumeLvl());
        }
    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolumeLvl(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolumeLvl());
    }

    @Test
    public void decreaseVolume1_100() {
        Radio radio = new Radio();

        radio.setCurrentVolumeLvl(100);
        int expected = 100;

        for (int i = 1; i < 100; i++) {
            radio.decreaseVolume();
            expected--;

            Assertions.assertEquals(expected, radio.getCurrentVolumeLvl());
        }
    }

    @Test
    public void decreaseVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolumeLvl(0);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolumeLvl());

    }
}
