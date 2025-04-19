public class ScopeDemo {

    public static void main(String[] args) {
        int x = 10; // global scope for main

        if (x > 5) {
            int y = 20; // local scope
            System.out.println("x + y = " + (x + y));
        }

        // y burada erişilemez çünkü if bloğunda tanımlandı
        // System.out.println(y); // hata verir
    }
}
