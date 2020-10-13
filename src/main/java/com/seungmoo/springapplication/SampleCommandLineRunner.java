package com.seungmoo.springapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sun.tools.jar.CommandLine;

import java.util.Arrays;

@Component
public class SampleCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=====command line start=====");
        Arrays.stream(args)
                .forEach(System.out::println);
        System.out.println("=====command line end=====");
    }
}
