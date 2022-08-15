package com.vivekanandpv.factorymethod;

public class AzureServer implements Server {
    private final long id;

    public AzureServer(long id) {
        this.id = id;
    }

    @Override
    public void start() {
        System.out.println("Azure Server Starts: " + id);
    }

    @Override
    public void stop() {
        System.out.println("Azure Server Stops: " + id);
    }

    @Override
    public String toString() {
        return "AzureServer{" +
                "id=" + id +
                '}';
    }
}
