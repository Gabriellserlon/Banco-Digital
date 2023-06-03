package app;

import entidades.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        Usuarios:
        Usuario u1 = new Usuario("Gabriell", "123", "123");
        u1.login(u1,"123");
        Usuario u2 = new Usuario("Thiago", "1234", "1");
        u2.login(u1, "1");
//        Criando uma conta e depositando:
        Conta c1 = new Conta(1);
        c1.depositar(500);
        c1.verificarExtrato();
//        Acessando o cartão
        Cartao cartao = new Cartao(200);
        cartao.compraCredito(100, 2);
        System.out.println("Fatura atual: " + cartao.consultarFatura());
        System.out.println("Limite disponível: "+cartao.cosultarLimite());
        cartao.modificarLimite(150);
//        Fazendo emprestimo
        Emprestimo e1 = new Emprestimo(1,50,3);
        System.out.println("Valor atual do empréstimo: "+e1.consultarEmprestimo());
        e1.pagarEmprestimo();
        System.out.println("Valor atual do empréstimo: "+e1.consultarEmprestimo());
        System.out.println("Saldo disponível: "+c1.verificarSaldoConta());
//        Implementando Poupança
        Poupanca p1 = new Poupanca(1,c1);
        p1.guardarPoupanca(100);
        p1.rendimentoPoupanca();
        System.out.println("Saldo: "+p1.verificarSaldoPoupanca());
//        Implementando Investimento
        Investimento i1 = new Investimento(c1, 1, TipoDeInvestimento.RENDAVARIAVEL);
        i1.aplicar(200);
        i1.rendimentoInvestimento();
        System.out.println("Valor Atual: "+i1.consultarInvestimento());
//        Fazendo Transferência
        Transferencia t1 = new Transferencia(c1);
        t1.transferenciaPix(10, c1, "839999999");
}}