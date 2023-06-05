package org.lessons.java.shop;

public class Prodotto {

    private int codice;
    private String nome;
    private String descrizione;
    private String prezzo;
    private String iva;


    //costruttore


    public Prodotto(int codice, String nome, String descrizione, String prezzo, String iva) {
        this.codice = codice;
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

    public String getPrezzo() {
        return prezzo;
    }

    public String getIva() {
        return iva;
    }

    //setter

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }
}
