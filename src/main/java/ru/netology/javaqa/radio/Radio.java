package ru.netology.javaqa.radio;

public class Radio { // объявление публичного класс 'Radio'

    // объявление  непубличного целочисленного поля 'currentNumberStation' (текущий номер радиостанции)
    private int currentNumberStation;

    // объявление  непубличного целочисленного поля 'currentVolumeStation' (текущая громкость радиостанции)
    private int currentVolumeStation;

    // получаем текущее значение поля 'currentNumberStation' из объектов класа 'Radio' используя метод 'getCurrentNumberStation'
    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    // изменяем текущее значение поля 'currentNumberStation' из объектов класса 'Radio' используя метод 'setCurrentNumberStation'
    public void setCurrentNumberStation(int newCurrentNumberStation) {
        if (newCurrentNumberStation < 0 || newCurrentNumberStation > 9) {
            return;
        }
        currentNumberStation = newCurrentNumberStation;
    }

    // получаем текущее значение поля 'currentVolumeStation' из объектов класа 'Radio' используя метод 'getCurrentVolumeStation'
    public int getCurrentVolumeStation() {
        return currentVolumeStation;
    } // конец метода 'getCurrentVolumeStation"

    // изменяем текущее значение поля 'CurrentVolumeStation' из объектов класса 'Radio' используя метод 'setCurrentVolumeStation'
    public void setCurrentVolumeStation(int newCurrentVolumeStation) {
        if (newCurrentVolumeStation < 0 || newCurrentVolumeStation > 100) {
            return;
        }
        currentVolumeStation = newCurrentVolumeStation;
    } // конец метода 'setCurrentVolumeStation'

    public void nextStation() { // объявление публичного метода 'nextStation'
        if (currentNumberStation == 9) {
            currentNumberStation = 0;
        } else {
            currentNumberStation = currentNumberStation + 1;
        }
    } // конец объявления метода 'nextStation'

    public void prevStation() { // объявление публичного метода 'prevStation'
        if (currentNumberStation == 0) {
            currentNumberStation = 9;
        } else {
            currentNumberStation = currentNumberStation - 1;
        }
    } // конец объявления метода 'prevStation'

    public void increaseVolumeStation() { // объявление публичного метода 'increaseVolumeStation'
        if (currentVolumeStation < 100) {
            currentVolumeStation = currentVolumeStation + 1;
        }
    }  // конец объявления метода 'increaseVolumeStation'

    public void decreaseVolumeStation() { // объявление публичного метода 'decreaseVolumeStation'
        if (currentVolumeStation > 0) {
            currentVolumeStation = currentVolumeStation - 1;
        }
    } // конец объявления метода 'decreaseVolumeStation'

} // конец объявления класса Radio
