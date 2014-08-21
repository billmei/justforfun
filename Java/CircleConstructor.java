// Trying out classes in Java

public class CircleConstructor {
    public static void main(String[] args) {
        Circle archemedes = new Circle();
        System.out.println(archemedes.radius);
        System.out.println(archemedes.getArea());
        System.out.println(archemedes.getFoo());

        Circle editable = new Circle(20);
        System.out.println(editable.radius);
        System.out.println(editable.getArea());

        Circle changed = new Circle(10);
        System.out.println(changed.radius);
        changed.modifyRadius(20);
        System.out.println(changed.radius);

    }
}

class Circle {
    // Creates a Circle object with a specified radius (default = 1.0)
    public double radius;
    private String foo;

    public Circle() {
        radius = 1.0;
        foo = "Foo is here!";
    }

    public String getFoo() {
        return foo;
    }

    public Circle(double newRadius) {
        radius = newRadius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void modifyRadius(double newRadius) {
        radius = newRadius;
    }
 }