package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        System.out.println();

        System.out.println("Creating beautiful texts from ordinary texts: ");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Apple", text -> "Butterflies " + text + " butterflies");
        poemBeautifier.beautify("Books", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("letters", text -> text.toUpperCase());
        poemBeautifier.beautify("UPPER", text -> text.toLowerCase());
        poemBeautifier.beautify("LongWords", text -> "Short" + text.substring(4, 8));
    }
}
