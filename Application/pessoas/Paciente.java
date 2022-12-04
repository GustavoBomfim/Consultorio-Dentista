package Application.pessoas;


public class Paciente extends Pessoa {
    public String convenio;

    public Paciente(String nome, String rg, String endereco, String telefone, String dataNascimento, String convenio) {
        super(nome, rg, endereco, telefone, dataNascimento);
        this.convenio = convenio;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + ", RG: " + rg + ", Endereço " + endereco + ", Telefone: " + telefone
                + ", Data de Nascimento: " + dataNascimento + ", Convenio: " + convenio;
    }
}
