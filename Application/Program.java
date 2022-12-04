package Application;

import Application.pessoas.Paciente;
import Application.pessoas.Profissional;

public class Program {
    public static void main(String[] args) {

        Paciente p = new Paciente("Hélio", "25522552-5", "rua restinga, 113",
                "2552-4578", "20/01/1990", "cartao de todos");

        Paciente p2 = new Paciente("Heliana", "3652552-5", "rua restinga, 113",
                "2552-4578", "10/03/2009", "notridame");


        Profissional pf1 = new Profissional("Cláudio", "5646545-2", "Rua padre", "654645-544",
                "02/08/1987", "Clínico Geral","segunda à sexta");


        System.out.println();
        System.out.println("Pacientes:");
        System.out.println(p.nome + " " + p.rg + " " + p.endereco + " " + p.telefone + " " + p.dataNascimento + " " + p.convenio);
        System.out.println("--------------------------------------------------------------");
        System.out.println(p2.nome + " " + p2.rg + " " + p2.endereco + " " + p2.telefone + " " + p2.dataNascimento + " " + p.convenio);

        System.out.println();
        System.out.println("Profissionais:");
        System.out.println("--------------------------------------------------------------");
        System.out.println(pf1.nome + " " + pf1.rg + " " + pf1.endereco + " " + pf1.telefone + " " + pf1.dataNascimento + " " +
                pf1.especialidade + " " + pf1.disponibilidade );

    }



}
