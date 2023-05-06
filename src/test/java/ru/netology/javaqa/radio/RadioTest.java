package ru.netology.javaqa.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest { // объявление публичного тест класса 'RadioTest'
    Radio radio = new Radio();
    // 1. положительный тест, проверяет установку текущей радиостанции на определенный номер
    @Test
    public void shouldSetCurrentStation() {
        radio.setCurrentNumberStation(5);

        Assertions.assertEquals(5, radio.getCurrentNumberStation());
    }
    // 2. положительный тест, проверяет увеличение громкости на единицу.
    @Test
    public void shouldIncreaseVolume() {

        radio.increaseVolumeStation();

        Assertions.assertEquals(1, radio.getCurrentVolumeStation());
    }
    // 3. отрицательный тест, проверяет, что нельзя установить громкость больше 100.
    @Test
    public void shouldNotSetVolumeMoreThanHundred() {
        radio.setCurrentVolumeStation(101);

        Assertions.assertEquals(0, radio.getCurrentVolumeStation());
    }
    // 4. положительный тест, проверяет уменьшение громкости на единицу.
    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolumeStation(50);
        radio.decreaseVolumeStation();

        Assertions.assertEquals(49, radio.getCurrentVolumeStation());
    }
    // 5. положительный тест, проверяет переключение на следующую радиостанцию.
    @Test
    public void shouldSwitchNextNumberStation() {
        radio.setCurrentNumberStation(8);
        radio.nextStation();

        Assertions.assertEquals(9, radio.getCurrentNumberStation());
    }
    // 6. положительный тест, проверяет переключение на предыдущую радиостанцию.
    @Test
    public void shouldSwitchPrevNumberStation() {
        radio.setCurrentNumberStation(5);
        radio.prevStation();

        Assertions.assertEquals(4, radio.getCurrentNumberStation());
    }
    // 7. положительный тест, проверяет переключение с последней радиостанции на первую.
    @Test
    public void shouldSwitchToFirstNumberStationThanOnLastNumberStation() {
        radio.setCurrentNumberStation(9);
        radio.nextStation();

        Assertions.assertEquals(0, radio.getCurrentNumberStation());
    }
    // 8. положительный тест, проверяет переключение с первой радиостанции на последнюю.
    @Test
    public void shouldSwitchToLastNumberStationWhenOnFirstNumberStation() {
        radio.setCurrentNumberStation(0);
        radio.prevStation();

        Assertions.assertEquals(9, radio.getCurrentNumberStation());
    }
    // 9. Положительный тест, проверяет выставленное значение максимального количества станций
    @Test
    public void shouldSetMaxNumberStation(){

        Assertions.assertEquals(10, radio.getMaxNumberStation());
    }
    // 10. Положительный тест, проверяет создание объекта с заданным параметром поля максимальное количество станций и корректным выставлением значений полей текущий номер станции и текущая громкость
    @Test
    public void ConstructorWithParameterMaxNumberStationTest(){
        Radio radio = new Radio(8);

        Assertions.assertEquals(8, radio.getMaxNumberStation());
        Assertions.assertEquals(0, radio.getCurrentNumberStation());
        Assertions.assertEquals(0, radio.getCurrentVolumeStation());
    }
    // 11. Положительный тест, проверяет создание объекта без параметара с выставленным по умолчанию значением поля максимальное количество станций и корректным выставлением значений полей текущий номер станции и текущая громкость
    @Test
    public void ConstructorWithoutParameterMaxNumberStationTest(){
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getMaxNumberStation());
        Assertions.assertEquals(0, radio.getCurrentNumberStation());
        Assertions.assertEquals(0, radio.getCurrentVolumeStation());
    }
    // 12. отрицательный тест, проверяет, что нельзя установить текущую радиостанцию с номером меньше нуля.
    @Test
    public void shouldNotSetCurrentStationLessThanZero() {
        radio.setCurrentNumberStation(-1);

        Assertions.assertEquals(0, radio.getCurrentNumberStation());
    }
    // 13.  отрицательный тест, проверяет, что нельзя установить текущую радиостанцию с номером больше 9.
    @Test
    public void shouldNotCurrentStationMoreThanNine() {
        radio.setCurrentNumberStation(10);

        Assertions.assertEquals(0, radio.getCurrentNumberStation());
    }
    // 14. отрицательный тест, проверяет, что нельзя увеличить громкость больше 100.
    @Test
    public void shouldNotIncreaseVolumeMoreThanHundred() {
        radio.setCurrentVolumeStation(100);
        radio.increaseVolumeStation();

        Assertions.assertEquals(100, radio.getCurrentVolumeStation());
    }
    // 15. отрицательный тест, проверяет, что нельзя установить громкость меньше нуля.
    @Test
    public void shouldNotSetVolumeLessThanZero() {
        radio.setCurrentVolumeStation(-1);

        Assertions.assertEquals(0, radio.getCurrentVolumeStation());
    }
    // 16. отрицательный тест, проверяет, что нельзя уменьшить громкость меньше нуля.
    @Test
    public void shouldNotDecreaseVolumeLessThanZero() {
        radio.decreaseVolumeStation();

        Assertions.assertEquals(0, radio.getCurrentVolumeStation());
    }
} // конец объявления класса 'RadioTest'
