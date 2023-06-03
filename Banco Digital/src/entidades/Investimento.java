package entidades;

public class Investimento extends Conta{
    private TipoDeInvestimento tipoDeInvestimento;
    private double valorAplicado;
    private double taxa;
    //Renda Fixa: 3%
    //Renda Variável: 10%
    private Conta conta;


    public Investimento(Conta conta, double numeroConta, TipoDeInvestimento tipoDeInvestimento) {
        super(numeroConta);
        this.tipoDeInvestimento = tipoDeInvestimento;
        this.taxa = taxa;
        this.valorAplicado = valorAplicado;
        this.conta = conta;
    }
    public void aplicar(double valor){
        if (valor <= this.conta.getSaldoConta()){
            this.valorAplicado += valor;
            this.conta.setSaldoConta(this.conta.getSaldoConta() - valor);
            System.out.println("Valor aplicado");
        }else{
            System.out.println("Digite um valor válido!");
        }
    }
    public void resgateTotal(){

        this.conta.setSaldoConta(this.conta.getSaldoConta() + this.valorAplicado);
        System.out.println("Valor resgatado");
    }

    public void resgateParcial(double valor){
        if (valor <= this.valorAplicado){
            this.valorAplicado -= valor;
            this.conta.setSaldoConta(this.conta.getSaldoConta() + valor);
            System.out.println("Valor resgatado");
        }else{
            System.out.println("Digite um valor válido!");
        }
    }
    public void rendimentoInvestimento(){
        if (this.tipoDeInvestimento == TipoDeInvestimento.RENDAFIXA){
            this.valorAplicado = this.valorAplicado * 1.03;
        }else{
            this.valorAplicado = this.valorAplicado * 1.1;
        }
    }
    public double consultarInvestimento(){
        return this.valorAplicado;
    }

    public TipoDeInvestimento getTipoDeInvestimento() {
        return tipoDeInvestimento;
    }

    public void setTipoDeInvestimento(TipoDeInvestimento tipoDeInvestimento) {
        this.tipoDeInvestimento = tipoDeInvestimento;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
