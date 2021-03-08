package ru.geekbrains.homework2;

import java.util.List;

@Component
public class Runner implements CommandLineRunner {
    private final Print printToConsole;
    private final Print printToFile;
    private final List<String>names;

    public Runner(Print printToConsole, Print printToFile, List<String> names) {
        this.printToConsole = printToConsole;
        this.printToFile = printToFile;
        this.names = names;
    }

    private class Print {
    }
}
