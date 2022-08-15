package com.vivekanandpv.abstractfactory;

public class AwsCloudServiceFactory implements CloudService {
    @Override
    public VirtualMachine getVirtualMachine() {
        return new AwsEC2();
    }

    @Override
    public Storage getStorage() {
        return new AwsS3();
    }
}
