package org.lessons.java.bank;

import org.lessons.java.helper.Helper;

public class Conto {

    private int numeroConto;
    private String nomeProp;
    private double saldo;

    public Conto(String nomeProp) {
        this.saldo = 0;
        this.numeroConto = Helper.generateCode();
        this.nomeProp = nomeProp;
    }

    //getter

    public int getNumeroConto() {
        return numeroConto;
    }

    public String getNomeProp() {
        return nomeProp;
    }

    public double getSaldo() {
        return saldo;
    }

    //setter

    private void setNumeroConto(int numeroConto) {
        this.numeroConto = numeroConto;
    }

    public void setNomeProp(String nomeProp) {
        this.nomeProp = nomeProp;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void preleva(int amount) {
        this.saldo -= amount;
        getSaldoAggiornato();

    }

    public void deposita(int amount) {

        this.saldo += amount;
        getSaldoAggiornato();

    }

    public void getSaldoAggiornato(){
        System.out.println("saldo aggiornato: " + this.saldo + " €");
    }

    public String getInfoConto() {
        String infoConto;

        infoConto = getNomeProp() + "-" + getNumeroConto();

        return infoConto;

    }
}
