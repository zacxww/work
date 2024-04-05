public class Usuario {
    private String nome;
    private String email;
    private String endereco;

    public Usuario(String nome, String email, String endereco){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String getEndereco(){
        return endereco;
    }
}
