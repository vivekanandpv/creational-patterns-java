package com.vivekanandpv.builder.cpu;

public class CpuImplementation implements Cpu {
    private final int cores;

    public CpuImplementation(int cores) {
        this.cores = cores;
    }

    @Override
    public int getCores() {
        return cores;
    }
}
