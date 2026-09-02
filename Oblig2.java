import java.util.Scanner;

public class Oblig2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int teller = 0;

        while (teller < 10){
            IO.println("Poengsum som student har oppnådd: ");
            double poengsum = input.nextDouble();

            if (poengsum > 100 || poengsum < 0){
                IO.println("Ikke gyldig poengsum");
            }

            if (poengsum <= 100 && poengsum >= 90){
                IO.println("studenten har fått karakteren A");
            } else if (poengsum <= 89 && poengsum >= 80) {
                IO.println("studenten har fått karakteren B");
            } else if (poengsum <= 79 && poengsum >= 60) {
                IO.println("studenten har fått karakteren C");
            } else if (poengsum <= 59 && poengsum >= 50) {
                IO.println("studenten har fått karakteren D");
            } else if (poengsum <= 49 && poengsum >= 40) {
                IO.println("studenten har fått karakteren E");
            } else if (poengsum <= 39 && poengsum >= 0) {
                IO.println("studenten har fått karakteren F");
            }
            teller++;
        }

    }
}
