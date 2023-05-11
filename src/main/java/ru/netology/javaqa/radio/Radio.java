package ru.netology.javaqa.radio;

public class Radio {
    private final int numStations;
    private int currentStation;
    private int volume;

    public Radio() {
        this.numStations = 10;
        this.currentStation = 0;
        this.volume = 0;
    }

    public Radio(int numStations) {
        this.numStations = numStations;
        this.currentStation = 0;
        this.volume = 0;
    }

    public int getNumStations() {
        return numStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < numStations) {
            this.currentStation = station;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public void setStation(int station) {
        if (station >= 0 && station < numStations) {
            this.currentStation = station;
        }
    }

    public void nextStation() {
        currentStation++;
        if (currentStation >= numStations) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        currentStation--;
        if (currentStation < 0) {
            currentStation = numStations - 1;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
