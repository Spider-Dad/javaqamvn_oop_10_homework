package ru.netology.javaqa.radio;

// объявление публичного класс 'Radio'
public class Radio {
    // объявление непубличного целочисленного поуля 'maxNumberStation' (максимальное количество станиций)
    private final int maxNumberStation;
    // объявление  непубличного целочисленного поля 'currentNumberStation' (текущий номер радиостанции)
    private int currentNumberStation;
    // объявление  непубличного целочисленного поля 'currentVolumeStation' (текущая громкость радиостанции)
    private int currentVolumeStation;
    // объявление конструктора 'Radio' без параметров
    public Radio() {
        this.maxNumberStation = 10;
        this.currentNumberStation = 0;
        this.currentVolumeStation = 0;
    }
    // объявление конструктора 'Radio' c  параметром
    public Radio(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
        this.currentNumberStation = currentNumberStation;
        this.currentVolumeStation = currentVolumeStation;
    }
    // получаем текущее значение поля 'maxNumberStation' из объектов класса 'Radio' используя метод 'getMaxNumberStation'
    public int getMaxNumberStation() {
        return maxNumberStation;
    }
    // получаем текущее значение поля 'currentNumberStation' из объектов класа 'Radio' используя метод 'getCurrentNumberStation'
    public int getCurrentNumberStation() {
        return currentNumberStation;
    }
    // изменяем текущее значение поля 'currentNumberStation' из объектов класса 'Radio' используя метод 'setCurrentNumberStation'
    public void setCurrentNumberStation(int newCurrentNumberStation) {
        if (newCurrentNumberStation < 0 || newCurrentNumberStation >= maxNumberStation) {
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
        if (currentNumberStation == maxNumberStation -1) {
            currentNumberStation = 0;
        } else {
            currentNumberStation ++;
        }
    } // конец объявления метода 'nextStation'
    public void prevStation() { // объявление публичного метода 'prevStation'
        if (currentNumberStation == 0) {
            currentNumberStation = maxNumberStation -1;
        } else {
            currentNumberStation --;
        }
    } // конец объявления метода 'prevStation'
    public void increaseVolumeStation() { // объявление публичного метода 'increaseVolumeStation'
        if (currentVolumeStation < 100) {
            currentVolumeStation ++;
        }
    }  // конец объявления метода 'increaseVolumeStation'
    public void decreaseVolumeStation() { // объявление публичного метода 'decreaseVolumeStation'
        if (currentVolumeStation > 0) {
            currentVolumeStation --;
        }
    } // конец объявления метода 'decreaseVolumeStation'

} // конец объявления класса Radio
