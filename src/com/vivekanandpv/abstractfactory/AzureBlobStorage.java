package com.vivekanandpv.abstractfactory;

public class AzureBlobStorage implements Storage {
    @Override
    public void save(String message) {
        System.out.println("Azure Blob Storage: " + message);
    }
}
