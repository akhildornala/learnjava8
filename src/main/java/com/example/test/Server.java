package com.example.test;

public class Server {
    @Override
    public String toString() {
        return "Server{" +
                "ipAddress='" + ipAddress + '\'' +
                ", currentLoad=" + currentLoad +
                '}';
    }

    private String ipAddress;
    private int currentLoad;

    public Server(String ipAddress, int currentLoad) {
        this.ipAddress = ipAddress;
        this.currentLoad = currentLoad;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void incrementLoad() {
        currentLoad++;
    }
}
