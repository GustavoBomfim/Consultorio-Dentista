package Application.pessoas;

public class Pessoa {
    public String nome;
    public String rg;
    public String endereco;
    public String telefone;
    public String dataNascimento;

    public Pessoa(String nome, String rg, String endereco, String telefone, String dataNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }
}
