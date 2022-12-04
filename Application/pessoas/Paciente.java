package Application.pessoas;


public class Paciente extends Pessoa {
    public String convenio;

    public Paciente(String nome, String rg, String endereco, String telefone, String dataNascimento, String convenio) {
        super(nome, rg, endereco, telefone, dataNascimento);
        this.convenio = convenio;
    }
}
