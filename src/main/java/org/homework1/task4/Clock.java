package org.homework1.task4;

public class Clock implements Readable {
    int hours;
    int minutes;
    int seconds;

    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    private void tick() {
        int sec = 1;
        for (int i = 0; i <= 60; i++) {
            if (seconds < 59) {
                seconds = seconds + sec;
                System.out.printf("%s:%s:%s \n", hours, minutes, seconds);
            } else if (minutes < 59) {
                seconds = 0;
                minutes = minutes + sec;
                System.out.printf("%s:%s:%s \n", hours, minutes, seconds);
            } else if (hours < 12) {
                seconds = 0;
                minutes = 0;
                hours = hours + sec;
                System.out.printf("%s:%s:%s \n", hours, minutes, seconds);
            } else {
                seconds = 0;
                minutes = 0;
                hours = 0;
                System.out.printf("%s:%s:%s \n", hours, minutes, seconds);
            }
        }
    }

    @Override
    public void readTime() {
        int count = 0;
        while (count < 10) {
            tick();
        }
    }
}
