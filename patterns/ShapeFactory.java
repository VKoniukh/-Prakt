//Factory Pattern
public class ShapeFactory {
    public enum ShapeType {
        CIRCLE, RECTANGLE
    }

    public Shape createShape(ShapeType type) {
        switch (type) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }
    }

    interface Shape {
        void draw();
    }

    class Circle implements Shape {
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    class Rectangle implements Shape {
        public void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }
}