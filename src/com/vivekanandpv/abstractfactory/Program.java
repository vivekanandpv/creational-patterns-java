package com.vivekanandpv.abstractfactory;

public class Program {
    public static void main(String[] args) {
        CloudService awsService = new AwsCloudServiceFactory();
        CloudService azureService = new AzureCloudServiceFactory();

        VirtualMachine awsEC2 = awsService.getVirtualMachine();
        Storage awsS3 = awsService.getStorage();

        VirtualMachine azureVM = azureService.getVirtualMachine();
        Storage azureBlob = azureService.getStorage();
    }
}
