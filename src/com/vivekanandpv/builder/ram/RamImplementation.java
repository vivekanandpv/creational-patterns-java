package com.vivekanandpv.builder.ram;

public class RamImplementation implements Ram {
    private final int capacity;

    public RamImplementation(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }
}
