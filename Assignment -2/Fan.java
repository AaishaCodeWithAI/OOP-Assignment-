package org.example;

public class Fan {
    boolean isRunning;
    void start() {
        isRunning = true;
        System.out.println("Fan Running: " + isRunning);
    }
  
    void stop() {
        isRunning = false;
        System.out.println("Fan Running: " + isRunning);
    }
}

public class Main {
    public static void main(String[] args) {
        Fan ceilingFan = new Fan();
        Fan tableFan = new Fan();

        ceilingFan.start();
        tableFan.stop();
    }
}
