package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String ordinaryText, PoemDecorator poemDecorator) {
        String beautifulText = poemDecorator.decorate(ordinaryText);
        System.out.println("Old text: " + ordinaryText + "\nNew beautiful text: " + beautifulText);
        System.out.println();
    }
}
