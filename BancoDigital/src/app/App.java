package app;

import entidades.Conta;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta c1 = new Conta(1);
        c1.depositar(50);
        c1.guardarPoupanca(20);
        c1.verificarSaldo();

    }
}