public class Foo {
    public static void main(String[] args) {
        Number a = new Number(1);
        Number b = new Number(2);
        Number c = new Number(3);

        System.out.println(b.getValue());
        a.add(4);
        System.out.println(a.getValue());
        
        a = b;
        b = c;
        c = a;
        
        System.out.println(a.getValue());
        System.out.println(b.getValue());
        System.out.println(c.getValue());
    }
} // end class Foo

class Number {
    private int value;

    public Number(int n) {
        value = n;
    }

    public int getValue() {
        return value;
    }

    public void add(int n) {
        value += n;
    }
} // end class Number