package Application;

public class Paciente {
    String nome;
    String rg;
    String endereco;
    String telefone;
    String dataNascimento;
    String profissao;

    void adicionarPaciente(String nome, String rg, String endereco, String telefone, String dataNascimento, String profissao){
        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
    }
}
