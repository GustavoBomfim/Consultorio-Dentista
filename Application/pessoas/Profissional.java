package Application.pessoas;

import Application.horarios.Turno;

public class Profissional extends Pessoa {

    public String especialidade;
    public String disponibilidade;
    public Turno turno;


    public Profissional(){
        super();
    }
    public Profissional(String nome, String rg, String endereco, String telefone, String dataNascimento, String especialidade, Turno turno) {
        super(nome, rg, endereco, telefone, dataNascimento);
        this.especialidade = especialidade;
        this.turno = turno;
    }
    public static void adicionarFuncionario(String nome, String rg, String endereco, String telefone, String dataNascimento, String especialidade, Turno turno){
        new Profissional(nome, rg, endereco, telefone, dataNascimento, especialidade, turno);
    }

    public String toString(){
        return "Nome: " + nome + ", RG: " + rg + ", Endereço " + endereco + ", Telefone: " + telefone
                + ", Data de Nascimento: " + dataNascimento + ", Especialidade: " + especialidade + ", Turno: " + turno ;
    }
}
