package Application.pessoas;

import Application.pessoas.Pessoa;

import java.util.Date;

public class Profissional extends Pessoa {

    public String especialidade;
    public String disponibilidade;

    public Profissional(String nome, String rg, String endereco, String telefone, String dataNascimento, String especialidade, String disponibilidade) {
        super(nome, rg, endereco, telefone, dataNascimento);
        this.especialidade = especialidade;
        this.disponibilidade = disponibilidade;
    }
}
