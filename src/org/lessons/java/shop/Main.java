package org.lessons.java.shop;

import org.lessons.java.helper.Helper;

public class Main {

    public static void main(String[] args) {


        double prezzo = 155;
        double iva = 0.22;


        Prodotto televisione = new Prodotto("televisione", "55 policci ultra hd", prezzo, iva);


        System.out.println(televisione.getNomeCompleto());
        System.out.println("Prezzo netto: " + televisione.getPrezzo() + " €");
        System.out.println("Prezzo lordo: " + Helper.getPrezzoIva(prezzo,iva) + " €");

    }
}
