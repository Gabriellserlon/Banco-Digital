package entidades;

public class Usuario {
    private String nome;
    private String cpf;
    private String senha;

    public Usuario (String nome, String cpf, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }
    public void login(Usuario usuario, String senha){
        if (usuario.senha == this.senha){
            System.out.println("Login realizado");
        }else{
            System.out.println("Usuário ou senha inválidos");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
