import java.util.Scanner;

public class Oblig1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            IO.println("Brutto inntekt: ");
            double brutto = input.nextInt();

            if (brutto < 226101){
                IO.println("gatulerer, ingen trinnskatt på deg");
            } else if (226101 < brutto && brutto < 318300) {
                brutto = brutto * 0.017;
            } else if (318301 < brutto && brutto < 725050) {
                brutto = brutto * 0.04;
            } else if (725051 < brutto && brutto < 980100) {
                brutto = brutto * 0.137;
            } else if (980101 < brutto && brutto < 1467200) {
                brutto = brutto * 0.168;
            } else {
                brutto = brutto * 0.178;
            }

            IO.println("Du må betale " + brutto + "kr i skatt.");
        }
    }
}
