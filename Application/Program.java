package Application;

public class Program {
    public static void main(String[] args) {

        Paciente p = new Paciente();
        p.adicionarPaciente("Hélio", "25522552-5", "rua restinga, 113", "2552-4578", "20/01/1990", "Engenheiro");
        System.out.println(p.nome + " " + p.rg + " " + p.endereco + " " + p.telefone + " " + p.dataNascimento + " " + p.profissao);

        System.out.println("--------------------------------------------------------------");
        Paciente p2 = new Paciente();
        p2.adicionarPaciente("Heliana", "3652552-5", "rua restinga, 113", "2552-4578", "10/03/2009", "Arquiteta");
        System.out.println(p2.nome + " " + p2.rg + " " + p2.endereco + " " + p2.telefone + " " + p2.dataNascimento + " " + p2.profissao);
    }
}
