package com.vivekanandpv.prototype;


public class AwsEC2 implements VirtualMachine {
    private final int cores;
    private final int ramCapacity;
    private final int ssdCapacity;

    public AwsEC2(int cores, int ramCapacity, int ssdCapacity) {
        this.cores = cores;
        this.ramCapacity = ramCapacity;
        this.ssdCapacity = ssdCapacity;
    }

    @Override
    public void start() {
        System.out.println("AWS EC2 Starts");
    }

    @Override
    public void stop() {
        System.out.println("AWS EC2 Stops");
    }

    @Override
    public VirtualMachine clone() {
        return new AwsEC2(
                this.cores,
                this.ramCapacity,
                this.ssdCapacity
        );
    }

    public int getCores() {
        return cores;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public int getSsdCapacity() {
        return ssdCapacity;
    }
}
