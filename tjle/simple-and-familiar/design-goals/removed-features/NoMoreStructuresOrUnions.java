public class NoMoreStructuresOrUnions {
    // Structures equivalent
    public class Point extends Object {
        double x;
        double y;
    }

    // Unions
    public class Rectangle extends Object {
        Point lowerLeft;
        Point upperRight;
    }
    // Methods to access the instance variables.
}