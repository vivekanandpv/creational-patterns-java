package com.vivekanandpv.abstractfactory;

public class AzureCloudServiceFactory implements CloudService {
    @Override
    public VirtualMachine getVirtualMachine() {
        return new AzureVM();
    }

    @Override
    public Storage getStorage() {
        return new AzureBlobStorage();
    }
}
