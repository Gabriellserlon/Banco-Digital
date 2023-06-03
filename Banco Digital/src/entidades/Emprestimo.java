package entidades;

public class Emprestimo extends Conta {
    private double valorEmprestimo;
//    prazo em meses
    private double prazo;
//    juros calculado de acordo com o prazo
    private double juros;

    public Emprestimo(double numeroConta, double valorEmprestimo, double prazo){
        super(numeroConta);
        this.juros = (0.015 * prazo);
        this.valorEmprestimo += ((valorEmprestimo)*(1+this.juros)/prazo);
        System.out.println("Empréstimo realizado!");
    }
    public double consultarEmprestimo(){
        return this.valorEmprestimo;
    }
    public double getValorEmprestimo(){
        return valorEmprestimo;
    }
    public void setValorEmprestimo(double valor){
        this.valorEmprestimo = valor;
    }
    public void pagarEmprestimo(){
        if (consultarEmprestimo() <= verificarSaldoConta()){
            setSaldoConta(getSaldoConta() - getValorEmprestimo());
            setExtrato("Pagamento de empréstimo: "+ getValorEmprestimo());
            setValorEmprestimo(getValorEmprestimo() - getValorEmprestimo());
            System.out.printf("Empréstimo pago!");
        }else{
            System.out.println("Não foi possível realizar o pagamento");
        }
    }

    public double getPrazo() {
        return prazo;
    }

    public void setPrazo(double prazo) {
        this.prazo = prazo;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}
