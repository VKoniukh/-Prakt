public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Factory Pattern
        ShapeFactory shapeFactory = new ShapeFactory();
        ShapeFactory.Shape circle = shapeFactory.createShape(ShapeFactory.ShapeType.CIRCLE);
        circle.draw();
        ShapeFactory.Shape rectangle = shapeFactory.createShape(ShapeFactory.ShapeType.RECTANGLE);
        rectangle.draw();

        // Observer Pattern
        Subject subject = new Subject();
        Subject.Observer observer1 = new Subject.ConcreteObserver("Observer 1");
        Subject.Observer observer2 = new Subject.ConcreteObserver("Observer 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.setMessage("New message for observers!");
    }
}