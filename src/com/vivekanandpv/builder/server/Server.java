package com.vivekanandpv.builder.server;

import com.vivekanandpv.builder.cpu.Cpu;
import com.vivekanandpv.builder.ram.Ram;
import com.vivekanandpv.builder.ssd.Ssd;

public interface Server {
    Cpu getCpu();

    void setCpu(Cpu cpu);

    Ram getRam();

    void setRam(Ram ram);

    Ssd getSsd();

    void setSsd(Ssd ssd);
}
