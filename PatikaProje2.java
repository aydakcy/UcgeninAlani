/* Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) */

import java.util.Scanner;

public class PatikaProje2 {
    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        double a, b, c, cevre, alan;

        //Scanner sınıfını tanımlayalım
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değer alalım
        System.out.print("a kenarını giriniz :");
        a = input.nextDouble();

        System.out.print("b kenarını giriniz : ");
        b = input.nextDouble();

        System.out.print("c kenarını giriniz :");
        c = input.nextDouble();

        //Üçgenin çevresi
        cevre = a + b + c ;
        System.out.println("Üçgenin Çevresi :" + cevre);

        //Üçgenin alanı
        alan = cevre/2 * (cevre/2 - a) * (cevre/2 - b) * (cevre/2 - c);
        System.out.print("Üçgenin Alanı : " + alan);
    }
}
