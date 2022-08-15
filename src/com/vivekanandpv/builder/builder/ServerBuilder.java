package com.vivekanandpv.builder.builder;

import com.vivekanandpv.builder.server.Server;

public interface ServerBuilder {
    void addCpu(int cores);
    void addRam(int capacity);
    void addSsd(int capacity);
    Server build();
}
