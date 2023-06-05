package org.lessons.java.shop;

public class Prodotto {

    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;


    //costante


    //costruttore


    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = generateCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //getter

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }

    //setter


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }


    public int generateCode(){

        int min = 10;
        int max = 10000;
        int randomNumber = (int)Math.floor(Math.random() * (max - min + 1) + min);

        return randomNumber;

    }

    public double getPrezzoIva(){
        double prezzoIva;
        prezzoIva = this.prezzo + (this.prezzo * this.iva);

        return prezzoIva;

    }

    public String getNomeCompleto(){
        String nomeCompleto;

        nomeCompleto = getNome() + "-" + getCodice();

        return nomeCompleto;
    }
}
