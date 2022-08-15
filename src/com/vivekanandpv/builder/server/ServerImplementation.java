package com.vivekanandpv.builder.server;

import com.vivekanandpv.builder.server.Server;
import com.vivekanandpv.builder.cpu.Cpu;
import com.vivekanandpv.builder.ram.Ram;
import com.vivekanandpv.builder.ssd.Ssd;

public class ServerImplementation implements Server {
    private Cpu cpu;
    private Ram ram;
    private Ssd ssd;

    @Override
    public Cpu getCpu() {
        return cpu;
    }

    @Override
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public Ram getRam() {
        return ram;
    }

    @Override
    public void setRam(Ram ram) {
        this.ram = ram;
    }

    @Override
    public Ssd getSsd() {
        return ssd;
    }

    @Override
    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }
}
