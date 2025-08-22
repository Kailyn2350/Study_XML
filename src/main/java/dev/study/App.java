package dev.study;

public class App {
    public static void main(String[] args) {
        String target = (args.length > 0) ? args[0] : "World";
        String greet = System.getProperty("greet", "Hello");
        System.out.println(greet + ", " + target + "!");
    }
}