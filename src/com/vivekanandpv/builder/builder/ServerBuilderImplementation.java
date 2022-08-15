package com.vivekanandpv.builder.builder;

import com.vivekanandpv.builder.cpu.CpuImplementation;
import com.vivekanandpv.builder.ram.RamImplementation;
import com.vivekanandpv.builder.server.Server;
import com.vivekanandpv.builder.ssd.SsdImplementation;

public class ServerBuilderImplementation implements ServerBuilder {
    private final Server server;

    public ServerBuilderImplementation(Server server) {
        this.server = server;
    }

    @Override
    public void addCpu(int cores) {
        server.setCpu(new CpuImplementation(cores));
    }

    @Override
    public void addRam(int capacity) {
        server.setRam(new RamImplementation(capacity));
    }

    @Override
    public void addSsd(int capacity) {
        server.setSsd(new SsdImplementation(capacity));
    }

    @Override
    public Server build() {
        return server;
    }
}
