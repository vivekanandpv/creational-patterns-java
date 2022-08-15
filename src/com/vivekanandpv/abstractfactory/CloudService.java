package com.vivekanandpv.abstractfactory;

public interface CloudService {
    VirtualMachine getVirtualMachine();
    Storage getStorage();
}
