class Shape {
    public void display() {
        System.out.println("This is a geometric shape.");
    }
}

class Circle extends Shape {
    public void drawCircle() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    public void drawRectangle() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Shapes {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        Rectangle myRectangle = new Rectangle();
        
        myCircle.display();
        myCircle.drawCircle();
        
        System.out.println("-------------------------");
        
        myRectangle.display();
        myRectangle.drawRectangle();
    }
}