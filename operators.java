public class operators {
    public static void main(String[] args) {

        int a = 10, b = 3;
        System.out.println("Aritmetik Operatörler:");
        System.out.println("Toplama: " + (a + b)); // 10 + 3 = 13
        System.out.println("Çıkarma: " + (a - b)); // 10 - 3 = 7
        System.out.println("Çarpma: " + (a * b)); // 10 * 3 = 30
        System.out.println("Bölme: " + (a / b)); // 10 / 3 = 3 (tam sayı bölme)
        System.out.println("Mod (Kalan): " + (a % b)); // 10 % 3 = 1
        System.out.println("--------------------");

        int c = 5;
        c += 2; // c = c + 2;
        System.out.println("Atama Operatörleri:");
        System.out.println("c += 2 → " + c); // 5 + 2 = 7
        c *= 3; // c = c * 3;
        System.out.println("c *= 3 → " + c); // 7 * 3 = 21
        c %= 4; // c = c % 4;
        System.out.println("c %= 4 → " + c); // 21 % 4 = 1
        System.out.println("--------------------");

        System.out.println("Karşılaştırma Operatörleri:");
        System.out.println("a == b → " + (a == b)); // false
        System.out.println("a != b → " + (a != b)); // true
        System.out.println("a > b → " + (a > b)); // true
        System.out.println("a < b → " + (a < b)); // false
        System.out.println("a >= b → " + (a >= b)); // true
        System.out.println("a <= b → " + (a <= b)); // false
        System.out.println("--------------------");

        boolean x = true, y = false;
        System.out.println("Mantıksal Operatörler:");
        System.out.println("x && y → " + (x && y)); // false (ve)
        System.out.println("x || y → " + (x || y)); // true (veya)
        System.out.println("!x → " + (!x)); // false (değil)
        System.out.println("--------------------");

        int bit1 = 5, bit2 = 3;
        System.out.println("Bitwise Operatörler:");
        System.out.println("bit1 & bit2 → " + (bit1 & bit2)); // 5 & 3 = 1 (0101 & 0011 = 0001)
        System.out.println("bit1 | bit2 → " + (bit1 | bit2)); // 5 | 3 = 7 (0101 | 0011 = 0111)
        System.out.println("bit1 ^ bit2 → " + (bit1 ^ bit2)); // 5 ^ 3 = 6 (0101 ^ 0011 = 0110)
        System.out.println("~bit1 → " + (~bit1)); // ~5 = -6
        System.out.println("bit1 << 1 → " + (bit1 << 1)); // 5 * 2 = 10
        System.out.println("bit1 >> 1 → " + (bit1 >> 1)); // 5 / 2 = 2
    }
    
}