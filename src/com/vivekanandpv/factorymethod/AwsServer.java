package com.vivekanandpv.factorymethod;

import java.util.UUID;

public class AwsServer implements Server {
    private final String uniqueId;

    public AwsServer(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public void start() {
        System.out.println("AWS Server Starts: " + this);
    }

    @Override
    public void stop() {
        System.out.println("AWS Server Stops: " + this);
    }

    @Override
    public String toString() {
        return "AwsServer{" +
                "uniqueId='" + uniqueId + '\'' +
                '}';
    }
}
