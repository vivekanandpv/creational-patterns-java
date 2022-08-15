package com.vivekanandpv.prototype;

public class Program {
    public static void main(String[] args) {
        VirtualMachine vm = new AwsEC2(4, 8, 250);

        VirtualMachine vm2 = vm.clone();
    }
}
