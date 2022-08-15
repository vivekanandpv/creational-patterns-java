package com.vivekanandpv.abstractfactory;

public class AwsEC2 implements VirtualMachine {
    @Override
    public void start() {
        System.out.println("AWS EC2 Starts");
    }

    @Override
    public void stop() {
        System.out.println("AWS EC2 Stops");
    }
}
