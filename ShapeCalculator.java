public class ShapeCalculator {
    public static void main(String[] args) {
        // Rectangle dimensions
        double length = 36.0;
        double breadth = 36.0;
        
        // Circle radius
        double radius = 36.0;
        
        // Calculations for the rectangle
        double rectangleArea = length * breadth;
        double rectanglePerimeter = 2 * (length + breadth);
        
        // Calculations for the circle
        double circleArea = Math.PI * radius * radius;
        double circleCircumference = 2 * Math.PI * radius;
        
        // Output results
        System.out.println("Rectangle Area: " + rectangleArea + " square units");
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter + " units");
        System.out.println("Circle Area: " + circleArea + " square units");
        System.out.println("Circle Circumference: " + circleCircumference + " units");
    }
}
