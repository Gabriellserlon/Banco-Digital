package entidades;

public abstract class Transferencia {

    public void transferenciaPix(double valor, Conta conta, String chavePix) {
        if (valor <= conta.verificarSaldoConta()) {
            conta.setSaldoConta(conta.getSaldoConta() - valor);
            System.out.println("Valor transferido!");
        }else{
            System.out.println("Não foi possível realizar a transferência");
        }
    }
    public void transferenciaTED(Conta conta, double contaDestino, double valor){
        if (valor <= conta.verificarSaldoConta()){
            conta.setSaldoConta(conta.getSaldoConta()-valor);
            System.out.println("Valor transferido para: "+contaDestino);
        }else{
            System.out.println("Não foi possível realizar a transferência");
        }
    }
    public void pagarFatura(Conta conta,Cartao cartao){
        if (cartao.consultarFatura() <= conta.verificarSaldoConta()){
            conta.setSaldoConta(conta.getSaldoConta() - cartao.getFatura());
            cartao.setFatura(cartao.getFatura() - cartao.getFatura());
            System.out.println("Fatura paga!");
            System.out.println("Novo saldo: "+conta.verificarSaldoConta());
        }else{
            System.out.printf("Você não possui valor suficiente para pagamento!");
        }
    }
    public void pagarBoleto(Conta conta, double valor){
        if (valor <= conta.verificarSaldoConta()) {
            conta.setSaldoConta(conta.getSaldoConta() - valor);
            System.out.println("Boleto pago!");
        }else{
            System.out.println("Não foi possível realizar a transferência");
        }
    }
    public void pagarEmprestimo(Conta conta, Emprestimo emprestimo){
        if (emprestimo.consultarEmprestimo() <= conta.verificarSaldoConta()){
            conta.setSaldoConta(conta.getSaldoConta() - emprestimo.getValorEmprestimo());
            emprestimo.setValorEmprestimo(emprestimo.getValorEmprestimo() - emprestimo.getValorEmprestimo());
            System.out.printf("Empréstimo pago!");
        }else{
            System.out.println("Não foi possível realizar o pagamento");
        }
    }
}
