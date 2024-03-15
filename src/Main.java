import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double m,kg,ki;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        m = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = inp.nextDouble();

        ki = kg / (m * m);
        System.out.println("Vücut Kitle İndeksiniz : " + ki);
    }
}
