package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {

        Prodotto televisione = new Prodotto("televisione", "55 policci ultra hd", 155, 0.22);



        televisione.generateCode();
        System.out.println(televisione.getNomeCompleto());
        System.out.println("Prezzo netto: " + televisione.getPrezzo() + " €");
        System.out.println("Prezzo lordo: " + televisione.getPrezzoIva() + " €");

    }
}
