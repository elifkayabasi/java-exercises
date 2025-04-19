public class arraysandmethods {
    // 1. Parametresiz, geri döndürmeyen metot
    static void selamVer() {
        System.out.println("Merhaba, ben selamVer metoduyum!");
    }

    // 2. Parametre alan, geri döndürmeyen metot (Overloading)
    static void selamVer(String isim) {
        System.out.println("Merhaba " + isim + ", hoş geldin!");
    }

    // 3. Geriye değer döndüren metot
    static int topla(int a, int b) {
        return a + b;
    }

    // 4. String dizisini yazdıran metot
    static void diziYazdir(String[] dizi) {
        for (String eleman : dizi) {
            System.out.println("Dizi Elemanı: " + eleman);
        }
    }

    // 5. int dizisinin ortalamasını hesaplayan metot
    static double ortalamaBul(int[] sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return (double) toplam / sayilar.length;
    }

    public static void main(String[] args) {
        // Metot çağrıları
        selamVer(); // Parametresiz metot
        selamVer("Elif"); // Overloaded metot

        int sonuc = topla(10, 20); // Geriye değer döndüren metot
        System.out.println("Toplam: " + sonuc);

        // String dizisi örneği
        String[] arabalar = {"Mercedes", "BMW", "Opel", "Ford"};
        diziYazdir(arabalar); // Dizi yazdırma

        // int dizisi ve ortalama hesaplama
        int[] notlar = {85, 90, 78, 92, 88};
        double ortalama = ortalamaBul(notlar);
        System.out.println("Not Ortalaması: " + ortalama);
    }
}
