package Application;

import Application.horarios.Turno;
import Application.pessoas.Paciente;
import Application.pessoas.Profissional;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------- BEM-VINDO AO HOSPITAL SÃO LUIZ -------- \n");
        System.out.println("Digite a opção que deseja fazer: \n 1 - Consultar todos os pacientes; \n 2 - Consultar todos os médicos; \n " +
                "3 - Cadastrar Profissional");
        int option = sc.nextInt();


        Paciente p = new Paciente("Hélio", "25522552-5", "rua restinga, 113",
                "2552-4578", "20/01/1990", "cartao de todos");

        Paciente p2 = new Paciente("Heliana", "3652552-5", "rua restinga, 113",
                "2692-7485", "10/03/2009", "notridame");


        Profissional pf1 = new Profissional("Cláudio", "5646545-2", "Rua padre", "654645-544",
                "02/08/1987", "Clínico Geral", Turno.MANHA);



        if(option == 1) {
            System.out.println();
            System.out.println("Pacientes:");
            System.out.println(p);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(p2);
        }
        else if(option == 2) {
            System.out.println();
            System.out.println("Profissionais:");
            System.out.println(pf1);
        }
        else if(option == 3){
            System.out.println("Cadastre um novo funcionário: ");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("RG: ");
            String rg = sc.next();
            System.out.print("Endereço: ");
            String endereco = sc.next();
            System.out.print("Data de nascimento: ");
            String dataNascimento = sc.next();
            System.out.print("Telefone: ");
            String telefone = sc.next();
            System.out.print("Especialidade: ");
            String especialidade = sc.next();
            System.out.print("Turno: " + " 1 - Manhã, 2 - Tarde, 3 - Noite");
            int turnoOption = sc.nextInt();
            if(turnoOption == 1){
                Profissional.adicionarFuncionario(nome,rg, endereco, telefone, dataNascimento, especialidade, Turno.MANHA);
            }
            else if(turnoOption == 2) {
                Profissional.adicionarFuncionario(nome, rg, endereco, telefone, dataNascimento, especialidade, Turno.TARDE);
            }
            else if(turnoOption == 3) {
                Profissional.adicionarFuncionario(nome, rg, endereco, telefone, dataNascimento, especialidade, Turno.NOITE);
            }
            Profissional.adicionarFuncionario(nome, rg, endereco, telefone, dataNascimento, especialidade, Turno.NOITE);
            System.out.println();

        }

        System.out.println();




    }



}
