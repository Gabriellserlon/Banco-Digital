package app;

import entidades.Cartao;
import entidades.Conta;
import entidades.Emprestimo;

public class App {
    public static void main(String[] args) {
//        Criando uma conta e depositando:
        Conta c1 = new Conta(1);
        c1.depositar(500);
//        Acessando o cartão
        Cartao cartao = new Cartao(200);
        cartao.compraCredito(100, 2);
        System.out.println("Fatura atual: " + cartao.consultarFatura());
        System.out.println("Limite disponível: "+cartao.cosultarLimite());
        cartao.modificarLimite(150);
//        Fazendo emprestimo
        Emprestimo e1 = new Emprestimo(50,3);
        System.out.println("Valor atual do empréstimo: "+e1.consultarEmprestimo());
        e1.pagarEmprestimo(c1,e1);
        System.out.println("Valor atual do empréstimo: "+e1.consultarEmprestimo());
        System.out.println("Saldo disponível: "+c1.verificarSaldoConta());
    }
}