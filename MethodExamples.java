public class MethodExamples {

    // Metot overloading örnekleri
    public static int topla(int a, int b) {
        return a + b;
    }

    public static double topla(double a, double b) {
        return a + b;
    }

    public static int topla(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(topla(5, 3));
        System.out.println(topla(4.5, 2.3));
        System.out.println(topla(1, 2, 3));
    }
}
