public class TabellOving {
    public static void main(String[] args) {

        // ============================================================
        // 1. EKSEMPEL: ENDIMENSJONAL TABELL
        // ============================================================

        // int[] betyr en tabell med heltall. Her legger vi inn fire tall.
        int[] tall = {10, 20, 30, 40};

        // Indeks er posisjonen i tabellen. Første indeks er alltid 0.
        // Indeks:      0   1   2   3
        // Verdi:      10  20  30  40
        System.out.println("Første tall: " + tall[0]); // Skriver 10.

        // Vi endrer tallet på indeks 1 fra 20 til 25.
        tall[1] = 25;

        // length gir antall elementer. Her er tall.length lik 4.
        // vi starter på 0, og i++ øker i med 1 etter hver runde.
        // Vi bruker < fordi siste gyldige indeks er length - 1.
        System.out.println("Tallene etter endringen:");
        for (int i = 0; i < tall.length; i++) {
            System.out.println("tall[" + i + "] = " + tall[i]);
        }

        // ------------------------------------------------------------
        // DIN TUR: SKRIV EN EGEN ENDIMENSJONAL TABELL HER
        // ------------------------------------------------------------
    int[] tabell = {3, 5, 6, 8, 9};

        // Skriv dine egne heltall mellom { og }, adskilt med komma.
        // Tomme klammer er lov: tabellen har foreløpig 0 elementer.
        int[] mineTall = {4,3,2,1};
            // Skriv tallene dine på linjen under:

        };

        // Oppgave: Les og skriv ut det første tallet med mineTall[0].
        // Legg inn minst ett tall først, ellers finnes ikke indeks 0.
        // Skriv din kode under:
System.out.println("mine tall er " + tabell);

        // Oppgave: Endre tallet på indeks 1. Du trenger minst to tall.
        // Skriv din kode under:


        // Denne løkken skriver automatisk ut tallene du legger inn.
        System.out.println("\nMin endimensjonale tabell:");
        for (int i = 0; i < mineTall.length; i++) {
            System.out.println("mineTall[" + i + "] = " + mineTall[i]);
        }

        // ============================================================
        // 2. EKSEMPEL: TODIMENSJONAL TABELL
        // ============================================================

        // int[][] betyr en tabell av tabeller.
        // Vi kan se den som rader og kolonner. Hver { ... } er en rad.
        int[][] rutenett = {
            {1, 2, 3}, // Rad 0: kolonne 0, 1 og 2.
            {4, 5, 6}  // Rad 1: kolonne 0, 1 og 2.
        };

        // Første indeks velger rad, andre indeks velger kolonne.
        // Begge starter på 0: [1][2] er andre rad, tredje kolonne.
        System.out.println("\nVerdien på rad 1, kolonne 2: " + rutenett[1][2]);

        // Vi endrer verdien i første rad, andre kolonne fra 2 til 9.
        rutenett[0][1] = 9;

        // Den ytre løkken går gjennom radene.
        // rutenett.length gir antall rader (2).
        System.out.println("Rutenettet etter endringen:");
        for (int rad = 0; rad < rutenett.length; rad++) {

            // Den indre løkken går gjennom kolonnene i denne raden.
            // rutenett[rad].length gir antall elementer i valgt rad.
            for (int kolonne = 0; kolonne < rutenett[rad].length; kolonne++) {
                // print skriver videre på samme linje.
                System.out.print(rutenett[rad][kolonne] + " ");
            }

            // println starter en ny linje når raden er ferdig.
            System.out.println();
        }
        // Utskriften blir:
        // 1 9 3
        // 4 5 6

        // ------------------------------------------------------------
        // DIN TUR: SKRIV EN EGEN TODIMENSJONAL TABELL HER
        // ------------------------------------------------------------

        // Fyll inn tall i hver rad, og legg gjerne til flere rader.
        // Bruk komma mellom tallene og mellom radene.
        int[][] minTabell = {
            { // Skriv tallene til rad 0 på linjen under:

            },
            { // Skriv tallene til rad 1 på linjen under:

            }
        };

        // Oppgave: Les og skriv ut minTabell[0][0].
        // Legg inn minst ett tall i rad 0 først.
        // Skriv din kode under:


        // Oppgave: Endre en verdi med minTabell[rad][kolonne] = verdi;
        // Bytt ut rad, kolonne og verdi med dine egne heltall.
        // Velg en posisjon som finnes i tabellen din.
        // Skriv din kode under:


        // Disse løkkene skriver automatisk ut din egen tabell.
        System.out.println("\nMin todimensjonale tabell:");
        for (int rad = 0; rad < minTabell.length; rad++) {
            for (int kolonne = 0; kolonne < minTabell[rad].length; kolonne++) {
                System.out.print(minTabell[rad][kolonne] + " ");
            }
            System.out.println();
        }

        // EKSTRA ØVING: Lag en tabell med new int[3][4].
        // Den får 3 rader og 4 kolonner. Alle verdiene starter på 0.
        // Prøv å fylle den med egne verdier og skrive den ut.
        // Skriv din kode under:


    }
}
