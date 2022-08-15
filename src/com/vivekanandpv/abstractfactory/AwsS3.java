package com.vivekanandpv.abstractfactory;

public class AwsS3 implements Storage {
    @Override
    public void save(String message) {
        System.out.println("AWS S3 Storage: " + message);
    }
}
