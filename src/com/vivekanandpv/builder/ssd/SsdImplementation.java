package com.vivekanandpv.builder.ssd;

public class SsdImplementation implements Ssd {
    private final int capacity;

    public SsdImplementation(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }
}
