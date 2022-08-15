package com.vivekanandpv.factorymethod;

public interface ServerFactory {
    Server getServer(ServerType serverType);
}
