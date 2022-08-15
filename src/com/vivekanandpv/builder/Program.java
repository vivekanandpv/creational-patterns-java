package com.vivekanandpv.builder;

import com.vivekanandpv.builder.builder.ServerBuilder;
import com.vivekanandpv.builder.builder.ServerBuilderImplementation;
import com.vivekanandpv.builder.server.Server;
import com.vivekanandpv.builder.server.ServerImplementation;

public class Program {
    public static void main(String[] args) {
        ServerBuilder builder = new ServerBuilderImplementation(new ServerImplementation());
        Director director = new Director(builder);

        Server server = director.construct();
    }
}
