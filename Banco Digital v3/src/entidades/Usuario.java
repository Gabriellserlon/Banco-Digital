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
}
