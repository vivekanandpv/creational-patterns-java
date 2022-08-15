package com.vivekanandpv.factorymethod;

import java.util.UUID;

public class ServerFactoryImplementation implements ServerFactory {
    @Override
    public Server getServer(ServerType serverType) {
        switch (serverType) {
            case AWS: {
                String uuid = UUID.randomUUID().toString();
                return new AwsServer(uuid);
            }
            case AZURE: {
                long id = (long)(Math.random() * 10_000_000_000L);
                return new AzureServer(id);
            }
            default:
                throw new RuntimeException("Unknown server type");
        }
    }
}
