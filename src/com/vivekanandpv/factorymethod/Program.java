package com.vivekanandpv.factorymethod;

public class Program {
    public static void main(String[] args) {
        ServerFactory factory = new ServerFactoryImplementation();

        Server server = factory.getServer(ServerType.AWS);

        server.start();
        server.stop();
    }
}
