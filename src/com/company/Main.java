package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        Double sum = Files.readAllLines(Paths.get(System.getProperty("user.dir"), "number.txt"))
                .stream()
                .filter(s -> !s.isEmpty())
                .filter(s -> !s.startsWith("#"))
                .mapToDouble(Double::valueOf)
                .sum();

        System.out.println("Result: " + sum);
    }
}
