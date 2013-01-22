public class test {
    public static void main(String args[]) {
    TestClass testObj = new TestClass(1,2); // line 1 (no errors)
    System.out.println(testObj.a); // line 2
    // System.out.println(testObj.b); // line 3
    testObj.a = 5; // line 4
    // testObj.b = 6; // line 5
    testObj.print(); // line 6 (no errors)
} // end main
}

class TestClass {
        public int a;
        private int b;
        public TestClass(int x, int y) {
            a = x;
            b = y;
        } // end constructor
        public void print() {
            System.out.println(a + " " + b);
        }
    } // end class TestClass


