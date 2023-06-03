package entidades;

public class Transferencia {
    private Conta conta;
    private Cartao cartao;

    public Transferencia(Conta conta){
        this.conta = conta;
        this.cartao = cartao;
    }

    public void pagarFatura(Conta conta,Cartao cartao){
        if (cartao.consultarFatura() <= conta.verificarSaldoConta()){
            conta.setSaldoConta(conta.getSaldoConta() - cartao.getFatura());
            conta.setExtrato("Pagamento de fatura: "+cartao.getFatura());
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
            conta.setExtrato("Pagamento de boleto: "+valor);
        }else{
            System.out.println("Não foi possível realizar a transferência");
        }
    }
    public void transferenciaPix(double valor, Conta conta, String chavePix) {
        if (valor <= conta.verificarSaldoConta()) {
            conta.setSaldoConta(conta.getSaldoConta() - valor);
            System.out.println("Valor transferido!");
            conta.setExtrato("Transferência pix: "+valor+" PIX destino: "+chavePix);
        }else{
            System.out.println("Não foi possível realizar a transferência");
        }
    }
    public void transferenciaTED(Conta conta, double contaDestino, double valor){
        if (valor <= conta.verificarSaldoConta()){
            conta.setSaldoConta(conta.getSaldoConta()-valor);
            System.out.println("Valor transferido para: "+contaDestino);
            conta.setExtrato("Transferência TED: "+valor+" Conta de destino: "+contaDestino);
        }else{
            System.out.println("Não foi possível realizar a transferência");
        }
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }
}
