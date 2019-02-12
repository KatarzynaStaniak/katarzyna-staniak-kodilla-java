package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    ShapeCollector shapeCollector;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        shapeCollector = new ShapeCollector();
        System.out.println("Beginning test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Ending test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Circle circle = new Circle(2.5);
        Triangle triangle = new Triangle(1.7, 3.7);
        Square square = new Square(6.8);

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        //Then
        Assert.assertEquals(3, shapeCollector.getShapes().size());
        Assert.assertEquals("circle", shapeCollector.getShapes().get(0).getShapeName());
        Assert.assertEquals("triangle", shapeCollector.getShapes().get(1).getShapeName());
        Assert.assertEquals("square", shapeCollector.getShapes().get(2).getShapeName());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Circle circle = new Circle(2.5);
        Triangle triangle = new Triangle(1.7, 3.7);
        Square square = new Square(6.8);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        //When
        boolean result1 = shapeCollector.removeFigure(circle);
        boolean result2 = shapeCollector.removeFigure(triangle);
        boolean result3 = shapeCollector.removeFigure(square);

        //Then
        Assert.assertEquals(0, shapeCollector.getShapes().size());
        Assert.assertEquals(true, result1);
        Assert.assertEquals(true, result2);
        Assert.assertEquals(true, result3);
    }

    @Test
    public void testRemoveShapeNotExisting() {
        //Given
        Circle circle = new Circle(2.5);

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure() {
        //Given
        Circle circle = new Circle(2.5);
        Triangle triangle = new Triangle(1.7, 3.7);
        Square square = new Square(6.8);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //When
        Shape shape0 = shapeCollector.getFigure(0);
        Shape shape1 = shapeCollector.getFigure(1);
        Shape shape2 = shapeCollector.getFigure(2);

        //Then
        Assert.assertEquals(circle, shape0);
        Assert.assertEquals(square, shape1);
        Assert.assertEquals(triangle, shape2);
    }

    @Test
    public void testShowFigures() {
        //Given
        Circle circle = new Circle(2.5);
        Triangle triangle = new Triangle(1.7, 3.7);
        Square square = new Square(6.8);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //When
        int figuresNumber = shapeCollector.showFigures();

        //Then
        Assert.assertEquals(shapeCollector.getShapes().size(), figuresNumber);
    }

}
