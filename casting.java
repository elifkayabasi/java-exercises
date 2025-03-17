public class casting {
    public static void main(String[] args) {

        byte byteDeger = 42;
        int intDeger = byteDeger; // byte → int (otomatik)
        double doubleDeger = intDeger; // int → double (otomatik)
    
        System.out.println("Byte Değer: " + byteDeger);
        System.out.println("Int Değer (Byte'dan geldi): " + intDeger);
        System.out.println("Double Değer (Int'ten geldi): " + doubleDeger);
    
        double doubleSayi = 9.78;
        int intSayi = (int) doubleSayi; // double → int (manuel)
    
        System.out.println("\nDouble Değer: " + doubleSayi);
        System.out.println("Int Değer (Double'dan geldi - veri kaybı var!): " + intSayi);
    }
}