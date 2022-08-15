package com.vivekanandpv.prototype;

public interface VirtualMachine {
    void start();
    void stop();
    VirtualMachine clone();
}
