package ru.netology.javaqa.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest { // объявление публичного тест класса 'RadioTest'

    // 1. положительный тест, проверяет установку текущей радиостанции на определенный номер
    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(5);

        int expected = 5;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    // 2. положительный тест, проверяет увеличение громкости на единицу.
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolumeStation();

        int expected = 1;
        int actual = radio.getCurrentVolumeStation();

        Assertions.assertEquals(expected, actual);

    }

    // 3. отрицательный тест, проверяет, что нельзя установить громкость больше 100.
    @Test
    public void shouldNotSetVolumeMoreThanHundred() {
        Radio radio = new Radio();

        radio.setCurrentVolumeStation(101);

        int expected = 0;
        int actual = radio.getCurrentVolumeStation();

        Assertions.assertEquals(expected, actual);
    }

    // 4. положительный тест, проверяет уменьшение громкости на единицу.
    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolumeStation(50);
        radio.decreaseVolumeStation();

        int expected = 49;
        int actual = radio.getCurrentVolumeStation();

        Assertions.assertEquals(expected, actual);
    }

    // 5. положительный тест, проверяет переключение на следующую радиостанцию.
    @Test
    public void shouldSwitchNextNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    // 6. положительный тест, проверяет переключение на предыдущую радиостанцию.
    @Test
    public void shouldSwitchPrevNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    // 7. положительный тест, проверяет переключение с последней радиостанции на первую.
    @Test
    public void shouldSwitchToFirstNumberStationThanOnLastNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    // 8. положительный тест, проверяет переключение с первой радиостанции на последнюю.
    @Test
    public void shouldSwitchToLastNumberStationWhenOnFirstNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    // 9. отрицательный тест, проверяет, что нельзя установить текущую радиостанцию с номером меньше нуля.
    @Test
    public void shouldNotSetCurrentStationLessThanZero() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    // 10.  отрицательный тест, проверяет, что нельзя установить текущую радиостанцию с номером больше 9.
    @Test
    public void shouldNotCurrentStationMoreThanNine() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(10);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    // 11. отрицательный тест, проверяет, что нельзя увеличить громкость больше 100.
    @Test
    public void shouldNotIncreaseVolumeMoreThanHundred() {
        Radio radio = new Radio();

        radio.setCurrentVolumeStation(100);
        radio.increaseVolumeStation();

        int expected = 100;
        int actual = radio.getCurrentVolumeStation();

        Assertions.assertEquals(expected, actual);
    }

    // 12. отрицательный тест, проверяет, что нельзя установить громкость меньше нуля.
    @Test
    public void shouldNotSetVolumeLessThanZero() {
        Radio radio = new Radio();

        radio.setCurrentVolumeStation(-1);

        int expected = 0;
        int actual = radio.getCurrentVolumeStation();

        Assertions.assertEquals(expected, actual);
    }

    // 13. отрицательный тест, проверяет, что нельзя уменьшить громкость меньше нуля.
    @Test
    public void shouldNotDecreaseVolumeLessThanZero() {
        Radio radio = new Radio();

        radio.decreaseVolumeStation();

        int expected = 0;
        int actual = radio.getCurrentVolumeStation();

        Assertions.assertEquals(expected, actual);
    }
} // конец объявления класса 'RadioTest'
