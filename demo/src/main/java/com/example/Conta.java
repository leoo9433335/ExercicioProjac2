package com.example;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor + 10;
    }

    public void sacar(double valor) {
        if (valor <= saldo)
            saldo = saldo - valor;
    }
}
