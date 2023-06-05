package org.lessons.java.bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Ciao inserisci un nome per il conto: ");
        String nome = scan.nextLine();

        Conto conto = new Conto(nome);
        int amount;
        int scelta;

        System.out.println("Ciao " + conto.getInfoConto());
        do {

            System.out.println("Quale operazione vuoi fare? ");
            System.out.println("1 - Preleva");
            System.out.println("2 - Deposita");
            System.out.println("3 - Esci");

            System.out.print("Quale opzione scegli: ");
            scelta = scan.nextInt();

            if (scelta == 1) {

                do {
                    System.out.println("quanto vuoi prelevare?: ");
                    amount = scan.nextInt();
                    if (amount >= conto.getSaldo()) {
                        System.out.println("saldo insufficiente");
                    }
                } while (amount >= conto.getSaldo());
                conto.preleva(amount);

            } else if (scelta == 2) {

                do {
                    System.out.println("quanto vuoi depositare?: ");
                    amount = scan.nextInt();
                    if (amount <= 0) {
                        System.out.println("Preleva almeno 1 €");
                    }
                } while (amount <= 0);

                conto.deposita(amount);
            }
        } while (scelta != 3);

        System.out.println("Arrivederci!");
    }
}
