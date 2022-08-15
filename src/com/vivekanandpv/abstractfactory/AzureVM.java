package com.vivekanandpv.abstractfactory;

public class AzureVM implements VirtualMachine {
    @Override
    public void start() {
        System.out.println("Azure VM Starts");
    }

    @Override
    public void stop() {
        System.out.println("Azure VM Stops");
    }
}
